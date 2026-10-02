package com.hexagon.mvc.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.hexagon.mvc.model.ColorManager;

public class ColorFrame extends JFrame {
	JComboBox<String> box;
	JButton bt;
	JLabel la_msg;
	ColorManager colorManager;
	
	public ColorFrame() {
		box = new JComboBox<String>();
		bt = new JButton("결과 보기");
		la_msg = new JLabel();
		colorManager = new ColorManager();
		
		box.addItem("select wanted color");
		box.addItem("red");
		box.addItem("blue");
		box.addItem("green");
		box.addItem("yellow");
		
		/*
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		*/
		
		bt.addActionListener((e) -> {
			String selected = (String)box.getSelectedItem();
			la_msg.setText(colorManager.getAdvice(selected));
		});
		
		setSize(400, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		add(box);
		add(bt);
		add(la_msg);
	}


	public static void main(String[] args) {
		new ColorFrame();
		
	}
}
