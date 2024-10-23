package com.swingdemoone.www;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{
	private JTextArea textArea;
	
	public TextPanel(){
		setLayout(new BorderLayout());
		textArea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		add(scrollPane, BorderLayout.CENTER);
	}
	
	
	public void appendText(String text) {
		textArea.append(text);
	}

}
