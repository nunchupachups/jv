package org.o7planning.hellospringmvc.bo;

import java.util.ArrayList;

import org.o7planning.hellospringmvc.bean.nhanvienbean_Trang;
import org.o7planning.hellospringmvc.dao.nhanviendao_Trang;

public class nhanvienbo_Trang {
	nhanviendao_Trang dddao=new nhanviendao_Trang();
	public ArrayList<nhanvienbean_Trang> getnhanvien() throws Exception{
		return dddao.getnhanvien();
	}
	public ArrayList<nhanvienbean_Trang> timnhanvien(String key) throws Exception{
		if(key=="") return dddao.getnhanvien();
		else {
			VNCharacterUtils_Trang chuyendoi=new VNCharacterUtils_Trang();
			ArrayList<nhanvienbean_Trang> ds= new ArrayList<nhanvienbean_Trang>();
			for (nhanvienbean_Trang d : dddao.getnhanvien()) {
				if(chuyendoi.removeAccent(d.getHoTen().trim().toLowerCase()).contains(chuyendoi.removeAccent(key.trim().toLowerCase()))||
						chuyendoi.removeAccent(d.getDiaChi().trim().toLowerCase()).contains(chuyendoi.removeAccent(key.trim().toLowerCase())))
					ds.add(d);
				
			}
			return ds;
		}
		
	}
}
