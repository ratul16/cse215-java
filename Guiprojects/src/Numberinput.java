import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class Numberinput {

	private JFrame frmPhonebook;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField mainField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Numberinput window = new Numberinput();
					window.frmPhonebook.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Numberinput() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPhonebook = new JFrame();
		frmPhonebook.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Software\\Folder icons\\Blackvariant-Button-Ui-Requests-15-Amazon-Kindle.ico"));
		frmPhonebook.setTitle("PhoneBook");
		frmPhonebook.setBounds(100, 100, 593, 332);
		frmPhonebook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhonebook.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblName.setBounds(24, 40, 88, 23);
		frmPhonebook.getContentPane().add(lblName);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNumber.setBounds(24, 112, 88, 23);
		frmPhonebook.getContentPane().add(lblNumber);
		
		nameField = new JTextField();
		nameField.setToolTipText("");
		nameField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		nameField.setBounds(122, 38, 418, 34);
		frmPhonebook.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		numberField = new JTextField();
		numberField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		numberField.setBounds(170, 110, 370, 34);
		frmPhonebook.getContentPane().add(numberField);
		numberField.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("C:\\Users\\RaTuL\\Desktop\\Phonebook.txt");
					FileWriter writer = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(writer);
					bw.newLine();
					nameField.write(bw);
					bw.newLine();
					mainField.write(bw);
					numberField.write(bw);
					bw.newLine();
					bw.close();
					
					nameField.setText("");
					nameField.requestFocus();
					numberField.setText("");
					
					
					
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, e);
					e.printStackTrace();
				}
			}
		});
		btnEnter.setBounds(246, 198, 117, 40);
		frmPhonebook.getContentPane().add(btnEnter);
		
		mainField = new JTextField();
		mainField.setEnabled(false);
		mainField.setEditable(false);
		mainField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mainField.setText("+88");
		mainField.setBounds(122, 110, 38, 34);
		frmPhonebook.getContentPane().add(mainField);
		mainField.setColumns(10);
	}
}
