public class StringArrayCheckout implements PersonQueue {
	private String[] nameArray;
	private int size;
	private static int INITIAL_ARRAY_SIZE = 5;
	
	/**
	 * Adds another person to the queue.
	 */
	public void insert(Person person) {
		if (isAlmostFull()) {
			reserveMoreMemory();
		}
		nameArray[size] = person.getName();
		System.out.println("Added " + person.getName());
		size++;
    }


	/**
	 * Removes a person from the queue.
	 */
	public Person retrieve() {
		if (isEmpty()) {
			System.out.println("Queue empty");
			return null;
		}
		String result = nameArray[0];
		nameArray[0] = null;
		shiftArrayLeft();
		size--;
		System.out.println("Removed " + result);
		Person removed = new Person(result);
		return removed;
	}
	
	/**
	 * Returns name of person at head of queue.
	 * 
	 * @return name of person at head of queue.
	 */
	public String getNext() {
		if (isEmpty()) {
			System.out.println("Queue empty");
			return null;
		}
		String result = nameArray[0];
		return result;
	}
	
    public StringArrayCheckout() {
	  nameArray = new String[INITIAL_ARRAY_SIZE];
	  size = 0;
    }
	
	public int getSize() {
		return size;
	}

    public boolean isEmpty() {
	  if (size == 0) {
		return true;
	  } else {
		return false;
	  }
    }
	
	/**
     * Shifts all values in the array one position to the left. 
     */ 
	private void shiftArrayLeft() {
		for (int i = 1; i < getSize(); i++) {
			nameArray[i - 1] = nameArray[i]; 
		}
	}
	
	/**
     * Returns true is the size of the stack is almost
     * the same as the size of the array, false otherwise. 
     */ 
    private boolean isAlmostFull() {
	  if (nameArray.length - size < 1) {
		return true;
	  } else {
		return false;
	  }
    }

    /**
     * Creates a new array twice as big, copies all elements
     * from the old array into it, and then replaces the old
     * array with the new array. 
     *
     * The old array is not pointed to by anyone, so it will 
     * be disposed of by the gargabe collector.
     */
    private void reserveMoreMemory() {
	  String[] biggerArray = new String[size*2];
	  for (int i = 0; i < size; i++) {
		biggerArray[i] = this.nameArray[i];
	  }
	  this.nameArray = biggerArray;
    }
}