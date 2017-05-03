---
layout: lab
num: lab04
ready: false
desc: "C++ Big-Three Review, Git/Github"
assigned: 2017-05-10 15:30:00.00-7
due: 2017-05-15 23:59:00.00-7
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

You will also be able to demonstrate that you understand the basics of working with version control using Github, using a very basic "git add; git commit; git push" workflow.

# Background

Being able to use <b>version control</b> is a <b>useful tool</b> and an <b>important job skill</b>.

In the UCSB lower-division curriculum, the main course where version control is taught is CS56.   So, it isn't a core topic of this course.

However, we will be able to do much more interesting projects if we have a few basics of version control in our toolset.

Therefore, in this lab, we are going to learn a few basic skills for:
* working with <b>git</b>, an open-source software package for peer-to-peer version control.<br><b>git</b> is open-source, free software that runs on both clients and servers, and is available for Windows, Mac and Unix.   It is what you use to interact with a git repository.
* working with <b>github.com</b>, a commercial website that provides web-based git repository hosting.<br>

## Benefits of Using Version Control

* Easier sharing of code with pair partners
    * By adding a pair partner as a collaborator on your repo, your collaborator can directly access the code at any time.  There is no need to email or copy code back and forth. And, you always have a record of which account code was committed under.
* Easier moving of code between CSIL and your own laptop/desktop machines.
    * Just commit code then push to github.com.  Then, you can clone copies of the same repo on another machine, pull from github, make changes and push them back.  You can always be sure of keeping everything in sync.
* Easier Sharing of code with TAs and Instructors
    * When asking for help from a TA or instructor, you no longer need to email any source code as an attachment.  Just add them as a collaborator on your code, and email them the URL of the repository.
    * The TA/Instructor now can see not only the code you are asking about, but the entire context of that code in your project, and the entire history of the project up to that point.
    * OR: If the repo is created in a github "organization" where your instructor and TAs have admin access, they can just see your work-in-progress code immediately.
* Saving intermediate versions
    * You can be much more fearless about removing commented out code from your source.   Just be sure you "commit" a version of your code before you rip out the commented out stuff.  Then, if you want it back, you can always get it back by visiting the previous version.    

These are just some of the benefits.


<b>Why are we using github and not bitbucket.org, or mercurial, or ... </b>

There are many choices for version control.    Everyone has their favorite, and each has its own pros/cons.     This discussion could go on (and on), but at the end of the day, we have to pick one and go with it.    This is the one we've chosen.

# Goals

By the time you have completed this lab:

* You will know how to create a public key/private key pair for use with SSH
* You will have set up an account on github.com, and installed your SSH public key
* You will have added and verified your UCSB umail address as one of the email addresses for your account on github.com
* You will be able to set up private repos on github.com in the organization for this course, ucsb-cs32-s17, and you will be able to add your pair partner (if any) as a collaborator.
* You will be able to explain a few basic concepts related to git and github, including the difference between git and github
* You will be able to "clone" a repo with <b>git clone <em>clone-url-goes-here</em></b>, and know what cloning a repo means.
* You will be able to perform the basic git workflow of:<br><b>git add</b><br><b>git commit -m "message goes here"</b><br><b>git push origin master</b>

# Step-by-Step

## Step 0: If you don't already have one, make a public/private SSH key pair

Using github.com is much easier if you have a public/private SSH key pair setup.

In this step, you'll set up a public/private key pair for your CSIL
account.  You may also later want to setup a public/private key pair
for your own laptop or home computer.

In a nutshell, the idea of a public/private key pair is this: 
* you generate them together
* you share the public key with other folks, and keep the private key a secret on your own hard drive
* anyone that has the public key can be sure that a message coming from you is definitely coming from you, because it got encrypted with the private key, and can only be decrypted with the public key.  This way, you don't have to type in your password to authenticate yourself to various sites.

To see if you already have an ssh public/private key pair set up:

* cd to your home directory
* type: <code>ls -al .ssh</code>

