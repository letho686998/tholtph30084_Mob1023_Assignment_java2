/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assgnment1.model;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class NhanVien implements Serializable {

    private String Manv;
    private String hoTen;
    private int tuoi;
    private String email;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String Manv, String hoTen, int tuoi, String email, double luong) {
        this.Manv = Manv;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "Manv=" + Manv + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", email=" + email + ", luong=" + luong + '}';
    }

}
