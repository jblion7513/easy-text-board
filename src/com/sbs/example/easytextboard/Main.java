package com.sbs.example.easytextboard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String command;
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.printf("명령어 )");
			command=scanner.nextLine();
			if(command.equals("article add")) {
				System.out.println("== 게시물 등록 ==");
			}
			else if(command.equals("article list")) {
				System.out.println("== 게시물 리스트 ==");
			}
			else if(command.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못된 명령어입니다.");
			}
		}
		scanner.close();
	}

}
