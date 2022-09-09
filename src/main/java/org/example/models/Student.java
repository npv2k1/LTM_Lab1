package org.example.models;

import java.io.Serializable;

public class Student implements Serializable {
    private String ma;
    private String hoten;
    private String nhom;

    public Student(String ma, String hoten, String nhom) {
        this.ma = ma;
        this.hoten = hoten;
        this.nhom = nhom;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ma='" + ma + '\'' +
                ", hoten='" + hoten + '\'' +
                ", nhom='" + nhom + '\'' +
                '}';
    }
}
