package com.punam.swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageOnButton {

	JFrame f;

	public ImageOnButton() {

		f = new JFrame();

		JButton b = new JButton(new ImageIcon("C:\\Users\\punamj\\Pictures\\Saved Pictures\\download.jpg"));
		b.setBounds(130, 100, 400, 150);

		f.add(b);

		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {

		new ImageOnButton();
	}

}
