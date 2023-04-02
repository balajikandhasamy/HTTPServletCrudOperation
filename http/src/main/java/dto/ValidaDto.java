package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ValidaDto {
	@Id
private String emailid;
private String pwd;
private String dob;
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}

}
