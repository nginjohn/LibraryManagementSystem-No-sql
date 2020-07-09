package lms;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class AdminSuccess {

	public JFrame frmAdminSection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			
				try {
					AdminSuccess window = new AdminSuccess();
					window.frmAdminSection.setVisible(true);
				} 
				catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminSuccess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmAdminSection = new JFrame();
		frmAdminSection.setTitle("Admin Section");
		frmAdminSection.setBounds(100, 100, 625, 502);
		frmAdminSection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminSection.getContentPane().setLayout(null);
		frmAdminSection.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 609, 22);
		frmAdminSection.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		JMenuItem tabLoginout = new JMenuItem("Login/Logout");
		tabLoginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmAdminSection.dispose();
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
				frmAdminSection.dispose();            
			}
		});
		mnNewMenu.add(LibrarianMenubar);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem userloginout = new JMenuItem("Login/Logout");
		userloginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmAdminSection.dispose();
			}
		});
		mnNewMenu_1.add(userloginout);
		
		JMenuItem bookSectionmenubar = new JMenuItem("Book Section");
		bookSectionmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSectionTable.main(new String[]{});
				frmAdminSection.dispose();
				
			}
		});
		mnNewMenu_1.add(bookSectionmenubar);
		
		JMenuItem IssueBookmenubar = new JMenuItem("Issue Book Section");
		IssueBookmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookTable.main(new String[]{});
				frmAdminSection.dispose();
			}
		});
		mnNewMenu_1.add(IssueBookmenubar);

		JLabel lblNewLabel = new JLabel("Admin Section");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(187, 22, 253, 45);
		frmAdminSection.getContentPane().add(lblNewLabel);
		
		JButton addlib = new JButton("Librarian Section");
		addlib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdlibTable.main(new String[] {});
				frmAdminSection.dispose();
				
			}
		});
		addlib.setFont(new Font("Times New Roman", Font.BOLD, 14));
		addlib.setBounds(183, 262, 276, 66);
		frmAdminSection.getContentPane().add(addlib);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmAdminSection.dispose();
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogout.setBounds(183, 367, 276, 66);
		frmAdminSection.getContentPane().add(btnLogout);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AdminSuccess.class.getResource("/lms/admin.png")));
		lblNewLabel_1.setBounds(212, 63, 214, 165);
		frmAdminSection.getContentPane().add(lblNewLabel_1);
		
	}
}
