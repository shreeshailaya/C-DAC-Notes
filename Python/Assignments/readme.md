## Day-1 to Day-6 (Beginner)
### print()
1. Let's start with a long time programming tradition and print "Hello World!" by typing it inside print() function.
2. Now try to assign "Hello World!" to the variable my_text.
3. Type a couple of different values inside the print function. Make sure they are separated by commas.  
---
### Variables
1. Below is a good example of mixing numbers and text inside the print() function
- Assign: 3 to variable glass_of_water. 
```pthon
#Type here. Assign a number to the variable: glass_of_water

glass_of_water=

print("I drank", glass_of_water, "glasses of water today.")
``` 
2. Let's try to see what happens after assigning a new value to our variable. Note that program gets executed line by line.
- Place the variable: glass_of_water inside the print function and observe what happens.
```python
#Fill the print function so it prints glass_of_water

glass_of_water=3

glass_of_water=glass_of_water + 1


print()

```
---
### Type Conversion
1. Using type() function assign the type of the variable to answer_1, then print it.
```python 
men_stepped_on_the_moon=12

#Type your code here.

answer_1=


print(answer_1)

```

2. Using type() function assign the type of the variable to answer_2, then print it.

```python
my_reason_for_coding="intergalactic travel"

#Type your code here.

answer_2=


print (answer_2)
```
---
### List
1. Assign the first element of the list to answer_1 on line 2
```python
lst=[11, 100, 99, 1000, 999]
answer_1=

print(answer_1)

```

2.  let's print the second element directly inside print function.This time print the second element of the list directly on line 3. You should get 100.

```python
lst=[11, 100, 101, 999, 1001]

print()

```
3. What is the maximum value in the list?

```python
lst=[55, 6, 777, 54, 6, 76, 101, 1, 6, 2, 6]

#  Type your code on line 4:
answer_1=

print(answer_1)

```

4. Using .count() method, count how many times 6 occur in the list.

```python
lst=[55, 6, 777, 54, 6, 76, 101, 1, 6, 2, 6]
#  Type your code inside print() function.

answer_1=

print(answer_1)
```

5.Using .append() method, add a new list to the end of the list which contains strings: "Navigator" and "Suburban".
```pthon
lst=["CRV", "Outback", "XC90", "GL", "Cherokee", "Escalade"]
#  Type your code here.


print(lst)
```
6. .insert() lets you specify the index you want to add your item.On line 3, this time insert "slippers" to index 3 of gift_list.
```python
gift_list=['socks', '4K drone', 'wine', 'jam']
# Type your code here.



print(gift_list)
```
---
### Tuples
1. Assign the first element of the tuple to answer_1 
```python
tt=(11, 100, 99, 1000, 999)

answer_1=


print(answer_1)

```

2. This time print the third element of the tuple.

```python
tt=(11, 100, 101, 999, 1001)

#Type your answer here.

answer_1=

print(answer_1)
```
3. What's the index of 2?
```python

tt=(55, 777, 54, 6, 76, 101, 1, 2, 8679, 123, 99)
#  Type your code here.

answer_1=

print(answer_1)
```
4. How many times does 777 occur?
```python
tt=(55, 6, 777, 54, 6, 76, 7777, 1, 777, 2, 6)

#  Type your code here.

answer_1=

print(answer_1)
```

5. What is the sum of all the numbers in the tuple?
```python
tt=(42, 1092, 11, 88, 65, 2, 6)

#  Type your code on line 4:

ans_1=


print(ans_1)
```

6.What is the minimum value in the tuple?

```python
tt=(66, 555, 11, 101, 9, 1001)

#  Type your code on line 4:

ans_1=


print(ans_1)

```
---
### Dictionaries
- Dictionaries don't have index orders, so speaking about them regarding their first item or last item is not very correct. Next time you print a dictionary it may have a different order than you saw before. Instead they have keys, and we can use keys to call their values.

1. When was Plato born?
```python
dict={"name": "Plato", "country": "Ancient Greece", "born": -427, "teacher": "Socrates", "student": "Aristotle"}

#Type your answer below.
answer_1=

print(answer_1)


```
2. Change Plato's birth year from B.C. 427 to B.C. 428.
```python
dict={"name": "Plato", "country": "Ancient Greece", "born": -427, "teacher": "Socrates", "student": "Aristotle"}

#Type your answer below.


print(dict["born"])
```

