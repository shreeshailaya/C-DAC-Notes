# Industrial Approach for Python Programming

- Python was founded by  Guido van Rossum in 1989 at National Research institute Netherland
- and it release to public in 20 February 1991 
- python is general purpose high level programming language
       - C - low lavel
- Dynamically typed language - (the type of a variable is determined at runtime, not during compile time)
- Name is came from TV serial on BBC (British Broadcasting Company) 1969-1974 - TV show called Monty Python Flying Circus
- TWO DIFFERENT VERSION HAS DIFFERENT STORY

### Features
- Easy to Code
- Open Source and Free
- Support for GUI
- Object-Oriented Approach
- High-Level Language
- Integrated by Nature
	- Execute code line by line easy to compile
- Highly Portable
- Highly Dynamic 
	- No need to declare as int 
- Integrated Language
- Large Standard library
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


## IF
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

## IF ELSE
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

## FOR
```python

# List of numbers
numbers = [6, 5, 3, 8, 4, 2, 5, 4, 11]



# iterate over the list
for val in numbers:
    print(val)


```



## File

The `with` statement automatically closes the file when done.



### **1. Open a file and print its attribute values**
```python
file = open("sample.txt", "r")
print("Name:", file.name)
print("Mode:", file.mode)
print("Closed:", file.closed)
file.close()
```
**Explanation**: Opens a file in read mode and prints file name, mode, and closed status.

---

### **2. Access a file after it is closed**
```python
file = open("sample.txt", "r")
file.close()
try:
    print(file.read())
except ValueError as e:
    print("Error:", e)
```
**Explanation**: Shows error when trying to read from a closed file.

---

### **3. Write using `writelines()`**
```python
lines = ["Hello\n", "Welcome to Python\n", "File writing demo\n"]
with open("demo.txt", "w") as f:
    f.writelines(lines)
```
**Explanation**: Writes a list of strings to the file using `writelines()`.

---

### **4. Append data to an existing file**
```python
with open("demo.txt", "a") as f:
    f.write("Appending this line.\n")
```
**Explanation**: Opens the file in append mode and adds a line at the end.

---

### **5. Display contents of a file**
```python
with open("demo.txt", "r") as f:
    print(f.read())
```
**Explanation**: Reads and prints the entire content of the file.

---

### **6. Split line into words using space**
```python
line = "Python is an amazing language"
words = line.split(" ")
print(words)
```
**Explanation**: Splits the line into a list of words using space.

---

### **7. Tell and set file pointer position**
```python
with open("demo.txt", "r") as f:
    print("Initial Pointer:", f.tell())
    f.read(5)
    print("After reading 5 chars:", f.tell())
    f.seek(0)
    print("Pointer after seek(0):", f.tell())
```
**Explanation**: Shows file pointer movement with `tell()` and `seek()`.

---

### **8. Calculate % of vowels and consonants**
```python
vowels = 'aeiouAEIOU'
with open("demo.txt", "r") as f:
    text = f.read()
    total = sum(c.isalpha() for c in text)
    vow = sum(c in vowels for c in text)
    cons = total - vow
    print(f"Vowels: {vow/total*100:.2f}%, Consonants: {cons/total*100:.2f}%")
```

```
total = sum(c.isalpha() for c in text)
c.isalpha() returns True if the character is a letter.

sum(...) adds up all the True values (each counts as 1).

vow = sum(c in vowels for c in text)
c in vowels checks if the character is in our vowels string.

sum(...) counts all vowel letters.
```
**Explanation**: Reads file, counts vowels/consonants, and calculates percentage.

---

### **9. Change current directory**
```python
import os

# Let's say we have a file path
file_path = "/home/user/documents/demo.txt"

# Extract the directory from the file path
file_dir = os.path.dirname(file_path)

# Change the current working directory to that directory
os.chdir(file_dir)

# Confirm the change
print("Current Directory:", os.getcwd())

```
**Explanation**: Creates and changes to a new directory.

---

### **10. Print absolute path using `os.path.join()`**
```python
import os
path = os.path.join(os.getcwd(), "demo.txt")
print("Absolute Path:", path)
```
**Explanation**: Combines current directory and file name to show absolute path.

---

### **11. Count tabs, spaces, and newlines**
```python
with open("demo.txt", "r") as f:
    data = f.read()
    print("Tabs:", data.count("\t"))
    print("Spaces:", data.count(" "))
    print("Newlines:", data.count("\n"))
```
**Explanation**: Counts the number of tabs, spaces, and newlines in the file.

---

### **12. Copy content with case and punctuation changes**
```python
with open("demo.txt", "r") as src, open("copied.txt", "w") as dest:
    for line in src:
        new_line = line.replace(".", ",").swapcase()
        dest.write(new_line)
```
**Explanation**: Replaces `.` with `,`, switches upper to lower and vice versa, then copies.

---

## Feedback Form
https://forms.gle/uKpTwCyvVCAUZUws5

