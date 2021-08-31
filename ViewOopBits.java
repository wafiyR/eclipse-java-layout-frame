import javax.swing.JFrame;
//NORTH
import javax.swing.JLabel;
//CENTER
import javax.swing.JPanel;
import javax.swing.JTextArea;
//SOUTH
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class  ViewOopBits extends JFrame
{
	//private JFrame frame;
		//NORTH
		private JPanel panelNorth;
		private JLabel lblTitle;
		//CENTER
		private JPanel panelCenter;
			private JTextArea taMessage;
		//SOUTH
		private JPanel panelSouth;
			private JLabel lblMessage;
			private JTextField txtMessage;
			private JButton btnSend;
		//EAST
			private JPanel panelEast;
				private String [] btnlabels = {"Open", "Save", "Save As","Note", "Close", "Exit"};
				private JButton btns[] = new JButton[btnlabels.length];
			
	public ViewOopBits()
	{
		init();
	}
	
	public void init()
	{
		//frame = new JFrame();
		this.setSize(600, 500);
			//NORTH
			panelNorth = new JPanel();
				lblTitle = new JLabel("BITS OOP");
			panelNorth.add(lblTitle);
		this.add(panelNorth,BorderLayout.NORTH);
			//CENTER
			panelCenter = new JPanel();
				taMessage = new JTextArea(20,30);
			panelCenter.add(taMessage);
		this.add(panelCenter, BorderLayout.CENTER);
			//SOUTH
			panelSouth = new MyPanel().init();		//call class MyPanel and method init()
		this.add(panelSouth, BorderLayout.SOUTH);
		
		
			//EAST
			panelEast = new JPanel(new GridLayout(10,1));
			int i =0;
				for(String btnlabel : btnlabels)
				{
					btns[i] = new JButton(btnlabel);
			panelEast.add(btns[i]);
					i++;
				}
		this.add(panelEast, BorderLayout.EAST);
		
		this.setVisible(true);
	}



}