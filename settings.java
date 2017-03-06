package painting;
//änderungskommentar
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class settings {
	
	public void open(){
		
		JFrame window = new JFrame();
		window.setTitle("Einstellungen");
		window.setSize(600, 400);
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBackground(Color.WHITE);
		// create a drop-down box and connect button, then place them at the top of the window
		
		//Speichern Button
		JButton btnspeichern = new JButton("Speichern");
		btnspeichern.addActionListener(new ActionListener() { 
			
		    public void actionPerformed(ActionEvent e) { 
		        speichern();
		    } 
		});
		JPanel lowerPanel = new JPanel();
		lowerPanel.add(btnspeichern);
		lowerPanel.setBackground(Color.white);
		window.add(lowerPanel, BorderLayout.SOUTH);
		
	
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5, 2, 5, 5));
		p.add(new JLabel("comport"));
		
		
		window.add(p);
		
		JMenuBar bar = new JMenuBar();
		window.add(bar, BorderLayout.NORTH);
		JMenu menu1 = new JMenu("Export"); 
		JMenuItem menuitemcsv = new JMenuItem("Exportieren als CSV-Datei (für Excel)");
		menuitemcsv.addActionListener(new ActionListener() { 
			
		    public void actionPerformed(ActionEvent e) { 
		        speichern(); //Hier export als csv-Funktion aufrufen
		    } 
		});
		menu1.add(menuitemcsv);
		bar.add(menu1);
		
		
		window.setVisible(true);
	}
	
	public void speichern(){
		System.out.println("Speichern!");
		//in Feld schreiben und ggf aktuialisieren
	}
	
}
