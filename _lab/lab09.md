---
layout: lab
num: lab09
ready: false
desc: "Advanced arrays and linked lists"
assigned: 2017-03-10 08:00:00.00-7
due: 2017-03-17 23:59:00.00-7
---

# Step by Step Instructions

## Step 1: Getting Started 

Pair programming is OPTIONAL for this lab.

Note:
'''If working in a pair:''' Choose who will be the first driver and who will start as navigator, and then remember to switch (at least once) during the lab. But you should probably know the long-term goal too: each partner should participate in both roles in approximately equal parts over the course of the quarter. We realize it is not possible to equally split time in every lab, but it's worth trying, and it is possible to make up for unequal splits in future labs. We trust you will try to meet this goal. Thanks!

Also: '''don't share passwords'''. Instead, '''use scp or email to share files with each other at the end of each work session.'''  

* For information on scp, see: [[Unix Commands: scp]]
* Share your work with each other at the end of EVERY work session* 
* That way, if your pair partner [http://discuss.fogcreek.com/joelonsoftware/default.asp?cmd=show&ixPost=149219 gets hit by a bus] you can continue working without him/her&mdash;you aren't 'out of luck'.




## Step 2: Obtaining the starter code




## Step 3: Reviewing the Files and what your tasks are 

Here is a list of your tasks for this lab:

=== Step 3a: Familiarize yourself with the big picture ===

Type "make tests" and you will see some tests pass, but some fail.

You are finished when all the tests pass.

There are only two files that you need to edit this week, and both are based on functions that you worked with in previous labs.

* <code>moreArrayFuncs.cpp</code> contains more functions that deal with arrays.  These are in addition to the arrayFuncs.cpp that you worked with before.

* <code>moreLinkedListFuncs.cpp</code> contains more functions that deal with linked lists.  These are in addition to the linkedListFuncs.cpp that you worked with before in lab08.

=== Step 3b: Work on the array functions first ===

Even if you only get these working, this will be an important step in terms of partial credit for this lab.  So concentrate on these first.

There are four files that run tests cases for the functions in moreArrayFuncs.cpp.  These are shown in the following table.  In each case, you should work on one file at a time.  For example, your first step is:

* type <code>make mafTest1</code> to compile and link mafTest1.cpp
* type <code>./mafTest1</code> to run the program that tests <code>indexOfMax</code> and <code>indexOfMin</code> from moreArrayFuncs.cpp
* edit the code in the file moreArrayFuncs.cpp so that <code>indexOfMax</code> and <code>indexOfMin</code> are correct.
* repeat the steps above until the tests in mafTest1.cpp pass.

Then do the same for the other lines in this table, i.e.. tests mafTest2.cpp through mafTest4.cpp

|file| command to compile|command to run| what it tests
|--- |---|---|---
| mafTest1.cpp| make mafTest1| ./mafTest1| <code>indexOfMax</code> and <code>indexOfMin</code> from moreArrayFuncs.cpp
| mafTest2.cpp| make mafTest2| ./mafTest2| <code>largestValue</code> and <code>smallestValue</code> from moreArrayFuncs.cpp
| mafTest3.cpp| make mafTest3| ./mafTest3| <code>sum</code>  from moreArrayFuncs.cpp
| mafTest4.cpp| make mafTest4| ./mafTest4| <code>copyElements</code>, <code>copyOddOnly</code> (*see tip box below), and <code>multiplyPairwise</code> from moreArrayFuncs.cpp


Then, submit your code to submit.cs and see if the tests for the array functions are at least passing on submit.cs.   The command for that is listed in step 4 of the lab.

When your array tests pass, you can move on to the linked list part.    Or, you can go ahead and move on, and wait to ask for help from a TA.

=== Step 3c: COPY A FILE FROM YOUR COMPLETED lab08 ===

The next step is crucial.  You need a function from your completed lab08 in order for your lab09 to work.

That function is in the file linkedListFuncs.cpp.  Note that in your lab09 directory, those functinons are only stubs, but THESE ARE THE SAME FUNCTIONS YOU WROTE IN lab08.

So, you need to use a Unix command to copy the file linkedListFuncs.cpp from your ~/cs16/lab08 directory to your ~/cs16/lab09 directory.

I am NOT going to tell you what that command is.  By now, you should know.  And if you don't, you should be able to look it up.  Also I may ask you about this on the final exam.

Once you've copied that over, you are ready for the next step.

=== Step 3d: Work on the linked list functions next ===

Working on the linked list functions below is one of the most important things you can do to prepare for the final exam.

There are five files that run tests cases for the functions in moreLinkedListFuncs.cpp. 

Proceed as you did for the four mafTest1.cpp through mafTest4.cpp files.


|file| command to compile|command to run| what it tests
|--- |---|---|---
| mllfTest1.cpp| make mllfTest1| ./mllfTest1|<code>pointerToMax</code> from moreLinkedListFuncs.cpp
| mllfTest2.cpp| make mllfTest2| ./mllfTest2| <code>pointerToMin</code> from moreLinkedListFuncs.cpp
| mllfTest3.cpp| make mllfTest3| ./mllfTest3| <code>largestValue</code>  from moreLinkedListFuncs.cpp
| mllfTest4.cpp| make mllfTest4| ./mllfTest4| <code>smallestValue</code>  from moreLinkedListFuncs.cpp
| mllfTest5.cpp| make mllfTest5| ./mllfTest5| <code>sum</code>  from moreLinkedListFuncs.cpp


## Step 4: Checking your work before submitting 

When you are finished, you should be able to type  <code>make clean</code> and then <code>make tests</code> and see the following output:


```
-bash-4.2$ make clean
/bin/rm -f mafTest1 mafTest2 mafTest3 mafTest4 addIntToEndOfListTest mllfTest1 mllfTest2 mllfTest3 mllfTest4 mllfTest5 *.o
-bash-4.2$ make tests
clang++ -Wall -Wno-uninitialized   -c -o mafTest1.o mafTest1.cpp
clang++ -Wall -Wno-uninitialized   -c -o linkedListFuncs.o linkedListFuncs.cpp
clang++ -Wall -Wno-uninitialized   -c -o moreArrayFuncs.o moreArrayFuncs.cpp
clang++ -Wall -Wno-uninitialized   -c -o moreLinkedListFuncs.o moreLinkedListFuncs.cpp
clang++ -Wall -Wno-uninitialized   -c -o tddFuncs.o tddFuncs.cpp
clang++ -Wall -Wno-uninitialized  mafTest1.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o mafTest1
clang++ -Wall -Wno-uninitialized   -c -o mafTest2.o mafTest2.cpp
clang++ -Wall -Wno-uninitialized  mafTest2.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o mafTest2
clang++ -Wall -Wno-uninitialized   -c -o mafTest3.o mafTest3.cpp
clang++ -Wall -Wno-uninitialized  mafTest3.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o mafTest3
clang++ -Wall -Wno-uninitialized   -c -o mafTest4.o mafTest4.cpp
clang++ -Wall -Wno-uninitialized  mafTest4.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o mafTest4
clang++ -Wall -Wno-uninitialized   -c -o addIntToEndOfListTest.o addIntToEndOfListTest.cpp
clang++ -Wall -Wno-uninitialized  addIntToEndOfListTest.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o addIntToEndOfListTest
clang++ -Wall -Wno-uninitialized   -c -o mllfTest1.o mllfTest1.cpp
clang++ -Wall -Wno-uninitialized  mllfTest1.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o mllfTest1
clang++ -Wall -Wno-uninitialized   -c -o mllfTest2.o mllfTest2.cpp
clang++ -Wall -Wno-uninitialized  mllfTest2.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o mllfTest2
clang++ -Wall -Wno-uninitialized   -c -o mllfTest3.o mllfTest3.cpp
clang++ -Wall -Wno-uninitialized  mllfTest3.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o mllfTest3
clang++ -Wall -Wno-uninitialized   -c -o mllfTest4.o mllfTest4.cpp
clang++ -Wall -Wno-uninitialized  mllfTest4.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o mllfTest4
clang++ -Wall -Wno-uninitialized   -c -o mllfTest5.o mllfTest5.cpp
clang++ -Wall -Wno-uninitialized  mllfTest5.o linkedListFuncs.o moreArrayFuncs.o moreLinkedListFuncs.o tddFuncs.o -o mllfTest5
./mafTest1
PASSED: arrayToString(fiveThrees,5)
PASSED: arrayToString(zeros,3)
PASSED: arrayToString(empty,0)
PASSED: arrayToString(primes,5)
PASSED: arrayToString(primes,10)
PASSED: arrayToString(meaning,1)
PASSED: arrayToString(mix1,10)
PASSED: arrayToString(mix2,10)
PASSED: arrayToString(descending,5)
PASSED: indexOfMax(fiveThrees,5)
PASSED: indexOfMax(zeros,3)
PASSED: indexOfMax(primes,1)
PASSED: indexOfMax(primes,5)
PASSED: indexOfMax(primes,10)
PASSED: indexOfMax(meaning,1)
PASSED: indexOfMax(mix1,10)
PASSED: indexOfMax(mix2,10)
PASSED: indexOfMax(mix1,3)
PASSED: indexOfMax(mix2,3)
PASSED: indexOfMax(mix2,1)
PASSED: indexOfMax(mix2,5)
PASSED: indexOfMin(fiveThrees,5)
PASSED: indexOfMin(zeros,3)
PASSED: indexOfMin(primes,5)
PASSED: indexOfMin(primes,10)
PASSED: indexOfMin(meaning,1)
PASSED: indexOfMin(mix1,10)
PASSED: indexOfMin(mix2,10)
PASSED: indexOfMin(mix1,3)
PASSED: indexOfMin(mix2,3)
PASSED: indexOfMin(descending,5)
PASSED: indexOfMin(descending,1)
./mafTest2
PASSED: largestValue(fiveThrees,5)
PASSED: largestValue(zeros,3)
PASSED: largestValue(primes,5)
PASSED: largestValue(primes,10)
PASSED: largestValue(meaning,1)
PASSED: largestValue(mix1,10)
PASSED: largestValue(mix2,10)
PASSED: largestValue(mix1,3)
PASSED: largestValue(mix2,3)
PASSED: largestValue(descending,5)
PASSED: largestValue(descending,1)
PASSED: smallestValue(fiveThrees,5)
PASSED: smallestValue(zeros,3)
PASSED: smallestValue(primes,5)
PASSED: smallestValue(primes,10)
PASSED: smallestValue(meaning,1)
PASSED: smallestValue(mix1,10)
PASSED: smallestValue(mix2,10)
PASSED: smallestValue(mix1,3)
PASSED: smallestValue(mix2,3)
PASSED: smallestValue(descending,5)
PASSED: smallestValue(descending,1)
./mafTest3
PASSED: arrayToString(fiveThrees,5)
PASSED: arrayToString(zeros,3)
PASSED: arrayToString(empty,0)
PASSED: arrayToString(primes,5)
PASSED: arrayToString(primes,10)
PASSED: arrayToString(meaning,1)
PASSED: arrayToString(mix1,10)
PASSED: arrayToString(mix2,10)
PASSED: arrayToString(descending,5)
PASSED: sum(fiveThrees,5)
PASSED: sum(zeros,3)
PASSED: sum(primes,5)
PASSED: sum(primes,10)
PASSED: sum(meaning,1)
PASSED: sum(mix1,10)
PASSED: sum(mix2,10)
PASSED: sum(mix1,3)
PASSED: sum(mix2,3)
PASSED: sum(descending,5)
PASSED: sum(descending,1)
./mafTest4
PASSED: arrayToString(fiveThrees,5)
PASSED: arrayToString(zeros,3)
PASSED: arrayToString(empty,0)
PASSED: arrayToString(primes,5)
PASSED: arrayToString(primes,10)
PASSED: arrayToString(meaning,1)
PASSED: arrayToString(mix1,10)
PASSED: arrayToString(mix2,10)
PASSED: arrayToString(descending,5)
PASSED: arrayToString(primes,10)
PASSED: arrayToString(mix1,10)
PASSED: arrayToString(mix1,10)
PASSED: arrayToString(mix2,10)
PASSED: arrayToString(mix1,10)
PASSED: arrayToString(mix2,10)
PASSED: arrayToString(descending,5)
PASSED: copyOddOnly(a,descending,5)
PASSED: arrayToString(descending,5)
PASSED: arrayToString(a,3)
PASSED: copyOddOnly(a,mix2,10)
PASSED: arrayToString(mix2,10)
PASSED: arrayToString(a,5)
PASSED: arrayToString(fiveThrees,5)
PASSED: arrayToString(zeros,3)
PASSED: arrayToString(primes,5)
PASSED: arrayToString(descending,5)
PASSED: arrayToString(fiveThrees,5)
PASSED: arrayToString(descending,5)
PASSED: arrayToString(a,5)
PASSED: arrayToString(primes,5)
PASSED: arrayToString(descending,5)
PASSED: arrayToString(a,4)
PASSED: arrayToString(primes,7)
PASSED: arrayToString(a,7)
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
./mllfTest1
PASSED: linkedListToString(list)
Testing pointerToMax
PASSED: p!=NULL
PASSED: p->data==61
PASSED: p->next==NULL
PASSED: p==list->tail
PASSED: list->head->data == 42
PASSED: list->tail->data == 25
PASSED: p!=NULL
PASSED: p->data==61
PASSED: p->next->data==25
PASSED: p->next==list->tail
PASSED: list after adding 25
PASSED: list->head->data == 42
PASSED: list->tail->data == 99
PASSED: list after adding 99
PASSED: p!=NULL
PASSED: p->data==99
PASSED: p->next==NULL
PASSED: p==list->tail
./mllfTest2
PASSED: linkedListToString(list)
Testing pointerToMin
PASSED: p!=NULL
PASSED: p->data==42
PASSED: p==list->head
PASSED: list->head->data == 42
PASSED: list->tail->data == 25
PASSED: p!=NULL
PASSED: p->data==25
PASSED: p->next==NULL
PASSED: p==list->tail
PASSED: list after adding 25
PASSED: list->head->data == 42
PASSED: list->tail->data == 99
PASSED: list after adding 99
PASSED: p!=NULL
PASSED: p->data==25
PASSED: p->next==list->tail
./mllfTest3
PASSED: linkedListToString(list)
Testing pointerToMax
PASSED: p!=NULL
PASSED: largestValue(list)
PASSED: p!=NULL
PASSED: largestValue(list)
PASSED: list after adding 25
PASSED: list after adding 99
PASSED: p!=NULL
PASSED: largestValue(list)
./mllfTest4
PASSED: linkedListToString(list)
Testing pointerToMin
PASSED: p!=NULL
PASSED: p->data==42
PASSED: p==list->head
PASSED: list->head->data == 42
PASSED: list->tail->data == 25
PASSED: p!=NULL
PASSED: p->data==25
PASSED: p->next==NULL
PASSED: p==list->tail
PASSED: list after adding 25
PASSED: list->head->data == 42
PASSED: list->tail->data == 99
PASSED: list after adding 99
PASSED: p!=NULL
PASSED: p->data==25
PASSED: p->next==list->tail
./mllfTest5
PASSED: sum(&emptyList)
PASSED: linkedListToString(list)
PASSED: sum(list)
PASSED: list after adding 25
PASSED: sum(list)
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
~bboe/bin/submit -p 245 *.cpp *.h
```

# Grading Rubric 

Some of the points will be awarded based on submit.cs automatic grading. Other points will be assigned after visual code inspection by TAs.

== Submit.cs system automatic points ==

<table border="1">
<tr><th>Test Group</th><th>Test Name</th><th>Value</th></tr>
<tr><td>mafTest1</td><td><p style="color:green;margin:0;padding:0;">mafTest1</p></td><td>(20 pts)</td></tr>
<tr><td>mafTest2</td><td><p style="color:green;margin:0;padding:0;">./mafTest2</p></td><td>(20 pts)</td></tr>
<tr><td>mafTest3</td><td><p style="color:green;margin:0;padding:0;">./mafTest3</p></td><td>(20 pts)</td></tr>
<tr><td>mafTest4</td><td><p style="color:green;margin:0;padding:0;">./mafTest4</p></td><td>(20 pts)</td></tr>
<tr><td>mllfTest1</td><td><p style="color:green;margin:0;padding:0;">./mllfTest1</p></td><td>(20 pts)</td></tr>
<tr><td>mllfTest2</td><td><p style="color:green;margin:0;padding:0;">./mllfTest2</p></td><td>(20 pts)</td></tr>
<tr><td>mllfTest3</td><td><p style="color:green;margin:0;padding:0;">./mllfTest3</p></td><td>(20 pts)</td></tr>
<tr><td>mllfTest4</td><td><p style="color:green;margin:0;padding:0;">./mllfTest4</p></td><td>(20 pts)</td></tr>
<tr><td>mllfTest5</td><td><p style="color:green;margin:0;padding:0;">./mllfTest5</p></td><td>(20 pts)</td></tr>
</table>

== Code inspection human-assigned points ==

* (30 pts) Submitting on time, per instructions
* (90 pts) Code style, including but not limited to:
1. Code can be easily understood by humans familiar with C++ (including both the author(s) of the code, and non-authors of the code.)
2. Code is neatly indented and formatted, following standard code indentation practices for C++ as illustrated in either the textbook, or example code given in lectures and labs
3. Variable names choices are reasonable
4. Code is reasonably "DRY" (as in "don't repeat yourself")&mdash;where appropriate, common code is factored out into functions
5. Code is not unnecessarily or unreasonably complex when a simpler solution is available



