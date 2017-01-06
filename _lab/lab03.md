---
layout: lab
num: lab03
ready: false
desc: "ASCII Art: Logical operators"
assigned: 2017-01-27 08:00:00.00-8
due: 2017-02-03 23:59:00.00-8
---

# Goals for this lab 
 
By the time you have completed this lab, you should be able to

* Use if/else and for loops to print various kinds of shapes with &quot;ASCII Art&quot;

* Show that you understand how to work through the basic process of test-driven development in C++
 
## Skills Needed 

By now, we expect that you are comfortable with these basic skills from lab00, lab01, lab02, and lab03 so we will no longer describe them in as much detail as we did previously:
 
* Using a text-editor (we suggest emacs) to create and/or edit C++ programs
* Creating a git repo on github
* Cloning your github to your local machine
* Integrating git command-line tools into your workflow (*git add...*, *git commit..*, *git push ...*)
* Compiling and running C++ programs
* Using the computers in both the CSIL and the Phelps labs to do basic things:
    * Performing basic management of directories and files with Unix commands such as mkdir, cd, pwd, ls, cp, mv
    * Submitting assignments in this class with the submit.cs system, and checking your results

## What we'll be doing in this lab: ASCII Art 

There was a time when laser printers either hadn't been invented yet, or were not yet widely available. Thus, the only kind of printer most folks had access to was something called a &quot;line printer&quot;, which printed only from left to right, top to bottom, and could only print the kinds of characters you find on a typewriter keyboard.

