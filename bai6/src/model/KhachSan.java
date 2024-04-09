package model;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	private ArrayList<KhachTro>	ds;
	
	public KhachSan()
	{
		ds=new ArrayList<KhachTro>(10);
	}
	public void themKhachTro(KhachTro kt)
	{
		ds.add(kt);
	}
	public void nhapDanhSach(Scanner sc) 
	{
		KhachTro khach;
		System.out.println("Nhap vao so luong khach ");
		int n=sc.nextInt();sc.nextLine();
		System.out.println("Nhap vao danh sach khach tro ");
		for(int i =0; i<n;i++) 
		{
			System.out.println("Khach tro thu "+(i+1)+"la" );
			khach=new KhachTro();
			khach.NhapThongTin(sc);
			themKhachTro(khach);
			
		}
	}
	public void hienThiDanhSach() 
	{
		for(KhachTro khach: ds)
		{
			khach.HienThiThongTin();		
		}
	}
	public double TinhTien(int CCCD) {
		double tien=0;
		for(KhachTro khach: ds)
		{
			if(khach.getCCCD()==CCCD)
			{
				tien=khach.getSoNgayTro()*khach.getGiaPhong();
			}
		}
		return tien;
	}
}
