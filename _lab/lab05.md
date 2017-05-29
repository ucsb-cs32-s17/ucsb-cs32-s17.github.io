---
layout: lab
num: lab05
ready: true
desc: "Hash Table part 1"
assigned: 2017-05-24 15:30:00.00-7
due: 2017-06-02 23:59:00.00-7
code_url: https://www.cs.ucsb.edu/~aduncan/cs32/s17/labs/lab05
code_dir: ~aduncan/public_html/cs32/s17/labs/lab05
submit_cs_project_num: 748
---

<div style='display:none'>
https://ucsb-cs32-s17.github.io/lab/lab05/
</div>

THIS IS AN INDIVIDUAL LAB. Pair programming is not permitted.

Each individual must submit their own individual submission.

## Step 1: Get the {{page.num}} starter code into your repository directory 

In this step, we are going to copy the {{page.num}} starter files from the instructors directory into your <tt>~/cs32/{{page.num}}</tt> directory.

The files are in the instructors directory at 

<tt>{{page.code_dir}}/*</tt> 

and also accessible via the URL

<tt>{{page.code_url}}</tt> 

You want to copy these files into your <tt>~/cs32/{{page.num}}</tt> directory.

## Step 2: Write the table.h header file

Write <font color="red"><b>table.h</b></font> to define <code>class Table</code> as it is used
in the demonstration program named <code>tabledemo.cpp</code>. Your Table must hold
<code>Entry</code> objects as defined in <code>entry.h</code> (and implemented in
<code>entry.cpp</code>). For the demonstration
program to compile successfully, your table.h must define at least the following public functions:

<ul type = "circle">
  <li style='margin-bottom:2em;'>One constructor that builds an empty Table designed to hold a maximum number of entries
  equal to the only parameter. This parameter should have a default value of 100:
  <br><code>&nbsp;&nbsp;&nbsp;Table(unsigned int max_entries = 100)</code></li>

  <li style='margin-bottom:2em;'>Another constructor that builds a Table designed to hold the number of entries
  specified by the first parameter, and puts that many entries into the Table by reading
  them one at a time from the input stream that is the second parameter:
  <br><code>&nbsp;&nbsp;&nbsp;Table(unsigned int entries, std::istream&amp; input)</code>
  <br><em>Do not input more than the specified number of entries.</em> If you always read all of input,
  you will lose points for not satisfying this requirement.</li>

  <li style='margin-bottom:2em;'>Two (overloaded) member functions named put, each of which puts a new Entry into the Table:
  <br><code>&nbsp;&nbsp;&nbsp;void put(unsigned int key, std::string data)</code>
  <br><code>&nbsp;&nbsp;&nbsp;void put(Entry e)</code>
  <br>The first of these functions creates a new Entry to put in the Table. The second
  one puts a copy of the parameter in the Table. In cases where the Table already
  contains an Entry with the given key, these functions act to update the Entry for that key.
  The Table is not allowed to contain duplicate keys.</li>

  <li style='margin-bottom:2em;'>A constant member function named get that returns the string associated with the
  parameter:
  <br><code>&nbsp;&nbsp;&nbsp;std::string get(unsigned int key) const</code>
  <br>This function returns an empty string if the Table has no Entry with the given key.</li>

  <li style='margin-bottom:2em;'>A member function named remove that removes the Entry containing the given key:
  <br><code>&nbsp;&nbsp;&nbsp;bool remove(unsigned int key)</code>
  <br>This function returns true if it removes an Entry, or false if the Table has no such Entry.</li>

  <li>A non-member output function that overloads the &lt;&lt; operator to print the Table:
  <br><code>&nbsp;&nbsp;&nbsp;std::ostream&amp; operator&lt;&lt; (std::ostream&amp; out, const Table&amp; t)</code>
  <br>This function is expected to print each Entry in the Table to a separate line of
  the given output stream <em>in the order of their key values</em>.</li>
</ul>
   
Your class may define other functions too, either public or private ones. In particular, you will
probably want to add a hashing function to transform the key values - in our version, function hashkey
is a private function. And of course, your class must define the private data a Table object stores.

HINT: You will probably want to use chained hashing for this lab. That means that each row in your <code>Table</code>
will be of type <code>std::vector&lt;Entry&gt;</code>. It is often convenient to typedef that type to some shorter
name, so your method signatures don't get clunky.

## Step 3: Write the Table class to implement the header from Step 2

Write <font color="red"><b>table.cpp</b></font> to implement your class Table. You may use
tools from any of the standard libraries except &lt;map&gt;, &lt;set&gt;, &lt;unordered_map&gt;
and &lt;unordered_set&gt;. 

Hint: write stub code for each method, and get your class to compile. Then filling in the methods
is a SMOP (Simple Matter of Programming).

In planning your implementations, keep in mind the following requirements:
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
   operators work too! The power of overloading.</td>
 </tr>
</table>
   
## Step 4: Testing
   
Compile and test your program at CSIL (by connecting remotely is okay). Create your
own testing program(s) to do so. After you think that all parts are working properly,
you should verify that your implementation compiles and executes correctly with the
demonstration program too. Use the following command to compile it:

<pre>g++ -std=c++11 -o tabledemo tabledemo.cpp table.cpp entry.cpp</pre>

The demonstration also requires a copy of the file <code>fips.txt</code>
(Federal Information Processing Standard codes for all U.S. counties) to
reside in your current working directory. (This file is provided along with the other ones.) 

<!--
Meanwhile, you can also
run our solution by typing the following from your CSIL account to know how
your solution should work:

<pre>~cs32/pa1/tabledemo</pre>

Even if you run our version, it is necessary to have a copy of fips.txt in your current
working directory (or you can just cd into ~cs32/pa1, and run the program from there).
-->
      
## Step 5: Submit your work
  
  You will turn in both <code>table.h</code> and <code>table.cpp</code>.

From our class page at <a href="https://submit.cs.ucsb.edu/">https://submit.cs.ucsb.edu/</a>,
click the "Make Submission" button next to PA1, or use the following command from a CS terminal:
  <pre>~submit/submit -p {{page.submit_cs_project_num}} table.cpp table.h</pre>
  
Be sure to wait for the results of all tests. If you score 100/100, and you've
followed all of the other rules, then you'll earn full credit.
 

