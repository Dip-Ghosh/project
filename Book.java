package project;

	import java.awt.List;
	import java.io.*;
	import java.util.*;

	import javax.swing.JOptionPane;
	
	public class Book {
		private String bookid;
		private String subject;
		private String title;
		private String author;
		private String publisher;
		private String edition;
		private String ISBN;
		
		//constructor
		public Book(String bookid,String subject,String title,String author,String publisher,
		String  edition,String ISBN)
		{
			this.bookid=bookid;
			this.subject=subject;
			this.title=title;
			this.author=author;
			this.publisher=publisher;
			this.edition=edition;
			this.ISBN=ISBN;
		
		}
		
		public String getBookID() {
			
			return bookid;
		}
		public void setBookID(String bookid) {
			this.bookid = bookid;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		public String getEdition() {
			return edition;
		}
		public void setEdition(String edition) {
			this.edition = edition;
		}
		public String getISBN() {
			return ISBN;
		}
		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}
		
	

}
