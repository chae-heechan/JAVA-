import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	public LogIn() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID: "); 
		JLabel pswrd = new JLabel("Password: ");
		JTextField textID = new JTextField(10);
		JPasswordField textPass = new JPasswordField(10);
		JButton logButton = new JButton("Lon In");
		
		panel.add(label);
		panel.add(textID);
		panel.add(pswrd);
		panel.add(textPass);
		panel.add(logButton);
		
		logButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Chae";
				String pass = "1123";
				
				if(id.equals(textID.getText()) && pass.equals(textPass.getText()))
					JOptionPane.showMessageDialog(null, "�α��� �Ǿ����ϴ�!");
				else {
					JOptionPane.showMessageDialog(null, "�α��ο� �����߽��ϴ�.");
				}
			}
			
		});
		
		add(panel);
		
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String args[]) {
		new LogIn();
	}
}
