package com.sms.payload.entry;

public class UserSummary {
	private Long id;
    private String username;
    private String name;
    private String email;
    private Boolean newUser;
    
    public UserSummary(Long id, String username, String name,String email, Boolean newUser) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.email = email;
        this.newUser = newUser;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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

	public Boolean getNewUser() {
		return newUser;
	}

	public void setNewUser(Boolean newUser) {
		this.newUser = newUser;
	}
	
    
}
