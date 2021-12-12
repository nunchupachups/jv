package org.o7planning.hellospringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.o7planning.hellospringmvc.dao.DungChung;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
    public ModelAndView hello(Model model, HttpSession session, HttpServletRequest request) {
       try {
    	   if(request.getParameter("but1")!=null) {
   	    	session.setAttribute("tam", "Xin chao session");
   	        String[] ds= {"Ha","Long","nam"};
   	        model.addAttribute("ds",ds);
   	    	model.addAttribute("greeting", "Ok da qua phan nay !!!!!!!!!!");
       	}
    	   DungChung dc = new DungChung();
           dc.KetNoi();
           return new ModelAndView("helloworld");
           
       }catch (Exception e) {
    	   e.printStackTrace();return null;
       }
    }

}