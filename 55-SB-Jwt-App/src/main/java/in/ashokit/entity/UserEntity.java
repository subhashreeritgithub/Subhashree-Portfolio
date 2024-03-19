package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue
	private Integer uerid;
	public Integer getUerid() {
		return uerid;
	}
	public void setUerid(Integer uerid) {
		this.uerid = uerid;
	}
	public String getUnmae() {
		return unmae;
	}
	public void setUnmae(String unmae) {
		this.unmae = unmae;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	private String unmae;
	private String upwd;
	private Long phno;
	

}
