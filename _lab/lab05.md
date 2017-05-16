---
layout: lab
num: lab05
ready: false
desc: "TBD"
assigned: 2017-05-17 15:30:00.00-7
due: 2017-05-22 23:59:00.00-7
code_url: https://www.cs.ucsb.edu/~aduncan/cs32/s17/labs/lab05
code_dir: ~aduncan/cs32/s17/labs/lab05
submit_cs_project_num: TBD
---

<div style='display:none'>
https://ucsb-cs32-s17.github.io/lab/lab05/
</div>



<div id="container">
<h1>CS 32, Spring 2016</h1>
<h2>Programming Assignment 1</h2>

<h3><u>Due</u>: Sunday April 24, 11:59pm
<br><u>Worth</u>: 100 points</h3>

<p>PA1 must be done individually. In other words, you are not allowed to use
   pair programming for this assignment. </p>
<ol>
  <li>Write <font color="red"><b>table.h</b></font> to define <code>class Table</code> as it is used
  in the demonstration program named <a href="tabledemo.cpp">tabledemo.cpp</a>. Your Table must hold
  <code>Entry</code> objects as defined in <a href="entry.h">entry.h</a> (and implemented in
  <a href="entry.cpp">entry.cpp</a>). For the demonstration
  program to compile successfully, your table.h must define at least the following public functions:
      <ul type = "circle">
        <li>One constructor that builds an empty Table designed to hold a maximum number of entries
        equal to the only parameter. This parameter should have a default value of 100:
        <br><code>&nbsp;&nbsp;&nbsp;Table(unsigned int max_entries = 100)</code></li>
        <li>Another constructor that builds a Table designed to hold the number of entries
        specified by the first parameter, and puts that many entries into the Table by reading
        them one at a time from the input stream that is the second parameter:
        <br><code>&nbsp;&nbsp;&nbsp;Table(unsigned int entries, std::istream &input)</code>
        <br><em>Do not input more than the specified number of entries.</em> If you always read all of input,
        you will lose points for not satisfying this requirement.</li>
        <li>Two (overloaded) member functions named put, each of which puts a new Entry into the Table:
        <br><code>&nbsp;&nbsp;&nbsp;void put(unsigned int key, std::string data)</code>
        <br><code>&nbsp;&nbsp;&nbsp;void put(Entry e)</code>
        <br>The first of these functions creates a new Entry to put in the Table. The second
        one puts a copy of the parameter in the Table. In cases where the Table already
        contains an Entry with the given key, these functions act to update the Entry for that key.
        The Table is not allowed to contain duplicate keys.</li>
        <li>A constant member function named get that returns the string associated with the
        parameter:
        <br><code>&nbsp;&nbsp;&nbsp;std::string get(unsigned int key) const</code>
        <br>This function returns an empty string if the Table has no Entry with the given key.</li>
        <li>A member function named remove that removes the Entry containing the given key:
        <br><code>&nbsp;&nbsp;&nbsp;bool remove(unsigned int key)</code>
        <br>This function returns true if it removes an Entry, or false if the Table has no such Entry.</li>
        <li>A non-member output function that overloads the &lt;&lt; operator to print the Table:
        <br><code>&nbsp;&nbsp;&nbsp;std::ostream& operator&lt;&lt; (std::ostream &out, const Table &t)</code>
        <br>This function is expected to print each Entry in the Table to a separate line of
        the given output stream <em>in the order of their key values</em>.</li>
      </ul>
  Your class may define other functions too, either public or private ones. In particular, you will
  probably want to add a hashing function to transform the key values - in our version, function hashkey
  is a private function. And of course, your class must define the private data a Table object stores.</li>
      </ul>
  </li>
  <li>Write <font color="red"><b>table.cpp</b></font> to implement your class Table. You may use
      tools from any of the standard libraries except &lt;map&gt;, &lt;set&gt;, &lt;unordered_map&gt;
      and &lt;unordered_set&gt;. In planning your implementations, keep in mind the following requirements:
      <ul type="circle">
        <li>Each of the functions put, get and remove must execute in constant O(1) time. That means your
        implementation must be a hash table. By the way, you should carefully choose the size of the
        table you create in the constructors - our version makes the size of the table equal to
        twice the maximum number of entries.</li>
        <li>Your output function must output the entries in the order of the key values, and it must
        execute in no more than O(n log n) time, and certainly not O(n<sup>2</sup>) time.</li>
      </ul>
        <table border="1">
          <tr align="left">
            <td><b>Clarification about Big-O restrictions:</b>
            <br>It is important that you store and manipulate Entry objects (i.e.,
            instances of class Entry), and not separately handle the integer keys and
            string data. That is because we assess the efficiency of your functions by
            using the Entry::access_count() function before and after various operations.
            The time tests used by submit.cs will fail if they detect impossibly small
            counts of Entry accesses. Do notice that sorting Entry objects is no more
            complicated than sorting numbers, thanks to the operator conversion function
            that allows an Entry object to be treated like an int when appropriate. So,
            for example, if e1 and e2 are both entry objects, then (e1 &lt; e2) will
            evaluate to true if e1.key() is less than e2.key(). All of the other relational
            operators work too. Cool, huh?</td>
          </tr>
        </table>
  <li>Compile and test your program at CSIL (by connecting remotely is okay). Create your
      own testing program(s) to do so. After you think that all parts are working properly,
      you should verify that your implementation compiles and executes correctly with the
      demonstration program too. Use the following command to compile it:
      <pre>g++ -std=c++11 -o tabledemo tabledemo.cpp table.cpp entry.cpp</pre>
      The demonstration also requires a copy of the file <a href="fips.txt">fips.txt</a>
      (Federal Information Processing Standard codes for all U.S. counties) to
      reside in your current working directory. Meanwhile, you can also
      run our solution by typing the following from your CSIL account to know how
      your solution should work:
      <pre>~cs32/pa1/tabledemo</pre>
      Even if you run our version, it is necessary to have a copy of fips.txt in your current
      working directory (or you can just cd into ~cs32/pa1, and run the program from there).</li>
  <li>You will turn in both table.h and table.cpp<!--, but the procedure for doing so is still being
            worked out. See this space for further instructions well before the due date-->.
      <table border="1" cellpadding="3">
        <tr>
          <td align="left">
          <p><b>New students:</b> If you don't already have an account on the submit.cs system, make one now at
          <a href="https://submit.cs.ucsb.edu/form/user">https://submit.cs.ucsb.edu/form/user</a>.
          The Create New Account form will insist that you sign up using your umail address, and
          we insist you <em>enter the name listed on the roster (not a nickname)</em>.</p>
          <p><b>Everybody:</b> After logging into <a href="https://submit.cs.ucsb.edu/">https://submit.cs.ucsb.edu/</a>,
          follow the Join Class link, and then click the button 
          labelled "Join CS32_s16" to join our class for this quarter.</p>
          </td>
        </tr>
      </table>
      From our class page at <a href="https://submit.cs.ucsb.edu/">https://submit.cs.ucsb.edu/</a>,
      click the "Make Submission" button next to PA1, or use the following command from a CS terminal:
        <pre>~submit/submit -p 466 table.cpp table.h</pre>
        Be sure to wait for the results of all tests. If you score 100/100, and you've
        followed all of the other rules, then you'll earn full credit.
      </li>
</ol>
<hr>

<h6>Prepared by Michael Costanzo, 4/6/2016. Submission instructions added 4/17/2016, and
    Big-O clarification added 4/19/2016.</h6>

</div><!-- id = "container" -->


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
