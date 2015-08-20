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
	* **Example:** 'java COP3404Project1Code input1.txt'
* Replace 'input1.txt' above with the name of any other plain-text file to supply custom test input.
* You can also chain together multiple input files.
	* **Example:** 'java COP3404Project1Code input1.txt input2.txt'

*******************************************************************

* Project 2
* 3/1/2015

*******************************************************************

The purpose of Project 2 is to develop a simple SIC/XE program and to become more familiar with writing assembly language code. Please see the [project specifications](https://github.com/Dyndrilliac/cop-3404-assignments/blob/master/Specifications/Project%202%20Specifications.pdf) for more details about the specific program requirements.

**File Listing (*in alphabetical order*):**

* COP3404Project2Code.asm
* COP3404Project2Code.lst
* COP3404Project2Code.obj
* sic.log

**Execution:**

* See the accompanying [sic.log](https://github.com/Dyndrilliac/cop-3404-assignments/blob/master/Project2/sic.log) file for the SICSIM execution log and the memory dump which shows the program's working as intended.

*******************************************************************

* Projects 3 & 4
* 3/27/2015 - 4/23/2015

*******************************************************************

The purposes of Projects 3 and 4 are to interface with Project 1 and implement the first and second passes of the SIC/XE assembler, respectively. Since they are so closely interconnected, I have decided to implement the two algorithms as separate methods within a [SICXE_AssemblerProgram](https://github.com/Dyndrilliac/java-custom-api/blob/master/api/util/sicxe/SICXE_AssemblerProgram.java) class. For this reason, these two projects have effectively been combined into a single repository.

**File Listing (*in alphabetical order*):**

* COP3404Project3Code.java
* Testfile1.txt
* Testfile1.txt.lst
* Testfile1.txt.obj
* Testfile1.txt.pass1-results
* Testfile2.txt
* Testfile2.txt.lst
* Testfile2.txt.obj
* Testfile2.txt.pass1-results
* Testfile3.txt
* Testfile3.txt.lst
* Testfile3.txt.obj
* Testfile3.txt.pass1-results

**Execution:**

* You can run the program using the java command.
	* **Example:** 'java COP3404Project3Code Testfile1.txt'
* Replace 'Testfile1.txt' above with the name of any other plain-text file to supply custom test input.
* You can also chain together multiple input files.
	* **Example:** 'java COP3404Project3Code Testfile1.txt Testfile2.txt Testfile3.txt'
	
**Results:**

* The results of the first pass will be output to a plain-text file in the same directory as the input file with '.pass1-results' appended to the input file name.
* The results of the second pass will be output to two plain-text files in the same directory as the input file. One will have '.lst' appended to the input file name, and the other will have '.obj' appended to the input file name. These two files represent the listing file and object file, respectively.