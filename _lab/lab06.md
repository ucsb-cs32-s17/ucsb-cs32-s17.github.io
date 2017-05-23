---
layout: lab
num: lab06
ready: false
desc: "TBD"
assigned: 2017-05-17 15:30:00.00-7
due: 2017-05-22 23:59:00.00-7
code_url: https://www.cs.ucsb.edu/~aduncan/cs32/s17/labs/lab06
code_dir: ~aduncan/cs32/s17/labs/lab06
submit_cs_project_num: TBD
---

<div style='display:none'>
https://ucsb-cs32-s17.github.io/lab/lab06/
</div>
<div id="container">
<h1>CS 32, Spring 2016</h1>
<h2>Programming Assignment 2</h2>

<h3><u>Due</u>: Monday May 9, 11:59pm
<br><u>Worth</u>: 100 points</h3>

<p>PA2 must be done individually: no pair programming allowed for this assignment. </p>
<ol>
  <li>Enhance <font color="red"><b>table.h</b></font>, the definition of <code>class Table</code>
      that you did for <a href="../pa1/index.html">PA1</a>, by adding the "Big Three" member
      functions to it: a copy constructor, a destructor and an assignment operator.
      <ul type = "circle">
        <li>Download and use these slightly revised <a href="entry.h">entry.h</a> and
        <a href="entry.cpp">entry.cpp</a> files. They are changed only to allow counting the
        number of Entry objects that are created and destroyed, so that we may test the
        effectiveness of your destructor implementation.</li>
        <li>Both your copy constructor and assignment operator must take a constant reference
        to a Table object as the only parameter.</li>
        <li>Your assignment operator must return the calling object as a reference.</li>
        <li>Refer to the textbooks and your lecture notes to know how these functions and
        the destructor should be defined.</li>
      </ul>
  </li>
  <li>Update <font color="red"><b>table.cpp</b></font> to implement the new functions. You may use
      tools from any of the standard libraries except &lt;map&gt;, &lt;set&gt;, &lt;unordered_map&gt;
      and &lt;unordered_set&gt;.
      <ul type="circle">
        <li>Both the copy constructor and the assignment operator must make completely
        independent copies of the source Table. In other words, if Table x is a copy of Table y,
        then future changes to x will not affect y, and future changes to y will not affect x.</li>
        <li>The destructor must perform its usual role. See either textbook if you are not sure
        what that role is.</li>
        <li>If your get, remove or output functions did not pass the time tests for PA1, then
        you should improve them now. Doing so might require you to change your overall approach
        to the problem: if you are using linear probing with open addressing to implement the
        table, then consider using quadratic probing or double hashing instead, or even consider
        using a chaining approach instead of open addressing. Again you should
        review the textbook and your lecture notes to learn about these issues.</li>
      </ul>
  <li><em>Compile and test your program <u>at CSIL</u></em> (by connecting remotely is okay).
      Create your
      own testing program(s) to do so. After you think that all parts are working properly,
      you should verify that your implementation compiles and executes correctly with the
      demonstration program from PA1.</li>
  <li>You will turn in both table.h and table.cpp<!--, but the procedure for doing so is still being
            worked out. See this space for further instructions well before the due date-->.
      From our class page at <a href="https://submit.cs.ucsb.edu/">https://submit.cs.ucsb.edu/</a>,
      click the "Make Submission" button next to PA2, or use the following command from a CS terminal:
        <pre>~submit/submit -p 481 table.cpp table.h</pre>
        Be sure to wait for the results of all tests. If you score 100/100, and you've
        followed all of the other rules, then you'll earn full credit.
      </li>
</ol>
<hr>

<h6>Prepared by Michael Costanzo, 4/29/2016; updated with submit instructions 5/3/2016.</h6>

</div><!-- id = "container" -->
