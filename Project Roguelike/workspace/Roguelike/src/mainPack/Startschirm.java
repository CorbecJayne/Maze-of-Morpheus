
package mainPack;

//Importiere Awt und Swing Bibliothek
import java.awt.*;

import javax.swing.*;

public class Startschirm {
	//Deklaration ! Bitte eine Ordnung einbringen (Strings untereinander oder ints untereinander!)!
	
	private int frameLaenge = 1024;
	private int frameBreite = 768;
	
	
	private String spielTitel = "Roguelike";
	
	private JFrame frame;
	
	private JPanel godPanel;
	private JPanel startPanel;
	private JPanel opPanel;
	private JPanel endPanel;
	
	private JSplitPane godrestSplit;
	private JSplitPane startrestSplit;
	private JSplitPane opendeSplit;
	
	private JLabel godLabel;
	
	private JButton startButton;
	private JButton optionsButton;
	private JButton endButton;


	
	//F�ge testBild zum Test ein
	private ImageIcon godBild = new ImageIcon(getClass().getResource("MenuPicture.png"));
	private ImageIcon startBild = new ImageIcon(getClass().getResource("MenuPlay.png"));
	private ImageIcon optionsBild = new ImageIcon(getClass().getResource("MenuOptions.png"));
	private ImageIcon endBild = new ImageIcon(getClass().getResource("MenuExit.png"));

	
	//Methode durch welche Spiel gestartet wird	
	public void menuStart(){

		//JFrame Fenster erstellen, Titel setzen, sichtbar setzen, Groesse setzen
		frame = new JFrame(spielTitel);

		frame.setVisible(true);
		frame.setSize(frameLaenge, frameBreite);
		
		frame.setResizable(false);
		frame.setDefaultCloseOperation(3);

		//Zusammensetzen der Grafik
		godLabel =new JLabel(godBild);
		
		startButton = new JButton(startBild);
		startButton.addActionListener(new StartButtonFunktion());
		
		
		optionsButton = new JButton(optionsBild);
		
		endButton = new JButton(endBild);
		endButton.addActionListener(new EndeButtonFunktion());
		
		//Erstelle JPanels godPanel startPanel opPanel endPanel (Quasi ein Fenster in einem Fenster)
		godPanel = new JPanel();
		startPanel = new JPanel();
		opPanel = new JPanel();
		endPanel = new JPanel();

		
		
		//Setup der Panel
		godPanel.add(godLabel);
		startPanel.add(startButton);
		opPanel.add(optionsButton);
		endPanel.add(endButton);	
		
		//Setup der Splits
		opendeSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT,optionsButton,endButton);
		opendeSplit.setDividerSize(0);
		opendeSplit.setDividerLocation(66);
		opendeSplit.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		startrestSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT,startButton,opendeSplit);
		startrestSplit.setDividerSize(0);
		startrestSplit.setDividerLocation(94);
		startrestSplit.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		godrestSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT,godLabel,startrestSplit);
		godrestSplit.setDividerSize(0);
		godrestSplit.setDividerLocation(370);
		godrestSplit.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
	
		
		
		
		
		
		
		

		frame.add(godrestSplit);
		
		
					

		startButton.setFocusPainted(false);
		optionsButton.setFocusPainted(false);
		endButton.setFocusPainted(false);
		
		startButton.setBorderPainted(false);
		optionsButton.setBorderPainted(false);
		endButton.setBorderPainted(false);

		
		

		frame.setVisible(true);
		
	}
}
	



// TODO Bitte immer Rechtschreibfehler anderer korrigieren oder anderweitig Hilfestellung geben. In dem folgendem TO DO bitte Auftr�ge eintragen !

// TODO Bitte macht folgendes: Luca:  Janik: Korbi:  Maxim: Mach mal 32p/64p bilder Allgemein:

//TODO Maxim: Mach mal 32p/64p bilder