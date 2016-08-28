package br.com.ufal.view;

import java.util.ArrayList;
import java.util.Scanner;
import br.com.ufal.controller.ChatController;
import br.com.ufal.model.User;

public class Chat {
	public static void main(User u){
		ArrayList<User> friends = u.getFriends();
		int i=1;
		for(User friend : friends){
			System.out.println(i+" - "+friend.getName());
		
		}
	Scanner in = new Scanner(System.in);
	int j = in.nextInt();
	}
	
}
	
