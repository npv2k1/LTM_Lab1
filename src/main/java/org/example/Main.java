package org.example;

import org.example.controllers.IOFile;
import org.example.models.Student;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> listStudent;
        String FILE_NAME = "students.bin";

        File f = new File(FILE_NAME);
        if (f.exists()) {
            listStudent = IOFile.<Student>doc(FILE_NAME);
        } else {
            listStudent =new ArrayList<>();
        }

        int option;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==========MENU==========");
            System.out.println("1. Nhap sinh vien");
            System.out.println("2. Xuat sinh vien");
            System.out.println("3. Sua sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Ghi file");
            System.out.println("0. Thoat");
            System.out.println("========================");
            System.out.print("Ban chon (0->5):");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 0:
                    System.out.println("Exit!");
                    System.exit(0);
                case 1:
                    System.out.println("Nhap ma: ");
                    String ma = sc.nextLine();
                    System.out.println("Nhap hoten: ");
                    String hoten = sc.nextLine();
                    System.out.println("Nhap nhom: ");
                    String nhom = sc.nextLine();
                    Student student = new Student(ma, hoten, nhom);
                    listStudent.add(student);
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien: ");
                    for (Student s : listStudent) {
                        System.out.println(s);
                    }
                    break;
                case 3:
                    System.out.println("Nhap ma sinh vien can sua: ");
                    String maSua = sc.nextLine();
                    for (Student s : listStudent) {
                        if (s.getMa().equals(maSua)) {
                            System.out.println("Nhap ma moi: ");
                            String maMoi = sc.nextLine();
                            System.out.println("Nhap hoten moi: ");
                            String hotenMoi = sc.nextLine();
                            System.out.println("Nhap nhom moi: ");
                            String nhomMoi = sc.nextLine();
                            s.setMa(maMoi);
                            s.setHoten(hotenMoi);
                            s.setNhom(nhomMoi);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhap ma sinh vien can xoa: ");
                    String maXoa = sc.nextLine();
                    for (Student s : listStudent) {
                        if (s.getMa().equals(maXoa)) {
                            listStudent.remove(s);
                        }
                    }
                    break;
                case 5:
                    IOFile.<Student>ghi( FILE_NAME,listStudent);
                    break;
                default:
                    System.out.println("chi chon 0->5");
                    break;
            }
        }
    }


}