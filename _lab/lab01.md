---
layout: lab
num: lab01
ready: false
desc: "Crunching numbers: Loops and functions, github command-line setup  "
assigned: 2017-01-13 8:00:00.00-8
due: 2017-01-20 23:59:00.00-8
---

<div markdown="1">

## Introduction
The assignment for this week will utilize concepts of control flow that we covered in class. You may utilize other concepts of programming as well, as you see fit. To complete the lab follow these steps:

1. [Getting the starter code](#step1){: data-ajax="false"}
2. [Create, edit, compile and run your C++ files](#step2){: data-ajax="false"}
3. [Submit your code](#step3){: data-ajax="false"}
4. [Check submission results](#step4){: data-ajax="false"}
5. [Git one-time configurations and basic work flow](#step5){: data-ajax="false"}


## Step 1: Getting the starter code <a name="step1"></a>
I hope I can safely assume that you have all gotten a CoE account.
Open a terminal window and log into the correct machine - refer to the instructions in Lab #0, if you forgot how to do that.

Start by changing into your CS 16 directory: 

`$ cd cs16`

And then create and change into the lab02 directory:

`$ mkdir lab01`

`$ cd lab01`

Remember that at any time, you can check what directory you are currently in with the command <b>pwd</b>.

In most labs, we provide you with some skeleton code. In this lab you can get the skeleton code by copying from a folder on the CSIL server. In later labs we will see how you can get the code from an existing git repo!

`cp /cs/faculty/dimirza/cs16-wi17/labs/lab01-starter-code/* ./`

Do a list file command (<b>ls</b>). You should see something like this:

```
$ ls

min2.cpp  min3v1.cpp  min3v2.cpp README.md
```
If you don't see these files, retrace your steps or seek assistance.

## Step 2: Create, edit, compile and run your C++ files <a name="step2"></a>
This week, you will need to create <b>three files named block.cpp, min4.cpp, and pi.cpp</b>:
Each corresponds to one of the problems listed below, which make up this lab.

For a reminder on how to open and use a text editor to create and edit new source files, refer back to Lab #0.

This assignment consists of 3 problems, each of which is described below. The first one is worth 20 points each, and the last two are worth 40 points each. Each should be solved in its own file and all three must be submitted for full assignment credit. These exercises are inspired by the ones from the textbook (in Ch. 2 and Ch. 3) - but they are NOT the same, so follow the instructions on THIS sheet carefully. 

For all the subproblems given in this assignment you must compile your code frequently (as you develop it), and test it extensively with as many inputs as you can think of. 

<hr>

### Print a block
In your `lab01` directory open a file called `block.cpp` using your favorite editor. In that file, write a program that takes an input from a user for the number of rows and number of columns and prints out a block of characters that is based on these 2 parameters. The program should keep asking the user for input, and printing out the result, until the user enters zero for each of the input parameters.

A session should look <b><i>exactly</i></b> like the following example (including whitespace and formatting - note that there is no whitespace at the end of each of these lines), for all the different inputs and the output:

<img src="block.png" width="700" alt="block program example" />

Each string printed by the program should include a newline at the end, but no other trailing whitespace (i.e. extra space characters at the end of the line).

To compile your code use the g++ command as in the previous lab.

`$ g++ -std=c++11 -o block block.cpp`

*NOTE: the -std=c++11 option in these commands is optional to use (that is, not critical to define). All this does is force the compiler to use the latest version of C++.*

<b>If you encounter an error, use the compiler hints and examine the line in question. If the compiler messsage is not sufficient to identify the error, you can search online to see when the error occurs in general.</b>

Remember to re-compile the relevant files after you make any changes to the C++ code.


Run your executable as follows to test it out.
`$ ./block`

<hr>

### Calculate the minimum of 4 numbers

In this part of the lab you will write a program that compares 4 input numbers and prints out the smallest one. You should base the program on the example programs provided to you that compare fewer inputs. Start by examining the given examples, also described below:

<b>min2.cpp</b>

This program takes two command line arguments, and converts them to integers.  It then calls a function, smallest_of_two, that returns the smallest of the two numbers (or the value they share in case of a tie.) It then prints out the result of that function call.

<b>min3v1.cpp</b>

This is the first of two versions of a program that takes min2.cpp one step further, finding the smallest value from among three numbers. Again, if there is a tie, it prints the tie value. Look at the nested if/else statements and see if you can make sense of the logic. Seek help if you don't.

<b>min3v2.cpp</b>

This program does EXACTLY the same thing as min3v1.cpp, but does it with much cleaner, simpler code. Notice how we REUSE the smallest_of_two function to build up a smallest_of_three function. 

Your job in this step is to test min2, min3v1 and min3v2 with many different values and convince yourself that they work properly.

In the next step, you will be taking these programs to the next logical step in this sequence.

<b><i>Your main task</i></b>: Write min4.cpp
Write a program that works just like min2 and min3v1 and min3v2, except it takes four ints on the command line, and prints the smallest value, handling ties appropriately.

I encourage you to follow the model of min3v2.cpp if you can understand how this works, since your code will be far cleaner than trying to build this out of nested if/else statements.

If you DO use nested if/else statements, though, be sure that you indent and format your code appropriately.

Follow the pattern in min2 and min3v1/min3v2 in terrms of all other issues and how they are handled, including the usage message, etc. Your program should look exactly like these except that it works on 4 inputs (note, there are no trailing whitespacse):

<img src="min4.png" width="500" alt="min4 program example" />

To compile your code use the g++ command as in the previous lab.

`$ g++ -std=c++11 -o min4 min4.cpp`

Run your executable with different inputs to test it out.

<hr>

### Calculate the approximate value of PI

Write a C++ program that approximates the value of the constant π, based on the Leibniz formula for π. The formula is given below:

```
 1 – 1/3 + 1/5 – 1/7 + 1/9 ...  = pi/4
```

Put another way, the formula can be written as:

```
pi = 4 · [ 1 – 1/3 + 1/5 – 1/7 + 1/9 ... + (–1 ^ n)/(2n + 1) ]
```

The Leibniz formula works well for high values of n.

The program takes an input from the user for the value of n, which determines the number of terms in the approximation of the value of pi. The program then outputs that calculation. You must also include a loop that allows the user to repeat this calculation for new values of `n` until the user says she or he wants to end the program by issuing an input of 0.

The program should print a string of text to the terminal before getting each piece of input from the user. A session should look like the following example (including whitespace and formatting), showing the expected output for different inputs:

<img src="pi.png" width="700" alt="pi program example" />

Note that each string printed by the program should include a newline at the end, but no other trailing whitespace (whitespace at the end of the line).

In addition, all approximated floating pointer numbers must be displayed to exactly three  digits after the decimal point. 

[//]:<>(Need to specify what the expected behavior is if the user inputs a negative number)


<hr>


## Step 3: Submit your code<a name="step3"></a>

Once you are satisfied that your programs are correct, it is time to submit them. Login at [https://submit.cs.ucsb.edu](https://submit.cs.ucsb.edu), then navigate to “CS16_w17” and click on “lab01”. Then click “Make Submission”, and make your submission the same way as last week. Remember to submit all three .cpp files.

Please remember that you must submit the programs to obtain any credit for the assignment; just completing the programs is not enough.

Once you submit, you should see a page detailing your submission. The system will automatically grade your program and will show you the results on this page after a 1 minute delay.

You can alternatively submit your code from the command line (terminal) on any CS machine, including the Phelps lab machines or the CSIL server. You can use this method when logged in remotely. To submit the the three source files to this assignment by running the command:

`$ ~submit/submit -p 561 block.cpp min4.cpp pi.cpp`

You can copy the URL shown in the output of the above and paste into a web browser to reach the submission result page. Once your submission receives a score of 100/100, you are done with most of this assignment. The next part continues our exploration of git.


## Step 4: Check Submission Results<a name="step4"></a>

After the 1 minute delay, the submit system will show your score and give you feedback on your submission. Refresh the webpage after a minute to see this information.

You may submit this lab multiple times. You should submit only after local compilation does not produce any errors and runs as expected. The score of the last submission uploaded before the deadline will be used as your assignment grade.


## Step 5: Git one-time configurations and basic work flow <a name="step5"></a>
In the last assignment we used github's web interface to store our code. However, programmer's typically use github's command line tools for version control. In the next assignment you will start using the git command line tools. In preparation for the next assignment, we ask that you complete the one-time configuration to use git's command-line tools.
Log into your CoE account and navigate to your cs16 directory. Then do the following steps:

* Step 1: Generate a private/public key pair and upload your public key to github. To do this refer to this tutorial: [https://ucsb-cs56-pconrad.github.io/topics/github_ssh_keys/](https://ucsb-cs56-pconrad.github.io/topics/github_ssh_keys/)

* Step 2: Set up your global user.name and user.email values. To do this type in the following commands, but change the name Alex Triton to your own real world first and last name. If you prefer, for privacy reasons, you may use your first name and last initial. Also, change the email address atriton@cs.ucsb.edu to your own @ucsb.edu email address.

```
git config --global user.name "Alex Triton"
git config --global user.email "atriton@cs.ucsb.edu"
```

* Soon we will try out the basic git work flow that makes use of command-line tools and is common to all git projects. This will also help you verify that you have completed the one time setup configurations successfully. Before we begin read this article on [cloning your first repo](https://ucsb-cs56-pconrad.github.io/topics/git_cloning_your_first_repo/) and another article on [git basic workflow](https://ucsb-cs56-pconrad.github.io/topics/git_basic_workflow/)

* Make sure you are in the cs16 directory. At the command prompt try cloning the repo that you created in lab00 using the ssh address of your repo. In our lab00 example this the ssh address was: `git@github.com:ucsb-cs16-wi17/lab00-johns-lilya.git`. The address for your repo should be something similar. The ssh address can be obtained by clicking on the green "Clone or download" button when you view your repo on github. In our example, cloning the repo will create a directory called `lab00-johns-lilya` that contains all our lab00 code. `cd` into that directory. Then make a few minor changes to your hello.cpp program: (1) Add a comment to hello.cpp that says "This program has been modified using git command-line tools". (2) Change the message printed by your hello program to whatever you like. Compile hello.cpp again and run it to make sure there are no errors. Then follow the instructions from the "git basic work flow" article to push your local changes to github. Be sure to use the *git add*, *git commit* and *git push* commands in that sequence as described by the article. Once you are done pushing your code, open a web browser and navigate to your lab00 repo. You should see your latest changes reflected on github! If you are confused at any point, seek out the instructional staff. 


## Step 6: Done!<a name="step6"></a>

You are now done with this assignment!
If you are in the Phelps lab or in CSIL, make sure to log out of the machine before you leave. Also, make sure to close all open programs before you log out. Some programs will not work next time if they are not closed. Remember to save all your open files before you close your text editor.

If you are logged in remotely, you can log out using the exit command:

`$ exit`

</div>
