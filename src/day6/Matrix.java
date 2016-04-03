//Create a class Matrix that has a 2-D array of integers as a field. The class should
//have methods for:
//
//• a constructor method Matrix(int,int)
//• a method setElement(int,int,int)
//• a method setRow(int,String)
//• a method setColumn(int,String)
//• a method toString()
//• A method prettyPrint()
//
//Create a Groovy program that uses all those methods from the Matrix class: creates
//matrices, modifies its elements (one-by-one, by rows, and by columns), and prints the
//matrix on the screeen.

//Extend your Matrix class with a method setMatrix(String) that takes a String
//representing the numbers to be put in the elements of the array separated by
//commas, separating rows by semicolons, e.g. 1,2,3;4,5,6;7,8,9.

public class Matrix {
	private int[][] matrix;
	
	//Creates matrix with given number of rows and columns.
	//All values in matrix are initialized to 1.
	public Matrix(int rows, int columns) {
		matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = 1;
			}
		}
	}

	//Sets elements of matrix as the numbers in given string.
	//Numbers in a row are separated by commas.
	//Rows are separated by semi-colons.
	//Does nothing if input does not match matrix size.
	public void setMatrix(String numbers) {
		String[] rowNumbers = numbers.split(";");
		String[] colNumbers = rowNumbers[0].split(",");
		int rows = rowNumbers.length;
		int columns = colNumbers.length;
		if ((rows == matrix.length) && (columns == matrix[0].length)) {
			for (int i = 0; i < rows; i++) {
				String[] splitNumbers = rowNumbers[i].split(",");
				for (int j = 0; j < splitNumbers.length; j++) {
					matrix[i][j] = Integer.parseInt(splitNumbers[j]);
				}
			}
		}
	}
	
	//Sets element in given matrix position to given number.
	//Does nothing if given index outside range of matrix.
	public void setElement(int row, int column, int number) {
		if ((row >= 0) && (row < matrix.length) && (column >= 0) && (column < matrix[0].length)) {
			matrix[row][column] = number;
		}
	}
	
	//Sets elements in given matrix row to given string of numbers.
	//Does nothing if given index outside range of matrix
	//or if string of numbers longer than number of columns in matrix.
	public void setRow(int row, String numbers) {
		String[] splitNumbers = numbers.split(",");
		if ((splitNumbers.length == matrix[0].length) && (row >=0) && (row < matrix.length)) {
			for (int i = 0; i < splitNumbers.length; i++) {
				matrix[row][i] = Integer.parseInt(splitNumbers[i]);
			}
		}	
	}

	//Sets elements in given matrix column to given string of numbers.
	//Does nothing if given index outside range of matrix
	//or if string of numbers longer than number of rows in matrix.
	public void setColumn(int column, String numbers) {
		String[] splitNumbers = numbers.split(",");
		if ((splitNumbers.length == matrix.length) && (column >=0) && (column < matrix[0].length)) {
			for (int i = 0; i < splitNumbers.length; i++) {
				matrix[i][column] = Integer.parseInt(splitNumbers[i]);
			}
		}	
	}
	
	//Returns contents of matrix as comma-delimited string.
	//Semi-colons denote end of row.
	public String toString() {
		String result = "[";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if ((i == matrix.length - 1) && (j == matrix[0].length - 1)) {
					result = result + matrix[i][j] + "]";
				} else {
					if (j == matrix[0].length - 1) {
						result = result + matrix[i][j] + ";";
					} else {
						result = result + matrix[i][j] + ",";
					}
				}
			}
		}
		return result;
	}
	
	//Prints contents of matrix as tab-delimited integers.
	public void prettyPrint() {
		int rows = matrix.length;
		int columns = matrix[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	//Returns true if matrix is symmetrical, false otherwise.
	public boolean isSymmetrical() {
		MatrixChecker matrixCheck = new MatrixChecker();
		return matrixCheck.isSymmetrical(matrix);
	}
	
	//Returns true if matrix is triangular, false otherwise.
	public boolean isTriangular() {
		MatrixChecker matrixCheck = new MatrixChecker();
		return matrixCheck.isTriangular(matrix);
	}
}