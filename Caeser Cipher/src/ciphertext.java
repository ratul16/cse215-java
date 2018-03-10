import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.ScrollPane;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JScrollBar;

public class ciphertext {

	private JFrame frmCaeserCipher;
	private JTextField textField1;
	private JTextField textField2;
	private JLabel lblEncryptedText;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ciphertext window = new ciphertext();
					window.frmCaeserCipher.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ciphertext() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCaeserCipher = new JFrame();
		frmCaeserCipher.setBackground(SystemColor.windowBorder);
		frmCaeserCipher.setForeground(SystemColor.textHighlight);
		frmCaeserCipher.setTitle("Caeser Cipher");
		frmCaeserCipher.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Software\\Folder icons\\Game\\fall.ico"));
		frmCaeserCipher.getContentPane().setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		frmCaeserCipher.setBounds(100, 100, 395, 533);
		frmCaeserCipher.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCaeserCipher.getContentPane().setLayout(null);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnEnter.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		btnEnter.setBounds(145, 179, 89, 23);
		frmCaeserCipher.getContentPane().add(btnEnter);
		
		textField1 = new JTextField();
		textField1.setBackground(SystemColor.inactiveCaption);
		textField1.setForeground(Color.BLACK);
		textField1.setBounds(10, 31, 347, 137);
		frmCaeserCipher.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter the text you want to encrypt :");
		lblNewLabel.setBounds(10, 11, 359, 14);
		frmCaeserCipher.getContentPane().add(lblNewLabel);
		
		textField2 = new JTextField();
		textField2.setBackground(SystemColor.inactiveCaption);
		textField2.setBounds(10, 243, 347, 207);
		frmCaeserCipher.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		lblEncryptedText = new JLabel("Encrypted Text :");
		lblEncryptedText.setBounds(10, 218, 359, 14);
		frmCaeserCipher.getContentPane().add(lblEncryptedText);
		
		btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		btnClear.setBounds(145, 461, 89, 23);
		frmCaeserCipher.getContentPane().add(btnClear);
		
		JScrollBar scrollBar1 = new JScrollBar();
		scrollBar1.setBounds(356, 243, 23, 207);
		frmCaeserCipher.getContentPane().add(scrollBar1);
		
		JScrollBar scrollBar2 = new JScrollBar();
		scrollBar2.setBounds(356, 31, 23, 137);
		frmCaeserCipher.getContentPane().add(scrollBar2);
	}
}
