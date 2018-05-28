package project;

	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.print.Book;
	import java.util.Date;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class ReturnBookGUI extends JFrame implements ActionListener{
		private JLabel bookIdl;
		private JLabel memberIdl;
		private JLabel dateOfBorrowl;
		private JLabel dateOfReturnl;
		private JLabel finel;
		
		private  JTextField bookId;
		private  JTextField memberId;
		private  JTextField dateOfBorrow;
		private  JTextField dateOfReturn;
		private  JTextField fine;
	    private JButton save;
		
		public ReturnBookGUI()
		{
			 bookIdl=new JLabel("BookID");
			 memberIdl=new JLabel("MemberID");
			 dateOfBorrowl=new JLabel("Date of Borrow");
			 dateOfReturnl=new JLabel("Date of Return");
			 finel=new JLabel("Fine");
			 
			
			 bookId=new JTextField("");
			 memberId=new JTextField("");
			 dateOfBorrow=new JTextField("");
			 dateOfReturn=new JTextField("");
			 fine=new JTextField("");
		
			
			 save=new JButton("Save");
		
		}
			 
		public void initReturnBookGUI() {
			
			 
			 super.add(bookIdl);
			 super.add(bookId);
			 super.add(memberIdl);
			 super.add(memberId);
			 super.add(dateOfBorrowl);
			 super.add(dateOfBorrow);
			 super.add(dateOfReturnl);
			 super.add(dateOfReturn);
			 super.add(finel);
			 super.add(fine);
			 super.add(save);
			
			 save.addActionListener(this);
		
			 setLayout(new GridLayout(6,2,10,10));
			 
			 super.setSize(500, 500);
			 super.setVisible(true);
			 
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==save)
				{
					
					
				
					bookId.getText();
					memberId.getText();
					dateOfBorrow.getText();
					dateOfReturn.getText();
					fine.getText();
						
					bookId.setText("");
					memberId.setText("");
					dateOfBorrow.setText("");
					dateOfReturn.setText("");
					fine.setText("");
				
					
				}	
			
			}

		
		
	


	}



