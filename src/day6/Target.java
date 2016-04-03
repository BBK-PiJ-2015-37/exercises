public class Target {
	private int[][][] field;
	private int targetX;
	private int targetY;
	private int targetZ;
	
	//Sets dimensions of playing field
	public Target(int dim) {
		field = new int[dim + 1][dim + 1][dim + 1];
		for (int x = 0; x <= dim; x++) {
			for (int y = 0; y <= dim; y++) {
				for (int z = 0; z <= dim; z++) {
					field[x][y][z] = 0;
				}
			}
		}
	}
	
	//Sets coordinates of target in playing field
	public void init() {
		int dim = field.length;
		targetX = (int) Math.abs(dim * Math.random());
		targetY = (int) Math.abs(dim * Math.random());
		targetZ = (int) Math.abs(dim * Math.random());
		field[targetX][targetY][targetZ] = 1;
	}
	
	//Fires at target in playing field and returns result
	public Result fire(int x, int y, int z) {
		Result result = null;
		int dim = field.length;
		if ((x >= dim) || (x < 0) | (y >= dim) || (y < 0) || (z >= dim) || (z < 0)) {
			result = Result.OUT_OF_RANGE;
		} else if (field[x][y][z] == 1) {
			result = Result.HIT;
		} else if (x > targetX) {
			result = Result.FAIL_LEFT;
		} else if (x < targetX) {
			result = Result.FAIL_RIGHT;
		} else if (y > targetY) {
			result = Result.FAIL_LOW;
		} else if (y < targetY) {
			result = Result.FAIL_HIGH;
		} else if (z > targetZ) {
			result = Result.FAIL_SHORT;
		} else if (z < targetZ) {
			result = Result.FAIL_LONG;
		}
		return result;
	}
}