# Core Java- 19/5
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
# 20/5
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
![object](https://github.com/shreeshailaya/c-dac/blob/main/Core%20Java/Media/4_repState-.PNG)
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
# 21/5
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
Guide to design readme [click here](https://medium.com/analytics-vidhya/how-to-create-a-readme-md-file-8fb2e8ce24e3)
