---
layout: lab
num: lab08
ready: false
desc: "Linked lists and array lists"
assigned: 2017-03-03 08:00:00.00-7
due: 2017-03-10 23:59:59.00-7
---
<div markdown="1">


# Step by Step Instructions 

## Step 1: Getting Started 

Pair programming is OPTIONAL for this lab.

'''If working in a pair:''' Choose who will be the first driver and who will start as navigator, and then remember to switch (at least once) during the lab. But you should probably know the long-term goal too: each partner should participate in both roles in approximately equal parts over the course of the quarter. We realize it is not possible to equally split time in every lab, but it's worth trying, and it is possible to make up for unequal splits in future labs. We trust you will try to meet this goal. Thanks!

Also: '''don't share passwords'''. Instead, '''use scp or email to share files with each other at the end of each work session.'''  

* For information on scp, see: [[Unix Commands: scp]]
* Share your work with each other at the end of EVERY work session* 
* That way, if your pair partner [gets hit by a bus!](http://discuss.fogcreek.com/joelonsoftware/default.asp?cmd=show&ixPost=149219) you can continue working without him/her&mdash;you aren't 'out of luck'.


## Step 2: Obtaining the code

Add instructions on getting the starter code from github

## Step 3: Reviewing the Files and what your tasks are 

Here is a list of your tasks for this lab:

* Run "make tests"

1. You wil see that  and see the tests for arrayToString and linkedListToString pass. 
2. But notice that tests for addIntToEndOfListtest and addIntToStartOfListTest are failing.

Your job is to write the code for addIntToEndOfList and addIntToStartOfList.  Both are in linkedListFuncs.cpp

This is your only job.  And there are clues in the file to help you.

When the test cases pass, you are done.

* Run "make tests" and see the correct output.
* Try submitting to submit.cs to see if your output is correct.
* YOU ARE READY TO CHECK YOUR WORK.

## Step 4: Checking your work before submitting 

When you are finished, you should be able to type  <code>make clean</code> and then <code>make tests</code> and see the following output:

```
-bash-4.2$ make clean
/bin/rm -f arrayToStringTest arrayToLinkedListTest addIntToEndOfListTest addIntToStartOfListTest  *.o
-bash-4.2$ make tests
clang++ -Wall -Wno-uninitialized   -c -o arrayToStringTest.o arrayToStringTest.cpp
clang++ -Wall -Wno-uninitialized   -c -o linkedListFuncs.o linkedListFuncs.cpp
clang++ -Wall -Wno-uninitialized   -c -o tddFuncs.o tddFuncs.cpp
clang++ -Wall -Wno-uninitialized  arrayToStringTest.o linkedListFuncs.o tddFuncs.o -o arrayToStringTest
clang++ -Wall -Wno-uninitialized   -c -o arrayToLinkedListTest.o arrayToLinkedListTest.cpp
clang++ -Wall -Wno-uninitialized  arrayToLinkedListTest.o linkedListFuncs.o tddFuncs.o -o arrayToLinkedListTest
clang++ -Wall -Wno-uninitialized   -c -o addIntToEndOfListTest.o addIntToEndOfListTest.cpp
clang++ -Wall -Wno-uninitialized  addIntToEndOfListTest.o linkedListFuncs.o tddFuncs.o -o addIntToEndOfListTest
clang++ -Wall -Wno-uninitialized   -c -o addIntToStartOfListTest.o addIntToStartOfListTest.cpp
clang++ -Wall -Wno-uninitialized  addIntToStartOfListTest.o linkedListFuncs.o tddFuncs.o -o addIntToStartOfListTest
./arrayToStringTest
PASSED: arrayToString(fiveThrees,5)
PASSED: arrayToString(zeros,3)
PASSED: arrayToString(empty,0)
PASSED: arrayToString(primes,10)
PASSED: arrayToString(meaning,1)
PASSED: arrayToString(mix,10)
./arrayToLinkedListTest
PASSED: linkedListToString(list)
PASSED: linkedListToString(emptyList)
PASSED: linkedListToString(singletonList)
./addIntToEndOfListTest
PASSED: linkedListToString(list)
PASSED: list->head->data == 42
PASSED: list->tail->data == 25
PASSED: list after adding 25
PASSED: list->head->data == 42
PASSED: list->tail->data == 31
PASSED: list after adding 31
PASSED: list->head->data == NULL
PASSED: list->tail->data == NULL)
PASSED: linkedListToString(emptyList)
PASSED: 
PASSED: list->head->data == 7
PASSED: 
PASSED: list->tail->data == 7)
PASSED: list after adding 7
PASSED: list != NULL
PASSED: list->head == list->tail
PASSED: list after adding -6
PASSED: 
PASSED: list->head->data == 7
PASSED: 
PASSED: list->tail->data == -6)
./addIntToStartOfListTest
PASSED: linkedListToString(list)
PASSED: list after adding 25
PASSED: list after adding 31
PASSED: linkedListToString(emptyList)
PASSED: list after adding 7
PASSED: list after adding -6
-bash-4.2$ 
```

At that point, you are ready to try submitting on the submit.cs system.

=== An important word about academic honesty and the submit.cs system ===

We will test your code against other data files too&mdash;not just these.  So while you might be able to pass the tests on submit.cs now by just doing a hard-coded "cout" of the expected output, that will NOT receive credit.    

To be very clear, code like this will pass on submit.cs, BUT REPRESENTS A FORM OF ACADEMIC DISHONESTY since it is an attempt to just "game the system", i.e. to get the tests to pass without really solving the problem.

I would hope this would be obvious, but I have to say it so that there is no ambiguity: hard coding your output is a form of cheating, i.e. a form of "academic dishonesty".  Submitting a program of this kind would be subject not only to a reduced grade, but to possible disciplinary penalties.    If there is <em>any</em> doubt about this fact, please ask your TA and/or your instructor for clarification.

## Step 5: Submitting via submit.cs 

The command to submit this weeks lab is this one:

Here is the command to submit this week's labs:

```
~bboe/bin/submit -p  232 *.cpp *.h
```

= Grading Rubric =

Points from submit.cs automatic grading:



<table border="1">
  <tr><th>Test Group</th><th>Test Name</th><th>Value</th></tr>
<tr><td>addIntToEndOfListTest</td><td><p style="color:green;margin:0;padding:0;">addIntToEndOfListTest</p></td><td>(50 pts)</td></tr>
<tr><td>addIntToStartOfListTest</td><td><p style="color:green;margin:0;padding:0;">addIntToStartOfListTest</p></td><td>(50 pts)</td></tr>
<tr><td>arrayToLinkedListTest</td><td><p style="color:green;margin:0;padding:0;">arrayToLinkedListTest</p></td><td>(0 pts)</td></tr><tr><td>arrayToStringTest</td><td><p style="color:green;margin:0;padding:0;">arrayToStringTest</p></td><td>(0 pts)</td></tr></table>

## Other points:

* (30 pts) Submitting on time, per instructions
* (70 pts) Code style, including but not limited to:
1. Code can be easily understood by humans familiar with C++ (including both the author(s) of the code, and non-authors of the code.)
2. Code is neatly indented and formatted, following standard code indentation practices for C++ as illustrated in either the textbook, or example code given in lectures and labs
3. Variable names choices are reasonable
** Code is reasonably "DRY" (as in "don't repeat yourself")&mdash;where appropriate, common code is factored out into functions
** Code is not unnecessarily or unreasonably complex when a simpler solution is available

