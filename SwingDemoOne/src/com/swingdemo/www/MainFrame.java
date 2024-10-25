package com.swingdemo.www;

import java.awt.BorderLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

//import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	//private JTextArea textArea;
	private TextPanel textPanel;
	private ToolBar toolBar;
	//private JButton button;
	MainFrame(){
		super("Hello World");
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//textArea = new JTextArea();
		//button = new JButton("Click Me!");
		textPanel = new TextPanel();
		toolBar = new ToolBar();
		setLayout(new BorderLayout());
		//add(textArea, BorderLayout.CENTER);
		//add(button, BorderLayout.SOUTH);
		add(textPanel, BorderLayout.CENTER);
		add(toolBar, BorderLayout.NORTH);
//		toolBar.setTextPanel(textPanel);
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				textPanel.appendText("Button has been clicked!\n");
//			}
//			
//		});
		toolBar.setStringListener(new StringListener(){
			public void textEmitted(String text){
				textPanel.appendtext(text);
			}
		});
	}
}
