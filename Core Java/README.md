# Core Java- 19/5(Intro,Features,JDK/JRE )
## Features
- Simple
- Platform Independent 
- High Performance
- Java is 100% object oriented everything is in class in c++ you can write main outside classs.
- java is compiled and intrepeted language.
- JIT(Just in Time) Compilier:-
	- work just before execuation.
	- It conver some part of code directly into machine understanding.
- because of this language become faster it avoid read and convert time.

- Security over the internet 
- Robust(strong/tough)
	- Automatic Memory Management
	- Expection Handelling
- Multithearding(multitasking)
- Distributed(Remote Server involved) 
- Dynamic
***

### JDK/JRE
![JDK/JRE](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/2_jdkjre.PNG) 
	
### First Program
```JAVA
	public class Hello
	{
		public static void main(String[] args)
		{
			System.out.println("Hello world");
		}
	}

```

- When the class is decleared as public then the name of program should be class name..
- static method can called without object creation thats why used in main.
- `out` is the object called for print, `out` object is accessible using System class.
- `println()` is a method.
- At least one class should be public because of `main()`.
- Class name always should be start with capital.
- System=Class, out=object, println()=function.
- Setting path of java/javac(for setting epath of java and javac you need following steps.).

![setpath of java/javac](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/1_setpath.PNG)

- for run program javac _programName_.
- javac -version is used to check the version of java.
- *Bytes code(.class) always based on class name,if program name and class name is not equal then .class file name will be class name not a program name. *
	> javac _programName_ 

	> java _.classFileName_
---
---
# 20/5 (OOPs,Major and Minor piller)
## Introduction of Object Oriented Programming
#### Procedural Programming
	* It made with the functions.
	* Co-ordinate with `main()`.
	* Not working with entity.
	* Real life modelling is not possible.
	* Data Security (primery focous on procedurse not security)
	* After some code modification of code is difficult. 
- To overcome from this disadvantage they come up with new concept i.e OOP
### Object Oriented Programming
#### Object
- It is instance of the class
- It representing real life entity- customer,student, account
- Object has some state and behavior.
- Every object has some *identity* and *role* to be play in system
- Some objects are actually physically present those are called as tangible entity/object.(eg. student, laptop,hard-disk)
- Some objects are not actually physically present those are called as non-tangible entity/object (eg. data, account,software)
- Object is something which present the real life tangiable non tangable entity which have some identity and role to be played.
- State and behavior of objects
	- Set of values given to the common attributes which are used for describing the object.
	- State is description of the object.
	- Eg. there is a car which has some compay name,color,number..etc
	- So if the object is `MyCar` then the state of the object are Maruti,Black,mh14p8254..etc
	- State is the description of object.
	- There is some functionality/behavior/role of object like car speed in program it is like function.  
	- State= Set of values 
	- Identity is one of the state value which has some unique identity.
![Object](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/3_object.PNG)
![object](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/4_repState-bev.PNG)
## Four Major Piller of OOP
### Major Piller 
1) Abstration 
2) Encapsulation
3) Inheritance
4) Polymorphim
### Minor Piller 
1) Strong typing
2) Concurrency
3) Persistance

### Minor Piller 
#### 1) Strong Typing
- Perticular type of input of way of typing or wiritng code.
#### 2) Concurrency
- Simultaneous Execution eg. Notepad spelling check
#### 3) Persistance 
- Perment Storage/Database
### Major Piller 
#### 1) Abstraction
- Selective ignorance
- It helps in reducing the complixity of code.
- Process of seperation which take what is needed.
- It focous on what is needed/required and discart everything else.
#### 2) Encapsulation
- State(data) and Behavior(function) are inseparable thats why we use Encapsulation
- State and behavior will always together bundled into one unit is clalled Encapsulation.
- Advantage- 1.Data hiding/helps to restrict access of data 
- 2.Data Binding 
- 3.Complex functionlity can be hidden so that simple UI is used for use of object.
- 4.Hide Complixity and give simple functions to the user 
- Class is the best example of encapsulation.
#### 3) Inheritance
- Its about the "is a" relationship.
- If t entity having "is a" relationship then there is Inherantance.
- Adventage 1.Reusability/reusing of code.
- 2.It creates the basics of polymorphism
- Spealize entity from existing generalize entity by adding some extra state and behavior.
#### 4) Polymorphism
- Polymorphism:- Same massage given to common entity of different object.(different function defication) 