If you see files called id_rsa.pub and id_rsa, then you have a public/private key pair, like this:

<pre>
-bash-4.2$ cd
-bash-4.2$ ls -al .ssh
total 64
drwx------   2 pconrad faculty  4096 Apr 26  2012 .
drwx--x--x 127 pconrad faculty 16384 Mar 14 04:41 ..
-rw-r--r--   1 pconrad faculty  1051 Oct 17  2011 authorized_keys
-rw-------   1 pconrad faculty  1675 Sep 15  2008 id_rsa
-rw-r--r--   1 pconrad faculty   394 Mar  7  2010 id_rsa.pub
-rw-r--r--   1 pconrad faculty  9654 Mar 12 14:09 known_hosts
-bash-4.2$ 
</pre>

If you don't even have a .ssh directory, or if you have one, but don't see the id_rsa and id_rsa.pub  files, then follow the instructions at this link to set up a public/private key pair.

http://engineering.ucsb.edu/eci/kb/index.php?action=artikel&cat=14&id=10&artlang=en

<div class="tip">
<h1>Tip</h1>
If you encounter problems using your SSH keys later in this lab try typing one or both of these command into your command shell:
* <code>chmod 700 ~/.ssh/id_rsa</code>
* <code>ssh-add ~/.ssh/id_rsa</code>
</div>


The first command changes the permissions on your private key, ensuring that you personally have all access.  The second command adds your new private key to your SSH keyring.
<div class="tip">
<h1>Tip</h1>
'''Should I make a passphrase, or just hit enter?'''

The advantage of making a passphrase is more security.  If someone gets a copy of your private key, then they can pretend to "be you", and do anything you've authorized your private key to be able to do.   However, if your private key is protected with a passphrase, then it can't be used unless the thief knows your passphrase.

The disadvantage of a passphrase on your private key is that you have to type in your passphrase every blessed time you do anything with your public/private key pair&mdash;which sort of defeats the whole "convenience" aspect of setting it up in the first place.   Ultimately, it's your decision.
</div>

<div style="clear:both">
</div>


## Step 1: Create your github.com account if you didn't already and log in to it

Open a web browser, go to <http://github.com>.  If you already have a github.com account, login. If not, create an account.  
For your email address, use your UCSB umail address, because:

* This will allow you to request the student discount, and get unlimited private repos for free (at least as of May 2017 this was true)
* It will allow you to use a webtool setup by your instructor to automatically add you into the course organization <tt>{{page.course_org}}</tt> where you can create private repos that your instructor and TA  automatically have access to.

<div style="clear:both">
</div>

## Step 2: Upload your public key to your github account

VERY IMPORTANT: you want to upload your `id_rsa.pub` file to github.com

You do NOT upload your `id_rsa` file to github.com  That file is your <b>private</b> key, and needs to stay private and protected.

You don't actually "upload" your `id_rsa.pub` to github.com&mdash;you actually just copy and paste the value.

`cd` into your `~/.ssh` directory and use the command `cat id_rsa.pub` to have the file be printed in the terminal
like this

```
(~/.ssh)$ cat id_rsa.pub
ssh-rsa 
AAAAB3NzaC1yc2EAAAADAQABAAABAQDYySoh7b1uGpI7saLozpgXz184YYgC9k22zLH8TqKiSLAcNCO5hEzgC0kZoytCMtw/hUx3kto8
apPS4ORL6HebWXuGfzQ3nQslPpBNmto0hdo446wBu/Hl5a7pC3SZUzti4YbUjRDOBgM5zQMaopTXhtqNY/tRB8/lSSYaEtIxLN5twk29
IQUoA2wdPTmU/fRPc3PUdD9/KHJfBIL/ROsOb73tGOxqZoMnzV0ElmLhjq6WEqNWypaFrI0YU8OmIvxmlDXn0gkr3oYHqrbz5qznSust
ucWBEFZ3lekvZiXrqizFplYZF+LiG9TOGjhxujOJ+sIcCy0BCN4msb1/lguN hamstra@csil.cs.ucsb.edu
(~/.ssh)$
```

