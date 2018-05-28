package project;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.io.FileWriter;

	public class AddBooks extends JFrame implements ActionListener{

		private JLabel bookidl;
		private JLabel subjectl;
		private JLabel titlel;
		private JLabel authorl;
		private JLabel publisherl;
		private JLabel editionl;
		private JLabel ISBNl;

		private  JTextField bookid;
		private  JTextField subject;
		private  JTextField title;
		private  JTextField author;
		private  JTextField publisher;
		private  JTextField edition;
		private  JTextField ISBN;
		private JButton save;
		private JButton exit;
		
		public AddBooks(){
			
			 bookidl=new JLabel("BookID");
			 subjectl=new JLabel("Subject");
			 titlel=new JLabel("Title");
			 authorl=new JLabel("Author");
			 publisherl=new JLabel("Publisher");
			 editionl=new JLabel("Edition");
			 ISBNl=new JLabel("ISBN");
			
			 bookid=new JTextField();
			 subject=new JTextField();
			 title=new JTextField();
			 author=new JTextField();
			 publisher=new JTextField();
			 edition=new JTextField();
			 ISBN=new JTextField();
			
			 save=new JButton("Save");
			 exit=new JButton("EXIT");
			 
		}
			 
		public void initAddBooks() {
			
			 setLayout(new GridLayout(13,2,10,10));
	
			 super.add(titlel);
			 super.add(title);
			 super.add(bookidl);
			 super.add(bookid);
			 super.add(subjectl);
			 super.add(subject);
			 super.add(authorl);
			 super.add(author);
			 super.add(publisherl);
			 super.add(publisher);
			 super.add(editionl);
			 super.add(edition);
			 super.add(ISBNl);
			 super.add(ISBN);
			 
			 super.add(save);
			 super.add(exit);
			 
			 save.addActionListener(this);
			 exit.addActionListener(this);
			 
			 super.setSize(500,500);
			 super.setVisible(true);
		     
			
		}
		
		
		
		
		public void writeBooks(){
			
			try{
				
				FileWriter fw=new FileWriter("D:\\New folder\\fall2014\\Books.txt",true);
				                                                                  
				fw.write(bookid.getText()+"\n");
				fw.write(subject.getText()+"\n");
				fw.write(title.getText()+"\n");
				fw.write(author.getText()+"\n");
				fw.write(publisher.getText()+"\n");
				fw.write(edition.getText()+"\n");
				fw.write(ISBN.getText()+"\n");
				
				bookid.setText("");
				subject.setText("");
				title.setText("");
				author.setText("");
				publisher.setText("");
				edition.setText("");
				ISBN.setText("");
				fw.close();
				
				
			}
			catch(Exception e){
				
				System.out.print(e);
			}
			
		}
			
			
		
			
		

		

	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==save){
			
			writeBooks();
			
		}
		
		else if (e.getSource()==exit){
			
			super.dispose();
			
		}
		
		
		
		
	}

	
	

	}