- Encaspulatio Unit 
```java
class Date
{
	// state and beahvior 
	// data members(private) + member methods(public)
	private int dd;
	private int mm;
	private int yy; //state members 
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
{

public class DateDemo
{
	public static void main(String args[])
	{
		Date d1;		//Referance variable decleration
		d1 = new Date();	//object creation
		d1.shoowdate();
	}
}
```
- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/20-05)
***
***
# 21/5 (Data Types, Memory Management, Constructor, this)
### Data Types 
1. Value type (premative)
	int,char,short,double,float
	eg. char ch;
2. Referance type (referance/non-premative(in c/c++))
	class,array,interface
	eg. Date d1;
![Data type tree](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/5_dataType.PNG)
![Memory Management](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/7_size.PNG)
![Memory Management](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/8_operator.PNG)
## Memory Management in java
- main method variable is in stack.
- Object are stored in heap.
- `new` is going to create to object in heap 
- heap data members(data in heap/object) are always initilize value 0.
- Default value of object variable is 0.
![Memory Management](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/6_Memory.PNG)
- Garbage collector is actually removing the unreferancing objects from the heap.
- In java in switch case you can use int abd string also.
- One advanced for loop(each for) is added in java.
- Class(acts as encapsulation unit) never occupy any memory.

## Constructor
- Is the function have same name as class.
- If you dont write constructor there is default constractor(zero argument).
- It has no any return type.
- There is two type of constructor 1. parameterise 2.non-parameterise.
- If you dont write any constructor then the default will be there if the you pass with argumrent you have to write the cinstructor.
- If you write paramatrised constractor then the default is not avalible.
- We can write N number of constructor but parameter should be different.
	No constructor :- Default constructor call
	Constructor with parameter :- have to define parametrised constructor
	Both (para/non para) :- Both are avalible but parameter constructor have to define (eg. con(), con(int a, int b)) 
- Constructor follow all the rules of polymorphism.
- Constructor assign the local variable value to instance variable.
- which constructor will use is depends on creation of object.
- If you create a object of parameterised constructor then only parameterised constructor will call
### this 
- `this` is the referance is refering to the current object(for which constructor is called)
- Refer last point of constructor.
	```
	  instance variable = local variable
	  this.dd = dd;
	  this.mm = mm;
	  this.yyyy = yyyy;
	 ``` 

- We are assigning the local variable to the instance variable.
- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/21-05)


***
***
# 22/5 (Garbage Collector, Array)
#### revise 
![Revise](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/9_revise.PNG)

### Garbage Collector 
- Static 
- Static can access only static data
- Non static access both static and non static
#### static block,static method,static variable

#### Static , Array covered portion
- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/22-05)
***
***

# 24/05 (Association Relation, Wrapper Classes)
 #### Referance equality
 ![Referance Equality](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/10_referance_equ.png)

### Association Relationship/has a relationship
- General rule of Encaplusation is declear *Data Member as private* and method public.
 ```java 
class Person
{
	private String name; //instance/non static-has
	private Date bdate;  //referance variable-has
	private int age;     // value type variable
	
	//person has name
	//person has birthday
	public Person(String name, int dd,int yy,int mm )
	{
		this.name=name;
		this.bdate=new Date(dd,yy,mm);
	}
}	
class Date
{
		int dd,yy,mm;
		public Date(int dd,int yy, int mm)
		{
			this.dd=dd;
			this.mm=mm;
			this.yy=yy
		}
}

class PersonMain()
{
	public static void main(String args [])
	{
		Person p1 = new Person("Shree",07,97,08);
	}

}
```
- One object inside/contain other object is called has relationship.
- Object within object. 
- Instance of one class contain instance of another class is called has a relationship.
- Reusing the class 
- If you do not assign any value to referance variable it will treat as null.
- name and bdate will be null if you dont assign anything to it.
- In Value type variable if you dont assign anything then it'll be zero. 
- `int age` will be zero if you dont assign anything to it.
- you cannot call methoth on null referance you will get error called  *null pointer expection*. 
- Person is container and and bdate is component.
- Adventage:- reusability. 

