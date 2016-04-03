public class MatrixCheckerScript {
	
	public static void main(String[] args) {
		MatrixChecker matrix = new MatrixChecker();
		int[] array1 = {};
		int[] array2 = {1};
		int[] array3 = {1,2,3,2,1};
		int[] array4 = {1,2,3,2,2};
		int[][] array5 = {};
		int[][] array6 = {{1,2},{2,1}};
		int[][] array7 = {{1,2,3},{3,2,1}};
		int[][] array8 = {{1,2,1},{2,0,2},{1,2,1}};
		int[][] array9 = {{1,2,1},{0,3,3},{0,0,5}};
		int[][] array10 = {{1,2,3,4},{0,2,3,4},{0,0,3,4},{0,0,0,4}};
		System.out.println(matrix.isSymmetrical(array1));		//Should return true
		System.out.println(matrix.isSymmetrical(array2));		//Should return true
		System.out.println(matrix.isSymmetrical(array3));		//Should return true
		System.out.println(matrix.isSymmetrical(array4));		//Should return false
		System.out.println(matrix.isSymmetrical(array5));		//Should return true
		System.out.println(matrix.isSymmetrical(array6));		//Should return true
		System.out.println(matrix.isSymmetrical(array7));		//Should return false
		System.out.println(matrix.isSymmetrical(array8));		//Should return true
		System.out.println(matrix.isTriangular(array5));		//Should return true
		System.out.println(matrix.isTriangular(array8));		//Should return false
		System.out.println(matrix.isTriangular(array9));		//Should return true
		System.out.println(matrix.isTriangular(array10));		//Should return true
	}
	
}