package painting;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;

public class GUI2 extends JFrame {
	public GUI2() {
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{178, 35, 35, 0};
		gridBagLayout.rowHeights = new int[]{25, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gridBagLayout);
		
		JRadioButton radioButton = new JRadioButton("Einheiten in m/s²");
		radioButton.setSelected(true);
		radioButton.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.insets = new Insets(0, 0, 5, 5);
		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(radioButton, gbc);
		
		JRadioButton rdbtnEinheitenInG = new JRadioButton("Einheiten in G");
		rdbtnEinheitenInG.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_rdbtnEinheitenInG = new GridBagConstraints();
		gbc_rdbtnEinheitenInG.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnEinheitenInG.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtnEinheitenInG.gridx = 1;
		gbc_rdbtnEinheitenInG.gridy = 0;
		panel.add(rdbtnEinheitenInG, gbc_rdbtnEinheitenInG);
		
		JButton btnspeichern = new JButton("Speichern");
		btnspeichern.addActionListener(new ActionListener() { 
			
		    public void actionPerformed(ActionEvent e) { 
		        
		    } 
		});
		JPanel lowerPanel = new JPanel();
		lowerPanel.add(btnspeichern);
		lowerPanel.setBackground(Color.white);
		getContentPane().add(lowerPanel, BorderLayout.SOUTH);
		
		
	}

}
