import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChainClass {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChainClass window = new ChainClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChainClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 704);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInformationInputApp = new JLabel("Information Input App");
		lblInformationInputApp.setBounds(198, 11, 131, 30);
		frame.getContentPane().add(lblInformationInputApp);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(35, 79, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField1 = new JTextField();
		textField1.setBounds(159, 76, 334, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(35, 131, 70, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setBounds(10, 180, 95, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(47, 232, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		textField2 = new JTextField();
		textField2.setBounds(159, 128, 334, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(159, 177, 334, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setBounds(159, 229, 334, 20);
		frame.getContentPane().add(textField4);
		textField4.setColumns(10);
		
		JButton btnInput = new JButton("Input");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInput.setBounds(198, 313, 131, 23);
		frame.getContentPane().add(btnInput);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblInformationInputApp, lblName, textField1, lblAddress, lblPhoneNumber, lblEmail, textField2, textField3, textField4, btnInput}));
	}
}
