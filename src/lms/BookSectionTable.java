package lms;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;

public class BookSectionTable {

	JFrame frmdsa;
	public JTextField bn;
	private JTextField nm;
	public JTextField aut;
	public JTextField pbls;
	public JTextField qtt;
	public Object frmbkst;
	public JTable tablebook;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookSectionTable window = new BookSectionTable();
					window.frmdsa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookSectionTable() {
		initialize();
		randomString();
	}
	public void randomString() {
		String characters= "AbcDeFgH@IKlMnQpRsTuVyZ";
		String randomString ="";
		int length= 5;
		Random rand= new Random();
		char[] text=new char[length];
		for(int i=0;i<length;i++) {
			text[i]=characters.charAt(rand.nextInt(characters.length()));
		}
		for(int i=0; i<text.length; i++) {
			randomString +=text[i];
			bn.setText(randomString);
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmdsa = new JFrame();
		frmdsa.setTitle("Book Section");
		frmdsa.setBounds(100, 100, 625, 502);
		frmdsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmdsa.getContentPane().setLayout(null);
		frmdsa.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 609, 22);
		frmdsa.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		JMenuItem tabLoginout = new JMenuItem("Login/Logout");
		tabLoginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmdsa.dispose();
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
				frmdsa.dispose();             //librarian table yok tekrar yap birleÅŸtir
			}
		});
		mnNewMenu.add(LibrarianMenubar);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem userloginout = new JMenuItem("Login/Logout");
		userloginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmdsa.dispose();
			}
		});
		mnNewMenu_1.add(userloginout);
		
		JMenuItem bookSectionmenubar = new JMenuItem("Book Section");
		bookSectionmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSectionTable.main(new String[]{});
				frmdsa.dispose();
				
			}
		});
		mnNewMenu_1.add(bookSectionmenubar);
		
		JMenuItem IssueBookmenubar = new JMenuItem("Issue Book Section");
		IssueBookmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookTable.main(new String[]{});
				frmdsa.dispose();
			}
		});
		mnNewMenu_1.add(IssueBookmenubar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 213, 579, 170);
		frmdsa.getContentPane().add(scrollPane);
		DefaultTableModel dtm=new DefaultTableModel ();
		tablebook = new JTable();
		scrollPane.setViewportView(tablebook);
		tablebook.setModel(dtm);
		
		dtm.setColumnIdentifiers(new String [] {"Book No","Name","Author","Publisher","Quantity"});
		dtm.addRow(new String[] {"QR@nH","Fundamentals of Electric Circuit","Charles K. Alexander","Raghothaman Srinivasan"," 2 ( Available : 1)"});
		dtm.addRow(new String[] {"glIMQ","Electronics","Muhammad H. Rashid","Nobel Akademik Yayincilik; 4. baski"," 2 ( Available : 0)"});
		dtm.addRow(new String[] {"RIZyQ","Power Engineering","Patrick McAvay","WSPC"," 2 ( Available : 2)"});
		dtm.addRow(new String[] {"bepyM","Energy Transformation","Claude Turmes","Biteback Publishing"," 3 ( Available : 2)"});
		dtm.addRow(new String[] {"bMFRg","C Programming","	Brian Kernighan","Prentice Hall"," 1 ( Available : 1)"});

		
		JLabel lblNewLabel = new JLabel("Add - View - Return Book Section");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(145, 33, 343, 47);
		frmdsa.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book No");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 114, 66, 14);
		frmdsa.getContentPane().add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblName.setBounds(10, 169, 66, 14);
		frmdsa.getContentPane().add(lblName);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAuthor.setBounds(241, 114, 66, 14);
		frmdsa.getContentPane().add(lblAuthor);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPublisher.setBounds(241, 169, 66, 14);
		frmdsa.getContentPane().add(lblPublisher);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblQuantity.setBounds(449, 114, 66, 14);
		frmdsa.getContentPane().add(lblQuantity);
		
		bn = new JTextField();
		bn.setBounds(86, 110, 104, 22);
		frmdsa.getContentPane().add(bn);
		bn.setColumns(10);
		bn.setEditable(false);
		bn.setBackground(Color.white);
		
		nm = new JTextField();
		nm.setColumns(10);
		nm.setBounds(86, 165, 104, 22);
		frmdsa.getContentPane().add(nm);
		
		aut = new JTextField();
		aut.setColumns(10);
		aut.setBounds(317, 111, 104, 22);
		frmdsa.getContentPane().add(aut);
		
		pbls = new JTextField();
		pbls.setColumns(10);
		pbls.setBounds(317, 166, 104, 22);
		frmdsa.getContentPane().add(pbls);
		
		qtt = new JTextField();
		qtt.setColumns(10);
		qtt.setBounds(525, 111, 76, 22);
		frmdsa.getContentPane().add(qtt);
		
		JButton btnNewButton = new JButton("Add Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtm.addRow(new String [] {bn.getText(),nm.getText(),aut.getText(),pbls.getText(),qtt.getText()});

			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(10, 410, 104, 35);
		frmdsa.getContentPane().add(btnNewButton);
		
		JButton btnRemoveBook = new JButton("Delete Book");
		btnRemoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int j=tablebook.getSelectedRow();  
				if(j>=0) 						//if non selected it will give error
				{
					dtm.removeRow(tablebook.getSelectedRow());
				}
				else
					JOptionPane.showMessageDialog(frmdsa,"Please select a book");
			
			}
		});
		btnRemoveBook.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRemoveBook.setBounds(146, 410, 130, 35);
		frmdsa.getContentPane().add(btnRemoveBook);
		
		JButton btnDeleteBookall = new JButton("Delete Book (ALL)");
		btnDeleteBookall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				while(dtm.getRowCount()>0)
					
				{
					for(int i= 0; i<dtm.getRowCount(); i++)
					{
						dtm.removeRow(i);
					}
				}
			}
		});
		btnDeleteBookall.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDeleteBookall.setBounds(299, 410, 178, 35);
		frmdsa.getContentPane().add(btnDeleteBookall);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserSuccess.main(new String[]{});
				frmdsa.dispose();
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnCancel.setBounds(510, 410, 89, 35);
		frmdsa.getContentPane().add(btnCancel);
		
		
		
	}
}
