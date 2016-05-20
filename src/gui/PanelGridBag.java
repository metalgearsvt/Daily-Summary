package gui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import util.GBC;

public class PanelGridBag extends JPanel {

	private static final long serialVersionUID = 7532887994846227144L;
	private GridBagLayout gbl;
	
	public static final int N = 1;
	public static final int NW = 2;

	public PanelGridBag() {
		super();
		gbl = new GridBagLayout();
		this.setLayout(gbl);
		gbl.layoutContainer(this);
	}
	
	public void addFillX(Component com, String orient) {
		GridBagConstraints g = GBC.makeFull(orient);
		this.add(com, g);
	}
	
	public void addFillX(Component com, String orient, double y) {
		GridBagConstraints g = GBC.makeFull(orient, y);
		this.add(com, g);
	}
	
	public void addWith(Component com) {
		addWith(com, GridBagConstraints.CENTER);
	}
	
	public void addWith(Component com, double x) {
		addWith(com, GridBagConstraints.CENTER, x, x);
	}
	
	public void addWith(Component com, int Orient) {
		addWith(com, Orient, 0.01, 0.01);
	}
	
	public void addWith(Component com, int Orient, double xw, double yw) {
		GridBagConstraints gbc = new GridBagConstraints();
		if(Orient == PanelGridBag.N) {
			gbc.anchor = GridBagConstraints.NORTH;
		} else if(Orient == PanelGridBag.NW) {
			gbc.anchor = GridBagConstraints.NORTHWEST;
		}
		if(xw == 1 && yw == 1) {
			gbc.fill = GridBagConstraints.BOTH;
			gbc.gridwidth = GridBagConstraints.REMAINDER;
			gbc.gridheight = GridBagConstraints.REMAINDER;
		}
		gbc.weightx = xw;
		gbc.weighty = yw;
		this.add(com, gbc);
	}
}
