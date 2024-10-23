package com.swingdemoone.www;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame{
	private TextPanel textPanel;
	private ToolBar toolBar;
	public MainFrame(){
		super("Hello World");
		textPanel = new TextPanel();
		toolBar = new ToolBar();
		setVisible(true);
		setLayout(new BorderLayout());
		add(textPanel, BorderLayout.CENTER);
		add(toolBar, BorderLayout.NORTH);
		toolBar.setTextPanel(textPanel);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
}
