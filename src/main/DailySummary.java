package main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import gui.EntryItem;
import gui.MainFrame;
import gui.PanelGridBag;
import listener.DateClickListener;

public class DailySummary {
	private static MainFrame m = new MainFrame();
	private static PanelGridBag p1 = new PanelGridBag();
	private static PanelGridBag pd1 = new PanelGridBag();
	
	public static void main(String[] args) {
		
		m.setDefaults();
		m.addWith(p1);
		
		p1.addFillX(new JLabel("Daily Summaries"), "N");
		p1.addWith(pd1, PanelGridBag.N, 1, 1);
		
		JPanel pd1Date = new JPanel();
		pd1Date.setLayout(new FlowLayout());
		
		SpinnerModel spinModel = new SpinnerDateModel();
		JSpinner spinDate = new JSpinner(spinModel);
		JComponent spinEdit = new JSpinner.DateEditor(spinDate, "MMM dd, yyyy");
		
		spinDate.setMinimumSize(new Dimension(5, 1));
		spinDate.setEditor(spinEdit);
		
		JButton getInfo = new JButton("Go");
		getInfo.addActionListener(new DateClickListener(spinDate));
		
		pd1Date.add(spinDate);
		pd1Date.add(getInfo);
		
		EntryItem e1 = new EntryItem(5);
		e1.setDef();
		
		pd1.addFillX(pd1Date, "NW", 0.1);
		pd1.addFillX(e1.scrollPane, "NW", 1);
		
		m.dis();
	}
}
