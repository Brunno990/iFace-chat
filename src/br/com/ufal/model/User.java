package br.com.ufal.model;
import java.util.ArrayList;

public class User {

	private String login;
	private String password;
	private String name;
	ArrayList<User> friends = new ArrayList();
	
	public User(String login, String password, String name, ArrayList<User> friends){
		this.login = login;
		this.password = password;
		this.name = name;
		this.friends = friends;
	}
	
	public String getLogin(){
		return this.login;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void editLogin(String login){
		this.setLogin(login);
	}
	
	public void editPassword(String Password){
		this.setPassword(password);
	}
	
	public void editName(String name){
		this.setName(name);
	}
	
	public ArrayList<User> getFriends(){
		return this.friends;
	}
}
