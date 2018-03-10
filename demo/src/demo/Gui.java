package demo;

import java.awt.Event;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

	private JFrame frame;
	private JTextField textnum1;
	private JTextField textnum2;
	private JTextField textresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSum = new JButton("Sum");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=textnum1.getText();
				String s2=textnum2.getText();
				
				double num1=Double.parseDouble(s1);
				double num2=Double.parseDouble(s2);
				
				double sum = num1+num2;
				
				textresult.setText("The sum is : "+ sum);
				
			}
		});
		btnSum.setBounds(317, 29, 89, 23);
		frame.getContentPane().add(btnSum);
		
		JButton btnSubstract = new JButton("Substract");
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1=textnum1.getText();
				String s2=textnum2.getText();
				double num1=Double.parseDouble(s1);
				double num2=Double.parseDouble(s2);
				double sum = num1-num2;
				textresult.setText("The Substract is : ");
				
			}
		});
		btnSubstract.setBounds(317, 83, 89, 23);
		frame.getContentPane().add(btnSubstract);
		
		textnum1 = new JTextField();
		textnum1.setBounds(36, 55, 86, 20);
		frame.getContentPane().add(textnum1);
		textnum1.setColumns(10);
		
		
		textnum2 = new JTextField();
		textnum2.setBounds(178, 55, 86, 20);
		frame.getContentPane().add(textnum2);
		textnum2.setColumns(10);
		
		textresult = new JTextField();
		textresult.setBounds(36, 158, 271, 74);
		frame.getContentPane().add(textresult);
		textresult.setColumns(10);
		
	}
}
