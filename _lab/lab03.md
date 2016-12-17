---
layout: lab
num: lab03
ready: true
desc: "Flow Control Assignment"
assigned: 2016-10-10 08:00:00.00-7
due: 2016-10-14 12:00:00.00-7
---

<div markdown="1">

<h1>CS16: Programming Assignment 03</h1>
<h2>Introduction</h2>
The assignment for this week will utilize concepts of control flow that we covered in class. You may utilize other concepts of programming as well, as you see fit.

This assignment is due on Friday, October 14th at 12:00 pm.

<h2>Step 1: Getting Ready</h2>
I hope I can safely assume that you have all gotten a CoE account yet...
Open a terminal window and log into the correct machine - refer to the instructions in Lab #1, if you forgot how to do that.

Start by changing into your CS 16 directory:

`$ cd cs16`

And then create and change into the lab03 directory:

`$ mkdir lab03`

`$ cd lab03`

Remember that at any time, you can check what directory you are currently in with the command <b>pwd</b>.

<h2>Step 2: Create and Edit Your C++ Files</h2>
This week, you will need to create <b>three files called block.cpp, min4.cpp, and pi.cpp</b>:
Each corresponds to one of the problems listed below, which make up this lab.

For a reminder on how to open and use a text editor to create and edit new source files, refer back to Lab #1.

This assignment consists of 3 problems, each of which is described below. The first one is worth 20 points each, and the last two are worth 40 points each. Each should be solved in its own file and all three must be submitted for full assignment credit. These exercises are inspied by ones from the textbook (in Ch. 2 and Ch. 3) - but they are NOT the same, so follow the instructions on THIS sheet carefully. 

<h3>BLOCK.CPP</h3>
Write a program that takes input from a user for number of rows and number of columns and prints out a block of characters that is based on these 2 parameters. The program should keep asking the user for input, and printing out the result, until the user enters zero for each of the input parameters.

A session should look <b><i>exactly</i></b> like the following example (including whitespace and formatting - although note that there is no whitespace at the end of each of these lines), with all manners of different numbers for inputs and the output:

<img src="block.png" width="700" alt="block program example" />

Each string printed by the program should include a newline at the end, but no other trailing whitespace (i.e. extra space characters at the end of the line).

<h3>MIN4.CPP</h3>
You are going to write a program that compares 4 input numbers and print out the smallest one. You should base the program on an example that I will give you that compares 3 numbers and uses nested functions (which we will talk about in class later). The example is shown in 3 separate files (see below).

<b><i>Step 1</i></b>: Copy all the files over to your directory using the <b>cp</b> UNIX command, by issuing the following:

`cp ~zmatni/public_html/cs16/lab03/* ~/cs16/lab03`

The * symbol in this command is a "wildcard" — it means that we want all of the files from the source directory copy be copied into the destination directory namely ~/cs16/lab03

<b><i>Step 2</i></b>: Do a list file command (<b>ls</b>). You should see something like this:

```
$ ls

min2.cpp  min3v1.cpp  min3v2.cpp
```

If you do not see those 3 files, go back through the instructions and make sure you did not miss a step. If you still have trouble, ask your TA for assistance.

<b><i>Step 3</i></b>: Examine the three programs
In this step, you are only examining three programs.

<b>min2.cpp</b>

It takes two command line arguments, and converts them to integers.  It then calls a function, smallest_of_two, that returns the smallest of the two numbers (or the value they share in case of a tie.) It then prints out the result of that function call.

<b>min3v1.cpp</b>

This is the first of two versions of a program that takes this one step further, finding the smallest value from among three numbers. Again, if there is a tie, it prints the value that is shared. Look at the nested if/else statements and see if you can make sense of the logic.

<b>min3v2.cpp</b>

This program does EXACTLY the same thing as min3v1.cpp, but does it with much cleaner, simpler code. Notice how we REUSE the smallest_of_two function to build up a smallest_of_three function. 

Your job in this step is to test min2, min3v1 and min3v2 with many different values and convince yourself that they work properly.

In the next step, you will be taking these programs to the next logical step in this sequence.

