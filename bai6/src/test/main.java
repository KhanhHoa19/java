package test;

import java.util.Scanner;

import model.KhachSan;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		KhachSan ks=  new KhachSan();
		ks.nhapDanhSach(sc);
		System.out.println("Nhap vao khach tro can tinh tien ");
		int CCCD=sc.nextInt();
		System.out.println("Tong tien la "+ks.TinhTien(CCCD));
		sc.close();
	}

}
