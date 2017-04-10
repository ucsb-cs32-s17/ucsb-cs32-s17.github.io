---
layout: lab
num: lab01
ready: true
desc: "Counting ducks: Simple I/O and flow control, github command-line setup"
assigned: 2017-01-13 15:30:00.00-8
due: 2017-01-20 23:59:00.00-8
---


# Introduction

By the time you have completed this lab, you should be able to:

* Use for loops to count up and count down
* Check command line argument for input filename, and open that input file for reading
* Read every line of text in an input file and process it, using a while loop
* Use if-else statements to select blocks of code
* Count how many times a value occurs in a file
* Use Unix commands to create directories, navigate to directories, list files, and copy files
* Use the "make" command to compile simple stand-alone C++ programs (i.e. single source code file)
* Run simple C++ programs both with and without a single command line parameter

# Step by Step Instructions 

* [Log on to CSIL and bring up a terminal window](#step1){: data-ajax="false"}
* [Create your working directory](#step2){: data-ajax="false"}
* [Getting the starter code from a local directory](#step3){: data-ajax="false"}
* [Compiling and running the first program for this assignment](#step4){: data-ajax="false"}
* [Copy sample01.cpp to myProg01.cpp and make changes](#step5){: data-ajax="false"}
* [Reading from input files and counting ducks](#step6){: data-ajax="false"}
* [A more detailed counting program](#step7){: data-ajax="false"}
* [Turn in your code ](#step8){: data-ajax="false"}
* [Preparing for lab02: Git one-time configurations and basic work flow](#gitonetime){: data-ajax="false"}

## Step 1: Log on to CSIL and bring up a terminal window. <a name="step1"></a>

*Note: This assignment MUST be done individually. This is a correction to what was announced in lecture*

I hope I can safely assume that you have all gotten a CoE account.
 If your account is not working,  get the attention of the instructor.

Log into your account to make sure it works. 
As a reminder to get to the terminal go to <strong>Application</strong> Menu, then <strong>System Tools</strong>, then <strong>Terminal Window</strong>.

In the steps below, and in most future labs, you will create files on your own
account.
 
## Step 2: Create your working directory <a name="step2"></a>

In lab00,  we created your <code>~/cs16</code> directory, and the <code>~/cs16/lab00</code> directory.

In this lab, we'll create the <code>~/cs16/lab01</code> directory.

You can do this with the following unix command:

<syntaxhighlight lang="bash">mkdir ~/cs16/lab01</syntaxhighlight>

Then you can use a <code>cd</code> command to go directly into that directory:

<syntaxhighlight lang="bash">cd ~/cs16/lab01</syntaxhighlight>

You can then use the <code>pwd</code> command to make sure that you are in the proper
spot. The result should look like this (except in place of /cs/faculty/dimirza, you'll see your own home directory listed, e.g. /cs/student/jsmith).

```
-bash-4.2$ mkdir ~/cs16/lab01
-bash-4.2$ cd ~/cs16/lab01
-bash-4.2$ pwd
/cs/faculty/dimirza/cs16/lab01
-bash-4.2$
```

In future weeks, we may simply say something like &quot;create a <code>~/cs16/lab01</code> directory and make it your current directory&quot;, without spelling out the Linux commands to do this.  You can always refer back to previous labs if you forget the details, but eventually you'll want to memorize some of the most useful commands such as <code>mkdir</code>, <code>cd</code>, <code>pwd</code> and <code>ls</code>.

## Step 3: Getting the starter code from a local directory <a name="step3"></a>


Copy the code from the instructor's account on the CSIL server using the following command:

```
  cp /cs/faculty/dimirza/cs16-wi17/labs/lab01-startercode/*  ~/cs16/lab01/
```

After doing this command, if you cd into ~/cs16/lab01/ and use the ls command, you should see several .cpp files:

```
-bash-4.2$ ls
animals01.txt  animals02.txt  countDucks.cpp  sample01.cpp
-bash-4.2$ 
```

If you don't see those files, work with your pair partner to go back through the instructions and make sure you didn't miss a step. If you still have trouble, ask for assistance. 

If so, you are ready to move on to the next step. 

## Step 4: Compiling and running the first program for this assignment <a name="step4"></a>

The first program we are going to compile and run is one that demonstrates a for loop in C++.   

In your lab01 directory, you should have a program called sample01.cpp that we copied in the previous step.   Here's how you can put yourself in that directory (though you should already be there):

```
-bash-4.2$ cd ~/cs16/lab01/
-bash-4.2$ pwd
/cs/faculty/dimirza/cs16/lab01/
-bash-4.2$ 
```

Then you can list out your files with the <code>ls</code> command:

```
-bash-4.2$ ls
animals01.txt  animals02.txt  countDucks.cpp  sample01.cpp
-bash-4.2$ 
```

Finally, use the Unix <code>cat</code> command to list the contents of the file sample01.cpp.  (The reason this command is called "cat" has nothing to do with the animal that goes "meow".  If you ask me in lecture and I'll tell you where the name comes from.)

```
-bash-4.2$ cat sample01.cpp
// sample01.cpp
// by P. Conrad for CS16, Winter 2017
#include <iostream>
using namespace std;

int main() {
    // Simple for loop that counts from 1 up to n

    int n=5;

    for (int i=1; i<=n; i++) {
       cout << "i=" << i << endl;
    }
   
    return 0;
}
-bash-4.2$ 
```

Compile this with the command <code>make sample01</code> and run it with the command <code>./sample01</code>.  That looks like this:

```
-bash-4.2$ make sample01
g++     sample01.cpp   -o sample01
-bash-4.2$ ./sample01 
i=1
i=2
i=3
i=4
i=5
-bash-4.2$ 
```


If you get that output, you are ready for the next step. 


## Step 5: Copy sample01.cpp to myProg01.cpp and make changes <a name="step5"></a>

Now we'll use the the Unix command <code>cp </code><em>oldfile newfile</em> which copies files, to copy from sample01.cpp to a new file called myProg01.cpp, as shown here:

```
-bash-4.2$ cp sample01.cpp myProg01.cpp
-bash-4.2$ ls
animals01.txt  countDucks.cpp  sample01
animals02.txt  myProg01.cpp    sample01.cpp
-bash-4.2$ 
```

Now you have a new file called myProg01.cpp that is a copy of sample01.cpp.   Open it up in a text editor and make the following changes:

1. Change the comment at the top of the file so that it says // myProg01.cpp
2. Change the second line of the file to be of the format "Author: your name"
3. Change the comment within the code to "Simple that counts down from n to 1"

4. Change the for loop as follows:

  * Instead of initializing to 1, initialize to n
  * Instead of testing <code>i&lt;=n</code>, test whether <code>i&gt;0</code>
  * Instead of changing i by incrementing with <code>i++</code>, change it by decrementing with <code>i--</code>
  * Remove the printing of "i=" each time.  Instead just print the number.  And Instead of printing a newline after each number, just print one space.  We do that by changing <code>cout &lt;&lt; "i=" &lt;&lt; i &lt;&lt; endl;</code> to <code> cout &lt;&lt; i &lt;&lt; " ";</code>
  * Add a line that prints a newline at the very end, just after the for loop is over, but BEFORE the <code>return 0;</code> statement. *Note: As a reminder, you get out of vim or gvim with ESC:x or ESC:wq . You can get out of emacs with CTRL/X followed by CTRL/C.  It will ask if you want to save changes; type y for yes.*

Compile and run myProg01.cpp with these changes. The output should look like this:

<pre>
5 4 3 2 1
</pre>


You are now ready to move to the next step.   


Tip: *If you make a mistake that results in an "infinite loop", i.e. the window is just scrolling by without stopping, you can use CTRL/C (hold down Control and type C) to stop the program.*


## Step 6: Reading from input files and counting ducks <a name="step6"></a>
The next files we are going to look at are not C++ code, but rather data files.

Use the "cat" command to look at the contents of animals01.txt and animals02.txt. You should get results like these:

```
-bash-4.2$ cat animals01.txt 
duck
duck
goose
-bash-4.2$ cat animals02.txt
duck
duck
goose
duck
duck
cow
duck
duck
dog
-bash-4.2$ 
```

The next program we are going to look at will read input from files such as these.    It is called <code>countDucks.cpp</code> and it will simply count the number of ducks in each file.

Before you look at the code, try compiling the program and running it, because this will help you understand what the program is trying to do.  Compile with:

```
-bash-4.2$ make countDucks
g++     countDucks.cpp   -o countDucks
-bash-4.2$ 
```

Then try running it with just <code>./countDucks</code>.  You'll see that you get a "Usage" message.  This is telling us that the program expects a "command line argument", which is the name of the file to read:

```
-bash-4.2$ ./countDucks 
Usage: ./countDucks inputFile
-bash-4.2$ 
```

So run it again, the first time giving it animals01.txt as the filename, and the second time giving it animals02.txt as the filename:

```
-bash-4.2$ ./countDucks animals01.txt 
There were 2 ducks in animals01.txt
-bash-4.2$ ./countDucks animals02.txt 
There were 6 ducks in animals02.txt
-bash-4.2$ 
```

This code for countDucks.cpp is longer than what will fit on a single screen, so instead of using the "cat" program to list it on our terminal, I suggest opening it up in a editor to look at it.  To open with emacs, this would be <code> emacs countDucks.cpp</code>. To open with gvim type: <code> gvim countDucks.cpp</code>


Read through the code, especially the comments, and try to understand what each line of code is doing.  We'll explain more about this code in lecture, but for now at least get the big picture of how the code works.

Once you've done that, you are ready for the next step.

## Step 7: A more detailed counting program <a name="step7"></a>

Your job is now to copy countDucks.cpp to a file myProg02.cpp and make some changes.

First, let's stipulate that you may assume that everything in the input file is an animal, one per line&mdash;if someone adds "potato" or "bicycle" to the file, you can just assume that potato and bicycle are now to be considered types of animals.

1. Add a variable that will count ALL animals in the file.    Give it an appropriate name and initialize it to zero. 
2. Add a variable that will count ALL animals in the file that are NOT ducks.   Give it an appropriate name and initialize it to zero. 
3. Add code that will increment those counts when appropriate.  It may help to know that C++ has an else clause for an if that looks like this:

```
   if (condition) {
     // lines of code here are 
     // executed when condition is true
   } else {
     // lines of code here are
     // executed when condition is false
   }
``` 

Note that it is NOT required for every if to have an else clause.

Also note that the braces <code>{ } </code> are:

* OPTIONAL when there is a SINGLE statement inside a particular if or else block
* REQUIRED when there is more than one statement inside a particular if or else block

After making these changes, one more thing: change the lines that give the output so they look like the ones shown below.


<pre>
Report for animals01.txt:
   Animal count:    3
   Duck count:      2
   Non duck count:  1
</pre>

<pre>
Report for animals02.txt:
   Animal count:    9
   Duck count:      6
   Non duck count:  3
</pre>

It is IMPORTANT to be EXACT since the submit.cs system will compare your output with the expected output character-by-character.   The spacing MATTERS!   You can add extra spaces at the beginning and end of the string literals for <code>"   Animal count:   "</code>  and <code>"   Duck count:   "</code> so that the spacing comes out right and matches the expected output below.  I'm not going to tell you how many; you'll have to figure that out.

Note that we will also test your program on other input files, so you should too.  Use the cp command to copy animals02.txt to animals03.txt and add some ducks and some other animals.  Count by hand, and make sure that the count when you run your program matches what is expected.

When you are satisfied that the count is correct and that format of the output is precise, you are ready to submit your code for grading.

Note that the submit.cs system may give you feedback on whether your code is correct or not.    You can use this feedback to resubmit as many times as you need up until the deadline for the assignment.  So if it doesn't work on the first try, don't panic&mdash;just fix your code.


## Step 8: Turn in your code  <a name="step8"></a>

Once you have joined the course, you should be able to submit your code by typing the sequence of commands shown below in a terminal window on CSIL:

* Navigate to your ~/cs16/lab01 directory, the one containing your code for this week's lab.
<pre>
-bash-4.2$ cd ~/cs16/lab01
</pre>

* Use the <code>ls</code> command to list your files and to be sure that you have the myProg01.cpp and myProg02.cpp files in your directory.  It is ok if there are other files (countDucks.cpp, animals01.txt, etc.) along with the executables.  You only have to submit myProg01.cpp and myProg02.cpp.

```
-bash-4.2$ cd ~/cs16/lab01
-bash-4.2$ ls
animals01.txt  countDucks.cpp  myProg02      sample01
animals02.txt  myProg01.cpp    myProg02.cpp  sample01.cpp
-bash-4.2$ 
```

* Use the following command to turn in your files:
<pre>
-bash-4.2$ ~submit/submit -p 627 myProg01.cpp myProg02.cpp
</pre>

The number 627 is the "project number" specfic to CS16 W17 lab01 for our class section.

### What a successful turnin looks like 

```
[dimirza@csil-02 lab01]$ pwd
/cs/faculty/dimirza/cs16/lab01
[dimirza@csil-02 lab01]$ ls
animals01.txt  countDucks      myProg01      myProg02      README.md
animals02.txt  countDucks.cpp  myProg01.cpp  myProg02.cpp  sample01.cpp
[dimirza@csil-02 lab01]$ ~submit/submit -p 627 myProg01.cpp myProg02.cpp
logged in as dimirza@cs.ucsb.edu
Sending myProg01.cpp
Sending myProg02.cpp
Submission successful
Results will be available at: https://submit.cs.ucsb.edu/submission/226377
[dimirza@csil-02 lab01]$
```

Once you have done the submit, go to the link shown.  (Yours will have a different number from the one given above.)

### What you'll see on submit.cs if the submission was successful 

If you see the following, it means you passed all the tests.  A successful submission will get 120 points. If you find any thing you want to change, you may resubmit as many times as needed up until the deadline.

<div id="diff_table_div">
<div class="row-fluid"><div class="pull-left well well-small"><h3 style="color:green">Passed Tests</h3><table border="1">
  <tr><th>Test Group</th><th>Test Name</th><th>Value</th></tr><tr><td>myProg01</td><td><p style="color:green;margin:0;padding:0;">myProg01</p></td><td>30</td></tr><tr><td>myProg02</td><td><p style="color:green;margin:0;padding:0;">./myProg02 animals01.txt</p></td><td>30</td></tr><tr><td>myProg02</td><td><p style="color:green;margin:0;padding:0;">./myProg02 animals02.txt</p></td><td>30</td></tr><tr><td>myProg02</td><td><p style="color:green;margin:0;padding:0;">myProg02 empty command line</p></td><td>30</td></tr></table></div></div>

</div>

### What you might see if there were errors 

If instead, you see someting like this, it means you didn't pass some tests:

![error](/lab/lab01/submit.cs.error-50pct.png){:height="500px"}

If you are seeing something like that, try to understand the feedback you are getting before asking questions.  Then if you are still stuck, ask for help.  For example, the output above shows that the student forgot the "colon" (<code>:</code>) in the output.

= Evaluation and Grading =

To earn full credit for this lab (120 pts) you should have successfully submitted both myProg01.cpp and myProg02.cpp  via submit.cs and received a "green" indication that it passed all the tests for expected output.

<div id="diff_table_div">
<div class="row-fluid"><div class="pull-left well well-small"><h3 style="color:green">Passed Tests</h3><table border="1">
  <tr><th>Test Group</th><th>Test Name</th><th>Value</th></tr><tr><td>myProg01</td><td><p style="color:green;margin:0;padding:0;">myProg01</p></td><td>30</td></tr><tr><td>myProg02</td><td><p style="color:green;margin:0;padding:0;">./myProg02 animals01.txt</p></td><td>30</td></tr><tr><td>myProg02</td><td><p style="color:green;margin:0;padding:0;">./myProg02 animals02.txt</p></td><td>30</td></tr><tr><td>myProg02</td><td><p style="color:green;margin:0;padding:0;">myProg02 empty command line</p></td><td>30</td></tr></table></div></div>

</div>



* You must check that you have followed these style guidelines: 

1. Indentation is neat, consistent and follows good practice (see below)
2. Variable name choice: variables should have sensible names.
	More on indentation: Your code should be indented neatly.  Code that is inside braces should be indented, and code that is at the same "level" of nesting inside braces should be indented in a consistent way.    Follow the examples from lecture, the sample code, and from the textbook.   


* Your submission should be on-time. If you miss the deadline, you are subject to getting a zero


Note:
*Regarding asking for "extensions": Extensions are granted only in TRUE emergencies (i.e. matters of life and death beyond the students control) and require PRIOR APPROVAL of the instructor AS SOON as the circumstances are known.   (Not weeks later "after the fact" approval.)  There must be documentation of some extra-ordinary circumstance beyond the students control (death/hospitalization of an immediate family member requiring emergency travel, hospitalization of student herself/himself), serious illness requiring medical intervention, etc.     Do not ask for extensions because of "heavy work load in my other courses", or other reasons that may  "feel" like an emergency to you, but are in fact, routine for all students.*



## Preparing for lab02: Git one-time configurations and basic work flow <a name="gitonetime"></a>

In the last assignment we used github's web interface. In this section we will learn about github's command-line tools which allow you to perform version control in a terminal. Software developers almost always prefer to use github's command line tools for version control instead of the web interface. The reason is that with the command-line tools you can (1) use your favorite editor to write your code, instead of github's simple web-based editor (2) compile and test your code, while also performing version control. 

We will see the complete workflow with the git command-line tools in the next assignment. In preparation for that we ask that you complete a few simple one-time configurations as part of this assignment and read some useful articles.

 Log into your CoE account and navigate to your cs16 directory. Then do the following steps:

* Step 1: Generate a private/public key pair and upload your public key to github. To do this refer to this tutorial: [https://ucsb-cs56-pconrad.github.io/topics/github_ssh_keys/](https://ucsb-cs56-pconrad.github.io/topics/github_ssh_keys/)

* Step 2: Set up your global user.name and user.email values. To do this type in the following commands, but change the name Alex Triton to your own real world first and last name. If you prefer, for privacy reasons, you may use your first name and last initial. Also, change the email address atriton@cs.ucsb.edu to your own @ucsb.edu email address.

```
   git config --global user.name "Alex Triton"

   git config --global user.email "atriton@cs.ucsb.edu"
```
    

* Read this article on [cloning your first repo](https://ucsb-cs56-pconrad.github.io/topics/git_cloning_your_first_repo/) and another article on [git basic workflow](https://ucsb-cs56-pconrad.github.io/topics/git_basic_workflow/). In the next assignment we will use this information to delve into the command-line tools. However, if you would like to continue exploring, try the following optional exercise.

*Optional Exercise* 

* Make sure you are in your cs16 directory on a CSIL server. You may have to go back to the articles you just read to complete these steps.

1. Open a browser and navigate to our class organization on github, available at this link: [ucsb-cs16-wi17](https://github.com/orgs/ucsb-cs16-wi17/dashboard). As shown in lecture, and in lab00, create a PRIVATE repo, with a readme and a .gitignore in our class organization. If your github username is jgaucho, your repo should be called: lab01_jgaucho

2. Open a terminal on your machine and naviagte to your cs16 directory. At the command prompt try cloning the repo that you just using the ssh address of your repo.  The ssh address can be obtained by navigating to your repo on github in a web-browser, and clicking on the green "Clone or download" button. If your repo name is 'lab00-jgaucho', the ssh address should be: `git@github.com:ucsb-cs16-wi17/lab01_jgaucho`, yours should be something similar. Cloning the repo will create a directory called `lab01_jgaucho` that contains only a README and a .gitignore. 

3. Copy all your code from your ~/cs16/lab01/ directory to your local git repo directory. You can do this using the following command, replacing jgaucho with your github username:

```
cp ~/cs16/lab01/* ~/cs16/lab01_jgaucho/
```

4. `cd` into your github lab01 directory (lab01_jgaucho). Compile and run your code. 

5. Then follow the instructions from the "git basic work flow" article to push your local changes to github. Be sure to use the *git add*, *git commit* and *git push* commands in that sequence as described by the article. Please make sure you read the article. The commands that you have to run are essentially the following:

```
git add .
git commit -m "Code for lab01"
git push origin master
```

Once you are done, open a web browser and navigate to your lab01 repo. You should see your code in github!