### Object Array
```java
public class ObjectArray
{
	Date [] datearr;
	datearr = new Date[3];
	datearr[0]=new Date();
	datearr[1]=new Date(11,12,99);
	datearr[2]=new Date(12);
	
	// Short cut
	//Date[] datearr = {new Date(),new Date(11,12,99),new Date(22)};

for(int i=0;i<datearr.lenght;i++)
{
	datearr[i].showdate();
}
}
```
#### Wrapper Class
- Is the classes which is replaced to treditional variables for using 100% oops concepts.
- Example:-
```java
	int i=10;
	Integer obj = new Integer(23);
	Integer obj = i; //autoboxing feature-no need to write new  
	// obj is object
	//i is value
	int num = obj; //auto unboxing
```
- It assign object to integer(auto unboxing) and integer to object(auto boxing)
- Because of wrapper class java is pure object oriented.
- There are 8 premative data type so there is 8 wrapper classes.
- Specifically Wrapper classes used in collections.
- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/24-05)


***
***
# 25/05 (Packages,IDE)
### Packages
- Packages is a namespace/collection of classes interfaces and sub-classes.
- Conceptually its a File Manager/File system in our mobile and PC.
- Easy to manage the things.
- File with same name but in different folder (avoid name conflicts).
- Example of build in package java.lang is base and java.io,java.util,java.sql are sub packages.
- You can create your own package.
- Package name always should start with small letter.
- To start package you have to just put `package package_name;`.
- Always start your program with package include.
- Sub packages are imported as `package package_name.sub_package;`
- When package is complied packages are reflected in folder hierarchy.
- Helps in reusability.
- Build in package java.lang API.

![Package APi](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/11_package-api.png)

- Package name should be short and small letter.
- Command for package compile `javac -d dirpath javafilename`

### Eclipse IDE
- It gives Development support 
- Eclipse is developed in JAVA
- Plugin is avalible for extra features.
- Workspace is a current working directory that has to be selected when eclipse is started
- Perspective is combinition of views and editors that are required for a perticular type of application.
- Use `ctr+space` for auto complete.
- In project there is option `Build Automically` so thats why its compiling when you typing code.
- Right click on code then source then generate const from superclass for creating constructor/with field(parameterized) autumatically.

![Eclipse Code](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/12_eclipse.png)

- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/25-05)


***
***
# 26/05(Inheritance,super(),Overriding, Dynamic Binding, Debug, Scanner)
### Inheritance
- It has is a relationship.
- Creating specialized entity from existing generalized entity by adding extra state and behavior.
- Person- name and bdate is state -display()
- Emp- empid,salary bev - calSalary()
- `extends` is keyword for inheritance.

``` java
	class Emp extends Person
	{
		//person is parent/super class
		//emp is child/sub class
	}
```

- It found is a relationship with each others.
- It used for reusability.
- Child class recive data members and methods.
- Private members are restricted within the class so not avalible for child.
- Super() is for accessing super class constructor.

![Super](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/13_super.png)


- We can access any constructor with the help of super()
- super always should call first in subclass.
- super() is a representation on the default constructor of the super class.
- So if you dont write, it will defaultly call default constructor of super class.
- Two methods of same name can be same in super and sub class because they are not in same class this is called method overriding.

```java
	// Method overriding
	class Person
	{
		
		display();
	}
	
	class Emp extends Person
	{
		int id,salary;
		public void display()
		{
			super.display();
			syso("ID:-"+id);
			syso("Salary:-"+salary)
		}
	}
```

- Recrusion is calling same method from same method.
```java 

	// Recursion
	class Emp extends Person
	{
		public void display()
		{
			display();
		}
	}
```
- The difference between Inheritance and the import in import you cannot access data members of class but in inheritance you can access the data members of super class.

#### debug,scanner
### Scanner 
![Scanner](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/14_scanner.png)

### Dynamic Binding

 - Whenever you create referance of super class you can create object of subclass `Person p = new Emp();`
 
![create obj](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/15_create-obj.png)
 
 - If we call `p.display();` which display will call, to understand this we need to understand *static binding and dynamic binding*
 
 #### static binding (Not used in JAVA)
 - Binding takes place at compile time 
 - It is based on type of invoking entity
 - It will resolve on type of `p`/Person.
 #### Dynmaic binding (used in java)
 - Binding takes place at run time. 
