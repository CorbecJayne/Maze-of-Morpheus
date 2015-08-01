package auxilary;

import gameElements.Element;
import gameElements.Exit;
import gameElements.Floor;
import gameElements.Player;
import gameElements.SpikeTrap;
import gameElements.Wall;

import java.util.ArrayList;

import levels.Level0;

public class Level {

	private Element[][] matrix;
	private Vector2 player;
	private ArrayList<Vector2> enemies;
	
	public Level() {
		fillLevel(Level0.getLevel());
	}
	
	public void fillLevel(int[][] graph) {
		matrix = new Element[graph.length][graph[0].length];

		for (int y = graph[0].length - 1; y >= 0; --y) {
			for (int x = 0; x < graph.length; ++x) {
				switch(graph[x][y]) {
				case 0:
					matrix[x][y] = new Floor(x, y);
					break;
				case 1:
					matrix[x][y] = new Wall(x, y);
					break;
				case 2:
					matrix[x][y] = new Exit(x, y);
					break;
				case 3:
					matrix[x][y] = new Player(x, y);
					player = new Vector2(x, y);
					break;
				case 4:
					matrix[x][y] = new SpikeTrap(x, y);
					break;
				default:
					break;
				}
			}
		}
	}
	
	public Element[][] getMatrix() {
		return this.matrix;
	}
	public Vector2 getPlayer() {
		return this.player;
	}
	public ArrayList<Vector2> getEnemies() {
		return this.enemies;
	}

}
