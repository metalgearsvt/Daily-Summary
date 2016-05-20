package gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -8026416994513756565L;
	
	public MainFrame() {
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
	}
	
	public void setDefaults() {
		this.setTitle("Daily Summary");
		this.setMinimumSize(new Dimension(600, 400));
	}
	
	public void addWith(Component c) {
		GridBagConstraints on = new GridBagConstraints();
		on.fill = GridBagConstraints.BOTH;
		on.insets = new Insets(10, 10, 10, 10);
		on.weightx = 1;
		on.weighty = 1;
		on.gridwidth = GridBagConstraints.REMAINDER;
		on.gridheight = GridBagConstraints.REMAINDER;
		this.add(c, on);
	}
	
	public void dis() {
		this.pack();
		this.setVisible(true);
	}
}
