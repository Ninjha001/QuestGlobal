package com.swingdemo.www;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel {
	private JButton helloButton;
	private JButton goodbyeButton;
	private TextPanel textPanel;
	ToolBar(){
		setLayout(new FlowLayout());
		helloButton = new JButton("Hello\n");
		goodbyeButton = new JButton("GoodBye\n");
		add(helloButton);
		add(goodbyeButton);
		helloButton.addActionListener(new ButtonListener());
		goodbyeButton.addActionListener(new ButtonListener());
	}
	public void setTextPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton buttonClicked = (JButton) e.getSource();
			if(buttonClicked == helloButton) {
				textPanel.appendText("Hello\n");
			}
			else if(buttonClicked == goodbyeButton) {
				textPanel.appendText("GoodBye\n");
			}
		}
		
	}
}
