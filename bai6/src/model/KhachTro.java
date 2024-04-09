package model;

import java.util.Scanner;

public class KhachTro extends Nguoi{
	
	private int soNgayTro;
	private String loaiPhong;
	private double giaPhong;
	public KhachTro() {
		
	}
	public KhachTro(String hoTen,int CCCD, int soNgayTro,String loaiPhong,double giaPhong) {
		this.hoTen=hoTen;
		this.CCCD=CCCD;
		this.soNgayTro=soNgayTro;
		this.loaiPhong=loaiPhong;
		this.giaPhong=giaPhong;
	}
	public void NhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("\tNhap so ngay tro ");
		soNgayTro=sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap loai phong ");
		loaiPhong=sc.nextLine();
		System.out.println("\tNhap gia phong ");
		giaPhong=sc.nextDouble(); sc.nextLine();
	}
	public void HienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo ngay tro " +soNgayTro);
		System.out.println("\tLoai phong " +loaiPhong);
		System.out.println("\tGia phong " +giaPhong);
	}
	public int getSoNgayTro() {
		return soNgayTro;
	}
	public double getGiaPhong() {
		return giaPhong;
	}
}
