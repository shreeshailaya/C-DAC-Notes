package apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Emp;

public class DIApp {

	public static void main(String[] args) 
	{
		//getting the reference spring container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");
		Emp e =(Emp)ctx.getBean("emp");  //get the object - don't create
		System.out.println(e.toString()); //call business logic method
		
	}

}
