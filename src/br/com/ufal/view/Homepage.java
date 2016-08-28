package br.com.ufal.view;

import java.util.Scanner;

import br.com.ufal.model.User;

public class Homepage {
	public static void main(User u){
		System.out.println("1 - Perfil");
		System.out.println("2 - Amigos");
		System.out.println("3 - Chat");
		System.out.println("4 - Comunidades");
		System.out.println("5 - Procurar usuários");
		
	    while(true){
		    Scanner in = new Scanner(System.in);
		    int i = in.nextInt();
		    switch(i){
		    case 1:
		    	Profile.main(u);
		    case 2:
			
		    case 3:
			
		    case 4:
		    	Communities.main(u);
		    case 5:
			
		    }
	    }
    }
}