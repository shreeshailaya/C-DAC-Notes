package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("name") String name,@RequestParam("cname") String cname, ModelMap map)
	{
		map.addAttribute("cname", cname);
		map.addAttribute("name",name);
		return "welcome";
	}
	@RequestMapping("/info")
	public ModelAndView process(HttpServletRequest req)
	{
		req.getSession().setAttribute("reqMethod", req.getMethod());
		req.getSession().setAttribute("reqCPath", req.getContextPath());
		req.getSession().setAttribute("reqURI", req.getRequestURI());
		String msg = "Learning Spring MVC implementation";
		return new ModelAndView("info", "message", msg);
	}
}
