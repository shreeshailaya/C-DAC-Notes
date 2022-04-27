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


### Modules
- Consider a module to be the same as a code library.
- A file containing a set of functions you want to include in your application.
- for importing modules we can use `import`

### Special Variable __name__

- __name__ is a built-in variable which evaluates to the name of the current module.

- Thus it can be used to check whether the current script is being run on its own or being imported somewhere else

- When the module is begin run the the value of __name__ is __main__ if its imported from someware else then it is module name 



## Python Functional Programming 

## Python Object Oriented Programming (OOPs) 

### Class and Objects 

