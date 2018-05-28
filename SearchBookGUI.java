package project;



	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.io.File;
	import java.util.Scanner;

	public class SearchBookGUI extends JFrame implements ActionListener{
		
		
		private static final SearchBook[] SearchBook = null;

		private SearchBook[] book;
		
		private JLabel title,status;
		
		private JTextField titleField,statusField;
		
		private JButton booked,search;
		
		public SearchBookGUI(){
			
			book=new SearchBook[100];
			title= new JLabel("Title");
			status=new JLabel("Status");
			titleField=new JTextField();
			statusField=new JTextField();
			booked=new JButton("Booked");
			search=new JButton("Search");
			
			super.add(title);
			super.add(titleField);
			super.add(status);
			super.add(statusField);
			super.add(booked);
			super.add(search);
			
		}

		public void initSearch(){
			
			
			try{
			
			
			File f = new File("D:\\New folder\\fall2014\\Books.txt");
			Scanner s = new Scanner(f);
			int index = 0;
			
			while(s.hasNextLine()==true){
				String title = s.nextLine();
				String bookId = s.nextLine();
				String subject= s.nextLine();
				String author= s.nextLine();
				String publisher= s.nextLine();
				String edition= s.nextLine();
				String isbn= s.nextLine();
				
				SearchBook temp = new SearchBook(title,bookId,subject,author,publisher,edition,isbn);
				SearchBook[index] = temp;
				index ++;
			}
			
			s.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
			search.addActionListener(this);
			booked.addActionListener(this);
			
			
			
		}
		

		public SearchBook serachBook(String title){
			SearchBook sb = null;
			
			for(int i = 0; i < book.length; i++){
				if(book[i]!=null && book[i].getTitle() == title){
					sb = book[i];
					break;
				}
			}
			
			return sb;
		}
		
		public void actionPerformed(ActionEvent e) {
			
			String i="Available";
			String j="Not Available";
			
			if(e.getSource() == search){
				String title = titleField.getText();
				SearchBook x = serachBook(title);
				
				if(x != null){
					statusField.setText(i);
					
				}
				
				else{
					statusField.setText(j);
				}
			}
			
			
			else if(e.getSource()==booked){
				
				
			}
		}


	}

