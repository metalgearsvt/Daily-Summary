package gui;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;

public class EntryItem extends JTextArea {
	
	private static final long serialVersionUID = 1420322431470090087L;
	public JScrollPane scrollPane;
	
	public EntryItem() {
		this(8);
	}
	
	public EntryItem(int a) {
		super(a, 35);
		this.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		this.scrollPane = new JScrollPane(this);
	}
	
	public JScrollPane getScroll() {
		return scrollPane;
	}
	
	public void setDef() {
		this.setWrapStyleWord(true);
		this.setLineWrap(true);
		this.scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	}

}
