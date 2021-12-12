package org.o7planning.hellospringmvc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.nhanvienbean_Trang;

public class nhanviendao_Trang {
	public ArrayList<nhanvienbean_Trang> getnhanvien() throws Exception{
		ArrayList<nhanvienbean_Trang> ds=new ArrayList<nhanvienbean_Trang>();
		DungChung dc=new DungChung();
		dc.KetNoi();
		String sql="select * from NhanVien";
		PreparedStatement cmd=dc.cn.prepareStatement(sql);
		ResultSet rs=cmd.executeQuery();
		while(rs.next()) {
			Long Manv=rs.getLong("Manv");
			String HoTen=rs.getString("HoTen");
			String DiaChi=rs.getString("DiaChi");
			Float HSL=rs.getFloat("HSL");
			ds.add(new nhanvienbean_Trang(Manv,HoTen , DiaChi, HSL));
		}
		rs.close();
		dc.cn.close();
		return ds;
	}
}
