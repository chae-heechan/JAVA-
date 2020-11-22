import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel buttonpanel = new JPanel();
		JLabel label = new JLabel("test text");
		JButton button1 = new JButton("click me!!"); 
		JButton button2 = new JButton("EXIT");
		JTextArea textarea = new JTextArea();	//이건 많은 글씨
		JTextField textfield = new JTextField(200);	//이건 한 줄 정도	
		
		
		 
		panel.setLayout(new BorderLayout());
		
		buttonpanel.add(button1);
		buttonpanel.add(button2);
		panel.add(label, BorderLayout.NORTH);
		panel.add(buttonpanel, BorderLayout.WEST);
		panel.add(textarea, BorderLayout.CENTER);
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textarea.getText());
				
			}
			
		});
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		frame.add(panel);
		
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
