package com.sbs.example.easytextboard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String command;
		Scanner scanner=new Scanner(System.in);
		System.out.printf("명령어 )");
		command=scanner.nextLine();
		if(command.equals("article add")) {
			System.out.println("== 게시물 등록 ==");
		}
		else if(command.equals("article list")) {
			System.out.println("== 게시물 리스트 ==");
		}
		else {
			System.out.println("잘못된 명령어입니다.");
		}
		scanner.close();
	}

}
