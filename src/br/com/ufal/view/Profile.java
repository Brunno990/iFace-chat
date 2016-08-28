package br.com.ufal.view;

import java.util.Scanner;
import br.com.ufal.model.User;
import br.com.ufal.view.Homepage;

public class Profile {

	public static void main(User u){
		System.out.println(u.getName());
		System.out.println("Nome de usuário: "+u.getLogin());
		System.out.println("1 - Editar nome");
		System.out.println("2 - Editar nome de usuário");
		System.out.println("3 - Editar senha");
		System.out.println("4 - Deletar conta");
		System.out.println("5 - Voltar");
		while(true){
			Scanner in = new Scanner(System.in);
			int i = in.nextInt();
			switch(i){
			case 1:
				System.out.println("Novo nome: ");
				String name = in.nextLine();
				u.setName(name);
			case 2:
				System.out.println("Novo nome de usuário: ");
				String login = in.nextLine();
				u.setLogin(login);
			case 3:
				System.out.println("Nova senha: ");
				String pass = in.nextLine();
				u.setPassword(pass);
			case 4:
				
			case 5:
				return;
			default:
				break;
			}
		}
	}
}