- It resolve on type of object refered by invoking entity i.e object of `p`/Empolyee.

- All instance method calls are resolved dynamically so the display() called from empolyee.

```java
	// if you create referance of super class i.e Person p; (Person is super class)
	
	// You can create object of subclass i.e p=new Empolyee(); (Empolyee is subclass)
	
	// you cannot do Empolyee e = new Person();
	
	class Person 
	{
		display()
		{
			System.out.println("Person display");
		}
	}
	
	class Empolyee extends Person
	{
		dislay()
		{
			System.out.println("Empolyee display");
		}
	}
	
	pblic class MainClass
	{
		public static void main(String args)
		{
			//Now see the obj and referance 
			
			Person p = new Empolyee();
			p.display();
			
			// so the question is which display will call Empolyee-> display() or Person-> display();
			
			//java used Dynamic Binding so it called Empolyee display
		}
	}
	
	
```

	> The output of the program 
	> Empolyee display

- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/26-05)


***
***
# 27/5 (class objects, c-o overiding)
### Class object
- Hierarchy of class object 
	object -> class Person -> class Emp
	
- Super class of Person is object and in object following are the methods
- Methods oof class Object

	> public String toString();
	> public boolean equals();
	> public void wait();
	> public int hashCode();
	> protected void finalize();

- By default this methods are present in every class that you create object.
``` java 
	p s v m(s [] a)
	{
		Person p = new Emp();
		System.out.println(p);  //p.toString()
		
		//Person class has received toString() from class Object
	}

```

- It will print hash map line `office.emps.Emp@262323a`

#### Class object overiding
```java
	// in Person class 
	@override
	public String toString()
	{
		return "Name: "+name+" Birdthdate:- " +bdate;
		
		//name.toString();  bdate.toString();
	}
```
- Output of this code is `Name:- shree Birdthday:- utility.Date@5215525a;`

- To avoid  `utility.Date@5215525a;` on the place of birdthdate you need to write return toString() in Date class.

- If there is toString() is in Emp class then it will call Emp -> toString();
- In below code Emp class don't contain toString() but its super class contain the toString() so it call Person -> toString();
- And for birdthdate the flow is main -> Emp(not toString()) -> Person(super of Emp) -> toString -> Date -> toString();

![Class Object](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/16_classobj.png)

- It represent object in string.
- It convert object to string.
- Purpose of toString() and display() are the same but toString print directly with the help of object.

- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/27-05)

***
***

# 28/5(Multilevel Inheritance,foreach, Abstraction, Access Specificer)

### Multilevel Inheritance

![Class Object](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/16_classobj.png)

- The flow of Executing constructor is Person()->Empolyee()->SalesManager()

#### foreach loop

```java
	Emp [] allemps;
	allemps = new Empolyee[3];
	allemps[0] = new SalesManager();
	allemps[1] = new Admin();
	// Shortcut 
	Empolyee [] allemps = {new SalesManager(), new Admin()};
	
	for (int i=0;i<allemps.length;i++);
	
	// Advanced for loop foreach.
	for(Empolyee e : allemps) 
	{
		System.out.println(e); //e.toString;
	}
	
	// here we achive polymorphism sending same data to every method but every methods acts diffently 
```

- foreach is only used for array.

- Protected data members are accesssible to its sub classes
- If you dont write access specificer then the scope is package
- Thre is 4 access specifier public, private, protected and default
- keywords are 3 and specificers are 4.

![Access Specificers](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/18_access-spe.png)

### Abstraction
- Abstract methods that are not decleared in super class.
- Methods that are not decleared are used for polyprism.
- If one of the method in the class is decleared as abstract then class should be abstract.
- Subclass must to complete abstract method if it fail to complete the abstract method then the subclass will be abstract.
- creating instance of abstract class is not allow.
- we cannot create object of abstract
- non abstract classes are concrate class.
- non abstract classes can be decleared as abstract

![Abstract](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/19_abstract.png)

- e.calsal(); will not call because it is not in Super class Emp.

![Abstract](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/20_abstraction.png)