Then you want to copy the text contents of the file, starting with `ssh-rsa AAAAA...` and ending with `...@csil.cs.ucsb.edu`.

* Keep in mind that uploading a public SSH key gives access to your github account to whoever has access to the matching private SSH key on his/her computer.
* So make sure that you are using YOUR OWN public ssh key&mdash;and not the key shown in the example above.


To do this, login to the page http://github.com

Look for the gear icon in upper right to take you to the settings screen.

Click on the tool icon, and it should take you to a screen like this&mdash;you are looking for the SSH Keys menu item on the left:

<div style="float:right; width:50%">
<div style='border:1px solid black;'>
<img src="http://www.cs.ucsb.edu/~pconrad/cs32/15S/labs/lab03c/images/xXESmRI.png" alt="ssh keys menu item screenshot">
</div>
</div>


Click on that, and you'll be taken to this screen, where you can upload a new public key:

<div style="float:right; width:50%">
<div style='border:1px solid black;'>
<img src="http://www.cs.ucsb.edu/~pconrad/cs32/15S/labs/lab03c/images/z8blAzI.png" alt="upload a new public key screenshot" >
</div>
</div>

Once the key is uploaded, you're all set to be able to use
github.com in the most streamlined way possible.  What you do is
simply use the SSH version of the URL instead of the https version of
the URL when you first clone your repository.  We'll see the
difference later in this lab.

<div style="clear:both">
</div>

## Step 3: Create a repository for {{page.num}}

In this step, we will do three things:

