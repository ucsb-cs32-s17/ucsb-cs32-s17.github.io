---
layout: lab
num: lab03
prev_num: lab02
ready: true
desc: "Debugging tools: gdb and valgrind"
assigned: 2017-05-03 15:30:00.00-7
due: 2017-05-08 23:59:00.00-7
code_url: https://www.cs.ucsb.edu/~aduncan/cs32/s17/labs/lab03
code_dir: ~aduncan/cs32/s17/labs/lab03
submit_cs_project_num: 726
tools_gdb_url: https://ucsb-cs32.github.io/topics/tools_gdb/
tools_valgrind_url: https://ucsb-cs32.github.io/topics/tools_valgrind/
---

<div style='display:none'>
https://ucsb-cs32-s17.github.io/lab/lab03/
</div>

# Two restrictions: individual (not pair), and ON CSIL (not on your own machine)

<code><b>THIS IS AN INDIVIDUAL LAB</b></code>. Pair programming is not permitted.   

Each individual must submit their own individual submission.

Note also, that with each submission, there is a file called <code>user</code> that must be submitted, and must contain your CSIL username.  That file is used as a "seed" that randomizes the answers.  So, if you are tempted to copy answers from another student, <em>please, please, please don't.</em>   

# Background

Thus far you've learned about object oriented design and test driven development. These techniques were designed to give structure to your code and your development process. This structure reduces the chance that a bug will sneak its way into your program. Even the most experienced programmer occasionally introduces bugs into his/her program. Given that a significant portion of your time will likely be spent debugging your code we want to optimize the debugging process and make you more productive.

# Step-by-Step 

There are two sections of this lab.  

In first section, Steps 1 and 2, you are guided through learning about gdb and valgrind.  There is nothing to turn in from these steps, so there may be a temptation to skip over them.  We encourage you, instead, to really take your time and work through those, to really learn about gdb and valgrind, because you'll need those skills for step 3.

Step 3 requires you to work with gdb and valgrind, compute some answers, and put those answers in text files.    

Those files will then be submitted to submit.cs for grading.   

## Step 1: gdb

The GNU debugger (a.k.a. gdb) is a very powerful tool for analyzing what your program is doing at run-time. 

