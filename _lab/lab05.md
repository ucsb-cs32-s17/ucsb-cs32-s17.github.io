---
layout: lab
num: lab05
ready: false
desc: "Fun with shapes: Pointers"
assigned: 2017-02-10 23:59:00.00-8
due: 2017-02-17 23:59:00.00-8
---
<div markdown="1">

# Step by Step Instructions

## Step 1: Getting Started 

Pair programming is OPTIONAL for this lab.


Note:
'''If working in a pair:''' Choose who will be the first driver and who will start as navigator, and then remember to switch (at least once) during the lab. But you should probably know the long-term goal too: each partner should participate in both roles in approximately equal parts over the course of the quarter. We realize it is not possible to equally split time in every lab, but it's worth trying, and it is possible to make up for unequal splits in future labs. We trust you will try to meet this goal. Thanks!

Also: '''don't share passwords'''. Instead, '''use scp or email to share files with each other at the end of each work session.'''  

* For information on scp, see: [[Unix Commands: scp]]
* Share your work with each other at the end of EVERY work session* 
* That way, if your pair partner [http://discuss.fogcreek.com/joelonsoftware/default.asp?cmd=show&ixPost=149219 gets hit by a bus] you can continue working without him/her&mdash;you aren't 'out of luck'.



## Step 2: Obtain the starter code

TBD

## Step 3: Reviewing the Files and what your tasks are 

Here is a list of your tasks for this lab:

* Run ./distanceBetweenTest and see it fail
* Edit the distanceBetween function in shapeFuncs.cpp to replace with correct code
* Run ./distanceBetweenTest and see it pass


* Run ./pointsAppoxEqualTest and see it pass
* Look at the code and understand how it works; you'll need this understanding to get ./boxesApproxEqual to pass


* Run ./initPointTest and see it fail
* Edit the initPoint function in shapeFuncs.cpp to replace with correct code
* Run ./initPointTest and see it pass


* Run ./boxesApproxEqualTest and see it fail
* Edit the boxesApproxEqual function in shapeFuncs.cpp to replace with correct code.  As you do, consider adding an approxEqual function that takes two double values into utility.h and utility.cpp, as this will make your coding job easier, and keep you code "DRYer". (DRY==Don't Repeat Yourself.)   Also, consider reusing the pointsApproxEqual function in your boxesApproxEqual solution.  Remember that the <code>&amp;&amp;</code> operator is the symbol for "logical and" in C++.
* Run ./boxesApproxEqualTest and see it pass


* Run ./initBoxTest and see it fail
* Edit the initBox function in shapeFuncs.cpp to replace with correct code.    As you do, remember that you use -> to access members of a struct through a pointer, but simply . to access members of a struct directly.  You may need both in your answer.
* Run ./initBoxTest and see it pass


* Run ./areaOfBoxTest and see it fail
* Edit the areaOfBox function in shapeFuncs.cpp to replace with correct code.
* Run ./areaOfBoxTest and see it pass


* Run ./pointToStringTest and see it it pass
* Copy pointToStringTest.cpp to boxToStringTest.cpp and make tests for the boxToString function.  Look in shapeFuncs.cpp at the boxToString function stub for an example of the format you need for boxToString's return values.  Make tests for different precisions, just like pointToString has.
* Add code to the Makefile so that boxToString runs.  Just follow the model--adding code for boxToStringTest everywhere you see code for pointToStringTest
* Run make


* Run ./boxToStringTest and see the tests fail
* Fix the definition of boxToString in shapeFuncs.cpp
* See the test ./boxToStringTest pass

* YOU ARE READY TO CHECK YOUR WORK.

## Step 4: Checking your work before submitting 


When you are finished, you should be able to type  <code>make clean</code> and then <code>make tests</code> and see the following output:

```
-bash-4.2$ make clean
/bin/rm -f distanceBetweenTest initPointTest pointsApproxEqualTest boxesApproxEqualTest initBoxTest areaOfBoxTest pointToStringTest *.o
-bash-4.2$ make tests
g++ -Wall -Wno-uninitialized   -c -o distanceBetweenTest.o distanceBetweenTest.cpp
g++ -Wall -Wno-uninitialized   -c -o tddFuncs.o tddFuncs.cpp
g++ -Wall -Wno-uninitialized   -c -o utility.o utility.cpp
g++ -Wall -Wno-uninitialized   -c -o shapeFuncs.o shapeFuncs.cpp
g++ -Wall -Wno-uninitialized  distanceBetweenTest.o tddFuncs.o utility.o shapeFuncs.o -o distanceBetweenTest
g++ -Wall -Wno-uninitialized   -c -o initPointTest.o initPointTest.cpp
g++ -Wall -Wno-uninitialized  initPointTest.o tddFuncs.o utility.o shapeFuncs.o -o initPointTest
g++ -Wall -Wno-uninitialized   -c -o pointsApproxEqualTest.o pointsApproxEqualTest.cpp
g++ -Wall -Wno-uninitialized  pointsApproxEqualTest.o tddFuncs.o utility.o shapeFuncs.o -o pointsApproxEqualTest
g++ -Wall -Wno-uninitialized   -c -o boxesApproxEqualTest.o boxesApproxEqualTest.cpp
g++ -Wall -Wno-uninitialized  boxesApproxEqualTest.o tddFuncs.o utility.o shapeFuncs.o -o boxesApproxEqualTest
g++ -Wall -Wno-uninitialized   -c -o initBoxTest.o initBoxTest.cpp
g++ -Wall -Wno-uninitialized  initBoxTest.o tddFuncs.o utility.o shapeFuncs.o -o initBoxTest
g++ -Wall -Wno-uninitialized   -c -o areaOfBoxTest.o areaOfBoxTest.cpp
g++ -Wall -Wno-uninitialized  areaOfBoxTest.o tddFuncs.o utility.o shapeFuncs.o -o areaOfBoxTest
g++ -Wall -Wno-uninitialized   -c -o pointToStringTest.o pointToStringTest.cpp
g++ -Wall -Wno-uninitialized  pointToStringTest.o tddFuncs.o utility.o shapeFuncs.o -o pointToStringTest
./distanceBetweenTest
PASSED: distanceBetween(p1,p2)
PASSED: distanceBetween(p2,p1)
PASSED: distanceBetween(p3,p4)
PASSED: distanceBetween(p4,p5)
PASSED: distanceBetween(p5,p3)
./initPointTest
PASSED: pointsApproxEqual(p1,p1Expected)
PASSED: pointsApproxEqual(p2,p2Expected)
PASSED: pointsApproxEqual(p3,p3Expected)
PASSED: pointsApproxEqual(p4,p4Expected)
./pointsApproxEqualTest
PASSED: pointsApproxEqual(p1,p1)
PASSED: pointsApproxEqual(p1,p2)
PASSED: assertFalse(pointsApproxEqual(p2,p1)
./boxesApproxEqualTest
PASSED: boxesApproxEqual(b0,b0)
PASSED: boxesApproxEqual(b1,b0)
PASSED: boxesApproxEqual(b0,b1)
PASSED: boxesApproxEqual(b0,b2)
PASSED: boxesApproxEqual(b0,b3)
PASSED: boxesApproxEqual(b0,b4)
PASSED: boxesApproxEqual(b5,b6)
PASSED: boxesApproxEqual(b6,b5)
./initBoxTest
PASSED: boxesApproxEqual(b1,b1Expected)
PASSED: boxesApproxEqual(b2,b2Expected)
PASSED: boxesApproxEqual(b1,b2)
./areaOfBoxTest
PASSED: areaOfBox(r)
PASSED: areaOfBox(s)
PASSED: areaOfBox(t)
PASSED: areaOfBox(u)
./pointToStringTest
PASSED: pointToString(p1)
PASSED: pointToString(p2)
PASSED: pointToString(p2,1)
PASSED: pointToString(p2,4)
PASSED: pointToString(p2,5)
-bash-4.2$ 
```

Plus, some output at the end with the output of your boxToStringTest 


At that point, you are ready to try submitting on the submit.cs system.

== Step 5: Submitting via submit.cs ==

The command to submit this weeks lab is this one:

Here is the command to submit this week's labs:

```
~bboe/bin/submit -p 230 *.cpp *.h
```

= Grading Rubric =

Points from submit.cs automatic grading:

<table border="1">
<tr>
<th>Test Group</th><th>Test Name</th><th>Value</th></tr>
<tr><td>areaOfBoxTest</td><td><p style="color:green;margin:0;padding:0;">areaOfBoxTest</p></td><td>(30 pts)</td></tr>
<tr><td>boxToStringTest</td><td><p style="color:green;margin:0;padding:0;">boxToStringTest (requires you to add a new file, so more points)</p></td><td>(60 pts)</td></tr>
<tr><td>boxesApproxEqualTest</td><td><p style="color:green;margin:0;padding:0;">boxesApproxEqualTest</p></td><td>(30 pts)</td></tr><tr><td>distanceBetweenTest</td><td><p style="color:green;margin:0;padding:0;">expected output from distanceBetweenTest</p></td><td>(30 pts)</td></tr>
<tr><td>initBoxTest</td><td><p style="color:green;margin:0;padding:0;">initBoxTest</p></td><td>(30 pts)</td></tr>
<tr><td>initPointTest</td><td><p style="color:green;margin:0;padding:0;">initPointTest</p></td><td>(30 pts)</td></tr>
<tr><td>pointToStringTest</td><td><p style="color:green;margin:0;padding:0;">pointToStringTest (should pass in base code, so no points assigned)</p></td><td>(0 pts)</td></tr>
<tr><td>pointsApproxEqualTest</td><td><p style="color:green;margin:0;padding:0;">pointsApproxEqualTest output (should pass in base code, so no points)</p></td><td>(0 pts)</td></tr>
</table>

Other points:

* (30 pts) Submitting on time, per instructions
* (60 pts) Code style, including but not limited to:
** Code can be easily understood by humans familiar with C++ (including both the author(s) of the code, and non-authors of the code.)
** Code is neatly indented and formatted, following standard code indentation practices for C++ as illustrated in either the textbook, or example code given in lectures and labs
** Variable names choices are reasonable
** Code is reasonably "DRY" (as in "don't repeat yourself")&mdash;where appropriate, common code is factored out into functions
** Code is not unnecessarily or unreasonably complex when a simpler solution is available

