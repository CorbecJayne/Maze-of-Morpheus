package levels;


public class Level0 {
	public static int[][] getLevel() {
		int[][] result = new int[32][23];
		for (int x = 0; x < result.length; ++x) {
			for (int y = 0; y < result[0].length; ++y) {
				result[x][y] = 1;
			}
		}
		for (int x = 1; x < result.length-1; ++x) {
			for (int y = 1; y < result[0].length-1; ++y) {
				result[x][y] = 0;
			}
		}
		result[1][1] = 3;  //Setze Spieler auf Position 1/1
		result[30][21] = 2;//Setze Ausgang auf Position 30/21
		result[20][19] = 4;//Setze Stachelfalle auf Position 20/19
		
		return result;
	}
}
