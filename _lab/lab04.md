---
layout: lab
num: lab04
ready: false
desc: "C++ Big-Three Review"
assigned: 2017-05-17 15:30:00.00-7
due: 2017-05-23 23:59:00.00-7
code_url: https://www.cs.ucsb.edu/~aduncan/cs32/s17/labs/lab04
code_dir: ~aduncan/cs32/s17/labs/lab04
submit_cs_project_num: TBD
example_repo: lab04_cgaucho_dslough
---

<div style='display:none'>
https://ucsb-cs32-s17.github.io/lab/lab04/
</div>

# Goals

By the end of this lab, given a description of a class containing data members that point to structures on the heap, you will be able to:

* write a correct copy constructor for the class
* write a correct destructor for the class
* write a correct assignment operator for the class


# Step-by-Step


## Step 7: Get the {{page.num}} starter code into your repository directory 



In this step, we are going to copy the {{page.num}} starter files from the instructors directory into your <tt>~/cs32/{{page.num}}</tt> directory.

The files are in the instructors directory at 

<tt>{{page.code_dir}}/*</tt> 

The `*` here stands in as a "wildcard" that matches "all files".

You want to copy these files into your <tt>~/cs32/{{page.num}}</tt> directory.

By now you should know (or remember) how to copy files; if you need a refresher, see earlier labs.

## Step 7b: Understanding Workflow: add, commit and push  

The next few steps are related to using git.   They would be the same steps whether you were working with Java, C, C++, Python, or even plain text files.    These are the steps that you'll want to get very accustomed to, because they represent a typical "workflow" in git&mdash;the workflow you'll use when working on an simple, single author, individual project.

Any time we add files to our repo, or make some changes to one or more of the files, if we want to keep those changes, we need to go through a "workflow" to get those changes get "committed" and "pushed".   First we'll describe what that means, then we'll show how to do it.

These steps are previewed here (the part represented by ... represents additional details we'll cover in a moment.)

* <b>git add ...</b> which <em>stages</em> files, i.e. indicates they are going to be part of the next <em>commit</em>
* <b>git commit ... </b> which <em>commits</em> files as a group to the <em>local</em> copy of the repository (the one in your CSIL account)
* <b>git push ... </b> which <em>pushes</em> the commit(s) in your local repository to the original repository on github.com that you cloned from.  

This last step, the <b>git push</b> step, is important, because it makes a "backup copy" of your work on the github.com server.  This has several benefits over just having the code only in your CSIL account:

* It provides a way for you to see the entire history of your project in a convenient web interface
* It provides a convenient way to move code between and among your CSIL account, your laptop, and your desktop machines, keeping everything in sync.
* By adding "collaborators" on the github.com, you can share code securely with pair-partners, TAs, and instructors and keep everything in sync.   And, when the repo is part of an "organization" on github.com, anyone that is an "owner" of that organization automatically gets access (this is how your TAs and instructor can see your work.)
* In the case of public repos on github.com, you can share open source code with anyone with internet access.  This is a great way to put "side-projects" on your resume so that potential employers can see your work.


### What's a ''workflow''?  What's a ''commit''? What's a ''push''? 

The word '''workflow''' is often used to describe a typical sequence of steps you go through to interact with a version control system to use it effectively.   In particular, it describes how the use of the tool fits in with the other parts of software development that you are already used to, such as editing code, compiling code, and testing code.

As you make changes to a repository&mdash;adding/deleting files or directories, renaming files, editing files&mdash;at a certain point, you should periodically '''commit''' those changes.    

When should you commit?   Often.   Typically, after each edit or set of edits that successfully accomplishes some goal, however small.   
* Get in the habit of committing any time you have improved your code in some way (e.g. you've added a few lines of code or some comments, and the code compiles, and nothing that was working before is now broken.)

It is typically NOT a good practice to commit changes that make the code "worse" (e.g. break something or cause it to no longer compile).  This is especially true in projects with multiple developers (the rule is sometimes called "don't break the build").   

But that's not a hard-and-fast rule.  It depends on the situation.     For now, I'd suggest you err on the side of committing TOO often, rather than the other way around.   The idea of a commit is that it is a checkpoint that you can roll back to if necessary.    Any commit can be "undone".  

And as long as you '''push''' your commits to the github.com server in the cloud, you'll be able to recover every commit you've ever made, even if the system where you are working (e.g. CSIL) is wiped out by a fire, earthquake or tsunami (along with all the CSIL backups.)

'''The difference between a commit and a push''' is this: 
* in general, a '''commit is local'''
* a push copies the '''results of a commit to a remote server'''.

To understand this, you need to understand what happened when you did the first "git clone" command in this lab.

To start with, the <tt>{{page.example_repo}}</tt> repository existed in only one place: on the github.com server.        Then you cloned it with "git clone" into a subdirectory of your ~/cs32 directory on your CSIL account.  Now there are TWO repositories, not ONE.

That's worth repeating: after you clone a repository, you now have TWO SEPARATE REPOSITORIES. For example, this in case:
* a REMOTE repository called <tt>{{page.example_repo}}</tt> that lives on github.com (git calls this the "origin master") 
* a LOCAL repository called <tt>{{page.example_repo}}</tt> that lives in your current directory.

When you "commit" a change, you are committing it in your LOCAL copy of the repository.

When you "push" that commit, you are updating the REMOTE copy on github.ucsb.edu.

Ok, now that we've talked through what we are about to do, let's actually do it.


### Step 7c: Do a <code>git pull</code> 

Normally, if we were working with other people, or perhaps doing work on more than one system (e.g. sometimes working on our laptop, sometimes our desktop machine at home and sometimes on CSIL), the first step before doing a commit is always to do a <code>git pull</code>.    The <code>git pull</code> command ensures that we get the latest updates from elsewhere, in case there are any.  

In this case, we probably don't need to do that, because we've just been working with this one clone of this one repo, but just because we want to establish a good set of habits, let's start with the <code>git pull</code>.   

```
-bash-4.2$ git pull
Already up-to-date.
-bash-4.2$ 
```

Unless you made any edits to your README.md  after your did the "git clone" command, there aren't any changes  that you need to pull from the origin repo (the one you cloned from).  So the message "Already up-to-date" is most likely what you will see.

If you did make changes to the README.md after cloning, this is where you'll update the local repo with those changes.

<em>Get in the habit of doing a <b>git pull</b> anytime there is a possibility that changes have been made elsewhere.</em>  Otherwise, you may end up with a <em>merge conflict</em> later when trying to push your changes back to github.ucsb.edu.

### Step 7d:  Do a <code>git status</code> and/or a <code>git diff</code> 

The next step before committing a change is to use the <code>git status</code> command to see what's up.   Specifically, we need to see which files may have changed since the last commit, and decide which of those changes we want to make part of our commit.   

Remember:
* A commit is typically a LOCAL operation&mdash;it doesn't touch the server.   
* A pull or a push is typically an operation involving the SERVER, and we have to authenticate either via SSH or with a username/password.

Here is what  a `git status` looks like:

```
-bash-4.2$ git status
On branch master
Your branch is up-to-date with 'origin/master'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)

(list of untracked files will appear here)

nothing added to commit but untracked files present (use "git add" to track)
-bash-4.2$    
```

We can see that we've made a change to some `.h`, `.cpp` and the `Makefile`, and these changes haven't been committed.  

To tell git that we want these files to be part of our commit, we use the command `git add`, which is the next step.   

### Step 7e:  Use <code>git add</code> to add files into the commit 

Nothing goes into a commit unless we specifically tell git we want it to be a part of the commit.    The git status command can be used to tell us what we might want to add to the commit, but ultimately, it is up to us to make this choice.  

Type the following: <code>git add *.h</code>

It should look like this:

```
-bash-4.2$ git add *.h
-bash-4.2$ 
```

It typical 'unix command" fashion, there is no output, which means "it worked."  But if we want to really see that it worked, we can type "git status" again:

```
-bash-4.2$ git status
# On branch master
# Changes to be committed:
#   (use "git reset HEAD <file>..." to unstage)
#
#	modified:   (list of .h files will appear here)
#
-bash-4.2$ 
```

Now do the same thing to add the `.cpp` files and the `Makefile` into the next commit.  Use the <code>git status</code> command to make sure this worked.


### Step 7f:  Use <code>git commit -m "some message here"</code>

This will to commit these files to the LOCAL repository (the one in our CSIL directory.)

When we commit, we need to add a message that describes what change we made to the file.  These are typically short.   We might say, for example, how many of our tests cases are currently passing.  If its all of them, say that. If it none, say that.  If its some, say which ones.

For example, in this case our message might be:


```
git commit -m "lab03 with first 3 tests passing"
```

Here's an example:

```
-bash-4.2$ git commit -m "lab03 with first 3 tests passing"
[master 7180ef4] Some change goes here @@@
 1 file changed, 7 insertions(+), 1 deletion(-)
-bash-4.2$ 
```

Note that there is a hex number that goes with the commit&mdash;in this case, 7180ef4.    That hex number is the first few hex digits of the SHA-1 Hash of the contents of the entire repository, and is the identifier by which this commit is known to the git system.    Those numbers will be important later.  For now, just notice that each time you commit a change, this hex number changes.

{{FloatRightStart|40%}}
<img src="http://www.cs.ucsb.edu/~pconrad/cs32/15F/labs/lab03/images/25/thrown.into.vi.on.commit.png" alt="thrown into vi on commit">
{{FloatRightEnd}}

<div class="tip">
<h1>Tip</h1>
'''Help!  I tried the commit command and my screen went all weird!'''

If you see something like the picture at right when doing a commit command, it means you forgot the -m, or somehow the -m got messed up.

So, the git commit command put you in the vi editor so you could finish typing the message.  This is all well and good if you know how to edit in vi.  In that case, just type your commit message, then type escape, and use ''':wq''' to save your changes.  Then your commit will go through just fine.

But if you don't know how to edit in vi, you are likely to be very confused.  To get out, just type escape, then ''':q!'''   

Then try your commit again.

A final note: if you set the environment variable GIT_EDITOR to the editor of your choice, then you can use emacs, or whatever in place of vim if/when you forgot to type in a commit message.
</div>

<div style="clear:both;">
</div>

### Step 7g:  Use <code>git status</code> to see the status now

It you now type git status, you'll see this message.  Read it carefully (it helps if you read it out loud.)

```
-bash-4.2$ git status
# On branch master
# Your branch is ahead of 'origin/master' by 1 commit.
#   (use "git push" to publish your local commits)
#
nothing to commit, working directory clean
-bash-4.2$ 
```

The important part here is that you are being told that you need to git push to "publish" your local commits.  That is, your commits are currently only in your local repository.  When you "publish" them, you push the back to the "origin/master" branch of your repository at github.ucsb.edu&mdash;which is the one that your instructor and/or TA will look at to give you a grade.

So, let's push the changes there, because you certainly want your instructor/TA to see the results of all your hard work!

### Step 7h: Use <code>git push origin master</code> to push the changes to github.com

Type "git push".  In this case, this is short for "git push origin master", which means "push all my local changes up to the master branch at the origin of this repository, the main repo at github.com".

Here's what that should look like.  

```
-bash-4.2$ git push origin master
Counting objects: 5, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 563 bytes, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.ucsb.edu/username/cs32-f15-lab03.git
   2d598d9..7180ef4  master -> master
-bash-4.2$ 
```

### Step 7i: Seeing the effect on github.com

Until you do the git push command, if you go to your repo on github.com, the changes you make aren't there.  But now, your changes will be there.

Go to the github.com page for your repo.

You should be able to click on a file name and see the contents, and see the "message" for your commit show up beside each file that was changed.

### So what's the big deal? 

This may not seem very exciting at this point---you may wonder what all the fuss is about.   And to be clear, the value of all this isn't really very apparent when we are dealing with one person making one change in one file.   But, as we work with this over the weeks ahead, with much larger projects, the benefits will become clear.  So, be patient and stay tuned.

<div style="clear:both;">
</div>

## Step 8: Actually starting the work of coding {{page.num}}!

Now, we are ready to to actually start working on coding for {{page.num}}.

In this week's lab, you have the following files:

* `Makefile`
* `student.h`, `student.cpp`
* `studentRoll.h`, `studentRoll.cpp`
* `studentTest00.cpp`, etc.
* `studentRollTest00.cpp`, etc.

Your job is, as usual, get all the test cases to pass.  This involves implementing the "big three": Copy Constructor, Overloaded Assignment Operator, and Destructor.

In addition to the regular test cases, there are also "leakTests".  
This involves running a utility called <code>valgrind</code> on your code to see whether there are any memory leaks, 
or other problems involving memory management.    You will only pass the tests if your code has proper memory management.

You will submit only the `student.cpp` and `studentRoll.cpp` files.  
As a result, there are two quite annoying things that you'll just have to put up with:

* In the `Student` class, the <code>name</code> attribute is implemented with a C-string that is 
   allocated with dynamic memory on the heap.  This is annoying.  Your might prefer to use the std::string class.  
   Of course you would.  But, that's not the point of this assignment.  
   The point of this assignment is to know whether you can manage memory properly.

* In the `StudentRoll` class, the list of students is a linked list of structs rather 
   than an <code>std::list&lt;Student&gt;</code> or <code>std::vector&lt;Student&gt;</code> or something.   
   This is indeed annoying.  Tough.   We are training you for the situation where you don't have any choice, 
   but have to work with the data structures you are given.

In certain later assignments, you will be given the freedom to choose whatever data structure or implementation is appropriate.  You'll be able to decide whether to use `std::string`, or C-strings, whether to use array or `std::vector`, etc. <em>This is not one of those assignments.</em>

### Suggested way to proceed 

I suggest proceeding in the following steps:

* (1) Work on each test file for student, getting those tests to pass, i.e. `testStudent00.cpp`, `testStudent01.cpp`, etc.
   * To get these to pass, you need to implement, possibly among other things, the Copy Constructor and Overloaded Assignment Operator for `Student`
   * After each increment of progress, do the steps: git add, git commit -m "describe what you did", git push origin master
* (2) Then, try to get the leak tests to pass as they pertain to `Student`, i.e. 
   * <code>make lts00</code>
   * <code>make lts01</code>
   * <code>make lts02</code>
   * <code>make lts03</code>
   * This will require implementing the destructor for `Student`
   * Do a git add, commit, push on your changes when you are successful!  Include a reasonable commit message.
* (3) Work on each test file for `StudentRoll`, getting those tests to pass, i.e. `testStudentRoll00.cpp`, `testStudentRoll01.cpp`, etc.
   * To get these to pass, you need to implement, possibly among other things, the Copy Constructor and Overloaded Assignment Operator for `StudentRoll`
   * After each increment of progress, do the steps: git add, git commit -m "describe what you did", git push origin master
* (4) Then, try to get the leak tests for StudentRoll to pass, i.e.
   * <code>make ltsr00</code>
   * <code>make ltsr01</code>
   * <code>make ltsr02</code>
   * This will require implementing the destructor for `StudentRoll`
   * Do a git add, commit, push on your changes when you are successful!  Include a reasonable commit message.

### How do I know if I'm done? 

When you are done, you should be able to do both of the following, and see no error messages:

```
make tests
make leaktests
```

# Submission

To submit, use:


<tt>~submit/submit -p {{page.submit_cs_project_num}} student.cpp studentRoll.cpp</tt>


Also, make sure your code is pushed to your repo on github.com

# Grading 

* (300 pts) {{page.num}}a: Test cases on submit.cs, as indicated on that system.

* {{page.num}}b: github.com repo created correctly, and github workflow correct:
   * (20 pts) github.com repo exists with correct name and is private
   * (20 pts) repo has correct name, 
   * (20 pts) pair-partner added as collaborator (if applicable)
   * (20 pts) README.md edited as indicated in instructions with additional information
   * (10 pts) Multiple commits, with incremental progress towards final completion
   * (10 pts) Commit messages are meaningful.
