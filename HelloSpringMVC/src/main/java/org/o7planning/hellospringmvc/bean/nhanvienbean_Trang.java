package org.o7planning.hellospringmvc.bean;

public class nhanvienbean_Trang {
	private long Manv;
	private String HoTen;
	private String DiaChi;
	private float HSL;
	public nhanvienbean_Trang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public nhanvienbean_Trang(long manv, String hoTen, String diaChi, float hSL) {
		super();
		Manv = manv;
		HoTen = hoTen;
		DiaChi = diaChi;
		HSL = hSL;
	}
	
	public long getManv() {
		return Manv;
	}
	public void setManv(long manv) {
		Manv = manv;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public float getHSL() {
		return HSL;
	}
	public void setHSL(float hSL) {
		HSL = hSL;
	}

}
