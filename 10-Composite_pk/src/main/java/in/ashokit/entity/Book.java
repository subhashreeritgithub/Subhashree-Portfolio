package in.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Books_Info_Tbl")
public class Book {
	private Double bookPrice;
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public BookPk getBookpk() {
		return bookpk;
	}
	public void setBookpk(BookPk bookpk) {
		this.bookpk = bookpk;
	}
	private String authorName;
	public Book() {
		
	}
	
public Book(Double bookPrice, String authorName, BookPk bookpk) {
		super();
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.bookpk = bookpk;
	}
@EmbeddedId	
	private BookPk bookpk;
}
