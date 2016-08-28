package br.com.ufal.model;

public class Community {

	private String name;
	private String description;
	private User u;

	public Community(String name, String description, User u){
		this.name = name;
		this.description = description;
		this.u = u;
	}
	
	public void addMember(User u){
		
	}
	
	public void removeMember(User u){
		
	}
}
