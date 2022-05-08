package com.sbs.example.easytextboard;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String command;
		int inputNo=0;
		String title1="";
		String body1="";
		String title2="";
		String body2="";
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.printf("명령어) ");
			command=scanner.nextLine();
			if(command.equals("article add")) {
				if(inputNo==0) {
					inputNo++;
					System.out.println("== 게시물 등록 ==");
					System.out.printf("제목) ");
					title1=scanner.nextLine();
					System.out.printf("내용) ");
					body1=scanner.nextLine();
					System.out.printf("%d번 게시물이 등록되었습니다.\n",inputNo);
				}
				if(inputNo==1) {
					inputNo++;
					System.out.println("== 게시물 등록 ==");
					System.out.printf("제목) ");
					title2=scanner.nextLine();
					System.out.printf("내용) ");
					body2=scanner.nextLine();
					System.out.printf("%d번 게시물이 등록되었습니다.\n",inputNo);
				}
				
			}
			else if(command.equals("article list")) {
				System.out.println("== 게시물 리스트 ==");
				if(inputNo==0) {
					System.out.println("등록된 게시물이 없습니다.");
				}
				else {
					if(inputNo==1) {
						System.out.printf("%d번, 제목: %s / 내용: %s\n",1,title1,body1);
					}
					else if(inputNo==2) {
						System.out.printf("%d번, 제목: %s / 내용: %s\n",1,title1,body1);
						System.out.printf("%d번, 제목: %s / 내용: %s\n",2,title2,body2);
					}
				}
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
