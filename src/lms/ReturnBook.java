package lms;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ReturnBook {

	public JFrame frame;
	public JTextField bookno;
	public JTextField stuid;
	public JTextField txtDdmmyyyy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnBook window = new ReturnBook();
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
	public ReturnBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 625, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 609, 22);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		JMenuItem tabLoginout = new JMenuItem("Login/Logout");
		tabLoginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frame.dispose();
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
				frame.dispose();            
			}
		});
		mnNewMenu.add(LibrarianMenubar);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem userloginout = new JMenuItem("Login/Logout");
		userloginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frame.dispose();
			}
		});
		mnNewMenu_1.add(userloginout);
		
		JMenuItem bookSectionmenubar = new JMenuItem("Book Section");
		bookSectionmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSectionTable.main(new String[]{});
				frame.dispose();
				
			}
		});
		mnNewMenu_1.add(bookSectionmenubar);
		
		JMenuItem IssueBookmenubar = new JMenuItem("Issue Book Section");
		IssueBookmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookTable.main(new String[]{});
				frame.dispose();
			}
		});
		mnNewMenu_1.add(IssueBookmenubar);
		
		JLabel lblNewLabel = new JLabel("Return Book");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setBounds(230, 50, 158, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book No");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(48, 138, 122, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblStudentId = new JLabel("Stu ID");
		lblStudentId.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblStudentId.setBounds(48, 215, 115, 31);
		frame.getContentPane().add(lblStudentId);
		
		bookno = new JTextField();
		bookno.setBounds(244, 139, 204, 38);
		frame.getContentPane().add(bookno);
		bookno.setColumns(10);
		
		stuid = new JTextField();
		stuid.setColumns(10);
		stuid.setBounds(244, 212, 200, 38);
		frame.getContentPane().add(stuid);
		
		JButton returnbook = new JButton("Return Book");
		returnbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(bookno.getText().isEmpty() || stuid.getText().isEmpty()) {
						JOptionPane.showMessageDialog(frame,"You Must Fill Fully");

			    		
			    	}
				else if(bookno.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(frame,"Please Fill Fully");
				}
				else if(stuid.getText().isEmpty() ) {
						JOptionPane.showMessageDialog(frame,"Please Fill Fully");
				}
				else {
				JOptionPane.showMessageDialog(frame, "Book is Returned!", null, JOptionPane.PLAIN_MESSAGE);
			}}
		});
		returnbook.setFont(new Font("Times New Roman", Font.BOLD, 16));
		returnbook.setForeground(Color.BLACK);
		returnbook.setBounds(399, 340, 158, 50);
		frame.getContentPane().add(returnbook);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnCancel.setBounds(48, 340, 158, 50);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel_2 = new JLabel("Please Return books on time!");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setIcon(new ImageIcon(ReturnBook.class.getResource("/lms/Warning.png")));
		lblNewLabel_2.setBounds(191, 401, 253, 31);
		frame.getContentPane().add(lblNewLabel_2);
			
		JLabel lblNewLabel_3 = new JLabel("Return Date");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(48, 280, 122, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtDdmmyyyy = new JTextField();
		txtDdmmyyyy.setText("dd/mm/yyyy");
		txtDdmmyyyy.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtDdmmyyyy.setBounds(244, 282, 200, 38);
		frame.getContentPane().add(txtDdmmyyyy);
		txtDdmmyyyy.setColumns(10);
	}

}
