---
title: "Syllabus"
layout: default
ready: true
---

<div markdown="1">
<a name="top"></a>

# Syllabus <a name="syllabus"></a>

* [What this course is about](#about)
* [Schedule](/info/schedule/)
* [Resources](/info/resources/)
* [Course Policies](/info/policies/)
* [FAQs](/info/faq/)

# Course Staff<a name="staff"></a>

## Course instructor: Diba Mirza 
* email: dimirza@cs.ucsb.edu	
* Office hours: Thu, Fri 11:00am- noon, Harold Frank Hall 1155
* Homepage: [https://www.cs.ucsb.edu/~dimirza/](https://www.cs.ucsb.edu/~dimirza/)
 
## Teaching Assistants
* Lin Chai: linchai@cs.ucsb.edu
* Harshitha Murthy: harshitha@umail.ucsb.edu
* Daria Rudneva: 	drudneva@umail.ucsb.edu

TA office hours is available on our class Google Calendar

## Undergraduate tutors 
* Angela Yung
* Barbara Korycki	
* Jimmy	Le	
* Sayali Kakade	
* Sean Shelton	
* Steven Fields	

The tutors will help with conducting the labs and other instructional activities as part of a new pilot program.


<a href="#top">Back to top</a>

# What this course is about <a name="about"></a>

<p><strong>This course is the first in a three course sequence, CS16-24-32 that provides a foundation in data structures and algorithms for deeper study of Computer Science.    <br />
  <br />
</strong></p>

<p>This is NOT an introductory programming course.  This is an INTERMEDIATE programming course.</p>

## What you need BEFORE you take this course 

<p>This course will present C++ from the beginning; no prior knowledge of C++ is assumed.  However, it IS assumed that you already have successfully completed CMPSC 8, or have an equivalent background in programming.  You should
be comfortable with all of the following:</p>

<table border="1" cellspacing="1" cellpadding="1" id="topicTable">
  <tr>
    <td><ul>
      <li>Problem solving
        <ul>
            <li>breaking down a problem into a sequence of steps</li>
          <li>abstracting specific problems into general ones<br />
            and finding general solutions</li>
        </ul>
      </li>
      <li>Memory concepts
        <ul>
            <li>variables, primitive vs. reference variables, name, type, value</li>
          <li>assignment statements</li>
          <li>scope of variables</li>
        </ul>
      </li>
      <li>Control structures
        <ul>
            <li>for loops, if/else, while loops</li>
        </ul>
      </li>
      <li>Arrays (or a similar data structure, e.g. Lists in Python)
        <ul>
            <li>index vs. value, finding sum, min, max, average, count of elements matching some condition, making a new list of elements containing only those that match some condition</li>
        </ul>
      </li>
    </ul>    </td>
    <td><ul class="style11">
      <li>Functions
        <ul>
            <li>function call vs. function definition</li>
          <li>formal vs. actual parameters (arguments)</li>
        </ul>
      </li>
      <li>Testing
        <ul>
            <li>How to test your code</li>
        </ul>
      </li>
      <li>Input/output concepts
        <ul>
            <li>Writing to the terminal</li>
          <li>Reading from the keyboard</li>
          <li>Reading and writing to files</li>
          <li>Neatly formatting output</li>
        </ul>
      </li>
      <li>Program style
        <ul>
            <li>How to write code that other people can read and understand</li>
        </ul>
      </li>
    </ul>    </td>
  </tr>
</table>



## What you SHOULD HAVE LEARNED BY THE END of this course to be ready for CS24 

<p>So, what is it that you need to know by the end of this course?   Here's the  list of just a few of the things you'll need to know to be ready for CS24 (the next programming course).  You'll have the opportunity to learn all of these things (though not necessarily in this order).</p>

* A few of the basic data types of C++, including at least, int, double, char, bool, string
* The basic control structures of C++ (if/else, while, for etc.)
* Defining functions in C++, and passing parameters to functions in three different ways (by value, by pointer, and by reference)
* Scope and lifetime of variables in C++
* The use of "const" with parameters to functions
* Using arrays in C++, and C-strings (null-terminated character arrays)
* How arrays are passed to functions, and the relationship between arrays and pointers
* Defining and working with structs in C++
* Using structs to create singly linked lists where the space for the list nodes is allocated on the heap
* The difference between space allocated on the stack (e.g. local variables) and space allocated on the heap (with the new and delete operators)
* Converting from binary to decimal, octal, and hex, and back again&mdash;and how this relates to how C++ programs store various kinds of data in memory.
* The basic principles of recursion, and some idea of when a recursive solution is appropriate.


<p><strong>The swimming/guitar/painting analogy</strong></p>
<p>You cannot learn to swim, play guitar, or paint from a textbook or a lecture. You can only:</p>
<ul>
  <li> learn  to swim by spending many hours in the pool, </li>
  <li>learn to play guitar by spending many hours playing the instrument</li>
  <li>learn to paint by spending many hours putting brush to canvas.</li>
</ul>
<p>The same is true of programming. Programming is not a series of facts to be memorized—you cannot &quot;cram&quot; for a computer science exam. You must practice, practice, practice.</p>


## How this course works

<p>There are five components to this course, each of which has a special job to do:</p>
<ul>
  <li><strong>(1) Reading</strong>—Between each class, you'll have reading to do in the textbook. There is too much information you need to learn in this course for you to get all of it in lecture, so the readings are essential. The reading assignments for the next class can be found on the homework assignments handed out during each class period.<br />
    <br />
  </li>
  <li><strong>(2) Homework</strong>—In almost every class, you'll be given a homework assignment that is due in the following class. (The exception is the class period immediately before an exam, where no homework will be given.) <br />
    <br />These are typically pencil/paper type problems, though sometimes you'll need access to a computer to solve them. If you don't have reliable access to a computer at home (or in your dorm), please plan your schedule so that you can spend time in the CSIL computer lab between classes.<br />
    <br />
    Homework assignments are completed on paper—they may NOT be submitted electronically—and may only be submitted in the class in which they are due. In this way, they also serve as an attendance check. Therefore, you may NOT turn in a homework assignment &quot;on behalf of&quot; an absent classmate, or have someone else turn in your homework for you—doing so in this course is a form of academic dishonesty.<br />
    <br /> 
    Because I realize that sometimes each student must miss a class due to unavoidable circumstances, or illness, each student is permitted <strong>one</strong> &quot;personal day/sick day&quot; (one per quarter) where you may make up a missed homework assignment (without penalty) by coming in person during the instructor or TAs office hours.   See details elsewhere on this syllabus.
    <br />
  </li>
  <li><strong>(3) Programming Assignments (Labs)</strong>—Programming assignments (also called labs) are given once or twice a week, and are typically started in the Tuesday lab sessions, and finished on your own time outside of lab. These will typically involve pair programming, which is described later in this syllabus.<br />
    <br />
  </li>
  <li><strong>(4) Lectures</strong>—Learning is something that you do as a student, not something that is &quot;done to you&quot; by a teacher. Therefore most of the learning you will do in this course takes place when you are actively involved in doing something challenging, i.e. during the homework assignments, and labs. Most of the information you will need to do those assignments will come from the reading. <br />
    <br />
    Therefore, you may ask, what is the purpose of the lectures?<br />
      <br />
      The purpose of the lectures in this course is to guide you through the readings, homeworks, and labs:
        <ul>
          <li>to provide an overview of how everything fits together</li>
          <li>to provide hands-on demonstrations of things you'll do on your own later</li>
          <li>to provide additional information that is not in the textbook</li>
          <li>to provide additional explanations about things in the text that might not be clear</li>
          <li>to provide an opportunity to ask questions, and hear answers to questions asked by others.<br />  
            <br />
          </li>
        </ul>
  </li>

<li><strong>(5) Exams</strong>&mdash;There are three exams in this course—two midterms and a final.</li>

You may wonder why there are two midterms in a course that is only ten weeks long. The reason is that I've found that in order to succeed at learning the material in this course, many students need two opportunities for feedback on how they are doing before the final exam. Students sometimes are doing better than they think they are, or not as well as think they are, and the exams provide a &quot;reality check&quot;

=== You may find the workload heavy ===

The workload in this course may feel heavy. It may even feel unreasonable compared to your other courses.

However, I assure you that it is not unreasonable, given the goal of making you an skilled beginning programmer. Programming is a skill, and the only way to get good at it is lots and lots of practice, which takes lots and lots of time.

The usual &quot;folklore&quot; rule of thumb is 8–12 hours per week for a normal college class. That means you should expect, at a minimum to put in 5–9 hours per week on this course, on top of the 3 hours 20 minutes you spend in lecture and lab each week. To put it another way, I really should be giving you between 2 and 4 hours of homework between every lecture.

I probably won't succeed in giving you that much work to do, but I really should, because that's the only way you'll learn what this course is supposed to teach! So, I'll do my best :-) 

</ul>

<a href="#top">Back to top</a>
