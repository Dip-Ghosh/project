package project;



	import java.util.Date;

	public class ReturnBook {
		
		private double fine;
		private String bookId;
		private String memberId;
		private Date dayOfBorrow;
		private  Date dayOfReturn;
		
		public String getBookId() {
			return bookId;
		}
		public void setBookId(String bookId) {
			this.bookId = bookId;
		}
		public String getMemberId() {
			return memberId;
		}
		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}
		public Date getDayOfBorrow() {
			return dayOfBorrow;
		}
		public void setDayOfBorrow(Date dayOfBorrow) {
			this.dayOfBorrow = dayOfBorrow;
		}
		public Date getDayOfReturn() {
			return dayOfReturn;
		}
		public void setDayOfReturn(Date dayOfReturn) {
			this.dayOfReturn = dayOfReturn;
		}
		public double getFine() {
			return fine;
		}
		public void setFine(double fine) {
			this.fine = fine;
		}
		
		public ReturnBook(String bookId, String memberId, Date dayOfBorrow,
				Date dayOfReturn, double fine) {
			
			this.bookId = bookId;
			this.memberId = memberId;
			this.dayOfBorrow = dayOfBorrow;
			this.dayOfReturn = dayOfReturn;
			this.fine = fine;
		}
		
		public int calculateFine(){
			
				if(dayOfReturn.after(new Date())){
					
					     Date today = new Date();
						 int timeElapsed = dayOfReturn.getSeconds() - today.getSeconds();
						 Date elapse = new Date(timeElapsed);
						
						 return elapse.getDay() * 5;
				}
			
			return 0;                                                                                                  
			
		}

	}


