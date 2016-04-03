public class MatrixChecker {
	
	//Takes an integer array and returns true if array is
	//symmetrical or empty, false otherwise.
	public boolean isSymmetrical(int[] array) {
		int length = array.length;
		if ((length == 0) || (length == 1)) {
			return true;
		} else {
			int index1 = 0;
			int index2 = length - 1;
			while (index1 < index2) {
				if (array[index1] != array[index2]) {
					return false;
				}
				index1++;
				index2--;
			}
			return true;
		}
	}

	//Takes a 2-d integer array and returns true if array is
	//symmetrical or empty, false otherwise.	
	public boolean isSymmetrical(int[][] array) {
		if (array.length == 0) {
			return true;
		} else {
			if (array.length != array[0].length) {
				return false;
			} else {
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[0].length; j++) {
						if (array[i][j] != array[j][i]) {
							return false;
						}
					}
				}
				return true;
			}
		}
		
	}

	//Takes a 2-d integer array and returns true if array is
	//triangular or empty, false otherwise.	
	public boolean isTriangular(int[][] array) {
		if (array.length == 0) {
			return true;
		} else {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					if (i > j) {
						if (array[i][j] != 0) {
							return false;
						}
					}
				}
			}
			return true;
		}
	}
}