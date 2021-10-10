# Day-1 16/6(Introduction)
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
# Day-2 17/6(Array,Linkedlist)

### Array(Subtopic)
 
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

### Linked List(Subtopic)

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

# Day3 18/6(Operation on Linkedlist)

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

# Day 4 19/6(searching algorithm)
- Searching algorithms 
	- Linear Search
	- Binary Search
***
***
# Day 5 21/6(Linkedlist)

### Sorting LinkedList(Subtopic)
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/15_linkedList.gif)
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/13_linkedList.png)

### Doubly LinkedList(Subtopic)
![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/14_linkedList.png)
***
***
# Day 6 22/6(Stack)
### Stack (Subtopic)
- Some functions in stact
- peak()
- isFull()
- push 
- pop

- push()
1. Check stack is full.
2. if the stack is full produce an error and exit
3. is the stack is not full increment top to point next empty space
4. adds data element to the stack locationwhere top is pointing
5. return success

![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/16_stack.gif)

- pop()

1. Checks if the stack is empty
2. if the stack is empty produce error and exit
3. if the stack is not empty access the data element at which top is pointing
4. decrease the value of top by  1
5. return success


```java
class MyStack
{
private int top,size;
private int arr[];

	public MyStack()
	{
		size=3;
		top=-1;
		arr=new int[size];
	}
	
	public MyStack(int size)
	{
		this.size=size;
		top=-1;
		arr=new int[size];
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else
			return false;
	}
	
	
	public void push(int element)
	{
		if(isFull==true)
		{
			syso("Stack is full");
			return;
		}
		else
		{
			top++;	//increment top
			arr[top]=element;
		}	
	}
	
	// it is mandatery that we have to pass paramert to push 
	
	public int pop()
	{
		int element=-9999;
		if(isEmpty()==false)
		{
			element= arr[top];
			top--;
		}else
		{
			syso("Stack is empty")
		}
		return element;
	}
	
	public void display()
	{
		syso("*** Stack is ***");
		for(int i=top;i>=0;i--)
		{
			syso("   "arr[i]);
		}
	}
}

```

- Push take parameter
- pop return parameter
- so pop always return something


### Dynamaic Stack (LikeList stack)(Subtopic)
- Create Node class
	- data and next
	- default constructor 
	- para constructor 
	- getter setter
	- toString/display()
- Create MyClass
	- having top as Node data type
	- default Constructor-assign null to top
	- implement is empty method which will return status  whether stack is empty or not
	if top is null then stack is empty
	- push method will take data as parameter 
	```
		create newnode
		if top isnull
			newnode become top
		else
			add newnode at beg
			assign top as new node
	```
	- pop()
	- check is stack is not empty
	- mark first node as del
	- move top to next node 
	- get del.data into data
	- assign del is null
	if empty stack return 99999
	
	- display()
	- assign move=top
	- displaymove.data
	- increment or shift move to next node.
	- repeat till move !=null;

```java

class Node
{
	private char data;
	private Node next;
	
	publuc Node()
	{
		data="0";
		next=null;
	}
	public Node(char ch)
	{
		this.data=ch;
		next=null;
	}
	
	public String toString()
	{
		return "  "+data;
	}
	
	//gettersetter
}

class MyStack
{
	Node top;
	public MyStack()
	{
		top=null;
	}
	public boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public void push(char ch)
	{
		Node newnode=new Node(ch);
		if(top==null)
		{
			top=newnode;
		}
		else
		{
			newnode.setNext(top);
			top=newnode;
		}
	}
	
	public char pop()
	{
		char data='0';
		Node del=null;
		if(isEmpty()==false)
		{
			del=top;
			data=del.getData();
			top=top.getNext();
			del=null;
		}
		
		return data;
	}
	
	public String toString()
	{
		String str="";
		Node move=top;
		while(move!=null)
		{
			str=str+"\n\t"+move.getData();
			move=move.getNext();	
			return str;		
		}
		
		
	}
}

```

### Reverse String using Stack

***
***
# Day 7 23/6(c2 stack,Queue)

### C2 Stack(Subtopic)

```java

class MyStack
{
	private int top1,top2,size;
	private int [] arr;
	
	public MyStack()
	{
	
	}
	
	public boolean isFull()
	{
		if(top1==top2-1)
			return true
	}
	
	public boolean isEmpty()
	{
		if(top1==-1 && top2==size)
			return true;
	}
	
	public void pushFront(int data)
	{
		if(isFull())
		{
			syso("Stac is full")
		}else
		{
			top1++;
			arr[top]=data;
		}
	}
	
	public void pushBack(int data)
	{
		if(isFull)
		{
			syso("Stack is full")
		}else
		{
			top2--;
			arr[top2]=data;
		}
	}
	
	public void display()
	{
		/*
		int i;
		for(i=top1;top1!=top2;i=(i-1)%size)
		{
			syso("  "+arr[i]);
		}
		
		double i =0,size =5;
i = (int) ((i-1)-(size*Math.floor((i-1)/size))); 
		*/
		
		
		for(i=top1;i>=0;i--)
			syso("  "+arr[i]);
		for(i=size-1;i>=top2;i--)
			syso("  "+arr[i]);
	}
}

```