So, you might find folks making pictures like this one, found at http://chris.com/ascii/

 <pre>
                                 .ze$$e.
              .ed$$$eee..      .$$$$$$$P""
           z$$$$$$$$$$$$$$$$$ee$$$$$$"
        .d$$$$$$$$$$$$$$$$$$$$$$$$$"
      .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$e..
    .$$****""""***$$$$$$$$$$$$$$$$$$$$$$$$$$$be.
                     ""**$$$$$$$$$$$$$$$$$$$$$$$L
                       z$$$$$$$$$$$$$$$$$$$$$$$$$
                     .$$$$$$$$P**$$$$$$$$$$$$$$$$
                    d$$$$$$$"              4$$$$$
                  z$$$$$$$$$                $$$P"
                 d$$$$$$$$$F                $P"
                 $$$$$$$$$$F 
                  *$$$$$$$$"
                    "***""  Gilo94'
</pre>

For now, we'll be keeping things much simpler: we are going to do some very simple ASCII art of letters, numbers and symbols, in order to practice with if/else and for loops.

The first few exercises will be very simple, but they get progressively more challenging.

## An example for you to follow: starL 

As an example, we will write a C++ function that returns a C++ string that when printed to cout,  makes the shape of prints the letter L with stars, at any width or height, provided both width and height are &gt;= 2

If either the parameter width or height is less than 2, the function returns an empty string.

The function will have the following <em>function prototype:</em>

<pre>string starL(int width, int height);</pre>

* As a reminder, a function prototype is the first line of the funciton definition (the header) followed by a semicolon instead of the function body&mdash;it is used to introduce the function to the compiler, in case the function definition isn't coming until later.

* You can read more about function prototypes here: [C++: function prototypes](https://ucsb-cs16.github.io/topics/cpp_function_prototypes/)

The following table shows various calls to this function, along with what the string returned looks like when printed using <code> cout << starL(w,h); </code>

The rule is that the L should have height at least 2, and width at least 2, otherwise the result is an empty string, and printing an empty string results in no output.

![starL](/lab/lab03/starL.png){:height="400px"}


So, this is a fairly easy function to write. This will do the job, and is provided for you as an example of how functions like this should be written.


To test whether this function works, we can write a simple main that takes the command line arguments, converts them to integers with atoi, 
and then passes those to the function:

## What you'll be doing 

What you'll be doing in this lab is writing three similar functions: startT, starC and starZ.  

*Sample values returned from starT*

![starT](/lab/lab03/starT.png){:height="400px"}

*Sample values returned from starC*

starC renders the letters C, but requires a minimum height of 3, and a minimum width of 2.  Otherwise it returns an empty string.

![starC](/lab/lab03/starC.png){:height="400px"}


*Sample values returned from starZ*

starZ renders the letters Z, but requires a minimum width of 3.   It only takes one parameter, because the height and width are always assumed to be equal.

![starZ](/lab/lab03/starZ.png){:height="400px"}

# Step by Step Instructions 

## Step 1: Getting Started 

Decide if you are working alone, or working in a pair.  

If you are working in a pair:
* Go to submit.cs, navigate to CS16, F14, lab04, and create a team for you and your pair partner.   
* Decide on initial navigator and driver.
* Driver, log on to driver's CSIL account.

Log on to CSIL, bring up a terminal window, and create a ~/cs16/lab03 directory

## Step 2: Getting the code

TBD: Update the instructions to get the code from github

If so, you are ready to move on to the next step.

If you don't see those files, work with your pair partner to go back through the instructions and make sure you didn't miss a step. If you still have trouble, ask your TA for assistance.

## Step 3: Practicing with the starL program 

First compile the starL.cpp file that you have in this week's directory, and run it with a few command line parameters.  You'll notice something special happens when you pass in the command line parameters -1 -1.

<pre>
 ./starL 3 4
 ./starL 4 3
 ./starL
 ./starL 2 1
 ./starL -1 -1
</pre>

With the command line parameters -1 -1, the program runs a set of tests on itself to make sure that the function starL inside the program is functioning correctly.  So, you should be able to get some feedback on whether your code is correct before you even send it to the submit program.  

* Note: In [[F14:Lectures:10.20]], we looked at code that runs its tests when you pass -t or --test as the command line argument.  That code used strcmp to compare a C-string value to argv[1], but we aren't going to deal with that in this lab&mdash;we'll save C-string and the messiness of strcmp for a later lab, after we've had a chance to read about C-strings in the textbook.   We'll just use atoi to convert the argv[1] and argv[2] to integer values, and compare against -1.

Look over the code and try to understand how it works.  When you feel ready, move on to the next step, and try tackling the starT.cpp, starC.cpp and starZ.cpp programs.

## Step 4: Writing the starT program 

Your job now is to start edit the starT.cpp program, which has a function inside of it that is a "stub".  That function does NOT produce the correct output---it always just returns the string "stub".   You need to replace that code with a proper implementation of starT.  You can use the implementation of starL in the starL.cpp file as a model.

Refer back to the description of starT earlier in this lab.   You can also run the program with arguments of -1 -1 to run the internal tests and see whether your implementation is correct.

When you think you have a correct implementation, try submitting to the submit.cs system.  You can submit just your starT.cpp program to see how far along you've gotten:

```
~bboe/bin/submit -p 223 starT.cpp
```

Note that this will show failures for <code>starC.cpp</code> and <code>starZ.cpp</code>, which are files that you'll be working on at a later step.

You could also just submit the "stubs" for those&mdash;though those will fail some or all of the tests:

```
~bboe/bin/submit -p 223 starC.cpp starT.cpp starZ.cpp
```

Either way, for now, concentrate only on the test failures that pertain to starT.cpp and try to address any problems you encounter.  If you fix these NOW before moving on to starC.cpp and/or starZ.cpp, you will likely have better success, because what you learn from fixing your mistakes will help you get those other parts solved more quickly and easily.

Some rules to keep in mind for the starT function:

* EVERY line of your T should have exactly the same number of characters, and should end in a newline&mdash;remember to pad out each line with spaces.
* Return a string that represents the letter T with the correct width and height, but only if height &gt;=2, and width is an odd number &gt;=3
* if the height and width values are not valid, return an empty string

Hints: recall that:
* the % operator can be used to test where a number is odd or even
* the &amp;&amp; operator means &quot;and&quot;
* the || operator means &quot;or&quot;
* the opposite of &gt;= is &lt;, not &lt;=

Also, for starT.cpp:
* If there are not exactly two command line args after the program name (one for width and one for height), print a usage message: <code>Usage: ./starT width height</code>
* If the height and width are both -1, then invoke the internal tests.  Don't change those.  If you do, then you may lose points.

## Step 5: Writing the starC program 

Next, write the starC program.   Follow the same basic procedure as for the starT.cpp program.

To get started, look at the table near the top of this lab that shows correct output for the starC program, as well as looking at the test cases in the runTests() function of the starC.cpp file in your directory.

Note that you'll need to add some code to the main, but this time the rules are different.   The minimum width is 2, and the minimum height is 3&mdash;everything else returns a null string (except for the values -1 for width and -1 for height&mdash;when passed in combination, the tests should be run.)

When:
* You can run your code with: <code>./starC -1 -1</code> and all the tests pass
* You can run your code on values such as <code>./starC 4 5</code> and <code>./starC 5 4 </code> and see the same output as what is shown in the table, AND
* When typing in a command line that doesn't have exactly two arguments after </code>./starC</code> produces the correct error message

then, you are ready to try testing your code on the submit system.

If you submit starC.cpp together with your starT.cpp program, your submit command will look like this:

```
~bboe/bin/submit -p 223 starT.cpp starC.cpp
```

(The order of the files doesn't matter&mdash;list starT.cpp first, or starC.cpp first, aand either way, the result is the same.)

Note that failures for <code>starZ.cpp</code> may still show up, but we need not be concerned about those yet.  

Concentrate only on the test failures that pertain to starC.cpp and starT.cpp and try to address any problems you encounter.  Once all of those pass, move on to the starZ.cpp program:

## Step 6: Writing the starZ program 

For the starZ.cpp program, we have these rules:

* Take only one command line parameter: the width. The height will automatically be set equal to the width.</li>

The starZ function follows these rules:
* return a string that draws  the letter Z with the correct width and height, but only if width &gt;=3 
* return an empty string if the value passed in for width is not valid, print nothing at all.

Hints for the middle part of the Z:

* Take a look at the program backslash.cpp which is in your directory.   Try compiling and running it.  Look at the source code and see if there are any hints there.
* As you can see, it produces a backslash.cpp produces a backslash of a given width, as shown here.   Look at the source code, and consider how you might turn backslash.c into forwardslash.c&mdash;in fact, that might be a good warm-up exercise for making the starZ.c program.     Note that the backslash.cpp program does not contain an internal test harness.
* Note that the backslash.cpp program uses several "helper functions".  You might find that to be a useful technique in writing your own code.   You may introduce whatever helper functions would be useful to you.

```
-bash-4.1$  ./backslash
Usage: ./backslash width
-bash-4.1$ ./backslash 3
*
 *
  *
-bash-4.1$ ./backslash 5
*
 *
  *
   *
    *
-bash-4.1$ ./backslash 2
*
 *
-bash-4.1$ ./backslash 4
*
 *
  *
   *
-bash-4.1$ 
```


As with starC.cpp, you should add code to starZ.cpp so that you are able to invoke the internal tests by typing <code>./starZ -1 </code>.  Note that this time, there is only one parameter.

And, if there is not exactly one parameter, there should be an appropriate "usage" message that follows the pattern of the other programs&mdash;except that there is only a width parameter in this program.

When you have a version that can pass its internal tests, try submitting it along with your starT.cpp and starC.cpp to the submit.cs system.  

```
~bboe/bin/submit -p 223 starC.cpp starT.cpp starZ.cpp
```

If there are errors reported, fix them.    

When you have a clean build, you are nearly done with this lab.   I say "nearly" done, because you should take one last look over the grading rubric to see if there is anything you need to adjust before doing your final submit and calling it a day.

Note:
You MUST make one final submission that includes ALL of your files.  For getting incremental feedback while working on the lab, it is fine to submit one at a time, but for GRADING purposes, your LAST submission (in time) must be a complete submission of EVERYTHING.   In the ideal case (for you), that submission is completely b"green", i.e. all test cases pass, and you have a perfect score (at least from the standpoint of the points you are awarded for passing the test cases.)

If there are parts you can't figure out, be sure to submit all of your files anyway to maximize the number of points you receive based on the parts that '''are''' working.}}
{{TipEnd}}

# Evaluation and Grading 
 
Mechanics:

* (30 pts) submitting starT.cpp, starC.cpp and starZ.cpp to the submit system (10 points each)
* (30 pts) submission is on time and follows instructions 
* (30 pts) starT.cpp, starC.cpp and starZ.c files submitted  have good header comments 
** First line is comment with &quot;cs16 lab04&quot; and date, and your name, and if applicable, that of your pair partner(s)</li>

Correctness

* (150 pts) 15 tests, ten points each, executed by submit.cs system

Style:

* (60 pts) All three programs have good programming style, including proper use of indentation, reasonable choices for variable names, readable code, reasonable use of whitespace, and other good programming practices.