First read through the tutorial [tools: gdb]({{ page.tools_gdb_url }}) at the course website (<https://ucsb-cs32.github.io>). <b>The rest of these instructions assume that you already read through that.</b>  So if you continue without first looking over that, you are likely to not know how to proceed.  If you then ask for help, we will first try to figure out: did you actually read through [[Tools: gdb]]?  If you did not, we'll tell you: ok, go read it.

Since you are already familiar with the code in [{{page.prev_num}}](/lab/{{page.prev_num}}/), you should use [{{page.prev_num}}](/lab/{{page.prev_num}}/) to practice using gdb. You will need to recompile [{{page.prev_num}}](/lab/{{page.prev_num}}/) with the `-g` option. Add `-g` to the `CXXFLAGS` in your `Makefile`. 

The order of flags on the `CXXFLAGS` line does not matter. You can add it to the end or the beginning.

```
CXXFLAGS = -g -std=c++11 -Wall -Wextra -Wno-unused-parameter -Wno-unused-private-field
```

Every time you change your `Makefile` you should always do a `make clean` first. Rebuild your tests.

Now start `gdb ./testStudent00` and set a breakpoint in `Student::setName`.  (If you have no idea how to do that, it's probably because you didn't read though the [tools: gdb]({{ page.tools_gdb_url }}) tutorial first.  Do that now.)

When you run the program (after setting the breakpoint, you type `run`), gdb will suspend the execution at the start of the setName method.   You can then use various gdb commands to examine the state of the program, including what's on the stack and what's on the heap.

Before moving on, you should experiment with each of the following gdb commands:

* `help`
* `break`
* `display`
* `print`
* `next`
* `step`
* `backtrace`
* `watch` 

There are examples for these commands on the [[tools: gdb]({{ page.tools_gdb_url }} page. Since you might not always know what you are looking for when debugging, experimentation is very important. It helps to know your code, but sometimes you may be debugging code that you didn't write.

Later steps in this lab will assume that you really did figure out how to use the commands above.  So, if you are just skipping over this step, or skimming it, eventually you'll make your way back here.  Just sayin'.

## Step 2: valgrind 

After you are comfortable using gdb and you have stepped through a few routines in your program now it's time to learn about valgrind.  We talked a bit about valgrind in lecture, but there's more to learn, so please now read about valgrind here at the [tools: valgrind]({{page.tools_valgrind_url}}) article on the <https://ucsb-cs32.github.io> website.

Run `memcheck` on your <tt>{{page.prev_num}}</tt> and ensure that you don't have any memory leaks or errors that were detected by valgrind. You should fix any errors that valgrind reports in <tt>{{page.prev_num}}</tt>.    (Note that if your program doesn't use `new` and/or `delete`, there probably won't be any.)

Run each test with --leak-check=full 
<pre>
valgrind --leak-check=full ./testStudent
valgrind --leak-check=full ./testRoster1
etc...
</pre>

## Step 3: Debugging someone else's code 

It's time to put your new skills to the test. You will be given an executable file, but not all the source code.

It is possible that you may have a program that calls a library and you won't be given all the source code to the library or the library was built without the -g option. Here we are reversing this a little bit. You are given some code, but the code to the main function is not given to you. You will not be able to step through all of the code. In a sense, you can treat main function like a 'black box', which calls the code you are given. You don't need to know what the main function is doing, but you will have to answer a few questions about how it calls the code you are given.

You MUST do the next section on a csil account because it checks the `$USER` environment variable. When the assignment is graded the user account will be checked, so it must match even if submit says all your test cases pass.

Download the 4 files from here:

* http://cs.ucsb.edu/~aduncan/cs32/s17/labs/lab03/

Or copy from here:

* /cs/faculty/aduncan/public_html/cs32/s17/labs/lab03/*

###  Guidelines for Answering 

To be sure that your answers pass the tests on submit.cs, be sure that you record them carefully.  The tests on submit.cs are very picky about filenames, formatting, etc.

* Do not add extra text to answers (e.g. reduce answers like <code>The answer is: x.</code> to only <code>x</code> )
* If question asks for you to write a string "my string", do not include the quotation marks (e.g. "my string" => my string )
* All questions should be placed in separate files matching the question name (e.g. your answer to <code>q1a</code> should be placed in a file called <code>q1a</code>; DO NOT create <code>q1a.txt</code>, etc )
* If a question asks you to enter a number 5,000 only include the numbers (e.g. <code>5,000</code> => <code>5000</code>) 

### HINT: Suggestion for Creating the Answer Files

Use the echo command and redirect the output to a file.  There is an example below.  Note that the quotations in the echo command are not included in the file named 'testfile'. The cat command is just printing the file to the terminal so you can see that the contents were in fact written.

```
-bash-4.2$ echo "100" > testFile
-bash-4.2$ cat testFile
100
```

The source code we've given you is poorly written code. Take your time and look through it, but note that these are examples of code that should be rewritten. However, that is not your job today. Instead, you will use debugging tools to understand why these programs are failing. 


First run the `segProgram`, which is designed to segfault. 

```
./segProgram 
Segmentation fault (core dumped)
```

`gdb` was designed to make handling segfaults trivial. Use `gdb` to pry into `segProgram` and discover the reason why it is crashing. When using `gdb`, make sure you run gdb from the same directory as a the program you are analyzing ( gdb relies on the current working directory as a path to find the source code). 


### Question 1 (q1a, q1b)

Start up `gdb` and load in `segProgram`.
```
gdb ./segProgram
```

Now run the program so it will stop as soon as it encounters the segfault. 

* <b>q1a: </b>What is the value is the program trying to store in the array when the fault occurred?  Write your answer in <code>q1a</code>. That's q-one-a, not q-L-a.
* <b>q1b: </b>What index of the array is the program trying to access? Write your answer in file <code>q1b</code>

### Question 2 (q2)

For the remainder of the questions use the debugProgram executable.

```
gdb ./debugProgram
```

<b>q2: </b> What is the value of the string 'a' when debugFunction1 is called?
<br>Remember to omit the quotation marks in your answer. Write your answer to a file named <code>q2</code>.
<br>Hint: use the <code>break</code> feature to stop the program 

### Question 3 (q3)

<b>q3: </b> What is the value of the string 'a' when debugFunction1 is called a second time?

<br>Remember to omit the quotation marks in your answer. Write your answer to a file named <code>q3</code>.

### Question 4 (q4a q4b)

* <b>q4a: </b> How many recursive calls to recursiveFunction are in the backtrace(also called a stack trace) when variable <code> a.debugInt == 100 </code> in debugFunction2? Put your answer in <code>q4a</code>.
* <b>q4b: </b> What is the value of the string a.debugStr?  Put your answer in <code>q4b</code>.

<b>Hints: </b>
* Use `backtrace` (abbreviated `bt`), along with conditional breakpoints:  <code>break</code> <em>someplace</em> <code>if </code> <em>condition</em>
* What is the number of stack frames when the last instance of recursiveFunction is created?  You may need to page through them.
* Then think about  how many of those stack frames are <em>actually</em> for the recursive function, as opposed to other functions that have been put on stack before or after.

### Question 5 (q5a q5b)

<b>Hint: </b> For this question, consider using the <code>watch</code> command.

* <b>q5a: </b> The main function assigns values to <code>watchdata[ ]</code>. What is <code>watchdata[25]</code>'s new value after being assigned a new value by <code>main</code>.   Put the new value of <code>watchdata[25]</code> (after it is modified by <code>main</code>) into the file <code>q5a</code>

* <b>q5b: </b> In addition, what is the value of the variable <code>watchsomevalue</code> at the instant that watchdata[25] is updated?   Please put the value of <code>watchsomevalue</code> at that moment into the file <code>q5b</code>.

### Question 6 (q6)

<b>q6:</b> The function <code>dataLost</code> is leaking memory. How much data is lost in the <code>dataLost</code> function?   Write your answer in a file called <code>q6</code>.

<b>Hints:</b> 

* Use `valgrind` with `--leak-check=full` and don't include data lost elsewhere.
* Valgrind formats its numerical output with commas. Don't include commas in the answer.
* Only submit the number. Don't use any units like Bytes.

### Saving your username to the file <code>user</code>

Save your username to a file.

```
echo $USER > user
```

Then use <code>cat user</code> to ensure that what prints at the command line is your CSIL username, e.g. if your username is <code>cgaucho</code>, you should see:

```
bash-4.2$ cat user
cgaucho
bash-4.2$
```

NOTE: If you submit file <code>user</code> with a user other than your own assigned CSIL username, you will receive zero points for the lab.

## Step 4: Submitting your results

Submit your files


<tt>~submit/submit -p  {{page.submit_cs_project_num}} q1a q1b q2 q3 q4a q4b q5a q5b q6 user</tt>


# Grading

* (300 pts) 20 points for first test, 35 for the remaining eight.

NOTE: If you submit file <code>user</code> with a user other than your own assigned CSIL username, you will receive zero points for the lab.
