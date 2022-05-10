# Core Python 
## Day-1 Introduction
- Python was founded by  Guido van Rossum in 1989 at National Research institute Netherland
- and it release to public in 20 February 1991 
- python is general purpose highlevel programming language
- Dynamically typed language
- Name is came from TV serial on BBC (British Broadcasting Company) 1969-1974 - TV show called Monty Python Flying Circus
- TWO DIFFERENT VERSION HAS DIFFERENT STORY

### Features
- Easy to Code
- Open Source and Free
- Support for GUI
- Object-Oriented Approach
- High-Level Language
- Integrated by Nature
	- Excute code line by line easy to compile
- Highly Portable
- Highly Dynamic 
	- No need to declear as int 
- Integrated Language
- Large Standred library
	- BINOD

### Features from other languages 
- Functional Programming from C
- OOP from C++
- Scripting from Shell and perl
-  Most of syntax is borrowed from c and ABC

### Use of python
1. Desktop App
2. Web Application 
3. Database Applications
4. Network Applications 
5. Data Science 
6. AI, IOT

### Companies using python 
- reddit 
- Google 
- IBM 
- Dropbox 
- Nasa

## Day - 2

### Operations on IDLE 
- +,-,*,/ Do operations in IDLE 
- 10 // 3
- 10 % 3


### Playing with String and print()
-  If you want to type in single ' ' in python outer quote shoud be in " " viceverse
- eg:-
```py

	print('Here is my "Laptop"')
	print("Here is my 'Laptop'")	

```
- To escape the special meaning of any quote you can use \
- To use internal query as it is you can use `print(r'Here is my 'laptop'')`
- You can use number with string to `'facebook' * 10` It will print facebook 10 times 
- \n

### Variables
- Variable is putting values in Container 
- Syntax `name = value`
- Add variable and integer you can do this a=5 `a+5` then it will give 10
- Variable means the value which can be changed
- You can take previous output referance by _ 
- You can Store String into a variable 
- String can be a concatenate 
- String Store in Array  
- Facebook 
- 01234567
- Fetch a <== name[1]
- fetch book <== name[4:8]
- String has indexing starting from 0 
- changing the f to a name[a] = 'a'(not possible)
- String are immutable that means we cannot change the string once it is decleared
- len() function give you length of the String

### Keywords in Python
- 33 keywords
- import keyword <== keyword.kwlist
  
| Keyword | Description |
| --- | ---  | 
| and | a logical operator |
| as | To create an alias |
| assert | For debugging |
| break | To break out of a loop |
| class | To define a class |
| continue | To continue to the next iteration of a loop |
| def |	To define a function |
| del |	To delete an object |
| elif | Used in conditional statements, same as else if |
| else | Used in conditional statements |
| except | Used with exceptions, what to do when an exception occurs |
| False	| Boolean value, result of comparison operations |
| finally | Used with exceptions, a block of code that will be executed no matter if there is an exception or not |
| for	| To create a for loop |
| from	| To import specific parts of a module |
| global | To declare a global variable |
| if	| To make a conditional statement |
| import | To import a module |
| in	| To check if a value is present in a list, tuple, etc. |
| is	| To test if two variables are equal |
| lambda | To create an anonymous function |
| None | Represents a null value |
| nonlocal | To declare a non-local variable |
| not |	A logical operator |
| or |	A logical operator |
| pass | A null statement, a statement that will do nothing |
| raise | To raise an exception |
| return | To exit a function and return a value |
| True | Boolean value, result of comparison operations |
| try |	To make a try...except statement |
| while | To create a while loop |
| with	| Used to simplify exception handling |
| yield	| To end a function, returns a generator |

### Day-3

### Operators in Python 
### Arthmathic 
- a=a+1
- a+=3

### Unary Operator 
- a = 8
= -a = -8
- a = -a

### Relational Operations 
- a<b 
- a>b
- a==b
- difference in == and =
- a <= b
- a >= b
- a != b


### Logical Operators 
1. and
2. or 
3. not

- a<5 and b>10
- a>10 or b<22 
- Not reverse thee output if a = True the not a = False


