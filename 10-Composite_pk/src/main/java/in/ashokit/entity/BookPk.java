package in.ashokit.entity;

import jakarta.persistence.Embeddable;

@Embeddable

public class BookPk {
	private Integer bookId;
	public BookPk(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	private String bookName;

}
