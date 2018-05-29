package project;



	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.io.FileWriter;

	public class AddMembers extends JFrame implements ActionListener{

		JLabel name,address,mobile,id,email;
		
		JTextField nameField,addressField,mobileField,idField,emailField;
		
		JButton exit,add;
		//Gui
		public AddMembers(){
			
			name=new JLabel("Name");
			address=new JLabel("Address");
			mobile=new JLabel("Mobile");
			id=new JLabel("ID");
			email=new JLabel("Email");
			
			nameField=new JTextField();
			addressField=new JTextField();
			mobileField=new JTextField();
			idField=new JTextField();
			emailField=new JTextField();
			
			exit=new JButton("Exit");
			add=new JButton("Add");
			
		}
		
		public void initMembers(){
			
			GridLayout g=new GridLayout(6,2);
			super.setLayout(g);
			

			super.add(name);
			super.add(nameField);
			
			super.add(address);
			super.add(addressField);
			
			super.add(mobile);
			super.add(mobileField);
			
			super.add(id);
			super.add(idField);
			
			super.add(email);
			super.add(emailField);
			
			super.add(exit);
			super.add(add);
			
			
			add.addActionListener(this);
			exit.addActionListener(this);
			
		}
		
		
		public void screenMembers(){
			
			initMembers();
			
			super.setSize(500,500);
			super.setLocation(100,100);
			super.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
			super.setVisible(true);

			
		}
		
		//file write
		public void writeMembers(){
			
			try{
				
				FileWriter fw=new FileWriter("D:\\New folder\\fall 2014\\members.txt",true);
				                                                                  
				fw.write(nameField.getText()+",");
				fw.write(addressField.getText()+",");
				fw.write(mobileField.getText()+",");
				fw.write(idField.getText()+",");
				fw.write(emailField.getText()+",");
				
				nameField.setText("");
				addressField.setText("");
				mobileField.setText("");
				emailField.setText("");
				idField.setText("");
				fw.close();
				
				
			}
			catch(Exception e){
				
				System.out.print(e);
			}
			
		}
			
			
		
			
		

		

	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==add){
			
			writeMembers();
			
		}
		
		else if(e.getSource()==exit){
			
			super.dispose();
			
		}
		
	}

	
		
	}



