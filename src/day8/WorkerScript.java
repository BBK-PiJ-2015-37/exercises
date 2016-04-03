public class WorkerScript {

	public void launch() {
		SimpleMap map = new WorkerIndex();
		System.out.println(map.isEmpty()); //tests map is initially empty
		map.put(52, "Albert Barry");       //tests addition to map
		map.put(754, "Chad Digweed");
		map.put(321, "Edward Farquad");
		System.out.println(map.isEmpty()); //tests map is no longer empty
		System.out.println(map.get(52));   //tests retrieval from map
		System.out.println(map.get(754));
		System.out.println(map.get(321));
		System.out.println(map.get(2754)); //tests null return if no value for key
		map.put(321, "Gary Hughes");       //tests non-addition if key already used
		System.out.println(map.get(321));
		map.put(2754, "Ian Jenkins");      //tests addition of element to bucket already containing element
		System.out.println(map.get(2754));
		map.remove(754);                   //tests removal from map
		map.remove(321);
		System.out.println(map.get(321));
		map.remove(52);
		map.remove(2754);
		System.out.println(map.isEmpty()); //tests map empty after all elements removed
	}
	
	public static void main(String[] args) {
		WorkerScript workers = new WorkerScript();
		workers.launch();
	}
}