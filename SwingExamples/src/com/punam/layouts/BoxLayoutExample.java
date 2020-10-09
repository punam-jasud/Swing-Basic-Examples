package com.punam.layouts;


import java.awt.Button;
import java.awt.Frame;

import javax.swing.BoxLayout;

public class BoxLayoutExample extends Frame{
		
	Button buttons[];
	
	public BoxLayoutExample() {
		
		buttons = new Button[5];
		
		for (int i = 0; i < 5; i++) {
			
			buttons[i] = new Button("Button "+(i+1));
			add(buttons[i]);
			
		}
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BoxLayoutExample();
	}
	

}