### Binary Decimal, Octal and Hexadecimal
- bin()
- oct()
- hex()


## Day-4
	       
### List
- Defined by [] 
- List is mutable you can change the value in list
- list is used to assign multiple values 
- In python list can store different type of variables like int, string
- Operations on list
- mix lists ans = [a,b]
- Functions in List 
- nums.insert(index, value)
- nums.append(value) append at the end 
- append vs insert 
- nums.remove(value)
- nums.pop(index)
- only call pop its using stack 
- remove vs pop
- del nums[2:] delete multiple values
- nums.extends([value, value]) extend existing list
- Inbuild Function on List
	- min(list)
	- max(list)
	- sum(list)
	- list.sort()

### Tuples 
- Defined by ()
- Syntax `a= (2,4,9)`
- Tuples are imutable we cannot change value in it
- Itteration is faster because it is imutable
- but indexing is allowed 
- Two methods i.e count and index
- Count counts number of occurance of the perticular number `a.count(number)`
- Index gives index value of the perticular number 
- You can store any data type in Tuples

### Sets 
- Defined by {}
- Syntax `a={1,2,5,4}`
- It is a collection of unique elements
- It dont follow the Sequence
- Every value is Unique 
- Indexing is not supported  because it dont follow sequence
- Some functions in sets 

### Dictionary
- Defined by {}
- Contain key and value pairs 
- Syntax `data = {key:'value'}`
- Every Key should be unique
- Adding values in dict `dict['key'] = value`
- Delete value from dict `del dict['key']`
- get() with not found 
- Functions in Dict
- Make a dict with list using zip() and dict()
- d = dict(zip(key, value))
- Combinations of list and dict 
- Combination of dict and dict
- Combination of list and dict


### More about Variables and Data type
- assiging value and check the address 
- Every variable referance is there value not variable name 
- Garbage Collector not assigned variable are in gc
- There is no concept of constant in python, but you can make it as CAPITAL variable declearation
- Variable assign is done by right to left
- DATA TYPES :
1. NONE
	- No value is assigned to it
2. Numeric
	- Integer
	- Float
	- Boolean
	- Complex (Its a combination of real number equation and imiginary number)
3. List 
4. Tuples
5. Set 
6. String 
7. Range
	- range() wich accept 3 parameter 
	- List,set with range 
	- Difference in range datatype and and list
8. Dict


### Conversion of Datatype
- int(), float(), str(), complex()
	       
## Day-5
### from console to .py
- Python uses extention .py to identify python file 
- Before running the python program you need to do some changes(as follow), if python command cannot recognized by the Command prompt
- Setting of path
- Copy the address of python installed folder in my case it is `C:\Users\YOUR_USERNAME\AppData\Local\Programs\Python\Python310`
- and past it into `My Computer > Properties > Advanced System Settings > Environment Variables > path > New `
- Create file with .py extension 
- then open command prompt go to the file location with the help of commands like `cd` and `dir`
- For execuation of python program you need to type `python program_name.py`
	
### Swipping the numbers 
- using third variable
```python
a=2
b=5 

temp = a
a = b
b = temp
print(" A:-"+str(a)+" B:-"+str(b))
```

- Without using 3rd variable 
```python 

a=2
b=5 


a=a+b	# a = 5+2 = 7
b=a-b	# b = 7-5 = 2 
a=a-b	# a = 7-2 = 5

print(" A:-"+str(a)+" B:-"+str(b))

```

- In python 
```python 
a,b = b,a # using ROT_TWO
```

### Input in python
- input ()
- input function take input default as str 
- typecasting the input()
- program with input()

## Day-6
### Conditions 

