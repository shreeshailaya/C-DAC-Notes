/*
Understanding Time and Space Complexity For Beginner

Being around the Software Engineering community long enough and the concepts of time complexity and space complexity are surely to come up. It is something that should always be on the mind from theorist of computer science and especially engineers and programmers who build real world productions and applications. A friend of mine recalled a conversation they had regarding the importance of time and space complexity, and it inspired me to write a little something about it. Seeing as some people did not learn it, or — like me — did not see the immediate importance of it, I will go through a basic overview of each and talk about some of their real world implications.

Scenario
Imagine you lent a book to one of your 100 friends. Having them all together, you would like your book back.

Space Complexity
Space Complexity is represented as a function that portrays the amount of space is necessary for an algorithm to run until complete. In the aforementioned scenario we are looking at you can think of space complexity as the number of rooms you need to figure out who has the book. However, in computer science, this typically means how much memory does the processes and data structures in our codebase / functions take up to achieve their goal.

Time Complexity
Time Complexity is represented as a function that portrays the amount of time is necessary for an algorithm to run until complete. In the aforementioned scenario we are looking at time complexity can be represented in the approach you take in finding out who has the book. However, in computer science, this typically means how much time does the processes and data structures in our codebase / functions take up to achieve their goal.

Time complexity however is an umbrella term for the different types of time complexities that we can calculate. From fastest to slowest they are:
->Worst Case Time Complexity: The absolute most number of times an operation needs to be done before completed
->Average Case Time Complexity: The average number of times it will take for the algorithm / code to complete
->Amortized Running Time: Similar to average, it is the number of times the operation will take when run a sufficient amount of time consecutively
->Best Case Time Complexity: The fastest number of times an operation needs to complete


Example of Complexity Function
->O(n²): You ask one friend if they have the book. You also ask them if the other 99 friends have the book. Afterwards move on to the next friend and repeat the process.
->O(n): You ask each friend one by one if they have the book.
->O(log n): You divide the friends into two rooms and ask if the person with the book is in room 1 or room 2. Depending on which group has the book split them up into the two rooms and repeat until there is one person in the right room with the book.
->O(1): You remember who has the book and you go them directly.

Note on the Meaning of Complexity Function
Something that is important to note is that the Time / Space Complexity of algorithm/code is not in fact actual time or space that is required to execute a particular code but the number of times a statement executes. Meaning the function is not a measure of time / or space but a measure of what the code is actually doing.

Importance of Time/Space Complexity
In real world applications developers are bound by the physical memory of the systems that they intend to run on. This is where space complexity becomes important, because we never want to run a function or process that exceeds the amount of space the system has at any given time. On the other hand, we do not want our functions to take so long that our applications gets bogged down and slowed.

                                                                                                                THANK YOU
*/
