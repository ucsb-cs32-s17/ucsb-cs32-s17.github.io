---
layout: lab
num: lab06
ready: true
desc: "Hash Table part 2"
assigned: 2017-05-27 15:30:00.00-7
due: 2017-06-07 23:59:00.00-7
code_url: https://www.cs.ucsb.edu/~aduncan/cs32/s17/labs/lab06
code_dir: ~aduncan/public_html/cs32/s17/labs/lab06
submit_cs_project_num: 751
---

<div style='display:none'>
https://ucsb-cs32-s17.github.io/lab/lab06/
</div>
THIS IS AN INDIVIDUAL LAB. Pair programming is not permitted.

Each individual must submit their own individual submission.

## Step 0: What up?

This is a <em>continuation</em> of the previous lab. You will add the "Big Three" member functions (copy constructor, assigment operator, and destructor) to your <code>Table</code> class. You will need a slightly revised <code>Entry</code> class, which counts the number of <code>Entry</code> objects that are created and destroyed, so we can test your destructor.

## Step 1: Get the {{page.num}} starter code into your repository directory 

In this step, we are going to copy the {{page.num}} starter files from the instructors directory into your <tt>~/cs32/{{page.num}}</tt> directory.

The files are in the instructors directory at 

<tt>{{page.code_dir}}/*</tt> 

and also accessible via the URL

<tt>{{page.code_url}}</tt> 

You want to copy these files into your <tt>~/cs32/{{page.num}}</tt> directory.

## Step 2: Update your Table's header file

<ul>
<li>Add the <em>declarations</em> (not the definitions) to <code>table.h</code>.</li>

<li>Both your copy constructor and 
  assignment  operator must take a constant reference to a <code>Table</code> object as the only parameter.</li>
  
  <li>Your assignment operator must return the calling object as a reference.</li>
</ul>

## Step 3: Update your Tables implementation file

<ul>

  <li>Add the <em>definitions</em> (not the declarations) to  <code>table.cpp</code>. You may use
  tools from any of the standard libraries except &lt;map&gt;, &lt;set&gt;, &lt;unordered_map&gt;
  and &lt;unordered_set&gt;.</li>
    
   <li>Both the copy constructor and the assignment operator must make completely
   independent copies of the source <code>Table</code>. In other words, if <code>Table x</code> is 
   a copy of <code>Table y</code>,
   then future changes to <code>x</code> will not affect <code>y</code>, and vice-versa.</li>
    
   <li>Your destructor must release all memory allocated via the operator <code>new</code> or calls 
  to <code>malloc()</code>.</li>

    <li>If your get, remove or output functions did not pass the time tests for h05, then
    you should improve them now. Doing so might require you to change your overall approach
    to the problem: if you are using linear probing with open addressing to implement the
    table, then consider using quadratic probing or double hashing instead, or even consider
    using a chaining approach instead of open addressing.</li>
 </ul>

## Step 4: Testing

  Compile and test your program at CSIL (by connecting remotely is okay).
  Create your own testing program(s) to do so. After you think that all parts are working properly,
  you should verify that your implementation compiles and executes correctly with the
  demonstration program from the previous lab.
  
  
## Step 5: Submit your work

   You will turn in both <code>table.h</code> and <code>table.cpp</code>.

From our class page at <a href="https://submit.cs.ucsb.edu/">https://submit.cs.ucsb.edu/</a>,
click the "Make Submission" button next to h06, or use the following command from a CS terminal:
  <pre>~submit/submit -p {{page.submit_cs_project_num}} table.cpp table.h</pre>
  
Be sure to wait for the results of all tests. If you score 100/100, and you've
followed all of the other rules, then you'll earn full credit.
 
