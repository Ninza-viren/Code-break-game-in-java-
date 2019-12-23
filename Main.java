package com.gaming;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		GamePlay gp=new GamePlay();
		frame.setBounds(10, 10, 700, 600);
		frame.setTitle("My game");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(gp);
		
	}

}
