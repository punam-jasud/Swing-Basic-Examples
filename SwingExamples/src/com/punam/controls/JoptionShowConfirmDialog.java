package com.punam.controls;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JoptionShowConfirmDialog extends WindowAdapter {

	JFrame f;

	public JoptionShowConfirmDialog() {

		f = new JFrame();
		f.addWindowListener(this);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setVisible(true);
	}

	public void windowClosing(WindowEvent e) {

		int a = JOptionPane.showConfirmDialog(f, "Do you really want to close ?");

		if (a == JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

	}

	public static void main(String[] args) {
		new JoptionShowConfirmDialog();
	}

}
