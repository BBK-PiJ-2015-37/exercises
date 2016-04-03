public class MatrixScript {

	public static void main(String[] args) {
		Matrix matrix = new Matrix(3,3);        //Tests constructor method
		System.out.println(matrix.toString());  //Tests toString() method
		matrix.setElement(1,1,5);		//Tests setElement() method (valid input)
		System.out.println(matrix.toString());
		matrix.setElement(1,4,5);		//Tests setElement() method (invalid input)
		System.out.println(matrix.toString());
		matrix.setElement(4,1,5);		//Tests setElement() method (invalid input)
		System.out.println(matrix.toString());
		matrix.setRow(0, "1,2,3");		//Tests setRow() method (valid input)
		System.out.println(matrix.toString());
		matrix.setRow(0, "1,2,3,4");		//Tests setRow() method (invalid input)
		System.out.println(matrix.toString());
		matrix.setRow(4, "1,2,3");		//Tests setRow() method (invalid input)
		System.out.println(matrix.toString());
		matrix.setColumn(2, "4,5,6");		//Tests setColumn() method (valid input)
		System.out.println(matrix.toString());
		matrix.setColumn(2, "4,5,6,7");		//Tests setColumn() method (invalid input)
		System.out.println(matrix.toString());
		matrix.setColumn(4, "4,5,6");		//Tests setColumn() method (invalid input)
		System.out.println(matrix.toString());
		matrix.setRow(1, "0,5,5");
		matrix.setRow(2, "0,0,1");
		matrix.prettyPrint();			//Tests prettyPrint() method
		System.out.println(matrix.isSymmetrical());	//Tests isSymmetrical() method (should return false)
		System.out.println(matrix.isTriangular());	//Tests isSymmetrical() method (should return true)
		matrix.setMatrix("1,2,3;4,5,6;7,8,9");	//Tests setMatrix()
		matrix.prettyPrint();
	}
}