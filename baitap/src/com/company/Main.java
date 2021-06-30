package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manger manger = new Manger();
        while (true){
            System.out.println("1.add");
            System.out.println("2.xoa");
            System.out.println("3.show");
            System.out.println("5.exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    manger.add();
                    break;
                case 2:
                    manger.xoa();
                    break;
                case 3:
                    manger.show();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
