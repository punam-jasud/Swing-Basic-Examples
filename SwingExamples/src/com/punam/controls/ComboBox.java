package com.punam.controls;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {

	JFrame f;

	public ComboBox() {
		f = new JFrame("ComboBox Example");

		String names[] = { "Fang", "Lie", "Leng", "Xiaqui", "Punam" };

		JComboBox cb = new JComboBox(names);
		cb.setBounds(50, 50, 90, 20);

		f.add(cb);
		f.setLayout(null);
		f.setSize(400, 500);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new ComboBox();
	}

}
