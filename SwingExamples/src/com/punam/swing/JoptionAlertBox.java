package com.punam.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JoptionAlertBox {

	JFrame f;

	public JoptionAlertBox() {
		f = new JFrame();
		JOptionPane.showMessageDialog(f, "Successfully Updated ", "Alert", JOptionPane.WARNING_MESSAGE);
	}

	public static void main(String[] args) {
		new JoptionAlertBox();
	}

}
