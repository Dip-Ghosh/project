package project;

	import java.io.FileWriter;

	import javax.swing.JOptionPane;

	public class AddMembersCode {
		private String name;
		private String address;
		private String mobile;
		private String id;
		private String email;
		
		public AddMembersCode(String name,String address,String mobile,String id,String email){
			
			this.name=name;
			this.address=address;
			this.mobile=mobile;
			this.id=id;
			this.email=email;
			
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		/*public   void saveMember(AddMembers aMember)
		{
			try{
				FileWriter fw=new FileWriter("D:\\AddMember.txt",true);
				String Memberinfo=String .format(aMember.name()+" , "+" , "+aMember.getAddress()+" , "+aMember.id+" , "+aMember.email);
				fw.write(Memberinfo);
				fw.write("\r\n");
				fw.close();
				JOptionPane.showMessageDialog(null, "Record saved");
				
				
			}catch(Exception e)
			
			{
				System.out.println(e.getMessage());
			}
		

	}*/
	}