```java
public class Empolyee
{
	public void display()
	{
		System.out.println("Empolyee Display");
	}
	
	
	public void accept()
	{
		System.out.println("Empolyee accept");
	}
}

public class Manager extends Empolyee
{
	display();
	accept();
	calsal();
}

public class SalesPerson extends Empolyee
{
	display();
	accept();
	calsal();
	bonous();
}

public class WageEmp()
{
	display();
	accept();
	calsal();
}

public class MainClass()
{
	Empolyee e = new Manager();
	e.calSale(); //cannot be compile 
	
}
```

- In below code `e.calSale();` will not compile because It searches the function in super class i.e in Empolyee.
- That is why abstration concept comes in picture.
- So you can declear the method in super class but there is no need to declear that method.
- You cannot create object of abstract class.
- We cannot create object that's why we use array.
- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/28-05)

***
***
# 29/5(geter/seter,final,Interface)

### geter/seter
- The rule says that class data members should be decleared as private.
- Because of this its unable to access in subclass.
- So there is 2 options to access that data member i.e 1. make it protected so it will accessable to sub class.
- And 2nd option is geter and seter methods.
- geter() method return private data member.
- seter() set new value to private data members.

```java
public class Account
{
	private String name;
	private int no;
}
public String getName()
{
	return name;
}

public String setName(String name)
{
	this.name = name;
	return name;
}

public int getNo()
{
	return no;
}
public int setNo(int no)
{
	this.no=no;
}
```

### final 
- final is the keyword in java.
- It is exactly opposite abstract.
- It cannot be modified/change.
- it is fully defined.
- It can be used in variable,methods and classes.
- final is replacement of const in java.
- We can only declear final but you have to initilize it afterwords.
- fianl variable decleared all in capital i.e final String NAME="shree"

- final Methods cannot be overriden.
- eg.class object methods wait(),notify(),notifyAll() are defined final.

- final classs cannot be modified 
- String class in java library is decleared as final.
- Because you cannot modified final class, fianl class cannot acts as super class.

![final](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/21_methods.PNG)

- final keyword for array.

![final](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/22_finalarr.PNG)

### Interfaces
- Interfaces are 100% incomplete.
- In interface there are abstract methods and concrete methods.
- In Inteface there is only final variable and abstract methods (for now)

![Interface](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/23_interface.PNG)

- Multiple interheritance through the classes is not allow but using interface its allow.

![Interface](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/24_interface1.PNG)

- Anything you write in interface it will default take `public static final`
```java
interface Drawable
{
	static double PI = 3.14; //public static and final
	double calArea(); //it can only decleared as public andabstract
	void drawShape(); //methods are bydefault treated as abstract
}

class Rectangle implements Drawable 
{
	privete double lenght,breadth;
	//constractor 
	// here toString method is avalible
	double calArea()
	{
		
	}
	void drawShape()
	{
		
	}	
}

class MainClass
{
	public static void main(String [] args)
	{
	Drawable d = new Circle();
	//interface referance = implementing class instance
	//super class referance = sub class instance
	d.calArea(); // Instance and non static methods resolve using dynamic binding
	//so it will call from the Circle class. 
	}	
}
```
- It has is a relationship.
- You cannot create a object but you can create a referance of interface.
- You can create only referance of Interface.
- There is no any concerete method in interface( upto java 1.7). 
- Complesary you have to implement all the methods in sub class.

```java
interface A
{
	void m1();
}
interface B extends A
{
	void m2();
}
class X implements B
{
	void m1(){}
	void m2(){}
}
```
- If two interfaces are extend with each others (A and B)
- Then in implement class i.e (X) need to implement both interface methods.
- Class and Interface relation
	* class ---> (extends)---> class
	* class ---> (implements)---> interface
	* interface ---> (extends)---> interface
- Abstract class and Interface cannot create object.
- Make difference between class and Interface.

- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/29-05)

***
***
# 31/5(typecast, instanceof, interface of java8)
### Types of methods 
- Final Methods 
	* Final methods are defined final it will not modified/override furtere
- Concrete Methods
	* In concrete methods we can override or not also. 
- Abstract Methods
	* Abstract methods should be complesary override in subclass
- Default Methods 
	* Default methods are decleared in inheritance onwards java8 as concrete methods in inheritance
	
### How multiple inheritance replaced by interfaces 

![Interface](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/25_interface2.png)

- We can use extend and implement both on one class

