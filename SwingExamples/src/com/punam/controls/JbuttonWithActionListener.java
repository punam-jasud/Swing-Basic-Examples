package com.punam.controls;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JbuttonWithActionListener {

	public static void main(String[] args) {

		JFrame f = new JFrame("JButton with ActionListener");

		JTextField tx = new JTextField();
		tx.setBounds(100, 100, 200, 50);

		JButton button = new JButton("Click Here");
		button.setBounds(100, 200, 100, 35);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tx.setText("Learning Swing is Fun");

			}
		});

		f.add(button);
		f.add(tx);

		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);

	}

}
