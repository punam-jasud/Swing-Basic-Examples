package com.punam.controls;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbutton {

	public static void main(String[] args) {

		JFrame f = new JFrame("JButton Example");

		JButton button = new JButton("Click Here");
		button.setBounds(130, 120, 95, 30);

		f.add(button);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
