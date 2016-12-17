---
layout: lab
num: lab06
ready: true
desc: "Using File I/O Data Streams & String Manipulation"
assigned: 2016-10-31 08:00:00.00-7
due: 2016-11-04 12:00:00.00-7
---
<div markdown="1">

<h1>CS16: Programming Assignment 06</h1>
<h2>Introduction -- Important: Read this!</h2>
The assignment for this week will utilize concepts of file I/O data streams and string manipulation. Some of the concepts needed to finish this lab, such as the various string member functions and others items, will be discussed further in the Tuesday, Nov. 1st lecture in class. Additionally, this lab is a little more challenging than previous labs and you are required to use functions and, by necessity, you will have to test these functions as per the lectures we have had on the topic in class. Again, the TAs and I will be looking for (and grading) programming stylizations, such as proper use of comments, tab indentation, good variable names, and overall block and function designs. So, it's not enough for your lab to pass submit.cs! Please read the instructions herein <b>carefully</b>. This assignment is due on <b>Friday, November 4th at noon (12:00 pm)</b>

<h2>Step 1: Getting Ready</h2>
Open a terminal window and log into the correct machine.
Change into your CS 16 directory, create a lab06 directory and change into it.
Remember that at any time, you can check what directory you are currently in with the command <b>pwd</b>.

<h2>Step 2: Create and Edit Your C++ Files</h2>
This week, you will need to create <b>3 files called stddev.cpp, operators.cpp, and binconverter.cpp</b>:
Each corresponds to one of the problems listed below, which make up this lab.

This assignment consists of 3 problems, each of which is described below. The problem stddev.cpp is worth 20 points, binconverter.cpp and operators.cpp are worth 40 points each. Each should be solved in its own file and each must be submitted for full assignment credit. 

Note: All these submissions will be checked by the automatic system on submit.cs AND by the instructor and TAs for further evaluation. Details below.

---

<h3>STDDEV.CPP</h3>
This program takes its inputs from a file that contains numbers. The program reads them in as type double. The program outputs to the screen the <i>standard deviation</i> of the numbers in the file. The file contains nothing but numbers of type double separated by blanks and/or line breaks. The standard deviation of a list of numbers x1, x2, x3, and so forth is defined as the <b><i>square root</i></b> of:

((x1 – a)<sup>2</sup> + (x2 – a)<sup>2</sup> + (x3 – a)<sup>2</sup> + ...) / (n - 1)

Where the number a is the average of the numbers x1, x2, x3, and so forth and the number n is the count of how many numbers there are.

Your program should take file name as input from the user. The answers should be given with 3 decimal points. Additionally, your program should define <b>at least one function</b>. If your program does NOT have at least one function, you will not get credit for this part of the assignment, even if your program passes submit.cs grading.

A session should look <b><i>exactly</i></b> like the following example (including whitespace and formatting - note that there is no whitespace at the end of each of these lines and each printed line has a newline at the end), with all manners of different numbers for inputs and the output:

```
Enter filename:
nums.txt
The standard deviation is 1.581
```
The accompanying input file in this example, could look like this (note the separation by one or more spaces):

```
6 7 8    9			10
```

or like this (note the separation by either spaces or newline characters):

```
6 7
8
9
10
```

---

<h3>OPERATORS.CPP</h3>
Write a program will correct a C++ program that has errors in which operator, << or >>, it uses with cin and cout. The program replaces each (incorrect) occurrence of:

`cin <<`

with the corrected version

`cin >>`

and each (incorrect) occurrence of

`cout >>`

with the corrected version

`cout <<`

Allow for the possibility that there may be any number of whitespace characters (one or more) between cin and << and between cout and >>. The replacement corrected version has only one blank between the cin or cout and the following operator. You should not correct other whitespace characters in the input file (such as those at the start of a line).

Your program should get the source filename as an input from the user. The corrected version should be output to a file called "corrected.txt" (it cannot be called anything else) and the output should also be displayed on the terminal. That is, the output of your program should be exactly same as the contents of the file "corrected.txt". 

Your program should define <b>at least one function</b> that is called and that manipulates the read line from the input file. If your program does NOT have at least this function, you will not get credit for this part of the assignment, even if your program passes submit.cs grading.

