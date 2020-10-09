package com.punam.swing.concurrency;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class IntialThreadExample {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				JFrame frame = new JFrame("Initial Threads");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JLabel label = new JLabel("Hello World");
				frame.getContentPane().add(label);
				frame.pack();
				frame.setVisible(true);
				
			}
		});
	}

}
