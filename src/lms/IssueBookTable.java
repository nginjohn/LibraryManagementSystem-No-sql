package lms;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class IssueBookTable {

	public JFrame frmIssueBookSection;
	public JTextField bkno;
	public JTextField stuid;
	public JTextField stuname;
	public JTextField stucontact;
	public JTable tableIssue;
	public JTextField issuetme;
	public JTextField txtDdmmyy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBookTable window = new IssueBookTable();
					window.frmIssueBookSection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IssueBookTable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmIssueBookSection = new JFrame();
		frmIssueBookSection.setTitle("Issue Book Section");
		frmIssueBookSection.setBounds(100, 100, 625, 502);
		frmIssueBookSection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIssueBookSection.getContentPane().setLayout(null);
		frmIssueBookSection.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 609, 22);
		frmIssueBookSection.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Admin");
		menuBar.add(mnNewMenu);
		
		JMenuItem tabLoginout = new JMenuItem("Login/Logout");
		tabLoginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[]{});
				frmIssueBookSection.dispose();
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
				frmIssueBookSection.dispose();             //librarian table yok tekrar yap birleştir
			}
		});
		mnNewMenu.add(LibrarianMenubar);
		
		JMenu mnNewMenu_1 = new JMenu("User");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem userloginout = new JMenuItem("Login/Logout");
		userloginout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLogin.main(new String[]{});
				frmIssueBookSection.dispose();
			}
		});
		mnNewMenu_1.add(userloginout);
		
		JMenuItem bookSectionmenubar = new JMenuItem("Book Section");
		bookSectionmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookSectionTable.main(new String[]{});
				frmIssueBookSection.dispose();
				
			}
		});
		mnNewMenu_1.add(bookSectionmenubar);
		
		JMenuItem IssueBookmenubar = new JMenuItem("Issue Book Section");
		IssueBookmenubar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookTable.main(new String[]{});
				frmIssueBookSection.dispose();
			}
		});
		mnNewMenu_1.add(IssueBookmenubar);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 162, 589, 195);
		frmIssueBookSection.getContentPane().add(scrollPane);
		
		tableIssue = new JTable();
		scrollPane.setViewportView(tableIssue);
		DefaultTableModel dtm= new DefaultTableModel();
		dtm.setColumnIdentifiers(new String [] {"Book No","Student Name","Student ID","Student Contact","Date"});
		
		dtm.addRow(new String[] {"QR@nH","Engin Can Erisen","B1505.020078","05303942211","29/05/2020"});
		dtm.addRow(new String[] {"glIMQ","Rawan Ahmed Mohammed Abu Elezz","B1605.020078","05073987743","21/05/2020"});
		dtm.addRow(new String[] {"glIMQ","Simge Ateş","B1605.020054","05455699505","26/05/2020"});
		dtm.addRow(new String[] {"bepyM","Anıl Yalçın","B1705.020043","05356788788","16/05/2020"});
		tableIssue.setModel(dtm);
		

		

		
		JLabel lblNewLabel = new JLabel("Book No");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 84, 78, 20);
		frmIssueBookSection.getContentPane().add(lblNewLabel);
		
		JLabel lblStuId = new JLabel("Stu ID");
		lblStuId.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblStuId.setBounds(10, 129, 78, 20);
		frmIssueBookSection.getContentPane().add(lblStuId);
		
		JLabel lblStuName = new JLabel("Stu Name");
		lblStuName.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblStuName.setBounds(221, 84, 78, 20);
		frmIssueBookSection.getContentPane().add(lblStuName);
		
		JLabel lblStuContact = new JLabel("Stu Contact");
		lblStuContact.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblStuContact.setBounds(221, 131, 78, 20);
		frmIssueBookSection.getContentPane().add(lblStuContact);
		
		bkno = new JTextField();
		bkno.setText(" ");
		bkno.setBounds(85, 82, 114, 27);
		frmIssueBookSection.getContentPane().add(bkno);
		bkno.setColumns(10);
		
		stuid = new JTextField();
		stuid.setText(" ");
		stuid.setColumns(10);
		stuid.setBounds(85, 124, 114, 27);
		frmIssueBookSection.getContentPane().add(stuid);
		
		stuname = new JTextField();
		stuname.setText(" ");
		stuname.setColumns(10);
		stuname.setBounds(320, 82, 114, 27);
		frmIssueBookSection.getContentPane().add(stuname);
		
		stucontact = new JTextField();
		stucontact.setText(" ");
		stucontact.setColumns(10);
		stucontact.setBounds(320, 124, 114, 27);
		frmIssueBookSection.getContentPane().add(stucontact);
		
		JButton btnNewButton = new JButton("Add Issue Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
					dtm.addRow(new String [] {bkno.getText(),stuname.getText(),stuid.getText(),stucontact.getText(),txtDdmmyy.getText()});
				
				
				
				
				}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(15, 368, 139, 34);
		frmIssueBookSection.getContentPane().add(btnNewButton);
		
		JButton btnDeleteIssuedBook = new JButton("Delete Issued Book");
		btnDeleteIssuedBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int j=tableIssue.getSelectedRow();
				if(j>=0)
				{
					dtm.removeRow(tableIssue.getSelectedRow());
				}
				else
					JOptionPane.showMessageDialog(frmIssueBookSection,"Please select a book ");
			}
		});
		btnDeleteIssuedBook.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDeleteIssuedBook.setBounds(164, 368, 177, 34);
		frmIssueBookSection.getContentPane().add(btnDeleteIssuedBook);
		
		JButton btnDeleteall = new JButton("Delete(ALL)");
		btnDeleteall.addActionListener(new ActionListener() {
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
		btnDeleteall.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDeleteall.setBounds(366, 368, 125, 34);
		frmIssueBookSection.getContentPane().add(btnDeleteall);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserSuccess.main(new String[]{});
				frmIssueBookSection.dispose();
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnCancel.setBounds(513, 368, 86, 34);
		frmIssueBookSection.getContentPane().add(btnCancel);
		
		JLabel lblNewLabel_1 = new JLabel("Add - View - Delete Issue Book Section");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(168, 33, 339, 27);
		frmIssueBookSection.getContentPane().add(lblNewLabel_1);
		
		JLabel giflbl = new JLabel(" If you will not return back on time. You will not get book for 2 weeks!");
		giflbl.setForeground(Color.RED);
		giflbl.setIcon(new ImageIcon(IssueBookTable.class.getResource("/lms/editor-1.3s-42px.gif")));
		giflbl.setBounds(40, 413, 547, 35);
		frmIssueBookSection.getContentPane().add(giflbl);
		
		JLabel lblNewLabel_2 = new JLabel("Date");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(444, 87, 46, 14);
		frmIssueBookSection.getContentPane().add(lblNewLabel_2);
		
		JLabel lblIssuteTime = new JLabel("Issue time");
		lblIssuteTime.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIssuteTime.setBounds(444, 132, 76, 14);
		frmIssueBookSection.getContentPane().add(lblIssuteTime);
		
		issuetme = new JTextField();
		issuetme.setHorizontalAlignment(SwingConstants.CENTER);
		issuetme.setText("max 2 weeks");
		issuetme.setBounds(513, 127, 86, 27);
		frmIssueBookSection.getContentPane().add(issuetme);
		issuetme.setColumns(10);
		issuetme.setEditable(false);
		issuetme.setBackground(Color.white);
		
		txtDdmmyy = new JTextField();
		txtDdmmyy.setHorizontalAlignment(SwingConstants.CENTER);
		txtDdmmyy.setText("dd/mm/yyyy");
		txtDdmmyy.setBounds(513, 82, 86, 27);
		frmIssueBookSection.getContentPane().add(txtDdmmyy);
		txtDdmmyy.setColumns(10);
		
		
		
	}
}
