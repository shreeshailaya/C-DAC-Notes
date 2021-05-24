public class Person
{
    //instatce or non-static variables
    private String name;
    private Date bdate;

    //deafult - no-arg constructor
    public Person()
    {
	//name=bdate=null
	this.name = new String("");
	this.bdate = new Date();
    }

    public Person(String name, int dd,int mm,int yy)
    {
	this.name = name;
	this.bdate = new Date(dd,mm,yy); //Date class constructor
    }

    public void display()
    {
	System.out.println("Name : "+name);
	
        if(bdate != null)
	{
             System.out.println("Birthdate : ");
	     bdate.showdate(); //showdate of Date
	}
    }	

}