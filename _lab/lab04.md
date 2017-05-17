---
layout: lab
num: lab04
ready: true
desc: "C++ Big-Three Review"
assigned: 2017-05-17 15:30:00.00-7
due: 2017-05-23 23:59:00.00-7
code_url: https://www.cs.ucsb.edu/~aduncan/cs32/s17/labs/lab04
code_dir: ~aduncan/public_html/cs32/s17/labs/lab04
submit_cs_project_num: 739
example_repo: lab04_cgaucho_dslough
---

<div style='display:none'>
https://ucsb-cs32-s17.github.io/lab/lab04/
</div>

# Goals

By the end of this lab, given a description of a class containing data members that point to structures on the heap, you will be able to:

* write a correct copy constructor for the class
* write a correct destructor for the class
* write a correct assignment operator for the class


# Step-by-Step


## Step 1: Get the {{page.num}} starter code into your repository directory 



In this step, we are going to copy the {{page.num}} starter files from the instructors directory into your <tt>~/cs32/{{page.num}}</tt> directory.

The files are in the instructors directory at 

<tt>{{page.code_dir}}/*</tt> 

The `*` here stands in as a "wildcard" that matches "all files".

You want to copy these files into your <tt>~/cs32/{{page.num}}</tt> directory.

By now you should know (or remember) how to copy files; if you need a refresher, see earlier labs.

## Step 2: Getting the test cases to pass for {{page.num}}!

Now, we are ready to to work on {{page.num}}.

In this week's lab, you have the following files:

* `Makefile`
* `student.h`, `student.cpp`
* `studentRoll.h`, `studentRoll.cpp`
* `studentTest00.cpp`, etc.
* `studentRollTest00.cpp`, etc.

Your job is, as usual, get all the test cases to pass.  This involves implementing the "big three": Copy Constructor, Overloaded Assignment Operator, and Destructor.

In addition to the regular test cases, there are also "leakTests".  
This involves running a utility called <code>valgrind</code> on your code to see whether there are any memory leaks, 
or other problems involving memory management.    You will only pass the tests if your code has proper memory management.

You will submit only the `student.cpp` and `studentRoll.cpp` files.  
As a result, there are two quite annoying things that you'll just have to put up with:

* In the `Student` class, the <code>name</code> attribute is implemented with a C-string that is 
   allocated with dynamic memory on the heap.  This is annoying.  Your might prefer to use the std::string class.  
   Of course you would.  But, that's not the point of this assignment.  
   The point of this assignment is to know whether you can manage memory properly.

* In the `StudentRoll` class, the list of students is a linked list of structs rather 
   than an <code>std::list&lt;Student&gt;</code> or <code>std::vector&lt;Student&gt;</code> or something.   
   This is indeed annoying.  Tough.   We are training you for the situation where you don't have any choice, 
   but have to work with the data structures you are given.

In certain later assignments, you will be given the freedom to choose whatever data structure or implementation is appropriate.  You'll be able to decide whether to use `std::string`, or C-strings, whether to use array or `std::vector`, etc. <em>This is not one of those assignments.</em>

### Suggested way to proceed 

I suggest proceeding in the following steps:

* (0) Look at the tests in `testStudent00.cpp`. You may want to get the simple tests to pass first, including the test for `toString()`. Run `make testStudent00` to compile this file, and then run `./testStudent00` to run the tests. Iterate until the tests for testStudent00 pass.
* (1) Repeat for `testStudent01.cpp`, etc.
   * To get these to pass, you need to implement, possibly among other things, the Copy Constructor and Overloaded Assignment Operator for `Student`
* (2) Then, try to get the leak tests to pass as they pertain to `Student`, i.e. 
   * <code>make lts00</code>
   * <code>make lts01</code>
   * <code>make lts02</code>
   * <code>make lts03</code>
   * This will require implementing the destructor for `Student`
* (3) Work on each test file for `StudentRoll`, getting those tests to pass, i.e. `testStudentRoll00.cpp`, `testStudentRoll01.cpp`, etc.
   * To get these to pass, you need to implement, possibly among other things, the Copy Constructor and Overloaded Assignment Operator for `StudentRoll`
* (4) Then, try to get the leak tests for StudentRoll to pass, i.e.
   * <code>make ltsr00</code>
   * <code>make ltsr01</code>
   * <code>make ltsr02</code>
   * This will require implementing the destructor for `StudentRoll`

### How do I know if I'm done? 

When you are done, you should be able to do both of the following, and see no error messages:

```
make tests
make leaktests
```

# Step 3: Submission

To submit, use:


<tt>~submit/submit -p {{page.submit_cs_project_num}} student.cpp studentRoll.cpp</tt>


# Grading 

* (300 pts) Test cases on submit.cs, as indicated on that system.

