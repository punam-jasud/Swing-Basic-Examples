package com.punam.controls;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {

	JFrame f;
	JMenuBar mb;
	JMenu file, edit, help, submenu;
	JMenuItem cut, copy, paste, selectOne, selectAll;

	public Menu() {

		f = new JFrame("Menu and MenuItem Example");
		mb = new JMenuBar();

		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		selectOne = new JMenuItem("Select One");
		selectAll = new JMenuItem("Select All");

		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		submenu = new JMenu("Select");

		submenu.add(selectOne);
		submenu.add(selectAll);

		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(submenu);

		mb.add(file);
		mb.add(edit);
		mb.add(help);

		f.add(mb);
		f.setJMenuBar(mb);
		f.setLayout(null);
		f.setSize(500, 500);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		new Menu();
	}

}
