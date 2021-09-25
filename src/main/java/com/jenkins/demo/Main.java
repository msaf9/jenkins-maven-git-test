package com.jenkins.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		Message message = new Message();
		System.out.print("Enter your name: ");
		name = sc.next();
		System.out.println(message.Print(name));
		sc.close();
	}

}
