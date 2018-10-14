package com.umg.models;



/**
 * @author valdana
 * @version 1.0
 * @created 08-oct.-2018 11:18:42 p. m.
 */
public class User {

	private long id;
	private String username;
	private String name;
	private String email;
	private String password;
        private int status;
	public User(){

	}

    public User(long id, String username, String name, String email, String password, int status) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

	
    
}