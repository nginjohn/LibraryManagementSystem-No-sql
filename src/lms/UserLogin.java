package lms;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UserLogin {

	public JFrame frmUserLogin;
	public JTextField user;
	public JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin window = new UserLogin();
					window.frmUserLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmUserLogin = new JFrame();
		frmUserLogin.setTitle("User Login");
		frmUserLogin.setBounds(100, 100, 625, 502);
		frmUserLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUserLogin.getContentPane().setLayout(null);
		frmUserLogin.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 609, 22);
		frmUserLogin.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		JMenuItem tabLoginout = new JMenuItem("Login/Logout");
		tabLoginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmUserLogin.dispose();
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
				frmUserLogin.dispose();             
			}
		});
		mnNewMenu.add(LibrarianMenubar);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem userloginout = new JMenuItem("Login/Logout");
		userloginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmUserLogin.dispose();
			}
		});
		mnNewMenu_1.add(userloginout);
		
		JMenuItem bookSectionmenubar = new JMenuItem("Book Section");
		bookSectionmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSectionTable.main(new String[]{});
				frmUserLogin.dispose();
				
			}
		});
		mnNewMenu_1.add(bookSectionmenubar);
		
		JMenuItem IssueBookmenubar = new JMenuItem("Issue Book Section");
		IssueBookmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookTable.main(new String[]{});
				frmUserLogin.dispose();
			}
		});
		mnNewMenu_1.add(IssueBookmenubar);
		
		
		JLabel lblNewLabel = new JLabel("Librarian Login");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(247, 110, 184, 28);
		frmUserLogin.getContentPane().add(lblNewLabel);
		
		JLabel username = new JLabel("Enter Name: ");
		username.setFont(new Font("Tahoma", Font.BOLD, 12));
		username.setBounds(49, 170, 141, 26);
		frmUserLogin.getContentPane().add(username);
		
		JLabel lblEnterPassword = new JLabel("Enter Password: ");
		lblEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEnterPassword.setBounds(49, 238, 141, 26);
		frmUserLogin.getContentPane().add(lblEnterPassword);
		
		user = new JTextField();
		user.setBounds(232, 170, 274, 28);
		frmUserLogin.getContentPane().add(user);
		user.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String name=user.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField.getText();
				if(name.equals("ali") && password.equals("alv354-")){
					UserSuccess.main(new String[]{});
					frmUserLogin.dispose();
					
				}
				else if(name.equals("veli") && password.equals("vlgs.1997+")){
					UserSuccess.main(new String[]{});
					frmUserLogin.dispose();
					
				}
				else if(name.equals("ahmet") && password.equals("ahmtbjk.99")){
					UserSuccess.main(new String[]{});
					frmUserLogin.dispose();
					
				}
				else if(name.equals("ayse") && password.equals("ayss99.20")){
					UserSuccess.main(new String[]{});
					frmUserLogin.dispose();
					
				}
				else if(name.equals("nergis") && password.equals("nrgs99++")){
					UserSuccess.main(new String[]{});
					frmUserLogin.dispose();
					
				}
				else{
					JOptionPane.showMessageDialog(frmUserLogin, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					user.setText("");
					passwordField.setText("");
				}
				}
			}
				
			
		);
		btnNewButton.setBounds(400, 359, 148, 49);
		frmUserLogin.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(UserLogin.class.getResource("/lms/User-Interface-Login-icon.png")));
		lblNewLabel_1.setBounds(314, 33, 70, 83);
		frmUserLogin.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(232, 238, 274, 28);
		frmUserLogin.getContentPane().add(passwordField);
		
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
		chckbxNewCheckBox.setBounds(278, 294, 136, 23);
		frmUserLogin.getContentPane().add(chckbxNewCheckBox);
		
		
	
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmUserLogin.setVisible(false);
				MainPage.main(new String[]{});
			}
		});
		btnNewButton_1.setBounds(49, 359, 148, 49);
		frmUserLogin.getContentPane().add(btnNewButton_1);
		
		}
}
