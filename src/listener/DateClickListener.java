package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSpinner;

public class DateClickListener implements ActionListener {

	private JSpinner js;
	
	public DateClickListener(JSpinner js) {
		this.js = js;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(this.js.getValue().toString());
	}

}
