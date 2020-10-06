package com.punam.swing;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JoptionShowMessageDialog {

	JFrame f;

	public JoptionShowMessageDialog() {
		f = new JFrame();
		JOptionPane.showMessageDialog(f, "Hi Punam , Keep Doing Good Things :) ");
	}

	public static void main(String[] args) {
		new JoptionShowMessageDialog();
	}

}