3. Dictionaries can have nested data too. Also, you can add a new key to a dictionary as they are mutable (changeable). Try to add the key "work" to dict with values shown below.
- "work": ["Apology", "Phaedo", "Republic", "Symposium"]
```python
dict={"name": "Plato", "country": "Ancient Greece", "born": -427, "teacher": "Socrates", "student": "Aristotle"}

#Type your answer below.


print(dict)
```
4. Add 2 inches to the son's height.
```python
dict={"son's name": "Lucas", "son's eyes": "green", "son's height": 32, "son's weight": 25}

#Type your answer below.


print(dict)

```
5. Using .items() method generate a list of tuples consisted of each key value pair.

```python
dict={"son's name": "Lucas", "son's eyes": "green", "son's height": 32, "son's weight": 25}

#Type your answer below.
ans_1=

print(ans_1)
```

6. .get() method can be used just to get the value of a key. But it has more tricks up its sleeve.Try to look for key: "son's age" and if nothing comes up make the .get() return "2"

```python
dict={"son's name": "Lucas", "son's eye color": "green", "son's height": 32, "son's weight": 25}

#Type your answer here.
ans_1=

print(ans_1)
```

7. Since dictionaries are mutable, they have some methods that tuples don't have, .clear() is one of them and it clears the whole dictionary.
```python
dict={"son's name": "Lucas", "son's eye color": "green", "son's height": 32, "son's weight": 25}

#clear the dictionary here then print it.


print(dict)
```
---
### String

1. Assign the string below to the variable in the exercise."It's always darkest before dawn."

```python
#Type your answer here.

str=""

print(str)


```

2. By using first, second and last characters of the string, create a new string.
```python
str="It's always darkest before dawn."

#Type your answer here.

ans_1=

print(ans_1)
```

3. Replace the (.) with (!)
```pyhton
str="It's always darkest before dawn."

#Type your code here.



print(str)

```

4. Reassign str so that, all its characters are lowercase
```python
str="EVERY Strike Brings Me Closer to the Next Home run."
# Type your code here.
# Use lower()



print(str)

```

5. Make the string so that everything is properly and first letter is capital with one function.

```python 

str="there are no traffic JamS Along The extra mile."

#Type your answer here.
# USE capitalize()



print(str)
```

6. Check does it end with a fullstop (.) ?
```python
str="There are no traffic jams along the extra mile."
#  Type your code here.
# Use endswith()

ans_1=


print(ans_1)
```

7. Which character occur more often in the string? "a" or "o" ? Print both counts inside the print function.
```python
str="People often say that motivation doesn't last. Well, neither does bathing.  That's why we recommend it daily."
#  Type your code here.
# Use count()
ans_1=

ans_2=


print("count of a is: ", ans_1, " count of o is: ", ans_2)

```

8. Print the length and type of the given string?
```python
str="1.975.000"

#  Type your code here:

len_str=
type_str=

print(len_str)
print(type_str)
```

9. Slice the word until first "a". (Tosc)

```python
wrd="Toscana"
#Type your answer here.

ans_1=


print(ans_1)
```

10. Now try to get "can" only.
```python
wrd="Toscana"
#Type your answer here.

ans_1=


print(ans_1)


```
---
### Functions in python

1. Using len() function find out how many items are in the list.

```python
lst=[11, 10, 12, 101, 99, 1000, 999]

answer_1=


print(answer_1)

```
2. Sort the list in ascending order with .sort() method.
```python
lst=[11, 100, 99, 1000, 999]

#Type your answer here.



print(lst)

```

3. Can you sort the gift list in reverse alphabetic order?
```python
gift_list=['socks', '4K drone', 'wine', 'jam']

# Type your answer here.


print(gift_list)
```

4. Pop the last item of the list below using pop()
```python
lst=[11, 100, 99, 1000, 999]

#Type your answer here.

popped_item=
 
print(popped_item)
print(lst)

```
5. Remove "broccoli" from the list using .pop and .index methods.

```python
lst=["milk", "banana", "eggs", "bread", "broccoli", "lemons"]

#Type your code here.


item=


print(lst, item)

```

6. Using input() function ask for user's name.
```python
#Type your answer here.

ans_1=
 
print("Hello!, " + ans_1)

```

7. Can you create a converter that converts miles to kms using input()?

8. Create a range from 0 to 50, excluding 50.

9. Create a range from 0 to 10 with steps of 2.

10. Create a range from 100 to 160 with steps of 10. Then print it as a list.

