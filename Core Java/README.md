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
## Four Major Piller of OOP
### Major Piller 
1) Abstration 
2) Encapsulation
3) Inheritance
4) Polymorphim
### Minor Piller 
1) String typing
2) Concurrency
3) Persistance

Guide to design readme [click here](https://medium.com/analytics-vidhya/how-to-create-a-readme-md-file-8fb2e8ce24e3)