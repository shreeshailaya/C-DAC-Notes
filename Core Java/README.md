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


 
Compiled by [Shreeshail Vitkar](https://github.com/shreeshailaya)
Feel free to fork @ [C-dac Notes](https://github.com/shreeshailaya/c-dac)


