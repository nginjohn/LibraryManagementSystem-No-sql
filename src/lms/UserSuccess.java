package lms;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class UserSuccess {

	public JFrame frmLibrarianUserSection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserSuccess window = new UserSuccess();
					window.frmLibrarianUserSection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public UserSuccess() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	
	public void initialize() {
		frmLibrarianUserSection = new JFrame();
		frmLibrarianUserSection.setTitle("Librarian - User Section");
		frmLibrarianUserSection.setBounds(100, 100, 625, 502);
		frmLibrarianUserSection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibrarianUserSection.getContentPane().setLayout(null);
		frmLibrarianUserSection.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 609, 22);
		frmLibrarianUserSection.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		JMenuItem tabLoginout = new JMenuItem("Login/Logout");
		tabLoginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmLibrarianUserSection.dispose();
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
				frmLibrarianUserSection.dispose();           
			}
		});
		mnNewMenu.add(LibrarianMenubar);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem userloginout = new JMenuItem("Login/Logout");
		userloginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmLibrarianUserSection.dispose();
			}
		});
		mnNewMenu_1.add(userloginout);
		
		JMenuItem bookSectionmenubar = new JMenuItem("Book Section");
		bookSectionmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSectionTable.main(new String[]{});
				frmLibrarianUserSection.dispose();
			}
		});
		mnNewMenu_1.add(bookSectionmenubar);
		
		JMenuItem IssueBookmenubar = new JMenuItem("Issue Book Section");
		IssueBookmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookTable.main(new String[]{});
				frmLibrarianUserSection.dispose();
			}
		});
		mnNewMenu_1.add(IssueBookmenubar);
		
		JLabel lblNewLabel = new JLabel("User-Librarian Section");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(163, 35, 289, 56);
		frmLibrarianUserSection.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Book Section");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BookSectionTable.main(new String[]{});
				frmLibrarianUserSection.dispose();
				
				
				
			
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(173, 102, 281, 56);
		frmLibrarianUserSection.getContentPane().add(btnNewButton);
		
		JButton btnIssueBooks = new JButton("Issue Book Section");
		btnIssueBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				IssueBookTable.main(new String[]{});
				frmLibrarianUserSection.dispose();
				
			}
		});
		btnIssueBooks.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnIssueBooks.setBounds(173, 199, 281, 56);
		frmLibrarianUserSection.getContentPane().add(btnIssueBooks);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmLibrarianUserSection.dispose();
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnLogout.setBounds(171, 365, 281, 56);
		frmLibrarianUserSection.getContentPane().add(btnLogout);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBook.main(new String[] {});
				frmLibrarianUserSection.dispose();

				
			}
		});
		btnReturnBook.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReturnBook.setBounds(173, 286, 281, 56);
		frmLibrarianUserSection.getContentPane().add(btnReturnBook);
	}

}
