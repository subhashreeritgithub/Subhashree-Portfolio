package in.ashokit;

public class Customer {
	 private Integer cid;
	 private String cname;
	 
	 public Customer(Integer cid, String cname, String cemail) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
	}
	public Customer() {
		 
	 }
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
	}
	private String cemail;
	 

}