1. if
- ![if](https://cdn.programiz.com/sites/tutorial2program/files/Python_if_statement.jpg)
```python
# If the number is positive, we print an appropriate message

num = 3
if num > 0:
    print(num, "is a positive number.")
print("This is always printed.")

num = -1
if num > 0:
    print(num, "is a positive number.")
print("This is also always printed.")
```


2. if else

- ![if else](https://cdn.programiz.com/sites/tutorial2program/files/Python_if_else_statement.jpg)
```python
# Program checks if the number is positive or negative
# And displays an appropriate message

num = 3

# Try these two variations as well. 
# num = -5
# num = 0

if num >= 0:
    print("Positive or Zero")
else:
    print("Negative number")

```
3. if elif else
- ![if elif](https://cdn.programiz.com/sites/tutorial2program/files/Python_if_elif_else_statement.jpg)
```python
'''In this program, 
we check if the number is positive or
negative or zero and 
display an appropriate message'''

num = 3.4

# Try these two variations as well:
# num = 0
# num = -4.5

if num > 0:
    print("Positive number")
elif num == 0:
    print("Zero")
else:
    print("Negative number")
```
4. Nested if
```python
'''In this program, we input a number
check if the number is positive or
negative or zero and display
an appropriate message
This time we use nested if statement'''

num = float(input("Enter a number: "))
if num >= 0:
    if num == 0:
        print("Zero")
    else:
        print("Positive number")
else:
    print("Negative number")
```
- Code of block with Indentation
- if else with even odd numbers
- else comes with if 
- 
### Indentation
- Indentation refers to the spaces at the beginning of a code line.
- Python uses indentation to indicate a block of code.

### Excuation and reassignment of variable 

```python
a = input('ENTER NO')
print(a)

class MyClass:
	a = 55
	def name():
		print("Hello")

print(MyCass.a)
```

### Intro of class for imports

### Import in Python
- import math
- sqrt()==> Squre root function
- floor(lower) and ceil(higher) functions
- pow(num, power) function
- Some constant math.pi, math.e
- import math as m the allies name 
- import functions sqrt and pow and pi

## Day-7
### Unicode Code
- Unicode, formally the Unicode Standard, is an information technology standard for the consistent encoding, representation, and handling of text expressed in most of the world's writing systems
- 65-90 uppercase
- 97-122 lowercase
- 48-57 digit
- remaining are special char

### While loop 
- With the while loop we can execute a set of statements as long as a condition is true.
- ![while loop](https://cdn.programiz.com/sites/tutorial2program/files/whileLoopFlowchart.jpg)

```python

# To take input from the user,
# n = int(input("Enter n: "))

n = 10

i = 1

while i <= n:
    print(i)
    i = i+1    # update counter

```

- inner while 


### For loop
- A for loop is used for iterating over a sequence (that is either a list, a tuple, a dictionary, a set, or a string).
- This is less like the for keyword in other programming languages, and works more like an iterator method as found in other object-orientated programming languages.
- With the for loop we can execute a set of statements, once for each item in a list, tuple, set etc.
- ![for loop](https://cdn.programiz.com/sites/tutorial2program/files/forLoop.jpg)
```python

# List of numbers
numbers = [6, 5, 3, 8, 4, 2, 5, 4, 11]



# iterate over the list
for val in numbers:
    print(val)



```

- for looping through string 
- for looping through range
	- range
	- range in between(3 variable)
	- range in negative
- inner for

### for and if else 

### Keywords pass, break, continue
1. pass
- In Python, the pass keyword is used to execute nothing
- it means, when we dont want to execute code, the pass can be used to execute empty
```python

for i in range(5):
	if i==2:
		pass
	else:
		print(i)

```

2. break 
- break keyword break the loop and excute the code that is written after code
- break entire loop after fullfiling the condition
- toffies example 
```python

for i in range(5):
	if i==2:
		break
	print(i)
```


3. continue
- The continue statement in Python returns the control to the beginning of the loop.
- escaping the number / 5 or 7
```python
for i in range(16):
	if i%5==0:
		continue
	print(i)
```


### for and else 
- for running for else loop for should be contain break statement if the condition is true
- gernally for else is not used in industry
```python
for i in range(1,10):
	if i%7==0:
		print(i)
		break
else:
	print('not found')
```

- print with end

### Day-8
#### Array
- import array 
- vals = array('i',[2,9,5,6])
- in array, array is method
- Array takes two parameter one is type and and secound is list of arrray
- Append value in array arr.append(val)
- ask user to add values in array
- To find values from array two methods one is manual and secound is with `arr.index(val)`


#### Functions in Python
- In Python, a function is a group of related statements that performs a specific task.
- Functions help break our program into smaller and modular chunks. As our program grows larger and larger, functions make it more organized and manageable.
```python
def greet(name):
    """
    This function greets to
    the person passed in as
    a parameter
    """
    print("Hello, " + name + ". Good morning!")
 greet('Paul')
```
- return in function
- return multiple values in functions 
- `a,b = add_sub(val1,val2)`
- tracking the values passed to function
- mutabale values can be change like list, variables cannot 
```python
def myFun(x):
	x[1]=10
	print(x)

x=[2,4]
print(x)
myFun(x)
print(x)


```

### Type of Arguments 
	    
1. Formal- def add(a,b)
2. Actual- add(5,6)
	- Position 
	- Keyword (passing with keyword add(a=10, b=12))
	- Default def add(a,b=12) add(10)
	- Variable length
#### Variable length arguments
- `def add(*a)` it will accept more than one argument in tuple 
#### Keyword Variable length arguments
- `def add(**a)` it will accept more than one argument with keyword in tuple
- for iterating the values from **kwargs you need `for i,j in kwargs.items()`
- print with .format
```python
def myFun(**a):
	print(a)
	for key,value in a.items():
		print('key {}, Value {}'.format(key,value))
	
myFun(a='dsd',b='dsds',c='dsdfggd')

```

### global and globles()
```python

a = 10	# global

def myFun():
	a = 15	# local
	b = 10	# Cannot access outside fun	
print('in fun',a)
myFun()
print('outside fun',a)
```  
- local and global has different referance of variable 
- use `global a` to access global variable from function
- you can use same name for global and local variable 
- but if you want to change the global variable you need to use globals() in function which gives all global variables
- `globals()['variable_name']`

### Recursion
- Recursion is calling function itself from function
- Recursion limit is 1000
- sys.getrecursionlimit()
```python
# Factorial
result = 1
for i in range(1, 6):	
	result = result * i
print(result)
```
- Factorial with recursion
```python
def myFun(n):
	if (n==0):
		return 1
	return n * myFun(n-1)

print(myFun(5))

```

### Lambda functions 
- Anonymous
- `f = lambda a:a*a`
- lambda is a single line function which only resolve the single expression 
- filter(function , list) in python
- filter with lambda
- `list(filter(lambda n: n%2==0, nums))`

### Decorators 
- Decorators are a very powerful and useful tool in Python since it allows programmers to modify the behaviour of function or class

- Decorators allow us to wrap another function in order to extend the behaviour of the wrapped function, without permanently modifying it. 

- A function is an instance of the Object type.
- You can store the function in a variable.
- You can pass the function as a parameter to another function.
- You can return the function from a function.
- You can store them in data structures such as hash tables, lists, …

- Treating the functions as objects. 
```python

# Python program to illustrate functions
# can be treated as objects
def shout(text):
	return text.upper()

print(shout('Hello'))

yell = shout

print(yell('Hello'))

```
- Passing the function as an argument 
```python

# Python program to illustrate functions
# can be passed as arguments to other functions
def shout(text):
	return text.upper()

def whisper(text):
	return text.lower()

def greet(func):
	# storing the function in a variable
	greeting = func("""Hi, I am created by a function passed as an argument.""")
	print (greeting)

greet(shout)
greet(whisper)

```

- Returning function from another function

```python
# Python program to illustrate functions
# Functions can return another function

def create_adder(x):
	def adder(y):
		return x+y

	return adder

add_15 = create_adder(15)

print(add_15(10))


```

- Decorators

```python
def div(a,b):
    return a/b

def smart_div(fun):

    def inner(a,b):
        if a<b:
            a,b = b,a 
        return div(a,b)
    return inner


div1 = smart_div(div)

print(div1(2,10))
```
### Non-local variables 
- The nonlocal keyword is used to work with variables inside nested functions, where the variable should not belong to the inner function

- Use the keyword nonlocal to declare that the variable is not local.

```python
def myfunc():
  x = "John"
  def inner():
    #nonlocal x
    x = "hello"
    print('inner :- ',x)
  inner() 
  return x

print(myfunc())

```

### Clouser

```python

def create_adder(x):
	def adder(y):
		return x+y

	return adder

add_15 = create_adder(15)

print(add_15(10))


```

### Iterator 
- An iterator is an object that contains a countable number of values.
- An iterator is an object that can be iterated upon, meaning that you can traverse through all the values.
- Technically, in Python, an iterator is an object which implements the iterator protocol, which consist of the methods __iter__() and __next__().

- Lists, tuples, dictionaries, and sets are all iterable objects. They are iterable containers which you can get an iterator from.

- All these objects have a iter() method which is used to get an iterator:

```python
mytuple = ("apple", "banana", "cherry")
myit = iter(mytuple)

print(next(myit))
print(next(myit))
print(next(myit))
```
- Even strings are iterable objects, and can return an iterator:
```
mystr = "banana"
myit = iter(mystr)

print(myit.__next__())
print(next(myit))
print(next(myit))
print(next(myit))
print(next(myit))
print(next(myit))


```

### Generator
- A generator-function is defined like a normal function, but whenever it needs to generate a value, it does so with the yield keyword rather than return. 
- If the body of a def contains yield, the function automatically becomes a generator function.
```python
# A generator function that yields 1 for first time,
# 2 second time and 3 third time
def simpleGeneratorFun():
	yield 1			
	yield 2			
	yield 3			

# Driver code to check above generator function
for value in simpleGeneratorFun():
	print(value)


``` 
- Generator functions return a generator object
- Generator objects are used either by calling the next method on the generator object or using the generator object in a “for in” loop (as shown in the above program).

```python 
# A Python program to demonstrate use of
# generator object with next()

# A generator function
def simpleGeneratorFun():
	yield 1
	yield 2
	yield 3

# x is a generator object
x = simpleGeneratorFun()

# Iterating over the generator object using next
print(x.next()) # In Python 3, __next__()
print(x.next())
print(x.next())

```



### Modules
- Consider a module to be the same as a code library.
- A file containing a set of functions you want to include in your application.
- for importing modules we can use `import`

### Special Variable `__name__`

- `__name__` is a built-in variable which evaluates to the name of the current module.

- Thus it can be used to check whether the current script is being run on its own or being imported somewhere else

- When the module is begin run the the value of `__name__` is `__main__` if its imported from someware else then it is module name 

### Regular Expressions 
- A RegEx, or Regular Expression, is a sequence of characters that forms a search pattern.
- RegEx can be used to check if a string contains the specified search pattern.
- Python has a built-in package called re, which can be used to work with Regular Expressions.

- Import the `re` module:
- findall()	Returns a list containing all matches
- search()	Returns a Match object if there is a match anywhere in the string
- split()	Returns a list where the string has been split at each match
- sub()		Replaces one or many matches with a string

- Metacharacters
```python
import re

txt = "The rain in Spain"

#Find all lower case characters alphabetically between "a" and "m":

x = re.findall("[a-m]", txt)
print(x)
```

```python

import re

txt = "That will be 59 dollars"

#Find all digit characters:

x = re.findall("\d", txt)
print(x)
```
```python
import re

txt = "hello heooo planet"

#Search for a sequence that starts with "he", followed by two (any) characters, and an "o":

x = re.findall("he..o", txt)
print(x)


```

```python
import re

txt = "hello planet"

#Check if the string starts with 'hello':

x = re.findall("^hello", txt)
if x:
  print("Yes, the string starts with 'hello'")
else:
  print("No match")
```

```python
import re

txt = "hello planet"

#Check if the string ends with 'planet':

x = re.findall("planet$", txt)
if x:
  print("Yes, the string ends with 'planet'")
else:
  print("No match")

```

```python
import re

txt = "The rain in Spain falls mainly in the plain!"

#Check if the string contains either "falls" or "stays":

x = re.findall("falls|stays", txt)

print(x)

if x:
  print("Yes, there is at least one match!")
else:
  print("No match")

```

- Special Sequences

```python
import re

txt = "The rain in 2  Spain"

#Check if the string contains any digits (numbers from 0-9):

x = re.findall("\d", txt)

print(x)

if x:
  print("Yes, there is at least one match!")
else:
  print("No match")
```

```python
import re

txt = "The rain in Spain"

#Return a match at every white-space character:

x = re.findall("\s", txt)

print(x)

if x:
  print("Yes, there is at least one match!")
else:
  print("No match")

```
- Sets
```python
import re

txt = "The rain in Spain"

#Check if the string has any a, r, or n characters:

x = re.findall("[arn]", txt)

print(x)

if x:
  print("Yes, there is at least one match!")
else:
  print("No match")

```

```python
import re

txt = "The rain in Spain"

#Check if the string has any 0, 1, 2, or 3 digits:

x = re.findall("[0123]", txt)

print(x)

if x:
  print("Yes, there is at least one match!")
else:
  print("No match")


```

```python
import re

txt = "8 times before 11:45 AM"

#Check if the string has any characters from a to z lower case, and A to Z upper case:

x = re.findall("[a-zA-Z]", txt)

print(x)

if x:
  print("Yes, there is at least one match!")
else:
  print("No match")

```

```python
import re

txt = "8 times before +11:45 AM"

#Check if the string has any + characters:

x = re.findall("[+]", txt)

print(x)

if x:
  print("Yes, there is at least one match!")
else:
  print("No match")

```

#### Search()
- The search() function searches the string for a match, and returns a Match object if there is a match.
- If there is more than one match, only the first occurrence of the match will be returned:
```python
import re

txt = "The rain in Spain"
x = re.search("\s", txt)

print("The first white-space character is located in position:", x.start()) 

```

#### Split()
```python

import re

#Split the string at every white-space character:

txt = "The rain in Spain"
x = re.split("\s", txt)
print(x)



import re

#Split the string at the first white-space character:

txt = "The rain in Spain"
x = re.split("\s", txt, 1)
print(x)

```

#### Sub()
```python

import re

#Replace all white-space characters with the digit "9":

txt = "The rain in Spain"
x = re.sub("\s", "9", txt)
print(x)
```


### PIP and Packages
- preferred installer program
- PIP is a package manager for Python packages, or modules if you like.
- A package contains all the files you need for a module.
- Modules are Python code libraries you can include in your project.
- check pip `pip --version`
- If you do not have PIP installed, you can download and install it from this page: https://pypi.org/project/pip/
- pip install camelcase
```python
import camelcase

c = camelcase.CamelCase()

txt = "hello world"

print(c.hump(txt))
```
- uninstall `pip uninstall camelcase`
- list of packages `pip list`



### File Handling 
- File handling is an important part of any web application.
- Python has several functions for creating, reading, updating, and deleting files.
- The key function for working with files in Python is the `open()` function.
- The open() function takes two parameters; filename, and mode.
- There are four different methods (modes) for opening a file:
	- "r" - Read - Default value. Opens a file for reading, error if the file does not exist
	- "a" - Append - Opens a file for appending, creates the file if it does not exist
	- "w" - Write - Opens a file for writing, creates the file if it does not exist
	- "x" - Create - Creates the specified file, returns an error if the file exists

- In addition you can specify if the file should be handled as binary or text mode
	- "t" - Text - Default value. Text mode

	- "b" - Binary - Binary mode (e.g. images)

- To open a file for reading it is enough to specify the name of the file:
```python
f = open("demofile.txt")
# OR
f = open("demofile.txt", "rt")
# OR
f = open("D:\\myfiles\welcome.txt", "r")
print(f.read())
```
- By default the read() method returns the whole text, but you can also specify how many characters you want to return:
```python
f = open("demofile.txt", "r")
print(f.read(5))
```
- You can return one line by using the readline() method:
```python
f = open("demofile.txt", "r")
print(f.readline())
print(f.readline())

# OR

f = open("demofile.txt", "r")
for x in f:
  print(x)

# OR

print(f.readline())
```
- Difference in readline() and readlines()
- readlines() gives each line in list
- readline() print single line in file 
- It is a good practice to always close the file when you are done with it using `.close()`.
- `w` will erase all the data from file it is used to create the file


#### Remove File 

```python

import os
if os.path.exists("demofile.txt"):
  os.remove("demofile.txt")
else:
  print("The file does not exist")


# OR REMOVE FOLDER

os.rmdir("myfolder")
```

## Python Object Oriented Programming (OOPs) 
- Python is a multi-paradigm programming language. It supports different programming approaches.
- One of the popular approaches to solve a programming problem is by creating objects. This is known as Object-Oriented Programming (OOP).
- An object has two characteristics:
	- attributes
	- behavior
- Let's take an example:
- A parrot is an object, as it has the following properties:
	- name, age, color as attributes
	- singing, dancing as behavior
- The concept of OOP in Python focuses on creating reusable code. This concept is also known as DRY (Don't Repeat Yourself).
- In Python, the concept of OOP follows some basic principles:


### Class 
- A class is a blueprint for the object.
- We can think of class as a sketch of a parrot with labels. It contains all the details about the name, colors, size etc. Based on these descriptions, we can study about the parrot. Here, a parrot is an object.
- Classes are created by keyword class.
- Attributes are the variables that belong to a class.
- Attributes are always public and can be accessed using the dot (.) operator. Eg.: Myclass.Myattribute
- The example for class of parrot can be :
```
class Parrot:
    pass
```
- 
### Objects
- The object is an entity that has a state and behavior associated with it
- An object (instance) is an instantiation of a class. When class is defined, only the description for the object is defined. Therefore, no memory or storage is allocated.
- `obj = Parrot()`
- Here, obj is an object of class Parrot.
- Suppose we have details of parrots. Now, we are going to show how to build the class and objects of parrots.
 - Object consist of 
	-State: It is represented by the attributes of an object. It also reflects the properties of an object.
	-Behavior: It is represented by the methods of an object. It also reflects the response of an object to other objects.
	-Identity: It gives a unique name to an object and enables one object to interact with other objects.
- Which are present in class 
- 
### Special Method __init__()
- It is similar to the constrector in java
- It is used to inlitization of the variables  

```python
class Parrot:

    # class attribute
    species = "bird"

    # instance attribute
    def __init__(self, name, age):
        self.name = name
        self.age = age

# instantiate the Parrot class
blu = Parrot("Blu", 10)
woo = Parrot("Woo", 15)

# access the class attributes
print("Blu is a {}".format(blu.__class__.species))
print("Woo is also a {}".format(woo.__class__.species))

# access the instance attributes
print("{} is {} years old".format( blu.name, blu.age))
print("{} is {} years old".format( woo.name, woo.age))
```

### self 
- In object-oriented programming, whenever we define methods for a class, we use self as the first parameter in each case. Let's look at the definition of a class called Cat.
- The self keyword is used to represent an instance (object) of the given class.
- In this case, the two Cat objects cat1 and cat2 have their own name and age attributes
- If there was no self argument, the same class couldn't hold the information for both these objects.
- explicitly defined everytime because of following reason
```python
class Cat:
    name = ''
    def __init__(self,name, age):
        self.name = name # Remove self and run 
        self.age = age	

    def info(self):
        print(f"I am a cat. My name is {self.name}. I am {self.age} years old.")

    def make_sound(self):
        print("Meow")
print(Cat.name)  
cat1 = Cat('ooo',22)
print(cat1.name)

cat2 = Cat('sss',11)
Cat.info(cat2)

# Cat.name and cat1.name are different

```
- update age for self
- class attributes and instance attributes

#### Compare()
- when you do obj1 == obj2 the it will compare address of the obj which is false by default
- declear the compare in class 
- to compare the values is the object
```python
from operator import truediv


class Cat:
	def __init__(self, name, age):
		self.name = name
		self.age = age

	def display(self):
		print(self.name, self.age)

	def compare(self, obj):
		if self.name == obj.name and self.age == obj.age:
			return True
		else:
			return False


obj1 = Cat('a', 11)
obj2 = Cat('b',22)
obj3 = Cat('a', 11)

print(obj1.compare(obj2))
print(obj1.compare(obj3))

```
### Methods in OOPS
- Instance Methods are depended on the object 
- which means the methods that we pass self are instance methods 
- Two types of instance methods 
	- Accessor Methods i.e getter 
	- Mutator Method i.e setter
```python
class Student:
	school = "NVH School" 

	def __init__(self, m1,m2,m3):
		self.m1 = m1
		self.m2 = m2
		self.m3 = m3
	
	def avg(self):	# Instance Method
		return (self.m1+self.m2+self.m3)/3

	@classmethod
	def schoolName(cls):	# Class Method 
		return cls.school
	@staticmethod
	def classInfo(): 		# Static Method 
		return 'This is a python class '

s1 = Student(22,33,44)

print(s1.avg())
print(Student.schoolName())
print(Student.classInfo())

```

#### Class inside Class

```python
class Student:
	def __init__(self, name, age):
		self.name = name 
		self.age = age
		self.lap = self.Laptop()
	def display(self):
		print (self.name, self.age)

	class Laptop:
		def __init__(self):
			self.brand = 'HP'
			self.processor = 'i5'

obj1 = Student('aaa',11)
obj1.display()
print('Calling in __init__',obj1.lap.brand)

lapObj = obj1.Laptop()
print('Laptop OBJ',lapObj.brand)
```

### Inheritance
- Single 
- Multilevel
- Multiple
#### Constractor in Inheritance 
- Constractor calling
- super() in init
- super() calling for method
- Method resolution order
	- Order takes left to right
	- For method also if there is two same method in multiple inheritance then it will excure R to L
### Polymorphism
- Poly => Many
- Morph => Forms 
- Object has multiple forms 
#### Duck Typing 
-  Python follow Dynamic typing 
```python
class PyCharm:
	def excute(self):
		print('compile')
		print('execute')


class VsCode:
	def excute(self):
		print('spell check')
		print('Intrupted')



class Laptop:
	def code(self,ide):
		ide.excute()

ideobj1 = PyCharm()

obj1 = Laptop()

obj1.code(ideobj1)

```
#### Operator Overloading
- Magic Methods
- int and str
- OVERRIDING
```python
print(5+2)

print(int.__and__(10,10))

class Student:
	def __init__(self,marks):
		self.marks = marks

	def __add__(self, obj):
		added_marks = self.marks + obj.marks
		return added_marks

	

s1 = Student(20)
s2 = Student(50)

print(s1+s2)

```
- __str__()

- object printing
#### Method Overloading 
```python
# Method Overloading


class Calculator:
	def add(self,a=None,b=None,c=None):
		if a != None and b != None and c != None:
			return a+b+c
		elif a != None and b != None:
			return a+b
		else:
			return a

obj = Calculator()

print(obj.add(1))
print(obj.add(1,2))
print(obj.add(1,2,3))


```

#### Method Overriding
- Self()
- Class Method

### Expection Handling 
#### Errors
- Compile Time Error
	- Syntax error
- Logical Error
	- 
- Runtime
	- Divide by 0
- In expection handling we work on handling the error
- Expection error useually client side error 
- To handle and to avoid the whole apllication for stoping server we use expection handling

#### TRY EXPECT FINALLY
- The `try` block lets you test a block of code for errors.
- The `except` block lets you handle the error.
- The `finally` block lets you execute code, regardless of the result of the try- and except blocks.
```python
a = 5
b = 0
try:
	print(a/b)
except Exception as e:
	print(e)
finally:
	print('finally')
	
```
- ZeroDivisionError
- ValueError

```python
a = 5
b = 0
try:
	print(a/b)
except ZeroDivisionError as e:
	print(e)
finally:
	print('finally')



a = 5
b = 0
try:
	x = int(input('Enter Nos'))
except ValueError as e:
	print('error',e)


```

- raise Exception()

```python
a = 5
b = int(input("Enter No"))
if b<=0:
	raise Exception('Wrong IP')
```
