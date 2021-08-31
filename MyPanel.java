import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyPanel implements ActionListener
{
	private JPanel panel;
		private JLabel lblMessage;
		private JTextField txtMessage;
		private JButton btnSend;
	public MyPanel()
	{
		init();
	}
	public JPanel init()
	{
		panel = new JPanel();
			lblMessage = new JLabel("Message : ");
			txtMessage = new JTextField(20);
			btnSend = new JButton("Send");
			btnSend.addActionListener(this);
		panel.add(lblMessage);
		panel.add(txtMessage);
		panel.add(btnSend);
		return panel;
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Send"))
		{
			new ViewRegisterFriend();
		}
	}
}