package br.com.ufal.view;

import java.util.Scanner;
import br.com.ufal.controller.UserController;
import br.com.ufal.model.User;

public class Signup {
	
	public static void main(String args[]){
		System.out.println("Nome de usuário: ");
		Scanner in = new Scanner(System.in);
		String login = in.nextLine();
		System.out.println("Senha: ");
		String password = in.nextLine();
		System.out.println("Nome: ");
		String name = in.nextLine();
		User u = new User(login, password, name, null);
		UserController.create(u);
		Homepage.main(u);
	}
}
