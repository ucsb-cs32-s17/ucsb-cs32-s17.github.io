---
layout: lab
num: lab08
ready: false
desc: "Anagrams, palindromes and histograms: Dynamic arrays and recursion"
assigned: 2017-03-13 15:30:00.00-7
due: 2017-03-20 23:59:00.00-7
---
<div markdown="1">


# Goals of this lab
This lab will have you do programming exercises with dynamic arrays, recursive functions, and Makefiles. You will also get more practice writing programs from scratch with no skeleton code.


# Step 1: Getting Started 

1. Decide if you are working alone, or working in a pair. Pair programming is OPTIONAL for this lab.

2. If you are working as a pair, go to submit.cs, navigate to this lab page and create a team for you and your pair partner.  Choose who will be the first driver and who will start as navigator, and then remember to switch (at least once) during the lab. 

3. Go to github and create a git repo for this lab following the naming convention specified in previous labs (this step carries style points, see our feedback on previous labs to understand what we are looking for). If you are working with a partner only one of you needs to create the repo.

4. If you are working with a partner and you are the one who created the github repo, add your partner as a collborator on the repo

5. Decide on initial navigator and driver.

6. Driver, log on to your CSIL account.

7. Open a terminal window and log into the correct machine.

8. Change into your CS 16 directory

9. Clone your github repo in the ~/cs16/ directory. Then cd into your repo directory.

Note: Remember to push your work to github at the end of EVERY work session. That way, both partners always have access to the latest version of the code even if the code is being developed on one partner's CoE account.


# Step 2: Writing the programs
This lab will have you create FIVE (5) programs: anagram.cpp, choose.cpp, histogram.cpp, and palindrome.cpp. Each of the 5 programs is worth 30 points. Each should be solved in its own file and each must be submitted for full assignment credit. You must follow the instructions carefully. It is not enough to pass the submit.cs check as the instructor and the TAs *will* be checking your submitted program files for style. 

NOTE: IF AN ASSIGNMENT BELOW ASKS YOU TO IMPLEMENT A CERTAIN APPROACH (e.g. you must use vectors somewhere, or dynamic arrays somewhere else), YOU **MUST** FOLLOW THOSE INSTRUCTIONS VERY CAREFULLY!!!

## Program to find if two strings are anagrams
In your github directory open a file named anagram.cpp (all lowercase). In that file write a function called isAnagram that takes two strings as arguments and returns a boolean true if the two strings are anagrams, otherwise it returns false. The function should not be case sensitive and should disregard any punctuation or spaces. Two strings are anagrams if the letters can be rearranged to form each other. For example, “Eleven plus two” is an anagram of “Twelve plus one”. Each string contains one “v”, three “e’s”, two “l’s”, etc. You may use either the string class or a C-style string. Either way, you may **not** use built-in C++ functions that we have NOT discussed in lecture.

In the same file, write a program that inputs two strings and calls your function to determine whether or not the strings are anagrams and prints the result.

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

## Program to output histogram of student grades
In your github directory open a file named histogram.cpp. Write a program that outputs a histogram of student grades for an assignment. First, the program will input the number of grades and create a dynamic array to store the grades. Then, the program should input each student's grade as an integer and store the grade in the dynamic array.

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
## Program to check if an input string is a palindrome
Open a file named palindrome.cpp. Write a recursive function that returns true if an input string is a palindrome and false if it is not. You can do this by checking if the first character equals the last character, and if so, make a recursive call with the input string minus the first and last characters. You will have to define a suitable stopping condition.

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
## Program to determine the possible number of combinations
Open a file named choose.cpp. Write a program to determine the number of ways to choose 'r' different things from a set of 'n' things. The formula for determining this is the following:

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

## Step 3: Create a Makefile to compile all the code you have written with the make command

Copy the file provided to you at this URL. This file contains an almost finished file that helps you run "make":
<http://www.cs.ucsb.edu/~zmatni/cs16/lab09/Lab9_file>



## Step 4: Submit

Push all your code to github. Then submit your code on submit.cs
Here is the command to submit this week's labs:

```
~submit/submit -p 649 *.cpp *.h

## Step 5: Check your submission results

After the 1 minute delay, the submit system will show your score and give you feedback on your submission. Refresh the webpage after a minute to see this information.

You may submit this lab multiple times. You should submit only after local compilation does not produce any errors and runs as expected. The score of the last submission uploaded before the deadline will be used as your assignment grade.

<b>Points assigned by TAs manually</b>
(50 pts) Style:
Good choice of variable names, code indented in ways that are consistent, and in line with good C++ practice. Where applicable, common code is factored out into functions.

You will note that the submit.cs score is worth 150 points and the manual grading is worth 50 points, making the total points for this lab equal to 200. This lab is worth exactly TWO (2) LABS.


## Step 6: Done!
Remember that we will check your code for appropriate comments, formatting, and the use of required code, as stated earlier.

If you are in the Phelps lab or in CSIL, make sure to log out of the machine before you leave. Also, make sure to close all open programs before you log out. Some programs will not work next time if they are not closed. Remember to save all your open files before you close your text editor.

If you are logged in remotely, you can log out using the exit command:

`$ exit`


</div>
