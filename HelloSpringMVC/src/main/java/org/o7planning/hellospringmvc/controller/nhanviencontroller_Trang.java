package org.o7planning.hellospringmvc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.o7planning.hellospringmvc.bean.nhanvienbean_Trang;
import org.o7planning.hellospringmvc.bo.nhanvienbo_Trang;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class nhanviencontroller_Trang {
	@RequestMapping("/nhanvien")
	public ModelAndView nhanvien(Model model, HttpSession session, HttpServletResponse response, HttpServletRequest request) {
		try {
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				String key= request.getParameter("key");
				nhanvienbo_Trang nvbo=new nhanvienbo_Trang();
	   	        ArrayList<nhanvienbean_Trang> ds=nvbo.getnhanvien();
				if(key!=null){
					ds=nvbo.timnhanvien(key);
					model.addAttribute("key1",key);
		       	} 
				model.addAttribute("ds",ds);
				
		   	   	return new ModelAndView("nhanvien");
	       }catch (Exception e) {
	    	   e.printStackTrace();return null;
	       }
	}
}
