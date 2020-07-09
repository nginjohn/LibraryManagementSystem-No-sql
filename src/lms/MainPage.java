package lms;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

import lms.AdminLogin;
import lms.UserLogin;

@SuppressWarnings("unused")
public class MainPage {

	public JFrame frmMainPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frmMainPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmMainPage = new JFrame();
		frmMainPage.setTitle("Main Page");
		frmMainPage.setBounds(100, 100, 625, 502);
		frmMainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainPage.getContentPane().setLayout(null);
		frmMainPage.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 609, 22);
		frmMainPage.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		UserLogin ug=new UserLogin();
		JMenuItem tabLoginout = new JMenuItem("Login/Logout");
		tabLoginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmMainPage.dispose();
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
				frmMainPage.dispose();            
			}
		});
		mnNewMenu.add(LibrarianMenubar);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem userloginout = new JMenuItem("Login/Logout");
		userloginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmMainPage.dispose();
			}
		});
		mnNewMenu_1.add(userloginout);
		
		JMenuItem bookSectionmenubar = new JMenuItem("Book Section");
		bookSectionmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSectionTable.main(new String[]{});
				frmMainPage.dispose();
				
			}
		});
		mnNewMenu_1.add(bookSectionmenubar);
		
		JMenuItem IssueBookmenubar = new JMenuItem("Issue Book Section");
		IssueBookmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookTable.main(new String[]{});
				frmMainPage.dispose();
			}
		});
		mnNewMenu_1.add(IssueBookmenubar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainPage.class.getResource("/lms/ssss.png")));
		lblNewLabel.setBounds(155, 30, 263, 111);
		frmMainPage.getContentPane().add(lblNewLabel);
		
		JButton AdminLog = new JButton("Admin Login");
		AdminLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmMainPage.dispose();
			}
		});
		AdminLog.setFont(new Font("Times New Roman", Font.BOLD, 16));
		AdminLog.setBounds(155, 174, 251, 58);
		frmMainPage.getContentPane().add(AdminLog);
		
		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmMainPage.dispose();
			}
		});
		btnLibrarianLogin.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLibrarianLogin.setBounds(155, 271, 251, 58);
		frmMainPage.getContentPane().add(btnLibrarianLogin);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MainPage.class.getResource("/lms/iconfinder_power-off_1608429 (1).png")));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(424, 359, 133, 58);
		frmMainPage.getContentPane().add(btnNewButton_1);

			}
}
