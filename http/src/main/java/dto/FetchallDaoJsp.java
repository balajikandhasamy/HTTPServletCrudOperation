package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class FetchallDaoJsp {
	@Id
private String email;
private String name;
private String password;
private String role;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
