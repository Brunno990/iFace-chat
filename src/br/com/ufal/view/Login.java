package br.com.ufal.view;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		System.out.println("Nome de usuário: ");
		Scanner in = new Scanner(System.in);
		String login = in.nextLine();
		System.out.println("Senha: ");
		String password = in.nextLine();
	}
}