* (1) Create a private repo called <tt>{{page.num}}\_githubid1</tt> (OR if you are in a pair, <tt>{{page.num}}\_githubid1\_githubid2</tt>.
    * Note that <tt>\_<i>githubid1</i>\_<i>githubid2</i></tt> here stand for the github ids of you and your pair partner.  The one that comes first should be the one that would appear first if you sorted your github ids in alphabetical order. (This makes it easier for us to find your repo--otherwise we have to guess).

* (2) If you are working in a pair, add your pair partner as a collaborator on the repo.
* (3) Add some text to the README.md file (this can be done directly through the website).

### Step 3a: Creating the repo

TODO: GET THIS TEXT FROM DIBA, FROM SPIS, OR FROM A CS56 assignment.

### Step 3b: Adding Collaborators (only if working in a pair)

Once you have created the repo, on the github.com website, look at the menu on the right hand side.    There is a link for <b>Settings</b>.  Click this link.

Then, under settings, look on the menu on the left hand side, and click <b>Collaborators</b>.

It may ask you to enter you username/password at this point.  This is a safety feature to be sure no-one adds an agent of organized crime or a rogue state to your account as a collaborator when your back is turned.    

Then, you are offered the opportunity to invite collaborators to your repo.  Add your pair partner by their github.com id.

### Step 3c: Editing your README.md

The README.md file can be edited directly in the github.com web interface.  This can be done by clicking on the name README.md, then clicking where it says "edit".

Please enter the following into your README.md:

* Your full name
* Your umail address
* If you are working with a pair partner, their full name and umail address as well.

You will be asked to enter more information in this file later, but for now, this is sufficient.

## Step 4. Configure your CSIL account for using git

In the github window, click on the Octocat logo upper left to go back to the main github page.  Keep that web window open, because we will need it later.  

But for now, bring up a terminal window.

### Configuring a few global options

To set up your CSIL account for using command line git, type the following commands, substituting your real name (e.g. Chris Gaucho) in place of "Your Name" and your email address (e.g. cgaucho@umail.ucsb.edu) in place of "you@example.com".

 git config --global user.name "Your Name"
 git config --global user.email you@example.com
 git config --global push.default simple

You should only have to ever do these steps once for any given computer system.  The values of these global configuration options are stored in a file called .gitconfig in your home directory.   Take a look by cd'ing into your home directory, and using the more command to list the contents of .gitconfig:

<pre>
$ cd
$ more .gitconfig
[push]
	default = simple
[user]
	name = Chris Gaucho
	email = cgaucho@umail.ucsb.edu
$ 
</pre>

The `~/.gitconfig` file is a plain text file, and the options in it can also be set by just editing this file.    Using the `git config` command is an alternative to hand editing this file, and is really just a way to be sure that the syntax ends up being right.



## Step 5: Review a few basics facts about git and github.com 

Version control is not a major learning objective for this course.  We are learning version control just as a means to an end&mdash;to be able to work with this project more effectively.   However, it is still important to learn a few basic concepts in order to be comfortable with the tool.

We need to understand the differences between, and the relationships among the following:
* a tool called "git" 
* websites called "github.com" and "github.ucsb.edu"
* repositories (or repos) on either a github web site, in a directory on our CSIL account, on our own own local machine.

=== What is git and what is a repo? ===

The software package "git" is an example of a "version control system".  (Others include SVN, Mercurial, and in a previous generations, CVS, RCS, and SCCS).

A git repo (short for repository) is nothing more than a collection of files and directories (folders), along with a special subdirectory called .git (stored only once in the top level directory of the repo) that keeps track of the complete history of the files and directories contained in the repo.     To some extent, the ".git" directory stays out of your way, and you use the files and directories in the repository exactly the same way you'd use files and directories in a regular directory.

On the other hand, keeping files in a git repository has many advantages:
* making it easier to collaborate with others on a project (whether that's an open source or closed source project)
* making it easier to recover from screwups (like deleting important files, messing up code that was previously working, complete failure of your hard drive)
* making it easier to share "works in progress" with TAs and instructors and fellow students to get help during lab, office hours, or by emai
* making it easier to share "open source" projects with others on the internet.

### What is github.ucsb.edu and github.com, and how do they differ from git?

A git repository can be local, on your file system, or it can be remote on a server somewhere on the Internet.  (We might say, using terminology that is trendy these days, that a repo on the internet is "in the cloud" if we get to remain blissfully ignorant of exactly how that service is being provided to us&mdash;i,.e. someone else is worrying about all the system management issues like keeping that server up and running, keeping it free of malware and defending from Denial of Service attacks, managing backups, etc.)

The github.com company is a commercial enterprise that runs a website called github.com.     Github.com provides a service for hosting github repositories "in the cloud".   The github.com company hosts open source projects for free (via free public repositories) and makes money by charging uses for  hosting closed source projects in private repositories.

In addition github licenses its software to various organizations that want to set up their own private "github" like servers within their enterprise.   UCSB licensed this software and set up a github server called github.ucsb.edu that is based on your CSIL account.

We will use github.com for this assignment.   You may have occasion to use github.ucsb.edu in other courses.

## Step 6: Cloning your first repo 

Go back to web browser where you have github.com open.   Find the link to your repository, and click on it.

Open a shell on your CSIL account, and cd into your ~/cs32 directory

<pre>
-bash-4.2$ cd ~/cs32
-bash-4.2$ pwd
/cs/student/bobgaucho/cs32
-bash-4.2$ 
</pre>


Now you will "clone" your repository.  This creates a copy of your repository&mdash;which is a separate repository in its own right&mdash;in your current directory (which we are assuming for this example is ~/cs32).

On the web page for your repo, look for the big green 
<span style="background-color: #28a745; color: white; padding: 3px 10px 3px 10px; border: 1px solid rgba(27,31,35,0.2); border-radius: 0.25em;white-space: nowrap; vertical-align:middle;font-weight: 600;font-size:12px;">Clone or download</span>
button.
* Click the pull down menu
* If it says "Clone with HTTPS", look for the text at upper right that says "Use SSH" and click it so that it changes to say "Clone with SSH".
* Now there should be a URL that you can copy. And if you click the little clipboard icon, it will copy that URL so that you can paste it in your terminal session.

Next, in the terminal window where you are in your ~/cs32 directory, type the command below to clone the repository into a new directory with the same name as your repo, replacing the URL shown there with the SSH URL you copied from the web page. 

<pre>
-bash-4.2$ pwd
/cs/student/chrisgaucho/cs32
-bash-4.2$ git clone git@github.ucsb.edu:username/lab04_cgaucho_dslough.git
...
</pre>

and you should see something like this.  You should only be asked for a password if you associated a passphrase with your SSH public/private key pair.


<pre>
-bash-4.2$ git clone git@github.ucsb.edu:username/lab04_cgaucho_dslough.git
Cloning into 'lab04_cgaucho_dslough.git'...
remote: Counting objects: 8, done.
remote: Compressing objects: 100% (5/5), done.
remote: Total 8 (delta 0), reused 4 (delta 0)
Unpacking objects: 100% (8/8), done.
-bash-4.2$ 
</pre>

This should create a new directory called lab04_cgaucho_dslough (or whatever your github ids are.)

`cd` into that directory and use the `ls` command to list the files.

```
$ ls
lab00 lab01 lab02 lab03 lab04_cgaucho_dslough
$ cd lab04_cgaucho_dslough
$ ls
README.md
$ 
```

Congratulations&mdash;you have now cloned your repository!

Next, we are going to do a few things with this repository.

## Step 7: Get the {{page.num}} starter code into your repository directory 

First, let's understand what a git repository is.

A git repository (or repo, for short), is:
* an ordinary directory hierarchy (i.e. a folder, possibly with subfolders),
* with a hidden <code>.git</code> directory in the top level directory of the hierarchy. 

The hidden .git directory contains:
*  the file <code>config</code> which controls the repository, 
* some other configuration information,
* additional files and directories that represent a data structure which is the <em>entire history of every commit, every commit message, and every intermediate version of every file</em> that has ever been committed to the repository.

Outside of this .git subdirectory, everything works just like it normally does.  You interact with files in exactly the same way your ordinarily would.    

* Files in the repository directory are only a part of the git repository if you <b>add</b> them and <b>commit</b> them to the repo. 
* We typically only add source files, e.g. Makefile, .h, .cpp etc.
* We typically do NOT add .o files or binary files to the repo.   These are ignored, or just "not added" to the repo.  They "hang out" in the repo folder, but are not offically "part" of the repo.  

### Step 7a: Copy instructor starter code into your repo directory ==

In this step, we are going to copy the {{page.num}} starter files from the instructors directory into this repository.

The files are in the instructors directory at 

<tt>{{page.code_dir}}/*</tt> 

The `*` here stands in as a "wildcard" that matches "all files".

You want to copy these files into your repo directory, which is <tt>~/cs32/lab04_cgaucho_dslough</tt> (for example).

If you `cd` into that directory first...

```
cd ~/cs32/lab04_cgaucho_dslough
```

... then you can use the period (`.`) to refer to "current directory".  So to copy the files into your repo, you can use this command.  Pay attention to the `.` at the end of the line.    Note that it is separated from the part that comes in front by a space.

<tt>cp {{page.code_dir}}/* .</tt>

After you do that, you'll do three steps to get these into the github.com copy of the repo.  The rest of "step 7" covers the details of that.

== Step 7b: Understanding Workflow: add, commit and push  ==

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


=== What's a ''workflow''?  What's a ''commit''? What's a ''push''? ===

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

=== Preview ===



=== Step 7c: Do a <code>git pull</code> ===

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

=== Step 7d:  Do a <code>git status</code> and/or a <code>git diff</code> ===

The next step before committing a change is to use the <code>git status</code> command to see what's up.   Specifically, we need to see which files may have changed since the last commit, and decide which of those changes we want to make part of our commit.   

Remember:
* A commit is typically a LOCAL operation&mdash;it doesn't touch the server.   
* A pull or a push is typically an operation involving the SERVER, and we have to authenticate either via SSH or with a username/password.

Here is what  a git status looks like:

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
