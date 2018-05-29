package project;

import java.util.Date;

public class DeleteBook {
	
	private String title;
	private String bookId;
	private String memberId;
	private Date dayOfBorrow;
	private  Date dayOfReturn;
	
	//constructor
	public DeleteBook(String title, String bookId, String memberId,
			Date dayOfBorrow, Date dayOfReturn) {
		super();
		
		this.bookId = bookId;
		this.memberId = memberId;
		this.dayOfBorrow = dayOfBorrow;
		this.dayOfReturn = dayOfReturn;
		this.title=title;
	}


      //get set method
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



	public String getTitle(){
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	 
	



	
	
	
	

}
