package br.com.ufal.view;

import java.util.Scanner;

public class Start {

	public static void main(String args[]){
		System.out.println("1. Login");
		System.out.println("2. Cadastro");
		while(true){
			Scanner in = new Scanner(System.in);
			int i = in.nextInt();
			switch(i){
			case 1:
				Login.main(args);
			case 2:
				Signup.main(args);
			default:
			break;	
			}
		}
	}
}
