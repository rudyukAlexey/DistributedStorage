package entities;

import java.io.Serializable;
import javax.persistence.*;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private String login;

	private String password;

public User() {
	
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
}