### Queue (Subtopic)

- there is two element i.e front and rear
- there is enqueue=insert and dequeue=retrive
- Insert element
	- check whether queue is full or not 
	- increment rear and insert data rear position
- delete element 
	- check whether queue is empty or not
	- increment front and return data avalible at front location 
	
- isEMPTY()
	``` 
		public boolean is Empty()
		{
			if(rear==front)
				if(rear==front)
				return true;
		}

	```
	
- isFull()
	'''
		public boolean isFull()	
		{
			if(rear=size-1)
				return true;	
		}
	```
***
***

# Day 8 24/6(Queue)

### Queue(Subtopic)	

![linkedList](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/17_queue.gif)



class MyClassMyQueue
{
- rear(to insert data)
- front (to print exit)
- size(size of queue())
- array
}

public void enQueue(int data)
{
- check queue is not full
	- increment rear and add data at rear position
- print queue is full
}

public int deQueue()
{
- check queue is not empty
	- increment front and return data avalible at front position
-return -9999
}

public int isFull()
{
- ifrear reach to size-1
}

public int isEmpty()
{
- when front and rear pointing to same index
- 
}

public void display()
{
- from front+1 to rear display all array elements
}

### Dynamic Queue(Subtopic)

![queue](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/18_queue.gif)



```java
class Node
{
	Book data;
	Node next;
	
	public Node()
	{
		data=null;
		next=null;
	}
	public Node(Book data)
	{
		this.data=data;
		this.next=null;
	}
	
	public String toString()
	{
		return data.toString();
	}
	
	//getter and setter
}

class QueueLinkedList
{
	Node rear,front;
	public QueueLinkedList()
	{
		rear=null;
		front=null;
	}
	
	public boolean isEmpty()
	{
		if(front==null)
		{
			rear=null;
			return true;
		}else
		{
			retur false;
		}
	}
	
	public void enQueue( Book data)
	{
		Node newnode = new Node(data);
		if(rear == null)
		{
			rear=front=newnode;
		}else
		{
			rear.setNext(newnode);
			rear=newnode;
		}
	}
	
	public Book deQueue()
	{
		Book data=null;
		if(isEmpty())
		{
			return data;
		}
		else
		{
			Node del;
			del=front;
			front=front.getNext();
			data=del.getData();
			del=null;
		}
		return data;
	}
	
	
	public String toString()
	{
		String str="";
		Node move;
		for(move=front;move!=null;move=move.getNext())
		{
			str=str+" "move.getData().toString();
		}
		return str;
	}
	
	

}

class Book
{
	int bookid;
	String bookname;
	
	public Book()
	{
		bookid=0;
		bookname=null;
	}
	public Book(int bookid, String bookname)
	{
		this.bookid=bookid;
		this.bookname=bookname;
	}
	
	// getter setters
	
	public String toString()
	{
		return "  "+ bookid "and "+ bookname;
	}
}


```


### Circular Queue (Subtopic)

Enqueue in circular Queue
 - check queue is not full
    -- if it is first element in queue
       increment rear and front by one
       add data ar rear position
   --- change rear and add element in array at rear position
       rear=(rear+1)%size;
 -- Print Queue is full

DeQueue element from queue
 --- check queue is not empty
   --return value at front position
   -- change front to next index.

Display circular Queue

  -- for(int i=front; i!=rear ; i= (i+1)%size) 
         print arr[i]
   print last element 

 front =2
 rear=1

  i=2     30
  i=3     40
  i=4     50
  i=0     60
  i=1     X

![queue](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/19_circularQueue.gif)





***
***
# Day 9 25/6(Dqueue)
### Dqueue(Subtopic)
pushBack()
}
- check queue is not full
- if rear =-1
- increament the rear and add element
}

pushFront()
{
- check queue is not full 
-
}
- 


***
***
# Day 10 26/6


# Day 11 28/6(Trees)

### tree(Subtopic)


![Tree](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/20_tree.png)



- Binary tree has max 2 node 
- General tree has as many node as you want
- In binary search tree left must be less than root and right is greater than root
### AVL Tree(subtopic)

- Balanced Tree 

### Binary tree types(Subtopic)
Full Binary tree
- All Internal node have must 0 or 2 nodes 
Complete binary tree
- Nodes are left to right only
- Complesary need left node
Perfect binary
- All the nodes at the same level
- Every perfect tree is complete 

- Implement binary tree

- Create Node Class 
	- data
	- left
	- right
- class BinaryTree
{
	root 
	void addNode(int data)
	{
		- create node with data
		- check if root is null
			- root is newnode
		- assign move as root
		- ask where you want to attach node
			-left
				= Check if left is avalible(null)
				attach at left of move
				break;
			- if left is not empty
				- check if right pointer is null
					- attach node at right of move
					- break;
				
		
	}
}
	
```java 
class Node
{
private int data;
private Node left,right;

	public Npde ()
	{
	data=0;
	left=rigit=nuu;
	}
	
	public Node(int data)
	{
	data=data
	}
}


class BinaryTree
{
private Node root;
	public Tree()
	{
	
	root=null;

	}
	get set root
	
	public void addNode()
	{
		Node newnode=new Node(data);
		Node move;
		char ans;
		Scanner sc = new Scanner();
		if(root==null)
		{
		  root=newnode;
		  syso("ROOT IS CREATED");
		}else
		{
		  move = root;
		  while(true)
		  {
		  	syso("LEFT or RIGHT of"+move.getData());
		  	ans=sc.next().charAt(0);
		  	if(ans=='l' || ans=='L')
		  	{
		  	  if(move.getLeft()==null)
		  	  {
		  	  	move.setLeft((nenode)
		  	  	break;
		  	  }else
		  	  {
		  	  	move=move.getLeft();
		  	  }
		  	}else if(ans==r)
		  	{
		  	  if (move.getRight()==null)
		  	  {
		  	  	move.serRight(newnode);
		  	  	break
		  	  }else
		  	  {
		  	  	move=move.getRight();
		  	  }
		  	}else
		  	{
		  		syso("Wrong option");
		  		break;
		  	}
		  }
		}
		
		void inOrder(Node root)
		{
			Node move=root;
			
		}		
	}
	
	
}

```

# Day 12 29/6(Inorder,Preorder,Postorder)
- Print Tree Recrusion function

### Inorder (LEFT,ROOT,RIGHT)(Subtopic)
```java

	 public void inOrder(Node root)
	    {
	    	Node move=root;
	    	if(move!=null)
	    	{
	    		inOrder(move.getLeft());
	    		System.out.println("  "+move.getData());
	    		inOrder(move.getRight());
	    	}
	    }
	 
```

![Traversal](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/21_inOrder.gif)


### Preorder(ROOT,LEFT,RIGHT)(Subtopic)

```java	 
	 
	 public void preOrder(Node root)
	    {
	    	Node move=root;
	    	if(move!=null)
	    	{
	    		System.out.println("  "+move.getData());
	    		preOrder(move.getLeft());
	    		preOrder(move.getRight());
	    	}
	    }
	 
```

![Traversal](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/22_preOrded.gif)


### Postorder(LEFT,RIGHT,ROOT)(Subtopic)


```java
	 
	 public void postOrder(Node root)
	    {
	    	Node move=root;
	    	if(move!=null)
	    	{
	    		postOrder(move.getLeft());
	    		postOrder(move.getRight());
	    		System.out.println("  "+move.getData());
	    	}
	    }



```

![Traversal](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/23_postOrder.gif)

- Recursion function saves values in stack so it print stack wise.

- **In order gives data in sorted manner**

### Search Element from tree(Subtopic)

### Delete Node from tree(Subtopic)
![Tree](https://github.com/shreeshailaya/c-dac/blob/main/Data%20structure/Media/24_tree.png)


### Graph(Subtopic)
- Vertex
- Edge
- Path 
- Adjacent Node

- in degree o0ut degree
- sink node/Source node


# Day 13 30/6(Graphs)
### Graph (Subtopic)
```java

class Graph
{
	int vertex;
	int graph[][];
	
	public Graph()
	{
		vertex =5;
		graph=new int[vertix][vertex]
	}
	
	public Graph(int size)
	{
	
	}
	
	public void acceptGraph()
	{
		Scanner sc = new Scanner(SI)
		syso("Enter adjency of ")
		fot(int i=0;i<vertex;i++)
		{
		for(int j=0j<vertex;j++)
		{
			syso("[i][j]");
			graph[i][j]=sc.nextInt();
		}
		
		}
	}
	
	
	
	
	public void displayGraph()
	{
		Scanner sc = new Scanner(SI)
		syso("Enter adjency of ")
		fot(int i=0;i<vertex;i++)
		{
			syso();
		for(int j=0j<vertex;j++)
		{
			syso(+graph[i][j]);
		}
		
		}
	}
}



```
### unDirectedGraph(Subtopic)
```java
public void addEdge(int i,int j)
{
	graph[i][j]=1;
	graph[j][i]=1;
}

```
### Graph Traversa(Subtopic)
- DFS-depth
- BFS-level


### Adjency List(Subtopic)








# Day 14 1/7(Important topics)
### Hash(Subtopic)
### time complixity (Subtopic)
### kruskal Algorithm(Subtopic)
### Prime's Algo(Subtopic)
### AVL Tree Balanced Factor(Subtopic)








### Sort(Subtopic)
***
***
# Sorting

### Buebble Sort(Subtopic)
### Selection Sort(Subtopic)
### Merge Sort(Subtopic)
### Shell sort(Subtopic)


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

