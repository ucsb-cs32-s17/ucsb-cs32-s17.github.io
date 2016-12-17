---
layout: lab
num: lab04
ready: true
desc: "Functions"
assigned: 2016-10-17 08:00:00.00-7
due: 2016-10-24 12:00:00.00-7
---
<div markdown="1">

<h1>CS16: Programming Assignment 04</h1>
<h2>Introduction</h2>
The assignment for this week will utilize concepts of functions. 
This assignment is due on <b>MONDAY, October 24th at 8:00 am</b>.

<h2>Step 1: Getting Ready</h2>
Open a terminal window and log into the correct machine.
Change into your CS 16 directory, create a lab04 directory and change into it.
Remember that at any time, you can check what directory you are currently in with the command <b>pwd</b>.

<h2>Step 2: Create and Edit Your C++ Files</h2>
This week, you will need to create <b>2 files called inflation.cpp, and mortgage.cpp</b>:
Each corresponds to one of the problems listed below, which make up this lab.

This assignment consists of 2 problems, each of which is described below. Each one is worth 50 points each. Each should be solved in its own file and both must be submitted for full assignment credit. 

NOTE: Both these submissions will be checked by the automatic system on submit.cs AND by the instructor and TAs for further evaluation. Details below.

<h3>INFLATION.CPP</h3>
Write a program that gauges the rate of inflation over the past year. The program asks for the price of an item (such as a hot dog or a 1-carat diamond) both from one year ago and today. It estimates the inflation rate as the difference in price divided by the year-ago price. Your program should allow the user to repeat this calculation as often as the user wishes. Define a function to compute the rate of inflation. The inflation rate should be a value of type double giving the rate as a percent, for example 5.32 for 5.32 percent. The inflation rate must be displayed to exactly two digits after the decimal point.

Your program must use a function to compute the rate of inflation. A program which does not use a function will be awarded a score of zero, even if all tests pass. The presence of this function will be checked by the instructor and the TAs.

Additionally, the program must make good use of comments in the code, per the discussions we have been having in class. Again, the presence of comments (and thier good use) will be checked by the instructor and the TAs.

A session should look <b><i>exactly</i></b> like the following example (including whitespace and formatting - note that there is no whitespace at the end of each of these lines and each printed line has a newline at the end), with all manners of different numbers for inputs and the output:

<img src="inflation.png" width="700" alt="inflation program example" />


<h3>MORTGAGE.CPP</h3>
Write a program that calculates the <i>annual after-tax cost</i> of a new house for the first year of ownership. The user inputs the price of the house and the downpayment made on it. The program thus knows what the loan amount is: the difference between the house price and the downpayment. The program also knows at least three constants: the loan interest rate (6%), the loan reduction cost rate (3%), and your tax rate (35%).

Home loans are subjected to an interest rate - that is one cost to home-owners. Additionally, they are paying off their loan at a certain rate - that is another cost. Thus the total annual mortgage costs for home-ownership is defined. However, home-owners get a bit of a break on their total costs because they can deduct part of their interest payments when they pay their taxes. These tax savings amount to the interest payment amount multiplied by the tax rate.

So, the real annual cost to a home-owner - the annual after-tax cost - is computed as the total annual mortgage cost minus the tax savings.

As mentioned, the input should be the price of the house and the down payment. Inputs should be of type double. Your program should use at least two function definitions (other than main function) and should allow the user to repeat this calculation as often as the user wishes. A program which does not use at least 2 functions will be awarded a score of zero, even if all tests pass. The presence of these functions will be checked by the instructor and the TAs.

Additionally, the program must make good use of comments in the code, per the discussions we have been having in class. Again, the presence of comments (and thier good use) will be checked by the instructor and the TAs.

A session should look <b><i>exactly</i></b> like the following example (including whitespace and formatting - note that there is no whitespace at the end of each of these lines and each printed line has a newline at the end), with all manners of different numbers for inputs and the output:

<img src="mortgage.png" width="700" alt="mortgage program example" />

<h2>Step 3: Create a makefile and Compile the Codes with the make Command</h2>
In order to learn another way to manage our source codes and their compilations, we will first create a makefile and put in the usual g++ commands in it. Afterwards, whenever we want to compile our programs, the Linux command is a lot shorter. The use of makefiles will reveal itself to be very useful the more complex our programs and CS projects become.

Using your text editor, create a new file called makefile and enter the following into it:

<div markdown="1">
```
all: inflation mortgage

inflation: inflation.cpp
   g++ -std=c++11 -o inflation inflation.cpp

mortgage: mortgage.cpp
   g++ -std=c++11 -o mortgage mortgage.cpp
```
</div>

Then from the Linux prompt, you can do one of two things: either issue separate compile commands for each project, like so:

`$ make inflation`

`$ make mortgage`

Or, you can issue one command that will compile all the projects mentioned in the makefile, like so:

`$ make`

If the compilation is successful, you will not  see any output from the compiler. You can then use the following commands to run your programs:

`$ ./inflation`

`$ ./mortgage`

<b>If you encounter an error, use the compiler hints and examine the line in question. If the compiler messsage is not sufficient to identify the error, you can search online to see when the error occurs in general.</b>

Remember to re-compile the relevant files after you make any changes to the C++ code.

<h2>Step 4: Submit</h2>

Once you are satisfied that your programs are correct, it is time to submit them. Login at [https://submit.cs.ucsb.edu](https://submit.cs.ucsb.edu), then navigate to “CS16_f16” and click on “lab04”. Then click “Make Submission”, and make your submission the same way as last week. Remember to submit both .cpp files.

Please remember that you must submit the programs to obtain any credit for the assignment; just completing the programs is not enough.

Once you submit, you should see a page detailing your submission. The system will automatically grade your program and will show you the results on this page after a 1 minute delay.

You can alternatively submit your code from the command line (terminal) on any CS machine, including the Phelps lab machines or the CSIL server. You can use this method when logged in remotely. To submit the the three source files to this assignment by running the command:

`$ ~submit/submit -p 566 inflation.cpp mortgage.cpp`

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
