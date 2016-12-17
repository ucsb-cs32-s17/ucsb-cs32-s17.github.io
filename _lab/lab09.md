---
layout: lab
num: lab09
ready: true
desc: "Arrays, Vectors and Dynamic Arrays"
assigned: 2016-11-21 08:00:00.00-8
due: 2016-12-02 23:59:59.00-8
---
<div markdown="1">

<h1>CS16: Programming Assignment 09 / 10</h1>
<h2>Introduction -- Important: Read this!</h2>
This lab will have you do programming exercises with vectors, dynamic arrays, and recursive functions. We will more fully discuss recursive functions in class in lecture on Tuesday.

THIS IS THE FINAL LAB ASSIGNMENT FOR CS16! IT COUNTS AS TWO (2) REGULAR LABS!

The TAs and I will be looking for (and grading) programming stylizations, such as proper use of comments, tab indentation, good variable names, and overall block and function designs. So, it is not enough for your lab to pass submit.cs! Please read the instructions herein **CAREFULLY!!!**. This assignment is due on <b>Friday, December 2nd at 11:59 PM</b>.

<h3>Pair programming is <b>REQUIRED</b> for this lab!!!</h3>
**Your lab will not be graded if you are not paired-up with 1 other person**
You **must** choose a partner for this lab before we go off on our Thanksgiving Break. Please consult with the instructor or the TAs if you have an issue with your paired arrangement. No changes will be allowed to your paired grouping after Monday, November 28th.

Choose who will be the first driver and who will start as navigator, and then remember to switch (at least once) during the lab. But you should probably know the long-term goal too: each partner should participate in both roles in approximately equal parts over the course of the assignment. 

DO NOT share passwords. Instead, use scp or email to share files with each other at the end of each work session.
For information on scp, see lecture notes from lecture #12.

**PLEASE MAKE SURE YOU TRADE CONTACT INFORMATION WITH YOUR LAB PARTNER! This means emails, phone numbers, online chat handles, or whatever is necessary to continue working together when you are working remotely (like, say, if one of you goes home for the weekend).**

Share your work with each other at the end of EVERY work session. That way, if your pair partner gets hit by a bus (or a rusty Ferrari, or a flying fish, or wins the lottery and quits UCSB, or ... you get the idea) you can continue working without him/her. :)

<h2>Step 1: Getting Ready</h2>
1. Go to submit.cs, navigate to this lab page and create a team for you and your pair partner. Do this by clicking on the blue "Join Groups" button, then follow directions.

2. Decide on initial navigator and driver.

3. Driver, log on to your CSIL account.

4. Open a terminal window and log into the correct machine.

5. Change into your CS 16 directory, create a lab09 directory and change into it.

<h2>Step 2: Writing the Programs</h2>
This lab will have you create FIVE (5) programs: anagram.cpp, choose.cpp, histogram.cpp, palindrome.cpp, and split.cpp. You must follow the instructions carefully. It is not enough to pass the submit.cs check as the instructor and the TAs *will* be checking your submitted program files.

NOTE: IF AN ASSIGNMENT BELOW ASKS YOU TO IMPLEMENT A CERTAIN APPROACH (e.g. you must use vectors somewhere, or dynamic arrays somewhere else), YOU **MUST** FOLLOW THOSE INSTRUCTIONS VERY CAREFULLY!!!

Each corresponds to one of the problems listed below, which make up this lab. Each of the 5 programs is worth 30 points. Each should be solved in its own file and each must be submitted for full assignment credit. 

Note: All these submissions will be checked by the automatic system on submit.cs AND by the instructor and TAs for further evaluation. Details below.

---
<h3>SPLIT.CPP</h3>
Given the following function header:

`vector<string> split(string target, string delimiter);`

implement the function *split* so that it returns a vector of the strings in target that are separated by the string delimiter.

For example: **split("10,20,30", ",")** should return a vector with the strings "10", "20", and "30". Similarly, **split("do re mi fa so la ti do", " ")** should return a vector with the strings "do", "re", "mi", "fa", "so", "la", "ti", and "do".