11. Can you you create a list from 1300 to 700 with descending steps of 100, including 700?
---
### Errors
1. Type something so that Python gives a SyntaxError.
2. Type something so that Python gives a NameError.
3. Type something so that Python gives a TypeError.
---
---
## Day-6 
### Conditions and Imports
1. Write a python program which accept two numbers and print max and min between them
2. Write a python program which accept three numbers and print max and min between them
3. Write a python program which accept a number, if the number is divided by 3 then console print 'fizz', if the number is divided by 5 console will print 'buzz' and if the number is divided by both then it will print 'fizzbuzz' also if it not divided by 3 or 5 print number as it is 
4. Write a python program find the given character is an uppercase letter or lowercase letter or a digit or a special character.
5. Write a python program to display current date and time on console(using import)

## Day-7
### loops
1.Write a Python program to guess a number between 1 to 9. 
- Note : User is prompted to enter a guess. If the user guesses wrong then the prompt appears again until the guess is correct, on successful guess, user will get a "Well guessed!" message, and the program will exit. 
---
2. Write a Python program to get the Fibonacci series between 0 to 50.
- Note : The Fibonacci Sequence is the series of numbers :
- 0, 1, 1, 2, 3, 5, 8, 13, 21, ....
- Every next number is found by adding up the two numbers before it.
- Expected Output : 1 1 2 3 5 8 13 21 34
---
3. Write a Python program which iterates the integers from 1 to 50. For multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
---
4. Write a Python program which accepts a sequence of comma separated 4 digit binary numbers as its input and print the numbers that are divisible by 5 in a comma separated sequence. 
- Sample Data : 0100,0011,1010,1001,1100,1001
- Expected Output : 1010
---
5.Write a Python program that accepts a string and calculate the number of digits and letters. 
- Sample Data : Python 3.2
- Expected Output :
Letters 6
Digits 2

---
---

### Print Pyramid, Star, and diamond pattern 
1.
```
* 
* * 
* * * 
* * * * 
* * * * *
```
2.
```
      * 
     * * 
    * * * 
   * * * * 
  * * * * *
```
3. 
```
Enter the number of rows: 5
* * * * *  
* * * *  
* * *  
* *  
*  
```
4. 
```
Enter the number of rows: 5
1  
2 2  
3 3 3  
4 4 4 4  
5 5 5 5 5  

```
5.
```
Enter the number of rows: 5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
```
6.
```
Enter the number of rows: 5
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5
```
7.
```
1 
2 3 4 
5 6 7 8 9
```
8.
```
Enter the number of rows: 5
1 2 3 4 5 
2 2 3 4 5 
3 3 3 4 5 
4 4 4 4 5 
5 5 5 5 5
```
9.
```
L
LO
LOV
LOVE
LOVEF
LOVEFO
LOVEFOR
LOVEFORP
LOVEFORPY
LOVEFORPYT
LOVEFORPYTH
LOVEFORPYTHO
LOVEFORPYTHON
```

### Array
1. Write a Python program to create an array of 5 integers and display the array items. Access individual element through indexes.
Sample Output:
1
3
5
7
9
Access first three items individually
1
3
5

---
2. Write a Python program to get the number of occurrences of a specified element in an array. 
Sample Output:
Original array: array('i', [1, 3, 5, 3, 7, 9, 3])
Number of occurrences of the number 3 in the said array: 3
---
---
### Functions 

1. Write a Python function to sum all the numbers in a list.
Sample List : (8, 2, 3, 0, 7)
Expected Output : 20
---
2. Write a Python program to reverse a string. 
Sample String : "1234abcd"
Expected Output : "dcba4321"
---
3. Write a Python function to calculate the factorial of a number (a non-negative integer). The function accepts the number as an argument
---
4. Write a Python function that accepts a string and calculate the number of upper case letters and lower case letters. Go to the editor
Sample String : 'The quick Brow Fox'
Expected Output :
No. of Upper case characters : 3
No. of Lower case Characters : 12
---
5. Write a Python function that checks whether a passed string is palindrome or not
--- 
6. Write a Python program to access a function inside a function
---
---
### Lambda Functions
1. Write a Python program to create a lambda function that adds 15 to a given number passed in as an argument, also create a lambda function that multiplies argument x with argument y and print the result. 
Sample Output:
25
48
---
2. Write a Python program to filter a list of integers using Lambda. 
Original list of integers:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Even numbers from the said list:
[2, 4, 6, 8, 10]
Odd numbers from the said list:
[1, 3, 5, 7, 9]
---
---

### Recursion
1. Write a Python program to calculate the sum of a list of numbers.
---
---