You will need to use multiple <string> member functions to manipulate strings in this program. In addition, you will have to use the getline() function in the <string> library in order to read an entire line by ifstream. 

A session should look like the following example (including whitespace and formatting):

<div markdown="1">
```
Enter filename:
original.txt
#include <iostream>

using namespace std;

int main(){
      cout << "Hello!";
        return 0;
}
```
</div>

The file "corrected.txt" consists of the above output (except first two lines).

---

<h3>BINCONVERTER.CPP</h3>
Write a program that reads in an input file with one or more binary numbers separated by spaces or newline characters and outputs a conversion to decimal, hexadecimal, and octal numbers.

Your program should take file name as input from the user. The binary numbers must be read in as strings. It is up to you to choose the variable types needed otherwise. Additionally, your program should define <b>at least one function</b> (likely, you'll end up with at least 3). If your program does NOT have at least one function, you will not get credit for this part of the assignment, even if your program passes submit.cs grading.

You have to utilize the following devices in your program (required):

```
string.length()     returns the length of a string, i
                    so if string = "code", string.length() = 4.
string[n]           returns the nth character in the string (indexing starts at 0), 
                    so string[0] = "c", string[1] = "o", etc...
int(char c)         converts a character into its ASCII code,
                    so if c = 'a', then int(c) = 97,
                    and if c = 'c', the int(c) = 99, etc...
to_string(int i)    converts an integer into a string. Function found in <string> library.
                    Example, if i = 73, then to_string(i) = "73"
```

For example, given a file called `bin.txt`, which contains the following:

<div markdown="1">
```
11011
1111
10111111
10
```
</div>

A session should then look like the following example, including whitespace (no whitespaces at the end of the lines) and formatting:

<div markdown="1">
```
Enter filename:
bin.txt
The binary number 11011 equals 27 in decimal, 1B in hexadecimal, and 33 in octal
The binary number 1111 equals 15 in decimal, F in hexadecimal, and 17 in octal
The binary number 10111111 equals 191 in decimal, BF in hexadecimal, and 277 in octal
The binary number 10 equals 2 in decimal, 2 in hexadecimal, and 2 in octal
```
</div>

<h2>Step 3: Create a makefile and Compile the Codes with the make Command</h2>
In order to learn another way to manage our source codes and their compilations, we will first create a makefile and put in the usual g++ commands in it. Afterwards, whenever we want to compile our programs, the Linux command is a lot shorter. The use of makefiles will reveal itself to be very useful the more complex our programs and CS projects become.

Using your text editor, create a new file called makefile and enter the following into it:

<div markdown="1">
```
all: stddev operators binconverter

stddev:
	g++ -std=c++11 stddev.cpp -o stddev

operators:
	g++ -std=c++11 operators.cpp -o operators

binconverter:
	g++ -std=c++11 binconverter.cpp -o binconverter

```
</div>

Then from the Linux prompt, you can do one of two things: either issue separate compile commands for each project, like so:

`$ make stddev`

Or, you can issue one command that will compile all the projects mentioned in the makefile, like so:

`$ make`

If the compilation is successful, you will not see any output from the compiler. You can then run your programs, for example:

`$ ./stddev`

<b>If you encounter an error, use the compiler hints and examine the line in question. If the compiler messsage is not sufficient to identify the error, you can search online to see when the error occurs in general.</b>

Remember to re-compile the relevant files after you make any changes to the C++ code.

<h2>Step 4: Submit</h2>

Once you are satisfied that your programs are correct, it is time to submit them. Login at [https://submit.cs.ucsb.edu](https://submit.cs.ucsb.edu), then navigate to “CS16_f16” and click on “lab05”. Then click “Make Submission”, and make your submission the same way as last week. Remember to submit all 3 of the .cpp files.

Please remember that you must submit the programs to obtain any credit for the assignment; just completing the programs is not enough.

Once you submit, you should see a page detailing your submission. The system will automatically grade your program and will show you the results on this page after a 1 minute delay.

You can alternatively submit your code from the command line (terminal) on any CS machine, including the Phelps lab machines or the CSIL server. You can use this method when logged in remotely. To submit the the three source files to this assignment by running the command:

`$ ~submit/submit -p 593 stddev.cpp operators.cpp binconverter.cpp`

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
