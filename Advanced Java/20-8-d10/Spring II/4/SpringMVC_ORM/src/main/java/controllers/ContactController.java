package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.ContactDAO;
import entities.Contact;

@Controller
public class ContactController {
	
	@Autowired   //get rid of mentioning property element within bean definition
	ContactDAO dao;
	
	@RequestMapping("/contactform")
	public ModelAndView showForm()
	{
		return new ModelAndView("contactform", "con", new Contact());
	}
	
	@RequestMapping("/insert")
	public String save(@ModelAttribute("con") Contact ct,ModelMap map)
	{
		int cid = dao.save(ct);
		map.addAttribute("insertedcontact", cid);
		return "msg";
	}
	
	@RequestMapping("/all")
	public ModelAndView getAll()
	{
		List<Contact> allcontacts= dao.getAll();
		return new ModelAndView("showall","allcontacts",allcontacts);
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(@RequestParam("cid") int cid)
	{
		Contact ct = dao.getOne(cid);
		return new ModelAndView("editconatct","contacttobeedited",ct);
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute("contacttobeedited")Contact ct)
	{
		dao.updateOne(ct);
			
			return "";
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
	    List<Contact> result = dao.search(keyword);
	    ModelAndView mav = new ModelAndView("search");
	    mav.addObject("result", result);
	 
	    return mav;    
	}
}
