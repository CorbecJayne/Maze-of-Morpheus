package gameElements;

import javax.swing.ImageIcon;

import auxilary.Vector2;

public class Player extends Element {
	
	protected final ImageIcon[] icons = {new ImageIcon(getClass().getResource("SpielerOben" + ".png")),		//0
										 new ImageIcon(getClass().getResource("SpielerRechts" + ".png")),	//1
										 new ImageIcon(getClass().getResource("SpielerUnten" + ".png")),	//2
										 new ImageIcon(getClass().getResource("SpielerLinks" + ".png")),	//3
										 new ImageIcon(getClass().getResource("Stachelfalle Spieler oben" + ".png")),   //4
										 new ImageIcon(getClass().getResource("Stachelfalle Spieler rechts" + ".png")), //5
										 new ImageIcon(getClass().getResource("Stachelfalle Spieler unten" + ".png")),  //6
										 new ImageIcon(getClass().getResource("Stachelfalle Spieler links" + ".png"))}; //7
	protected final int id = 3;

	protected ImageIcon icon = icons[0];
	public Vector2 coords; 

	public Player(int x, int y) {
		super(x, y);
	}
	public Player(Vector2 coords) {
		super(coords);
	}
	@Override
	public ImageIcon setIcon(int iconIndex) {
		this.icon = icons[iconIndex];
		return this.icon;
	}
	@Override
	public ImageIcon getIcon() {
		return this.icon;
	}
	
	@Override
	public int getID() {
		return this.id;
	}
	
}