package com.punam.controls;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextArea {

	public TextArea() {

		JFrame f = new JFrame();

		JTextArea area = new JTextArea("Learning Swing is Fun");
		area.setBounds(10, 30, 200, 200);

		f.add(area);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TextArea();
	}

}
