/**
* Map from integer to Strings
*/
public class WorkerIndex implements SimpleMap {
	private static int SIZE = 1000;
	private Entry table[] = new Entry[SIZE];

	class Entry {
		private int key;
		private String value;
		private Entry next;

		Entry(int k, String v) {
			key = k;
			value = v;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public int getKey() {
			return key;
		}
	}

	/**
	* Puts a new String in the map.
	*
	* If the key is already in the map, nothing is done.
	*/
	public void put(int key, String name) {
		int hash = HashUtilities.shortHash(key);
		Entry e = table[hash];
		if (e != null) {
			//if key already in table, do nothing
			if (e.key == key) {
				if (e.getValue() != null) {
					return;
				}
				e.setValue(name);
			} else {
				//traverse to end of list and add new entry
				while (e.next != null) {
					e = e.next;
				}
				Entry newEntry = new Entry(key, name);
				e.next = newEntry;
			}
		} else {
			Entry newEntry = new Entry(key, name);
			table[hash] = newEntry;
		}
	}
	
	
	/**
	* Returns the name associated with that key,
	* or null if there is none.
	*/
	public String get(int key) {
		int hash = HashUtilities.shortHash(key);
		Entry e = table[hash];
		while (e != null) {
			if (e.getKey() == key) {
				if (e.getValue() == null) {
					return null;
				}
				return e.getValue();
			}
			e = e.next;
		}
		return null;
	}
	
	/**
	* Removes a name from the map. Future calls to get(key)
	* will return null for this key unless another
	* name is added with the same key.
	2
	*/
	public void remove(int key) {
		int hash = HashUtilities.shortHash(key);
		Entry e = table[hash];
		while (e != null) {
			if (e.getKey() == key) {
				if (e.getValue() == null) {
					return;
				}
				e.setValue(null);
			}
			e = e.next;
		}		
	}
	
	/**
	* Returns true if there are no workers in the map,
	* false otherwise
	*/
	public boolean isEmpty() {
		Entry e;
		for (int i = 0; i < SIZE; i++) {
			e = table[i];
			if (e != null) {
				while (e != null) {
					if (e.getValue() != null) {
						return false;
					}
					e = e.next;
				}
			}
		}
		return true;
	}
}