```java
public class SalesManager extends Empolyee implement ITraveller
{
	//add all unimplemented methods in ITraveller 
	//ITraveller is interface so you have to implement all methods which in ITraveller
}
```
### typecast
- Convert the type of variable/object
- double d=4.6; ---> float f=(float)d;
```java
	Empolyee [] allEmp;
	allEmp = new Empolyee[3];
	allEmp[0]=new SalesPerson("",,,,);
	allEmp[1]=new SalesPerson("",,,,);
	allEmp[2]=new SalesPerson("",,,,);
	for (Emp e : allEmp)
	{
		if(e instanceof ITreaveller)	//It checks e can be typecasted toITreaveller so remove error that is showed in typecast
		{
		System.out.println("TA:  "+((ITraveller)e).calculateTA());
		}
	}
```
### instanceof and typecast
- instanceof is a operator

![Typecast error](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/26_typecast.png)

- It return true and false value 
- Referance below code and error ---> It checks e can be typecasted toITreaveller so remove error that is showed in typecast
- syntax
	> e instanceof iTreaveller
	> e source, ITreaveller is destination
- It avoid error in runtime
- It is intelligent way of checking typecast is valid or not
- upcasting is not required (super calss methods are avalible for subclass as it is)
- Downcast is required (because subclass methods are not avalible in super class)

![Typecast](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/27_typecast1.png)

![Typecast](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/28_typecast2.png)

- Extra ↓

![Typecast](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/29_typecast3.png)

![Typecast](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/30_typecast4.png)

- It verified calsalary(); is avalible in person or not 

### Interface onwards java 8
- Previously interface only contain abstract methods 
- If i go and suddenly add abstract method in interface will breakdown existing classes
- When this is realize by the oracal and other developers
- Now do not add suddenly any abstract method insted of that use default keyword
- Also you can add static method in interface
- Now there are three type of methods in interface
	* Static (not expect to rewrire or overide)
	* Abstract (compulsory override)
	* default (do or don't)
```java 
interface A
{
	void m1();		// compulsory to implement
	default void m2()	// not compulsory use it or not 
	{}
	
	static void m3()
	{
	}

}
class MyClass implements A
{
	void m1(){}
	void m2(){}
}
```
- Interface can be implement across the hierarchy (Not abstract classes)
- Interface deside what to do
- Class decide how to do it
![Typecast](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/31_interface.png)
- [Download and see code here](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java/31-05)

***
***

| Concept | What | Why | Where | Comment | Referance |
|---|---|---|---|---|---|
| Java | Programming language | For building applications(web,mobile) | All over industry | It is a programming language based on OOP's concepts | [Notes](https://github.com/shreeshailaya/c-dac/), [official docs](https://docs.oracle.com/en/java/)
| JVM | Java Virtual Machine | Running Java | Installed in system for running java | To allow Java programs to run on any device or operating system (known as the "Write once, run anywhere" principle), and to manage and optimize program memory | [Infoworld](https://www.infoworld.com/article/3272244/what-is-the-jvm-introducing-the-java-virtual-machine.html) |
| JDK | Java Development Kit | Required by developers for developing and testing the application | In development enviroment | -- | [Notes](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java#jdkjre), [Java docs](https://jdk.java.net/16/)
| JRE | Java Runtime Environment  | It is needed by client machine to run existing java application (already compiled) | In development enviroment | -- | [Notes](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java#jdkjre)
| OOP | Object Orinted Programming | Structuring the programming language | Used in programming languages like c++/java | Object-oriented programming is a programming paradigm based on the concept of "objects", which can contain data and code | [Notes](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java#object-oriented-programming), [Wikipedia](https://en.wikipedia.org/wiki/Object-oriented_programming) |
| Major Piller of OOP | --  | -- | -- | Abstration, Encapsulation, Inheritance, Polymorphim | [Notes](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java#four-major-piller-of-oop)
| Minor Piller of OOP | --  | -- | -- | Strong typing, Concurrency, Persistance| [Notes](https://github.com/shreeshailaya/c-dac/tree/main/Core%20Java#four-major-piller-of-oop) |




***

Compiled by [Shreeshail Vitkar](https://github.com/shreeshailaya)
Feel free to fork @ [C-dac Notes](https://github.com/shreeshailaya/c-dac)

***
***

