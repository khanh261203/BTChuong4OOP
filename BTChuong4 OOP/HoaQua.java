/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoaqua;

/**
 *
 * @author ADMIN
 */
class HoaQua {
    protected String ten;
    protected float giaBan;
    protected String nguonXuatXu;
    protected String ngayNhap;
    protected int soLuong;

    public HoaQua(String ten, float giaBan, String nguonXuatXu, String ngayNhap, int soLuong) {
        this.ten = ten;
        this.giaBan = giaBan;
        this.nguonXuatXu = nguonXuatXu;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
    }

    public void inThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Nguồn xuất xứ: " + nguonXuatXu);
        System.out.println("Ngày nhập: " + ngayNhap);
        System.out.println("Số lượng: " + soLuong);
    }

    public float tinhGiaTri() {
        return giaBan * soLuong;
    }
}

class QuaCam extends HoaQua {
    public QuaCam(String ten, float giaBan, String nguonXuatXu, String ngayNhap, int soLuong) {
        super(ten, giaBan, nguonXuatXu, ngayNhap, soLuong);
    }
}

class QuaTao extends HoaQua {
    public QuaTao(String ten, float giaBan, String nguonXuatXu, String ngayNhap, int soLuong) {
        super(ten, giaBan, nguonXuatXu, ngayNhap, soLuong);
    }
}

class CamCaoPhong extends HoaQua {
    public CamCaoPhong(String ten, float giaBan, String nguonXuatXu, String ngayNhap, int soLuong) {
        super(ten, giaBan, nguonXuatXu, ngayNhap, soLuong);
    }
}

class CamSanh extends HoaQua {
    public CamSanh(String ten, float giaBan, String nguonXuatXu, String ngayNhap, int soLuong) {
        super(ten, giaBan, nguonXuatXu, ngayNhap, soLuong);
    }
}
public class Main {
    public static void main(String[] args) {
        HoaQua hoaQua = new HoaQua("Hoa Quả", 0, "Việt Nam", "09/03/2023", 0);
        QuaCam quaCam = new QuaCam("Quả Cam", 20000, "Hà Giang", "09/03/2023", 50);
        QuaTao quaTao = new QuaTao("Quả Táo", 25000, "Hà Nội", "08/03/2023", 30);
        CamCaoPhong camCaoPhong = new CamCaoPhong("Cam Cao Phong", 30000, "Ninh Bình", "08/03/2023",40);
    }
}