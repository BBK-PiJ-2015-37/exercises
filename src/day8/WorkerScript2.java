public class WorkerScript2 {
	
	public void launch() {
		SimpleMap2 map = new WorkerHashTable();
		System.out.println(map.isEmpty()); //tests map is initially empty
		map.put(52, "Albert Barry");       //tests addition to map
		map.put(754, "Chad Digweed");
		map.put(321, "Edward Farquad");
		System.out.println(map.isEmpty()); //tests map is no longer empty
		map.get(52);   //tests retrieval from map and print method
		map.get(754);
		map.get(321);
		map.get(2754); //tests null return if no value for key
		map.put(52, "Andrew Bertrand");    //tests addition to map in pre-existing key
		map.put(52, "Alfred Banks");
		map.put(52, "Alphonse Barrera");
		map.put(2754, "Ian Jenkins");      //tests addition of element to bucket already containing element
		map.get(2754);
		map.remove(754, "Chad Digweed");                   //tests removal from map
		map.remove(321, "Edward Farquad");
		map.get(321);
		map.remove(52, "Albert Barry");
		map.remove(52, "Andrew Bertrand");
		map.remove(52, "Alfred Banks");
		map.remove(52, "Alphonse Barrera");
		map.remove(2754, "Ian Jenkins");
		System.out.println(map.isEmpty()); //tests map empty after all elements removed
	}
	
	public static void main(String[] args) {
		WorkerScript2 workers = new WorkerScript2();
		workers.launch();
	}
}