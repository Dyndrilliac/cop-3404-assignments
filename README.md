*******************************************************************

* Title:     COP 3404 Assignments
* Author:    [Matthew Boyette](mailto:Dyndrilliac@gmail.com)
* Professor: Dr. Sandeep Reddivari
* Term:      Spring 2015

*******************************************************************

This code makes use of my [Custom Java API](https://github.com/Dyndrilliac/java-custom-api). In order to build this source, you should clone the repository for the API using your Git client, then import the project into your IDE of choice (I prefer Eclipse), and finally modify the build path to include the API project. For more detailed instructions, see the README for the API project.

*******************************************************************

* Project 1
* 2/11/2015

*******************************************************************

The purpose of Project 1 is to implement an efficient hash-based symbol table for the first and second passes of the SIC/XE assembler. It makes use of prime numbers, double hashing, hash chaining, and automatic size adjustment to avoid collisions.

**File Listing (*in alphabetical order*):**

* COP3404Project1Code.java
* input1.txt
* input2.txt

**Execution:**

* You can run the program using the java command.
	* Example: 'java COP3404Project1Code input1.txt'
* Replace 'input1.txt' above with the name of any other plain-text file to supply custom test input.
* You can also chain together multiple input files.
	* Example: 'java COP3404Project1Code input1.txt input2.txt'

*******************************************************************

* Project 2
* TBD

*******************************************************************

The purpose of Project 2 is to develop a simple SIC/XE program and to become more familiar with writing assembly language code.

*******************************************************************

* Project 3
* 3/27/2015

*******************************************************************

The purpose of Project 3 is to interface with Project 1 and implement the first pass of the SIC/XE assembler.

**File Listing (*in alphabetical order*):**

* COP3404Project3Code.java
* Testfile1.txt
* Testfile1.txt.pass1-results
* Testfile2.txt
* Testfile2.txt.pass1-results

**Execution:**

* You can run the program using the java command.
	* Example: 'java COP3404Project3Code Testfile1.txt'
* Replace 'Testfile1.txt' above with the name of any other plain-text file to supply custom test input.
* You can also chain together multiple input files.
	* Example: 'java COP3404Project3Code Testfile1.txt Testfile2.txt'
	
**Results:**

The results of the first pass will be output to a plain-text file in the same directory as the input file with '.pass1-results' appended to the input file name.

*******************************************************************

* Project 4
* 3/27/2015

*******************************************************************

The purpose of Project 4 is to interface with Project 1 and implement the second pass of the SIC/XE assembler.