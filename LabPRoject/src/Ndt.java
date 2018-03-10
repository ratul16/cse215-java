import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Ndt {

	private JFrame frame;
	private JTextField pingField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ndt window = new Ndt();
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
	public Ndt() {
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
		final JTextArea textArea_1 = new JTextArea();
		
		JButton btnPing = new JButton("Ping");
		btnPing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String p1=pingField.getText();
				String test = "ping "+p1;
				
				Process sysProcess = null;
				try {
					sysProcess = Runtime.getRuntime().exec(test);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				BufferedReader pingreader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
				
				String line;
				String nextline = "\n";
				try {
					while(( line = pingreader.readLine()) !=null){
						
					System.out.println(line);
					textArea_1.append(line + nextline);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btnPing.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnPing);
		
		pingField = new JTextField();
		pingField.setBounds(132, 12, 246, 20);
		frame.getContentPane().add(pingField);
		pingField.setColumns(10);
		
		//JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 45, 414, 205);
		frame.getContentPane().add(textArea_1);
	}
}
