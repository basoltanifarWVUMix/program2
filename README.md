
# Progam2
This is a Java implementation of basic arithmetic functions .
This application should perform following tasks
1. Addition
2. Subtraction
3. Multiplication
4. Division

## Generic Arithmetic Library
This application uses the third party Java library in order to
perform basic arithmetic functions.
The library obtained from [github repository](https://github.com/sarsdawg/arithmetic)
## Requirements :
1. [Java](https://java.com/en/download/)
2. [junit](http://junit.org/junit4/)
3. [Maven](http://maven.apache.org)

## Arithmetic library
Arithmetic library is place under **"com.generic.arithmetic"** package. 
This library is intended to be widely reuasable due to its ability to perform basic arithmetic operations on binary, octal, decimal, hexadecimal, and floating point numbers. It also performs conversions between the various types. All input for number values, regardless of type, is taken as a String. All output is given as a String as well. Base values (binary, octal, decimal, hexadecimal) are represented as the numbers 2, 8, 10, and 16, respectively, and are passed as the primitive Java int type. All functions return an error if there is an invalid base, a mismatch between the given base and one of the arguments, or invalid characters in any of the arguments.
## Acceptable Number Formats: 
in order to be able to perform arithmetic operation , user must pass base to the library.
Acceptable bases are as follow
* 2
* 8
* 10
* 16

## How to use application.

Using this application is simple, upon execution of application menu message will prompt for user describing functionality of application. User can perform arithmetic operation repeatedly till he/she specify that wishes not to continue the application by entering appropriate choice.  

## Experience integrate the library 
Using the library was simple and easy essentially i can say it was black-box reuse.

## Tests
Series of tests are available in order to verify the functionality of application.
Tests can be access under **"/Seng560-Prog2/src/test/java/com"** package. 



## Build :
mvn clean install

## JAR File
JAR files are packaged with the ZIP file format, so you can use them for tasks such as loss less data compression, archiving, decompression, and archive unpacking. These tasks are among the most common uses of JAR files, and you can realize many JAR file benefits using only these basic features.
Project JAR file can be find under
**/Seng560-Prog2/target/Seng560-Prog2-0.0.1-SNAPSHOT.jar**