public class ArrayCopierScript {
	
	public static void main(String[] args) {
		ArrayCopier array = new ArrayCopier();
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 7, 8, 9, 0};
		int[] c = {3, 6, 9};
		int[] d = {2, 4, 6, 8, 0, 2, 4, 5, 7, 9};
		array.copy(a,b);
		array.copy(a,c);
		array.copy(a,d);
		System.out.println(array.toString(a));
		System.out.println(array.toString(b));
		System.out.println(array.toString(c));
		System.out.println(array.toString(d));
	}

}