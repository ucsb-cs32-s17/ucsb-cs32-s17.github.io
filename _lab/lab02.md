---
layout: lab
prev_num: lab01
num: lab02
ready: true
desc: "Selection Sort"
assigned: 2017-04-26 15:30:00.00-7
due: 2017-05-01 23:59:00.00-7
prev_code_url: https://www.cs.ucsb.edu/~aduncan/cs32/s17/labs/lab01
code_url: https://www.cs.ucsb.edu/~aduncan/cs32/s17/labs/lab02
code_dir: ~aduncan/cs32/s17/labs/lab02
submit_cs_project_num: TBD
---

<div style='display:none'>
https://ucsb-cs32-s17.github.io/lab/lab02/
</div>

# Goals 

By the time you have finished this lab, you should have demonstrated
your ability to code a selection sort on a an array of pointers to
objects in C++.  You will also get more practice with doing
test-driven development of object-oriented C++ code, this time with
two classes that interact with one another.

# Step by Step 

## Step 0: Getting Started

Decide if you are working solo, or in a pair.  Pair programming is
OPTIONAL for this lab.

<b>If working in a pair, register your pair on submit.cs.</b>

Create a <tt>~/cs32/{{page.num}}</tt> directory and make it your current directory. 

## Step 1: Copying some programs from my directory 

Visit the following web link—you may want to use "right click" (or "control-click" on Mac) to bring up a window where you can open this in a new window or tab:

<{{page.code_url}}>

You should see a listing of several C++ programs. We are going to copy those into your<tt>~/{{site.course | downcase}}/{{page.num}}</tt> directory all at once with the following command:

