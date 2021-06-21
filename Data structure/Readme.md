# Day-1 16/6
- It is used in designing
- It is abstract data type
- It has some set of rules that we cannot change 
- We uses DS for abstract data type

- What is data structure?
 Defination -> working -> real life example 
 - In computer terms a ds is a specific way to store and organize data in computers memory so that these data can be used efficiently later
 - It belong to structuring the data 
 
 - Need of Data Structure
	 - Effiency
	 - Reusability
	 - Abstraction

- There is two types of DS
	- Linear 
	- Non-Linearas
- Linear 
	- Array
	- Queue
	- Stack
	- Linked list
- Non Linear
	- Graph 
	- Tree


***
***
# Day-2 17/6

### Array 
 
```java
class Student
{
	private int rollno;
	private string name;
	private int marks;
	
	public Student()
	{
	}
	
	public Student(int rollno, String name, int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.name=name;
	}
	
	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		Syso(name,rollno,marks);
		sc=name,rollno,marks;
	}
	
	public void display()
	{
		System.out.println(name,rollno,name);
	}
}
```


![array](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/1_array.png)


```java
class Team
{
	private int size;
	Student s[];
	
	public Team(int size)
	{
		this.size=size;
		s=new Student[size];
		for(int i=0;i<size;i++)
			s[i]=new Student();
	}
	
	public void accept()
	{
		for(int i=0;i<size;i++)
			s[i].accept();
	}
	
	
	public void display()
	{
		for(int i=0;i<size;i++)
			s[i].display();
	}

}

```

```java 

class Program
{
	public ststic void main(String [] arr)
	{
		Team cri = new Team(11);
		cri.accept();
		cri.display();
		
		
		Team kabadi = new Team(7);
		kabadi.accept();
		kabadi.display();
	}

}

```

### Linked List 

- It is Linear Data Structure 
- It connected via links 

- Disadventage of Array
	- Slow searching in array so linked list come 
	- Inseration and deletion is slow in array
	- fixed size in array
	- memory weastage in array
- Because of this disadvantages of array linked list is come in picture	
- In other hand linked list able to grow in size as needed
- Does not required the shifting of items during inseration or deletion.
- Each data value is linked with address of next value
- Each element is called node 
- Data values need not be stored in adjacent memory cell

![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/2_linkedList.png)


![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/3_linkedList.png)

- Structure of Linked List
```java
class Node
{
	private int data;
	private Node next; 	//Next  is data member which will hold the referance of next variable
	
	// One linked list may have multiple node  
	public Node()
	{
		data=0;
		next=null;
	}
	
	public void display()
	{
		syso(data);
	}
}
class Linkedlist
{
	Node head;
	createNode(int data);
	createLinkedList(int numberOfNodes);
}	

class Program()
{
	PSVM(	)
	{
		Linkedlist l1= new Linkedlist();
		l1.createLinklist(5);
		l1.display();
	}
}
```

- Linked list real program
- link = next;

![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/4_linkedList.png)


```java

public class Linkedlist
{
	private Node head;
	public Linkledlist()
	{
		head=null;
		
	}
	
	public void createLinkedlist(int terms)
	{
		int data =5;
		int i;
		node newnode=null,move=null;
		for(int i=1;i<=term;i++)
		{
			newnode=new Node(data); //create new node 
			if(head==null)	
				head=newnode;
			else
			{
				move=head;
				while(move.getNext())!=null)
				{
					move=move.getNext();
				}
				move.setLink(newnode);
			}
			data=data+5;
		}
		
	}
	
	public void display()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.println("  "+move.getData());
			move=move.getLink();
		}
	}
}
```
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/5_linkedList.gif)

- Inseration in linked list

```
move.setLink(newnode);

```
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/6_linkedList.gif)

- Steps for creating Linked List
	- Ask user number of nodes to insert
	- Create node first
	- First check whether the linklist is empty or not, if linklist is empty this node will be first node so assign this node as head 
	- Otherwise travel the linkedlist till the end and attach node at end.
	- Repeat these steps till number of nodes user entered

#### Assignments and code for [Array](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/17juneDay2/assignment1.java) and [LinkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/17juneDay2/assignment2.java)

***
***

# Day3 18/6

### Operations on Linkedlist
- Add begining
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/7_linkedList.png)

- Add mid

![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/8_linkedList.png)

![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/9_linkedList.gif)

- Delete first node 
- Note Head is 200 in below img
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/10_linkedList.png)

- Delete Mid Node
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/12_linkedList.png)


- Delete last node 

![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/11_linkedList.png)

***
***

# Day 4 19/6
- Searching algorithms 
	- Linear Search
	- Binary Search
***
***
# Day 5 21/6

### Sorting LinkedList
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/15_linkedList.gif)
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/13_linkedList.png)

### Doubly LinkedList
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/14_linkedList.png)
***
***
# Sorting



***
***

| Concept | What | Why | Where | Comment | Referance |
|---|---|---|---|---|---|
| Data Structure | A data structure is a particular way of organizing data in a computer so that it can be used effectively. | Data structures are used as a framework for organizing and storing information in virtual memory forms. | In evey application | - | - |
| Array | An array is a collection of items stored at contiguous memory locations. | For Storing data | in heap | - | [Array](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/17juneDay2/assignment1.java) |
| Linked List | Linked list is linear data structure where each element is dynamically allocated. Each node contain two parts, namely the data and the reference | to overcome disadvantage of array | Data Structure(Ralilway)| - | [LinkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/17juneDay2/assignment2.java) |


***

Compiled by [Shreeshail Vitkar](https://github.com/shreeshailaya)

Feel free to fork @ [C-dac Notes](https://github.com/shreeshailaya/c-dac)

***

