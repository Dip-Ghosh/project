package project;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteBookGUI extends JFrame implements ActionListener{

	private DeleteBook[]bbook;
	
	private JLabel title;
	private JLabel bookId;
	private JLabel memberId;
	private JLabel dateOfBorrow;
	private JLabel dateOfReturn;
	
	private  JTextField titleField;
	private  JTextField bookIdField;
	private  JTextField memberIdField;
	private  JTextField dateOfBorrowField;
	private  JTextField dateOfReturnField;
    private JButton save;
    
    public DeleteBookGUI(){
    	
    	
    	 bbook=new DeleteBook[100];
    	 
    	 title=new JLabel("Book Title");
    	 bookId=new JLabel("BookID");
		 memberId=new JLabel("MemberID");
		 dateOfBorrow=new JLabel("Date of Borrow");
		 dateOfReturn=new JLabel("Date of Return");
		
		 
		 titleField=new JTextField("");
		 bookIdField=new JTextField("");
		 memberIdField=new JTextField("");
		 dateOfBorrowField=new JTextField("");
		 dateOfReturnField=new JTextField("");
		 
	
		
		 save=new JButton("Save");
	
    	
    }
    
    public void initDeleteBookGUI() {
		
    	super.add(title);
    	super.add(titleField);
		 super.add(bookId);
		 super.add(bookIdField);
		 super.add(memberId);
		 super.add(memberIdField);
		 super.add(dateOfBorrow);
		 super.add(dateOfBorrowField);
		 super.add(dateOfReturn);
		 super.add(dateOfReturnField);
		 super.add(save);
		
		 save.addActionListener(this);
	
		 setLayout(new GridLayout(6,2,10,10));
		 
		 super.setSize(500, 500);
		 super.setVisible(true);
		 
		 save.addActionListener(this);
		 
		 
		 
	}

	public DeleteBook serachBook(String title){
		DeleteBook bb = null;
		
		for(int i = 0; i < bbook.length; i++){
			if(bbook[i]!=null && bbook[i].getTitle() == title){
				bbook[i]=null;
				break;
			}
		}
		
		return bb;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String i="Available";
		String j="Not Available";
		
		if(e.getSource() == save){
			String title = titleField.getText();
			DeleteBook x = DeleteBook(title);
			
			
			
			
		}
		
		
	}


	
    
}
