package br.com.ufal.view;

import java.util.Scanner;

import br.com.ufal.controller.CommunityController;
import br.com.ufal.model.Community;
import br.com.ufal.model.User;

public class Communities {
	public static void main(User u){
		System.out.println("1 - Suas comunidades");
		System.out.println("2 - Criar comunidade");
		System.out.println("3 - Deletar comunidade");
		while(true){
			Scanner in = new Scanner(System.in);
			int i = in.nextInt();
			switch(i){
			case 1:
				
			case 2:
				System.out.println("Nome: ");
				String name = in.nextLine();
				System.out.println("Descrição: ");
				String description = in.nextLine();
			    Community c = new Community(name, description, u);
			    CommunityController.create(c);
			case 3:
				
			default:
				break;
			}
		}
	}
}
