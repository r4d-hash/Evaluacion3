package com.platinum.JunitTest;

public class Usuario {
	private int rut;
	private String username;
	private int password;
	
	public Usuario() {
    }

    public Usuario(int rut, String username, int password) {
        this.rut = rut;
        this.username = username;
        this.password = password;
    }
    
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}
