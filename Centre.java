package project;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class Centre extends JFrame implements ActionListener{
		
		JTextArea pad;
		
		JMenuBar bar;
		
		JMenu library,help,admin;
		
		JMenuItem borrowBook,searchBook,bookList,memberList,returnBook,addBook,addMember,deleteBook,cancelMembership,modifyInformation,howToBorrow,howToGetMembership,aboutLibrary;
		
		JLabel bookName;
		JTextField bookNameField;
		JButton search,exit;
		
		public Centre(){
			
			pad=new JTextArea();
			
			bar=new JMenuBar();
			
			library=new JMenu("Library");
			help=new JMenu("Help");
			admin=new JMenu("Admin");
			
			borrowBook=new JMenuItem("BorrowBook");
			bookList=new JMenuItem("Book List");
			returnBook=new JMenuItem("Return Books");
			addBook=new JMenuItem("Add Books");
			addMember=new JMenuItem("Add Members");
			deleteBook=new JMenuItem("Delete book");
			cancelMembership=new JMenuItem("Cancel Membership");
			modifyInformation=new JMenuItem("Modify Information");
			searchBook=new JMenuItem("Search Book");
			
			howToBorrow=new JMenuItem("How To Borrow");
			howToGetMembership=new JMenuItem("How To Get Membership");
			aboutLibrary=new JMenuItem("About Library");
			
			bookName=new JLabel("Book Name");
			bookNameField=new JTextField();
			
			search=new JButton("Search");
			exit=new JButton("Exit");
			
			
			
		}
		

		public void initCentre(){
			
			String s="Welcome to Bornoporichoy Library.";
			
			super.setJMenuBar(bar);
			super.add(pad);
			pad.setText(s);
			
			
			bar.add(library);
			bar.add(help);
			
			library.add(admin);
			library.add(bookList);
			library.add(memberList);
			library.add(returnBook);
			library.add(searchBook);
			library.add(borrowBook);
			
			admin.add(addBook);
			admin.add(addMember);
			admin.add(deleteBook);
			admin.add(cancelMembership);
			admin.add(modifyInformation);
			
			help.add(howToBorrow);
			help.add(howToGetMembership);
			help.add(aboutLibrary);
			
			GridLayout g=new GridLayout(3,2,10,10);
			super.setLayout(g);
			
			exit.addActionListener(this);
			addBook.addActionListener(this);
			addMember.addActionListener(this);
			returnBook.addActionListener(this);
			searchBook.addActionListener(this);
			deleteBook.addActionListener(this);
			
		}
		
		
		public void screenCentre(){
			
			initCentre();
			super.setSize(600,600);
			super.setLocation(200,200);
			super.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
			super.setVisible(true);
			
			
			
		}

		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==exit){
				
				super.dispose();
			}
			
			else if(e.getSource()==addBook){
				
				AddBooks ab=new AddBooks();
				ab.initAddBooks();
				
			}
			
			
			
			else if(e.getSource()==addMember){
		
				AddMembers am=new AddMembers();
				am.screenMembers();
			
			
		}
			
			
			else if(e.getSource()==returnBook){
				
				ReturnBookGUI rb=new ReturnBookGUI();
				rb.initReturnBookGUI();
				
				
			}
			
			else if(e.getSource()==searchBook){
				
				SearchBookGUI sb=new SearchBookGUI();
				sb.initSearch();
				
				
				
			}
			
			else if(e.getSource()==deleteBook){
				
				
				DeleteBookGUI db=new DeleteBookGUI();
				db.initDeleteBookGUI();
			}
			
			else if(e.getSource()==borrowBook){
				
				BorrowBookGUI bb=new BorrowBookGUI();
				bb.initBorrowBookGUI();
				
			}
			
		}
		
		
		
	}
