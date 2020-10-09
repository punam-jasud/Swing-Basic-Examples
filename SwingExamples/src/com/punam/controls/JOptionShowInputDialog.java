package com.punam.controls;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionShowInputDialog {

	JFrame f;

	public JOptionShowInputDialog() {
		f = new JFrame();
		JOptionPane.showInputDialog(f, "Enter Your Name");
	}

	public static void main(String[] args) {
		new JOptionShowInputDialog();
	}

}