<div>
<tt>cp {{page.code_dir}}/* ~/{{site.course | downcase}}/{{{page.num}}}}</tt>
</div>

Note: If you get the error message:


<div>
<tt>cp: target '/cs/student/youruserid/{{site.course | downcase}}/{{page.num}}' is not a directory</tt>
</div>

then it probably means you didn't create a <tt>~/{{site.course | downcase}}/{{page.num}}</tt> directory yet. So do that first.

The `*` symbol in this command is a "wildcard"—it means that we want all of the files from the source directory copy be copied into the destination directory namely <tt>~/{{site.course | downcase}}/{{page.num}}</tt>.

After doing this command, if you `cd` into <tt>~/{{site.course | downcase}}/{{page.num}}</tt> and use the `ls` command, you should see several files in your <tt>~/{{site.course | downcase}}/{{page.num}}</tt> directory&mdash;the same ones that you see if you visit the link <{{page.code_url}}>


If so, you are ready to move on to the next step.

If you don't see those files, go back through the instructions and make sure you didn't miss a step. If you still have trouble, ask your TA for assistance.



## Step 2: Understanding the Starting Point Code

### Step 2a: Understanding the tddFuncs.cpp code

You may find it interesting to compare the versions of `tddFuncs.h` and `tddFuncs.cpp` from <tt>{{page.prev_num}}</tt> with the ones from this lab (<tt>{{page.num}}</tt>).

You do NOT need to make any changes to these files.  However, they serve the purpose of showing how we can use Template Functions in C++ and Template Specialization to create code that is more "DRY", i.e. follows the adage "Don't Repeat Yourself".

Here are links to the versions of these files from last week and this week:


| lab01 | lab02 |
|-------|-------|
| [tddFuncs.h]({{page.prev_code_url}}/tddFuncs.h) | [tddFuncs.h]({{page.code_url}}/tddFuncs.h) | 
| [tddFuncs.cpp]({{page.prev_code_url}}/tddFuncs.cpp) | [tddFuncs.cpp]({{page.code_url}}/tddFuncs.cpp) | 

Some things to notice:

* In the lab01 version of tddFuncs.cpp, there was duplicated code&mdash;identical versions of `assertEquals for both `int` and `std::string`.   In the lab02 version, this has been DRY'ed up and factored out into a template in the lab02 tddFuncs.h.
* In the lab02 version of tddFuncs.cpp, there are also two overloaded versions of the function `assertEquals` that are NOT using the template.  These versions of the function are needed because C-strings (i.e. `const char *` and ` const char * const` values)  cannot be compared with the `==` operator.     The version for two C-strings used `strcmp` instead, while the version for a C-string and an `std::string` simply converts the C-string to a C++ string and invokes the template version for `std::string`.

Again, you don't need to do anything with this for this lab, so if you want to gloss over this for now and come back to it later, that's fine.   You should look it over, though, before the next midterm exam.

A final note: the way we overloaded the functions here does work, and it has the advantage of being easy to understand and follow. However, it is probably NOT the "current best practice" way of handing this, and strictly speaking, is not "template specialization", it is rather just "garden variety overloading".     We'll go over the "better way", i.e. true template specialization, in a future lab or lecture.  For now, if you are curious, and want to "read ahead", consider the following StackOverflow link:

http://stackoverflow.com/questions/17344405/template-function-specialization-vs-overloading

(H/T to Hunter Laux for finding this.)

### Step 2b: Understanding the CXXFLAGS in the Makefile

In this week's Makefile, as with last weeks, we have the following.
<pre>
CXXFLAGS = -Wall -Wextra -Wno-unused-parameter -Wno-unused-private-field

# Change to this before final submission:
# CXXFLAGS = -Wall -Wextra -Werror
</pre>

See the explanation in lab01 of these two definitons for `CXXFLAGS`.  It will be important for you to modify these before submitting to make sure that your code will compile with those flags set.


### Step 2c: Understanding the Student and Roster classes

The Student.h and Student.cpp classes are mostly unchanged from lab01, except for the addition of a few new methods.   

Please look those over&mdash;these are mostly methods for reading in a Student from a comma-separated string, and are there so that we can read in students from a CSV file  (i.e. a file of comma separated values) into a Roster.

The Roster.h and Roster.cpp files, though, are new.


You'll see that the Roster.h file contains the specification of a  class that represents a collection of Students.   It represents this collection with a simple fixed size C++ array of pointers to Student objects.  THERE ARE CERTAINLY BETTER WAYS TO IMPLEMENT A COLLECTION OF STUDENTS.   And we WILL discuss those before the course is over.   The point here, though, is to understand sorting algorithms.

We will implement a selection sort on the array of pointers to Student objects.   Since we only have to swap the pointers in the array&mdash;we don't have to swap the entire Student object&mdash;our algorithm will run in the same amount of time no matter how large the actual Student objects may be.   In general, this is a good idea if/when one is working with large objects.

The files where you will be making changes this week are:
* Student.cpp, where you'll be updating the methods that you wrote in lab01.  Don't just copy over the entire file though, because if you do, you'll lose the new methods that we supplied you with in the starting point code.
* Roster.cpp, where you'll be replacing stubs with correct code.

### Step 2c: Understanding the tests: testStudent*.cpp and tddFuncs.* 

What you should do next is to look through the test cases in testStudent.cpp (which includes all the tests from the three test files in lab01) nd testRoster1.cpp, testRoster2.cpp and testRoster3.cpp

Look over these files and understand how they work.   Then, type `make tests` to compile and run all of the tests.

You can also type, for example, `make testRoster1` and `./testRoster1` to make and run these tests one at a time.

## Step 3:Make all the test cases pass

When you are ready, start editing Student.cpp, replacing the stubs for the constructor first, and then each of the stubs for the other functions.    Get all the tests in testStudent to pass first.

Then, read through testRoster1.cpp and see what methods in Roster.cpp you think you need to update in order to get those tests to pass.

Then proceed to do the same with testRoster2.cpp and testRoster3.cpp.


## Step 4: Checking your work before submitting

When you are finished, you should be able to type  `make clean` and then `make tests` and see that all the test cases pass.

At that point, you are ready to try submitting on the submit.cs system.

## Step 5: Submitting via submit.cs

The command to submit this weeks lab is this one:

Here is the command to submit this week's labs:

```
~submit/submit -p 375 Student.cpp Roster.cpp
```

# Grading Rubric 

Points will be awarded based on submit.cs automatic grading. 

## submit.cs automated

* submit.cs tests
 * (50 pts) testStudent
 * (50 pts) testRoster1
 * (50 pts) testRoster2
 * (50 pts) testRoster3

