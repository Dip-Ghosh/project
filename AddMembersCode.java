package project;

	import java.io.FileWriter;
	import javax.swing.JOptionPane;

	public class AddMembersCode {
		private String name;
		private String address;
		private String mobile;
		private String id;
		private String email;
		
		//constructor
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
		
		

	}
	}