Write a program that inputs two strings and calls your function to split the first target string by the second delimiter string and prints the resulting vector all on line line with elements separated by commas.

You **MUST** use the vector function defined above and you may **not** use built-in C++ functions that we have NOT discussed in lecture.

The program should print a string of text to the terminal before getting each line of input from the user. A session should look like one of the following examples (including whitespace and formatting), with possibly different numbers in the output:

```
Enter string to split:
10,20,30
Enter delimiter string:
,
The substrings are: "10", "20", "30"
```

OR

```
Enter string to split:
do re mi fa so la ti do
Enter delimiter string:
 
The substrings are: "do", "re", "mi", "fa", "so", "la", "ti", "do"
```

Note: the fourth line in the second example has a single space character (it is not an empty line).

The strings printed by the program should include a newline at the end.

---
<h3>ANAGRAM.CPP</h3>
Write a function that determines if two strings are anagrams. 
The function should not be case sensitive and should disregard any punctuation or spaces. Two strings are anagrams if the letters can be rearranged to form each other. For example, “Eleven plus two” is an anagram of “Twelve plus one”. Each string contains one “v”, three “e’s”, two “l’s”, etc. You may use either the string class or a C-style string. Either way, you may **not** use built-in C++ functions that we have NOT discussed in lecture.

Write a program that inputs two strings and calls your function to determine whether or not the strings are anagrams and prints the result.

The program should print a string of text to the terminal before getting each line of input from the user. A session should look like one of the following examples (including whitespace and formatting), with possibly different numbers and numbers of asterisks in the output:

```
Enter first string:
Eleven plus two
Enter second string:
Twelve plus three
The strings are not anagrams.
```

OR

```
Enter first string:
Rats and Mice
Enter second string:
in cat's dream
The strings are anagrams.
```

The strings printed by the program should include a newline at the end, but no other trailing whitespace (whitespace at the end of the line).

---
<h3>HISTOGRAM.CPP</h3>
Write a program that outputs a histogram of student grades for an assignment. First, the program will input the number of grades and create a dynamic array to store the grades. Then, the program should input each student's grade as an integer and store the grade in the dynamic array.

The program should then scan through the array and compute the histogram. In computing the histogram, the minimum value of a grade is 0 but your program should determine the maximum value entered by the user. Use a dynamic array to store the histogram. Output the histogram to the console.

For example, if the input is:

Enter number of grades:
6
Enter grades (each on a new line):
20
30
4
20
30
30
Then the output histogram should be:

 4 *
20 **
30 ***

You must delete all memory allocated to dynamic arrays before the program ends.

You **MUST** use dynamic arrays to build this program and you may **not** use built-in C++ functions that we have NOT discussed in lecture.

The program should print a string of text to the terminal before getting each line of input from the user. A session should look like one of the following examples (including whitespace and formatting), with possibly different numbers and numbers of asterisks in the output:

```
Enter number of grades:
6
Enter grades (each on a new line):
20
30
4
20
30
30
Histogram:
 4 *
 20 **
 30 ***
```

OR

```
Enter number of grades:
7
Enter grades (each on a new line):
1
1
100
100
100
99
50
Histogram:
  1 **
 50 *
 99 *
100 ***
```

The strings printed by the program should include a newline at the end, but no other trailing whitespace (whitespace at the end of the line).

The scores should be right-justified with width 3 (there should be two spaces before a one-digit number, and one space before a two-digit number). So you can assume that the "grades" inputted will not be composed of more than 3 digits. Hint for formatting: remember setw.

---
<h3>PALINDROME.CPP</h3>
Write a recursive function that returns true if an input string is a palindrome and false if it is not. You can do this by checking if the first character equals the last character, and if so, make a recursive call with the input string minus the first and last characters. You will have to define a suitable stopping condition.

Then write a program that takes in a string as user input, then calls the above function and outputs the result. Input string may have characters and numbers. Ignore case when comparing two chracters.

The program should print a string of text to the terminal before getting the inputs from the user. A session should look like one of the following examples (including whitespace and formatting):

