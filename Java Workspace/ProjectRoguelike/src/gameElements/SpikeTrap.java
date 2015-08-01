package gameElements;

import javax.swing.ImageIcon;

import auxilary.Vector2;

public class SpikeTrap extends Element {
	
	protected final ImageIcon[] icons = {new ImageIcon(getClass().getResource("Stachelfalle Fliese 32" + ".png")),     //0
										new ImageIcon(getClass().getResource("Stachelfalle Blutig" + ".png")),		   //1	
										new ImageIcon(getClass().getResource("Stachelfalle Spieler oben" + ".png")),   //2
										new ImageIcon(getClass().getResource("Stachelfalle Spieler rechts" + ".png")), //3
										new ImageIcon(getClass().getResource("Stachelfalle Spieler unten" + ".png")),  //4
										new ImageIcon(getClass().getResource("Stachelfalle Spieler links" + ".png"))}; //5
	protected final int id = 4;

	protected ImageIcon icon = icons[0];
	public Vector2 coords;

	public SpikeTrap(int x, int y) {
		super(x, y);
	}
	public SpikeTrap(Vector2 coords) {
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
