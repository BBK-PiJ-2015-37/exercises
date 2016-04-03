/**
* Map from integer to Strings: one to many
*/
public class WorkerHashTable implements SimpleMap2 {
	private static int HASH_TABLE_SIZE = 1000;
	private static int INITIAL_KEY_ARRAY_SIZE = 3;
	private Entry table[] = new Entry[HASH_TABLE_SIZE];

	class Entry {
		private int key;
		private String[] stringArray = new String[INITIAL_KEY_ARRAY_SIZE];
		private Entry next;
		private int size = 0;

		Entry(int k) {
			key = k;
		}

		public String[] getValue() {
			return stringArray;
		}

		public void setValue(String value) {
			if (isAlmostFull()) {
				reserveMoreMemory();
			}
			for (int i = 0; i < stringArray.length; i++) {
				if (stringArray[i] == null) {
					stringArray[i] = value;
					size++;
					break;
				}
			}
		}

		public int getKey() {
			return key;
		}

		private boolean isAlmostFull() {
			if (stringArray.length - size < 1) {
				return true;
			} else {
				return false;
			}
		}
		
		private void reserveMoreMemory() {
			String[] biggerArray = new String[size*2];
			for (int i = 0; i < size; i++) {
				biggerArray[i] = this.stringArray[i];
			}
			this.stringArray = biggerArray;
		}
		
	}
	/**
	* Puts a new String in the map.
	*/
	public String put(int key, String name) {
		int hash = HashUtilities.shortHash(key);
		Entry e = table[hash];
		if (e != null) {
			//if key already in table, do nothing
			if (e.key == key) {
				e.setValue(name);
			} else {
				//traverse to end of list and add new entry
				while (e.next != null) {
					e = e.next;
				}
				Entry newEntry = new Entry(key);
				newEntry.setValue(name);
				e.next = newEntry;
			}
		} else {
			Entry newEntry = new Entry(key);
			newEntry.setValue(name);
			table[hash] = newEntry;
		}
		String result = name + " added at key " + key;
		System.out.println(result);
		return result;
	}

	/**
	* Returns all the names associated with that key,
	* or null if there is none.
	*/
	public String[] get(int key) {
		int hash = HashUtilities.shortHash(key);
		Entry e = table[hash];
		while (e != null) {
			if (e.getKey() == key) {
				if (e.getValue() == null) {
					System.out.println("No names associated with key " + key);
					return null;
				}
				print(e.getValue());
				return e.getValue();
			}
			e = e.next;
		}
		System.out.println("No names associated with key " + key);
		return null;
	}
	
	/**
	* Removes a name from the map.
	*/
	public void remove(int key, String name) {
		int hash = HashUtilities.shortHash(key);
		Entry e = table[hash];
		while (e != null) {
			if (e.getKey() == key) {
				if (e.getValue() != null) {
					for (int i = 0; i < e.getValue().length; i++) {
						if (e.getValue()[i].equals(name)) {
							e.getValue()[i] = null;
							e.size--;
							System.out.println(name + " removed.");
							break;
						}
					}
				}
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
		for (int i = 0; i < HASH_TABLE_SIZE; i++) {
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
	
	/**
	* Prints contents of given String array.
	*/
	public void print(String[] names) {
		System.out.print("-- ");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.print(names[i] + " -- ");
			}
			System.out.println("");
		}
	}
}