import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
public class ViewRegisterFriend
{
	private JFrame frame;
	private JLabel lblTitle;
	private String labels[] ={"Name", "Nick Name", "Address", "Tel", "Email", "Note"};
	private JLabel lblDot;
	private JLabel lbls[] = new JLabel[labels.length];
	private JTextField txtFields[] = new JTextField[labels.length];
	private JTextArea taAddress;
	
	public ViewRegisterFriend()
	{
		init();
	}
	public void init()
	{
		frame = new JFrame();
		frame.setSize(500,400);
		frame.setLayout(null);
			//TOP
			lblTitle = new JLabel("Register Friend");
			lblTitle.setBounds(140, 30, 200, 20);
		frame.add(lblTitle);
			//CENTER
			int x = 60;
			int y = 70;
			for(int i=0; i<labels.length; i++)
			{
				lbls[i] = new JLabel(labels[i]);
				lbls[i].setBounds(x, y, 150, 20);
				
				lblDot = new JLabel(":");
				lblDot.setBounds(212, y, 5,20);
				
				txtFields[i] = new JTextField(20);
				if(i!=2)
				{
					txtFields[i].setBounds(225, y, 150, 20);
			
				}
			frame.add(lbls[i]);
			frame.add(lblDot);
			frame.add(txtFields[i]);
			y+=30;
			}
		
		
		frame.setVisible(true);
	}
	

}