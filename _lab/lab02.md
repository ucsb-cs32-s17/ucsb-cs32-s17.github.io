---
layout: lab
num: lab02
ready: true
desc: "Input/Output and Simple Flow Assignment"
assigned: 2016-10-03 08:00:00.00-7
due: 2016-10-07 12:00:00.00-7
---

<div markdown="1">

<h1>CS16: Programming Assignment 02</h1>
<h2>Introduction</h2>
The assignment for this week will utilize concepts of input and output and simple control flow that we covered in class (Chapter 2 in the book). You may utilize other concepts of programming as well, as you see fit.

This assignment is due on Friday, October 7th at 12:00 pm.

<h2>Step 1: Getting Ready</h2>
If you have not gotten a CoE account yet, please do so as soon as possible!
Open a terminal window and log into the correct machine - refer to the instructions in Lab #1, if you forgot how to do that.

Start by changing into your CS 16 directory:

`$ cd cs16`

And then create and change into the lab02 directory:

`$ mkdir lab02`

`$ cd lab02`

Remember that at any time, you can check what directory you are currently in with the command <b>pwd</b>.

<h2>Step 2: Create and Edit Your C++ Files</h2>
This week, you will need to create <b>three files called coins.cpp, meeting.cpp, and sum.cpp</b>:
Each corresponds to one of the problems listed below, which make up this lab.

For a reminder on how to open and use a text editor to create and edit new source files, refer back to Lab #1.

This assignment consists of 3 problems, each of which is described below. The first two are worth 30 points each, and the last is worth 40 points. Each should be solved in its own file and all three must be submitted for full assignment credit. These exercises are inspied by ones from the textbook (in Ch. 2) - but they are NOT the same, so follow the instructions on THIS sheet carefully.

<h2>COINS.CPP</h2>
Write a program that allows the user to enter a number of quarters, dimes, and nickels and then outputs the monetary value of the coins in cents. For example, if the user enters 2 for the number of quarters, 3 for the number of dimes, and 1 for the number of nickels, then the program should output that the coins are worth 85 cents.

The program should print a string of text to the terminal before getting each piece of input from the user. A session should look <b><i>exactly</i></b> like the following example (including whitespace and formatting), with possibly different numbers for inputs and the output (so the following is just ONE example of how the program might run, but the FORMATTING has to be exactly the same in order for you to get full credit):

<img src="coins_img.PNG" alt="coins program example" />

Each string printed by the program should include a newline at the end, but no other trailing whitespace (i.e. extra space characters at the end of the line).

<h2>MEETING.CPP</h2>
Write a program that determines whether a meeting room is in violation of fire law regulations regarding the maximum room capacity. The program will read in the maximum room capacity and the number of people attending the meeting. If the number of people is less than or equal to the maximum room capacity, the program announces that it is legal to hold the meeting. If the number of people exceeds the maximum room capacity, the program announces that the meeting cannot be held as planned due to fire regulations and tells how many people must be excluded in order to meet the fire regulations.

Note: You should do the problem specified above, rather than the harder version shown in the textbook.

The program should print a string of text to the terminal before getting each piece of input from the user. A session should look exactly one of the the following two examples (including whitespace and formatting), with possibly different inputs and number in the output:

<img src="meetingNEW_img.PNG" alt="meeting program example" />

Each string printed by the program should include a newline at the end, but no other trailing whitespace.

<h2>SUM.CPP</h2>
Write a program that reads in <b>ten</b> whole numbers and that outputs the sum of all the numbers greater than zero, the sum of all the numbers less than zero (which will be a negative number or zero), and the sum of all the numbers, whether positive, negative, or zero. The user enters the ten numbers just once each and the user can enter them in any order. Your program should not ask the user to enter the positive numbers and the negative numbers separately.

The program should print a string of text to the terminal before getting each piece of input from the user. A session should look exactly like the following example (including whitespace and formatting), with possibly different inputs and numbers in the output:

<img src="sum_img.PNG" alt="sum program example" />

Each string printed by the program should include a newline at the end, but no other trailing whitespace.

<h2>Step 3: Compile the Code</h2>

To compile our codes, we will use the same g++ command as we described last week in Lab #1. The following three commands will compile the three source files (in the same order as listed above):

`$ g++ -std=c++11 -o coins coins.cpp`

`$ g++ -std=c++11 -o meeting meeting.cpp`

`$ g++ -std=c++11 -o sum sum.cpp`

(NOTE: the -std=c++11 option in these commands is optional to use (that is, not critical to define). All this does is force the compiler to use the latest version of C++).

If the compilation is successful, you won't see any output from the compiler. You can then use the following commands to run your programs:

`$ ./coins`

`$ ./meeting`

`$ ./sum`

<b>If you encounter an error, use the compiler hints and examine the line in question. If the compiler messsage is not sufficient to identify the error, you can search online to see when the error occurs in general.</b>

Remember to re-compile the relevant files after you make any changes to the C++ code.

<h2>Step 4: Submit</h2>

Once you are satisfied that your program is correct, it is time to submit it. Login at [https://submit.cs.ucsb.edu](https://submit.cs.ucsb.edu), then navigate to “CS16_f16” and click on “lab02”. Then click “Make Submission”, and make your submission the same way as last week. Remember to submit all three .cpp files.

Please remember that you must submit the program to obtain any credit for the assignment; just completing the program is not enough.

Once you submit, you should see a page detailing your submission. The system will automatically grade your program and will show you the results on this page after a 1 minute delay.

You can alternatively submit your code from the command line (terminal) on any CS machine, including the Phelps lab machines or the CSIL server. You can use this method when logged in remotely. To submit the the three source files to this assignment by running the command:

`$ ~submit/submit -p 552 coins.cpp meeting.cpp sum.cpp`

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
