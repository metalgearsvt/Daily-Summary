package util;

import java.awt.GridBagConstraints;

public class GBC {
	public static GridBagConstraints make(int a, int x, int xf, int y, int yf) {
		GridBagConstraints g = new GridBagConstraints();
		g.anchor = a;
		g.weightx = x;
		g.weighty = y;
		g.gridwidth = xf;
		g.gridheight = yf;
		g.fill = GridBagConstraints.BOTH;
		return g;
	}
	public static GridBagConstraints makeFull(String orient) {
		GridBagConstraints g = new GridBagConstraints();
		if(orient.equalsIgnoreCase("N")) {
			g.anchor = GridBagConstraints.NORTH;
		} else if(orient.equalsIgnoreCase("E")) {
			g.anchor = GridBagConstraints.EAST;
		} else if(orient.equalsIgnoreCase("S")) {
			g.anchor = GridBagConstraints.SOUTH;
		} else if(orient.equalsIgnoreCase("W")) {
			g.anchor = GridBagConstraints.WEST;
		} else if(orient.equalsIgnoreCase("NW")) {
			g.anchor = GridBagConstraints.NORTHWEST;
		} else if(orient.equalsIgnoreCase("NE")) {
			g.anchor = GridBagConstraints.NORTHEAST;
		} else if(orient.equalsIgnoreCase("SW")) {
			g.anchor = GridBagConstraints.SOUTHWEST;
		} else if(orient.equalsIgnoreCase("SE")) {
			g.anchor = GridBagConstraints.SOUTHEAST;
		}
		g.weightx = 1;
		g.weighty = 0;
		g.gridwidth = GridBagConstraints.REMAINDER;
		g.gridheight = GridBagConstraints.RELATIVE;
		return g;
	}
	
	public static GridBagConstraints makeFull(String orient, double y) {
		GridBagConstraints g = new GridBagConstraints();
		if(orient.equalsIgnoreCase("N")) {
			g.anchor = GridBagConstraints.NORTH;
		} else if(orient.equalsIgnoreCase("E")) {
			g.anchor = GridBagConstraints.EAST;
		} else if(orient.equalsIgnoreCase("S")) {
			g.anchor = GridBagConstraints.SOUTH;
		} else if(orient.equalsIgnoreCase("W")) {
			g.anchor = GridBagConstraints.WEST;
		} else if(orient.equalsIgnoreCase("NW")) {
			g.anchor = GridBagConstraints.NORTHWEST;
		} else if(orient.equalsIgnoreCase("NE")) {
			g.anchor = GridBagConstraints.NORTHEAST;
		} else if(orient.equalsIgnoreCase("SW")) {
			g.anchor = GridBagConstraints.SOUTHWEST;
		} else if(orient.equalsIgnoreCase("SE")) {
			g.anchor = GridBagConstraints.SOUTHEAST;
		}
		g.weightx = 1;
		g.weighty = y;
		g.gridwidth = GridBagConstraints.REMAINDER;
		g.gridheight = GridBagConstraints.RELATIVE;
		return g;
	}
}
