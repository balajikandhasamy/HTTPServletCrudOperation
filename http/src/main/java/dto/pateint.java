package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class pateint {
	@Id
private String p_id;
private String p_name;
private String p_bg;
public String getP_id() {
	return p_id;
}
public void setP_id(String p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
}
public String getP_bg() {
	return p_bg;
}
public void setP_bg(String p_bg) {
	this.p_bg = p_bg;
}
@Override
public String toString() {
	return "pateint [p_id=" + p_id + ", p_name=" + p_name + ", p_bg=" + p_bg + "]";
}
}