```
Enter string:
redivide
"redivide" is not a palindrome.
```

OR

```
Enter string:
detartrated
"detartrated" is a palindrome.
```

The strings printed by the program should include a newline at the end, but no other trailing whitespace (whitespace at the end of the line).
You **MUST** use a recursive function to build this program and you may **not** use built-in C++ functions that we have NOT discussed in lecture.

---
<h3>CHOOSE.CPP</h3>
The formula for computing the number of ways of choosing r different things from a set of n things is the following:

*C(n, r) = n! / (r! · (n – r)!)*

The factorial function n! is defined by

*n! = n · (n – 1) · (n – 2) · ... · 1*

Discover a recursive version of this formula and write a recursive function that computes the value of the formula. Using this recursive function, write a function which computes the formula for number of ways to choose r different things from a set of n things.

Then write a program that takes r and n as user input, then calls the above functions and outputs the result.

Hint: some of the intermediate values (such as 16!) are too large to fit in a variable of int type. Consider using a type which can store larger numbers such as long (or even unsigned long, since our numbers are all positive in this problem).

The program should print a string of text to the terminal before getting each line of input from the user. A session should look like the following example (including whitespace and formatting), with possibly different numbers in the output:

```
Enter r (number of things to choose):
3
Enter n (the number of things to choose from):
6
There are 20 ways to choose 3 things from a set of 6 things.
```

The strings printed by the program should include a newline at the end, but no other trailing whitespace (whitespace at the end of the line). Also take care of singular and plural words in the sentence (1 way, 2 things etc.)

You **MUST** use a recursive function to build this program and you may **not** use built-in C++ functions that we have NOT discussed in lecture.

---

<h2>Step 3: Create a File for "make" & Compile the Codes with the make Command</h2>

Copy the file provided to you at this URL. This file contains an almost finished file that helps you run "make":
<http://www.cs.ucsb.edu/~zmatni/cs16/lab09/Lab9_file>

Using your text editor, fill in the missing parts of the file (you will also have to rename it appropriately - see lecture notes on "make", or go back to the previous lab for quick hints).

<h2>Step 4: Submit</h2>

Once you are satisfied that your programs are correct, it is time to submit them. Login at [https://submit.cs.ucsb.edu](https://submit.cs.ucsb.edu), then navigate to “CS16_f16” and click on “lab09”. Then click “Make Submission”, and make your submission the same way as last week. Remember to submit all of the .cpp files.

Once you submit, you should see a page detailing your submission. The system will automatically grade your program and will show you the results on this page after a 1 minute delay.

You can alternatively submit your code from the command line (terminal) on any CS machine, including the Phelps lab machines or the CSIL server. You can use this method when logged in remotely. To submit the the five source files (make sure they are the only 5 .cpp files)  to this assignment by running the command:

`~submit/submit -p 605 *.cpp`

You can copy the URL shown in the output of the above and paste into a web browser to reach the submission result page.

<h2>Step 5: Check Submission Results</h2>

After the 1 minute delay, the submit system will show your score and give you feedback on your submission. Refresh the webpage after a minute to see this information.

You may submit this lab multiple times. You should submit only after local compilation does not produce any errors and runs as expected. The score of the last submission uploaded before the deadline will be used as your assignment grade.

<b>Points assigned by TAs manually</b>
(50 pts) Style:
Good choice of variable names, code indented in ways that are consistent, and in line with good C++ practice. Where applicable, common code is factored out into functions.

You will note that the submit.cs score is worth 150 points and the manual grading is worth 50 points, making the total points for this lab equal to 200. This lab is worth exactly TWO (2) LABS.


<h2>Step 6: Done!</h2>
Remember that we will check your code for appropriate comments, formatting, and the use of required code, as stated earlier.

If you are in the Phelps lab or in CSIL, make sure to log out of the machine before you leave. Also, make sure to close all open programs before you log out. Some programs will not work next time if they are not closed. Remember to save all your open files before you close your text editor.

If you are logged in remotely, you can log out using the exit command:

`$ exit`

</div>
