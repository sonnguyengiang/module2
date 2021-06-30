package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Manger{
    ArrayList<SanPham> list = readFile();
    Scanner scanner = new Scanner(System.in);
    public ArrayList<SanPham> readFile() {
        ArrayList<SanPham> list1 = new ArrayList<>();
        try {
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream("nhanvien.txt"));
           list1 = (ArrayList<SanPham>) ois.readObject();
           ois.close();
        } catch (Exception e){
            System.out.println("ko co file");
        }
        return list1;
    }

    public void writeFile(ArrayList<SanPham> list){
       try{
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nhanvien.txt"));
           oos.writeObject(list);
           oos.close();
       } catch (Exception e){
           e.printStackTrace();
       }
    }
    public void add(){
       try {
           System.out.print("enter a id: ");
           int id = Integer.parseInt(scanner.nextLine());
           System.out.print("enter a name: ");
           String name = scanner.nextLine();
           System.out.print("enter a hang sx: ");
           String hangSX = scanner.nextLine();
           System.out.print("enter a gia: ");
           int gia = Integer.parseInt(scanner.nextLine());
           list.add(new SanPham(id,name,hangSX,gia));
           writeFile(list);
       } catch (Exception e){
           System.out.println("ko co file");
       }
    }
    public void xoa(){
        System.out.print("enter a id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                list.remove(i);
            }
        }
        writeFile(list);
    }
    public void show(){
        for (SanPham a: list){
            System.out.println(a);
        }
    }
}