<b><i>Step 4</i></b>: Write min4.cpp
Write a program that works just like min2 and min3v1 and min3v2, except it takes four ints on the command line, and prints the smallest value, handling ties appropriately.

I encourage you to follow the model of min3v2.cpp if you can understand how this works, since your code will be far cleaner than trying to build this out of nested if/else statements.

If you DO use nested if/else statements, though, be sure that you indent and format your code appropriately.

Follow the pattern in min2 and min3v1/min3v2 in terrms of all other issues and how they are handled, including the usage message, etc. Your program should look exactly like this (note, there are no trailing whitespacse):

<img src="min4.png" width="500" alt="min4 program example" />

<h3>PI.CPP</h3>
Write a C++ program that approximates the value of the constant π, based on the Leibniz formula for π. The formula is shown in the image below:

<img src="pi_formula.png" alt="pi formula" />

Put another way, the formula can be written as:

pi = 4 · [ 1 – 1/3 + 1/5 – 1/7 + 1/9 ... + (–1 ^ n)/(2n + 1) ]

The Leibniz formula works well for high values of n.

The program takes an input from the user for the value of n, which determines the number of terms in the approximation of the value of pi. The program then outputs that calculation. You must also include a loop that allows the user to repeat this calculation for new values n until the user says she or he wants to end the program by issuing an input of 0.

The program should print a string of text to the terminal before getting each piece of input from the user. A session should look like the following example (including whitespace and formatting), with various and different inputs and numbers in the output:

<img src="pi.png" width="700" alt="pi program example" />

Note that each string printed by the program should include a newline at the end, but no other trailing whitespace (whitespace at the end of the line).

In addition, all approximated floating pointer numbers must be displayed to exactly three  digits after the decimal point.

<h2>Step 3: Compile the Codes</h2>

To compile our codes, we will use the same g++ command as we described in previous labs. The following three commands will compile the three source files (in the same order as listed above):

`$ g++ -std=c++11 -o block block.cpp`

`$ g++ -std=c++11 -o min4 min4.cpp`

`$ g++ -std=c++11 -o pi pi.cpp`

(NOTE: the -std=c++11 option in these commands is optional to use (that is, not critical to define). All this does is force the compiler to use the latest version of C++).

If the compilation is successful, you will not  see any output from the compiler. You can then use the following commands to run your programs:

`$ ./block`

`$ ./min4`

`$ ./pi`

<b>If you encounter an error, use the compiler hints and examine the line in question. If the compiler messsage is not sufficient to identify the error, you can search online to see when the error occurs in general.</b>

Remember to re-compile the relevant files after you make any changes to the C++ code.

<h2>Step 4: Submit</h2>

Once you are satisfied that your programs are correct, it is time to submit them. Login at [https://submit.cs.ucsb.edu](https://submit.cs.ucsb.edu), then navigate to “CS16_f16” and click on “lab03”. Then click “Make Submission”, and make your submission the same way as last week. Remember to submit all three .cpp files.

Please remember that you must submit the programs to obtain any credit for the assignment; just completing the programs is not enough.

Once you submit, you should see a page detailing your submission. The system will automatically grade your program and will show you the results on this page after a 1 minute delay.

You can alternatively submit your code from the command line (terminal) on any CS machine, including the Phelps lab machines or the CSIL server. You can use this method when logged in remotely. To submit the the three source files to this assignment by running the command:

`$ ~submit/submit -p 561 block.cpp min4.cpp pi.cpp`

You can copy the URL shown in the output of the above and paste into a web browser to reach the submission result page.

<h2>Step 5: Check Submission Results</h2>

After the 1 minute delay, the submit system will show your score and give you feedback on your submission. Refresh the webpage after a minute to see this information.

You may submit this lab multiple times. You should submit only after local compilation does not produce any errors and runs as expected. The score of the last submission uploaded before the deadline will be used as your assignment grade.

<h2>Step 6: Done!</h2>

Once your submission receives a score of 100/100, you are done with this assignment.

If you are in the Phelps lab or in CSIL, make sure to log out of the machine before you leave. Also, make sure to close all open programs before you log out. Some programs will not work next time if they are not closed. Remember to save all your open files before you close your text editor.

If you are logged in remotely, you can log out using the exit command:

`$ exit`

</div>
