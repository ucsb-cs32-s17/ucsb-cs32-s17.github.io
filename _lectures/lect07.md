---
num: "lect07"
desc: "Seperate compilation, pointers"
ready: false
pdfurl: /lectures/CS16_Lecture7.pdf
annotatedpdfurl: 
annotatedready: false
lecture_date: 2017-01-31
---

## Under the hood of program compilation and execution
* From high-level programs to machine code
* A peek into assembly code
* Making it real: Getting the compiler to show assembly code
* Creating object files and linking programs with g++
* Makefiles



## Layout of C++ programs in memory
* First order model of memory
* Program layout: text, data, bss, stack and heap
* Connections with the stored program model

## Under the hood of function calls
* Function calls use the run-time stack, we'll see how and why that's important
* Review of pass by value
* Passing parameters to functions by value


## C++ Pointers 
* Review model of computer memory
* Pointer declaration - difference/similarities with declaring basic types
* Accessing variables "indirectly" via pointers
* The address and indirection operators: "&" and "*"
* Pointer arithmetic
* Pointer pitfalls