package lms;

import java.awt.Color;
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
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class AdlibTable {

	public JFrame frmLibrarianSection;
	public JTextField nm;
	public JTextField emailtxt;
	public JTextField cty;
	public JTextField Contactxt;
	public JTextField adrss;
	public JPasswordField passwordField;
	public JTextField idauto;
	public JTable tablebook;
	public JTextField txtdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdlibTable window = new AdlibTable();
					window.frmLibrarianSection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdlibTable() {
		initialize();
		randomnumbers();
	}
	public void randomnumbers() {
		Random ran= new Random();
		int n=ran.nextInt(100000)+1;
		String val=String.valueOf(n);
		idauto.setText(val);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmLibrarianSection = new JFrame();
		frmLibrarianSection.setTitle("Librarian Section");
		frmLibrarianSection.setBounds(100, 100, 625, 502);
		frmLibrarianSection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibrarianSection.setLocationRelativeTo(null);
		frmLibrarianSection.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();  //creating the menu bar to select all of buttons from menu
		menuBar.setBounds(0, 0, 609, 22);
		frmLibrarianSection.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		JMenuItem tabLoginout = new JMenuItem("Login/Logout");
		tabLoginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmLibrarianSection.dispose();
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
				frmLibrarianSection.dispose();             
			}
		});
		mnNewMenu.add(LibrarianMenubar);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem userloginout = new JMenuItem("Login/Logout");
		userloginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmLibrarianSection.dispose();
			}
		});
		mnNewMenu_1.add(userloginout);
		
		JMenuItem bookSectionmenubar = new JMenuItem("Book Section");
		bookSectionmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSectionTable.main(new String[]{});
				frmLibrarianSection.dispose();
				
			}
		});
		mnNewMenu_1.add(bookSectionmenubar);
		
		JMenuItem IssueBookmenubar = new JMenuItem("Issue Book Section");
		IssueBookmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookTable.main(new String[]{});
				frmLibrarianSection.dispose();
			}
		});
		mnNewMenu_1.add(IssueBookmenubar);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 126, 74, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmLibrarianSection.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 171, 74, 14);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmLibrarianSection.getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(10, 218, 74, 14);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmLibrarianSection.getContentPane().add(lblEmail);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(346, 86, 74, 14);
		lblCity.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmLibrarianSection.getContentPane().add(lblCity);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(346, 126, 68, 14);
		lblContact.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmLibrarianSection.getContentPane().add(lblContact);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(346, 171, 74, 14);
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmLibrarianSection.getContentPane().add(lblAddress);
		
		nm = new JTextField();
		nm.setBounds(90, 121, 130, 27);
		frmLibrarianSection.getContentPane().add(nm);
		nm.setColumns(10);
		
		
		emailtxt = new JTextField();
		emailtxt.setBounds(90, 213, 130, 27);
		emailtxt.setColumns(10);
		frmLibrarianSection.getContentPane().add(emailtxt);
		
		cty = new JTextField();
		cty.setBounds(426, 78, 130, 27);
		cty.setColumns(10);
		frmLibrarianSection.getContentPane().add(cty);
		
		Contactxt = new JTextField();
		Contactxt.setBounds(426, 121, 130, 27);
		Contactxt.setColumns(10);
		frmLibrarianSection.getContentPane().add(Contactxt);
		
		adrss = new JTextField();
		adrss.setBounds(426, 162, 130, 34);
		adrss.setColumns(10);
		frmLibrarianSection.getContentPane().add(adrss);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(90, 166, 130, 27);
		frmLibrarianSection.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Add - View - Delete Librarian Section");
		lblNewLabel_1.setBounds(118, 33, 333, 34);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frmLibrarianSection.getContentPane().add(lblNewLabel_1);
		DefaultTableModel dtm=new DefaultTableModel ();
		

		
		idauto = new JTextField();
		idauto.setBounds(90, 78, 130, 27);
		frmLibrarianSection.getContentPane().add(idauto);
		idauto.setColumns(10);
		idauto.setEditable(false);
		idauto.setBackground(Color.white);
		
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(10, 81, 74, 14);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmLibrarianSection.getContentPane().add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane(); 
		scrollPane.setBounds(20, 256, 568, 151);
		frmLibrarianSection.getContentPane().add(scrollPane);
		
		tablebook = new JTable();   //creating the table here
		scrollPane.setViewportView(tablebook);
		

		tablebook.setModel(dtm);
		
		JButton btnNewButton_1 = new JButton("Add Librarian");
		btnNewButton_1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				dtm.addRow(new String [] {idauto.getText(),nm.getText(),passwordField.getText(),emailtxt.getText(),adrss.getText(),cty.getText(),Contactxt.getText(),txtdate.getText()});
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.setBounds(10, 418, 118, 34);
		frmLibrarianSection.getContentPane().add(btnNewButton_1);
		
		JButton btnDeleteLibrarian_1 = new JButton("Delete Librarian");
		btnDeleteLibrarian_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int j=tablebook.getSelectedRow();  
				if(j>=0) 						//if non selected it will give error
				{
					dtm.removeRow(tablebook.getSelectedRow());
				}
				else
					JOptionPane.showMessageDialog(frmLibrarianSection,"Please select a user");
			
			}
		});
		btnDeleteLibrarian_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDeleteLibrarian_1.setBounds(170, 418, 137, 34);
		frmLibrarianSection.getContentPane().add(btnDeleteLibrarian_1);
		
		JButton btnDeleteall_1 = new JButton("Delete (ALL)");
		btnDeleteall_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				while(dtm.getRowCount()>0)
					
				{
					for(int i= 0; i<dtm.getRowCount(); i++)   //  not need to select. Just Delete ALL
					{
						dtm.removeRow(i);
					}
				}
			}
		});
		btnDeleteall_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDeleteall_1.setBounds(335, 418, 123, 34);
		frmLibrarianSection.getContentPane().add(btnDeleteall_1);
		
		JButton btnCancel_1 = new JButton("Cancel");
		btnCancel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					AdminSuccess.main(new String[]{});
					frmLibrarianSection.dispose();   //destroy the frame and going to the other defined class
				
			}
		});
		btnCancel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnCancel_1.setBounds(486, 418, 113, 34);
		frmLibrarianSection.getContentPane().add(btnCancel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(346, 219, 46, 14);
		frmLibrarianSection.getContentPane().add(lblNewLabel_3);
		
		txtdate = new JTextField();
		txtdate.setText("dd/mm/yyyy");
		txtdate.setBounds(426, 216, 130, 27);
		frmLibrarianSection.getContentPane().add(txtdate);
		txtdate.setColumns(10);
		
		dtm.setColumnIdentifiers(new String[] {"ID","Name","Password","E-mail","Address","City","Contact","Date"});
		dtm.addRow(new String[] {"66566","ali","alv354-","aligns@gmail.com","cicek sk.","Istanbul","05445851452","06/12/2019"});
		dtm.addRow(new String[] {"53296","veli","vlgs.1997+","veligs97@hotmail.com","manolya sk.","Izmir","05052935678","13/01/2020"});
		dtm.addRow(new String[] {"23785","ahmet","ahmtbjk.99","ahmtfb20@gmail.com","Nergis sk.","Ankara","05339785662","31/01/2020"});
		dtm.addRow(new String[] {"54500","ayse","ayss99.20","aysegnl20@gmail.com","barinaklar blv.","Antalya","05072399939","02/02/2020"});
		dtm.addRow(new String[] {"65361","nergis","nrgs99++","nergsglr@hotmail.com","yesilova sk.","Istanbul","05435938991","18/02/2020"});

		}
}
