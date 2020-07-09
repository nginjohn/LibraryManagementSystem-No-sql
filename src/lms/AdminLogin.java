package lms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;


public class AdminLogin {

	public JFrame frmAdminLogin;
	public JTextField user;
	public JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
					window.frmAdminLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmAdminLogin = new JFrame();
		frmAdminLogin.setTitle("Admin Login");
		frmAdminLogin.setBounds(100, 100, 625, 502);
		frmAdminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminLogin.getContentPane().setLayout(null);
		frmAdminLogin.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 609, 22);
		frmAdminLogin.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		JMenuItem tabLoginout = new JMenuItem("Login/Logout");
		tabLoginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmAdminLogin.dispose();
			}
		});
		mnNewMenu.add(tabLoginout);
		
		JMenuItem tabCreate = new JMenuItem("Create");
		mnNewMenu.add(tabCreate);
		
		JMenuItem tabReset = new JMenuItem("Reset");
		mnNewMenu.add(tabReset);
		
		JMenuItem LibrarianMenubar = new JMenuItem("Librarian");
		LibrarianMenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				AdlibTable.main(new String[]{});
				frmAdminLogin.dispose();             
			}
		});
		mnNewMenu.add(LibrarianMenubar);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem userloginout = new JMenuItem("Login/Logout");
		userloginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmAdminLogin.dispose();
			}
		});
		mnNewMenu_1.add(userloginout);
		
		JMenuItem bookSectionmenubar = new JMenuItem("Book Section");
		bookSectionmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSectionTable.main(new String[]{});
				frmAdminLogin.dispose();
				
			}
		});
		mnNewMenu_1.add(bookSectionmenubar);
		
		JMenuItem IssueBookmenubar = new JMenuItem("Issue Book Section");
		IssueBookmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookTable.main(new String[]{});
				frmAdminLogin.dispose();
			}
		});
		mnNewMenu_1.add(IssueBookmenubar);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(211, 113, 160, 28);
		frmAdminLogin.getContentPane().add(lblNewLabel);
		
		JLabel username = new JLabel("Enter Name: ");
		username.setFont(new Font("Tahoma", Font.BOLD, 12));
		username.setBounds(64, 183, 141, 22);
		frmAdminLogin.getContentPane().add(username);
		
		JLabel lblEnterPassword = new JLabel("Enter Password: ");
		lblEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterPassword.setBounds(64, 240, 141, 22);
		frmAdminLogin.getContentPane().add(lblEnterPassword);
		
		user = new JTextField();
		user.setBounds(265, 181, 189, 28);
		frmAdminLogin.getContentPane().add(user);
		user.setColumns(10);
		
		JLabel lbl_name = new JLabel("");
		lbl_name.setBounds(200, 127, 146, 14);
		frmAdminLogin.getContentPane().add(lbl_name);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AdminLogin.class.getResource("/lms/User-Interface-Login-icon.png")));
		lblNewLabel_1.setBounds(262, 31, 56, 71);
		frmAdminLogin.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(265, 238, 189, 28);
		frmAdminLogin.getContentPane().add(passwordField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBounds(318, 291, 136, 23);
		frmAdminLogin.getContentPane().add(chckbxNewCheckBox);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage.main(new String[]{});
				frmAdminLogin.dispose();
			}
		});
		Cancel.setBounds(141, 372, 136, 40);
		frmAdminLogin.getContentPane().add(Cancel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name=user.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField.getText();
				if(name.equals("admin")&&password.equals("admin123")){
					AdminSuccess.main(new String[]{});
					frmAdminLogin.dispose();
					
				}
				else{
					JOptionPane.showMessageDialog(frmAdminLogin, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					user.setText("");
					passwordField.setText("");
				}
			}
		});
		btnNewButton.setBounds(378, 372, 136, 40);
		frmAdminLogin.getContentPane().add(btnNewButton);
		}
}
