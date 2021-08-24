package tagclasses;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetTag extends SimpleTagSupport {
	
	String user;   //data member name should match with name of the attribute

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public void doTag() throws JspException, IOException {
		//translation logic
		getJspContext().getOut().print("<h1 style='color:blue;text-shadow:2px 2px 2px black'> WELCOME "+user+"</h1>");
	}
	
	//default constructor
	

}
