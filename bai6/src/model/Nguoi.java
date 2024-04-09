package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen;
	protected Date ngaySinh;
	protected int CCCD;
	
	public Nguoi() {
		
	}
	public Nguoi(String hoTen,Date ngaySinh,int CCCD) {
		this.hoTen=hoTen;
		this.ngaySinh=ngaySinh;
		this.CCCD=CCCD;
	}
	public void nhapThongTin(Scanner sc) {
		System.out.println("\tNhap ho ten ");
		hoTen=sc.nextLine();
		System.out.println("\tNhap ngay sinh ");
		String strDate=sc.nextLine();
		ngaySinh=strToDate(strDate);
		System.out.println("\tNhap CCCD");
		CCCD=sc.nextInt();
		sc.nextLine();

		
	}
	private Date strToDate(String strDate) {
		Date date=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try{
			date =sdf.parse(strDate);
		}catch(ParseException e) {
			System.out.println("Loi dinh dang");
		}
		return date;
	}
	public void hienThiThongTin() {
		System.out.println("\t Ho ten "+ hoTen);
		System.out.println("\t Ngay sinh "+ ngaySinh );
		System.out.println("\t CCCD "+ CCCD);

	}
	public int getCCCD() {
		return CCCD;
	}
	public void setCCCD(int cCCD) {
		CCCD = cCCD;
	}
	
}
