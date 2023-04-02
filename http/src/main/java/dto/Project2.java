package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Project2 {
	@Id
	private String pwd;
private String username;
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}


}
