/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enity;

/**
 *
 * @author default
 */
public class Sinhvien {
    private String msv;
    private String ten;
    private String ngaysinh;
    private String lop;
    private String nganh;

    public Sinhvien() {
    }

    
    
    public Sinhvien(String msv, String ten, String ngaysinh, String lop, String nganh) {
        this.msv = msv;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
        this.nganh = nganh;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public Object[] toArray(){
        return new Object[]{msv,ten,ngaysinh,lop,nganh};
    }
    
    
}
