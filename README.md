https://revature.zoom.us/j/7841280666

Day 1

Git	-	https://git-scm.com/download/win
Jdk1.8	-	uninstall any other versions of jdk and install jdk 1.8
IntelliJ	- 	https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC	


Java
==========

JDK	- Java Development Kit
JVM	- Java Virtual machine
JRE	- Java runtime Environment

JDK
	-JVM - 
	-JRE - used to run java applications

JRE	- just run
	JVM


Java is platform independent, it is because of JVM



void main()
{
}

java is case sensitive.
statements must be terminated by semi colon (;)


java - compile the code ( compiler)
1) check for the syntax errors
2) They will generate bytecode	(Hello.java --> Hello.class)


Naming conventions in java
==================

class name must begin with upper case

HelloWorld
Revature
Employee
Customer
Product
String


variables
must start with a lowercase 

helloWorld
hello_world
employeeName

methods
helloWorld()
displayRecord()

final variable
ALL CAPS

AGE
APPLY_AGE

eage
empAge
employeeAge

packages
=============
alllowercase


Modularity
================

main method is a special method which JVM calls

15 minutes
checkUserDetails()
This method must be called before displaying details



packages in java
	benefits of packages
		easy accessible
		maintain
		security
		name conflict

two types of packages
	built in		- java.lang,java.util, java.sql
	user defined
	

	String 	- java.lang	( automatically imported in all java classes)

access specifiers in java


folders

import hr.*;


import hr.Salary;
import hr.Tax;

===================================


hr
	Salary
	Tax	


finance
	Company
	Investors


Write one method in every class and call it in main method

15 minutes 




================================
Access specifiers in java
-------------------------------

public		- least access specifier , ec
private		- most restrictive one
protected		- same package and all child classes (irrespective of package)
default		- same package



10:00 AM EST


https://revature.zoom.us/j/96121243699?pwd=djhsQzJiMnp0VUwvcGZLMmNRb1dQQT09







QC			- 
Quiz	
Coding challenge

=======================
Day 2 agenda
Hardware fundamentals
CPU/Processor/OS
Garbage Collection
Stack & heap


Control Flow statements
if else
switch
nested if else


Primitive data types
	
int 
byte
short
long


float
double

char

boolean



Code structure in java
---------------------------
put your class in file
put your methods in class
put your statements in methods



package day2;

public class ControlFlowDemo {
    
    int num=10;
    int age;
    age = 99;
  
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}



WAP to check the highest number between the three.

num1=981
num2=867
num3=93

The highest number is : num1




15  minutes


Operators
==============
Arithmetic

++
--

+

=
>
<
Logical Operators
		Short circuit
& 		&&
|		||



&
&&

condi1 &	condi2 &	condi3


condi1 && condi2 &&  condi3



num1=10
num2=20

num2=10
num1=9

OUT	-9

num2=9
num1=10

OUT - 9


OUT - 19

Ternary Operator.
age

?:



			


Operators



Constructors
-----------------
	- special method
	- get called automatically whenever you create an object
	- same name as the class name
	- not have any return type, not even void
	- it is used for initialization
	- can be overloaded



public class Customer
{
	String customerName="Ananda";
	public Customer(){
		customerName="Daniel";
	}
	public void changeName(){
		customerName="Andrew";
	}
	public static void main(String args[]){
		Customer cust = new Customer();

		System.out.println(cust.customerName);
	}

}


cust.customerName="Daniel"










Methods and parameters
Order of initialization







Employee

	employeeId
	employeeName


	Create default cons
		employeeId=-1
		employeeName="NA"


	Paramertized cons
		



	Employee e1 = new Employee();
	System.out.println(e1.employeeId);		//-1
	System.out.println(e1.employeeName);	//NA


	Employee e2 = new Employee(181,"Opeyemi");
	System.out.println(e1.employeeId);		//181
	System.out.println(e1.employeeName);	//Opeyemi



static

Num 1 : 11
Num 2 : 19
Num 1 : 100
Num 2 : 200

package day2;
//QC : static keyword in java :
//Ans :The static keyword in Java is used to share the same variable or method of a given class
//The static keyword belongs to the class than an instance of the class.
//Real Time Scenario : count number of objects created
public class StaticDemo {
    int num1=10;
    static int counter=0;
    static int num2=20;
    public void changevalue(){
        num1--;
        num2++;
    }
    public static void changeValueAgain(){
          num2++;
    }
    public static void main(String[] args) {

            StaticDemo d1 = new StaticDemo();
            d1.counter++;
            d1.changevalue();
            StaticDemo d2 = new StaticDemo();
              d2.counter++;
            d2.changevalue();
            StaticDemo.changeValueAgain();
            System.out.println("D1 num1 :"+d1.num1);
            System.out.println("D1 num2 :"+d1.num2);

            System.out.println("D2 num1 :"+d2.num1);
            System.out.println("D2 num2 :"+d2.num2);
            //9 23 9 23

        System.out.println("No of objects created :"+d1.counter);
    }
}




---------------------------------------------------------------------------------

Order of initialization

static block,
 In main
W constructor
instance block
Z constructor
W constructor
instance block
Z constructor



Stack 
function calls
primitive data types (int, double, etc.) and 
local and reference variables of the functions are stored



Heap

object



QC**
Scopes of a variable
======================

instance scope
class scope	-static/global
local scope
block scope




Constuctor
Order of initalization
Overloading
instance scope
class scope	-static/global
local scope
block scope




Product

	productId
	productName
	quantityOnHand
	price


	count number of objects


	* Use initialzer block and static intializer block to initilize the member variables

	* Create default cons to initialize productId=100, productName=Lakme,quantityOnHand=100, price=90

	*Create parametrized cons to assign different product values
		201, Aroma, 900, 899
		
		202, Pendrive , 877, 99

	* create one  to calculate the bill for a product

	int calculatePrice(Product product)
	{	
		//create local variable total
		product.quantityOnHand * product.price;
	}

	

	main()
	{
		Print the bill for all the products

		Aroma : 809100

		Total products : totalNumberOfObjects
	}







Week 1 Java DevOps/SRE (AWS) QC w/Tufail - Auditors (HH/ES)
Wednesday, 5/11/2022
10:30 AM EST



Agenda - Day 3
-----------------------
Review - Constructor
class Employee
{

    public Employee(String name) {
    }

    public Employee() {

    }
}

public class ConstructorDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        //java provides default constructor in every class if no constructor is there
        Employee e2 = new Employee("Daniel");
    }
}


OOPS concepts		**


As the name suggests, Object-Oriented Programming or OOPs refers to languages that uses objects in programming. 

Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc in programming. 



The main aim of OOP is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function. 


Access Modifier: Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers. 
public: accessible in all class in your application.
protected: accessible within the package in which it is defined and in its subclass(es)(including subclasses declared outside the package)
private: accessible only within the class in which it is defined.
default (declared/defined without using any modifier): accessible within same class and package within which its class is defined.



The return type: The data type of the value returned by the method or void if does not return a value.
Method Name: the rules for field names apply to method names as well, but the convention is a little different.
Parameter list: Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().
Exception list: The exceptions you expect by the method can throw, you can specify these exception(s).
Method body: it is enclosed between braces. The code you need to be executed to perform your intended operations.
Message Passing: Objects communicate with one another by sending and receiving information to each other. A message for an object is a request for execution of a procedure and therefore will invoke a function in the receiving object that generates the desired results. Message passing involves specifying the name of the object, the name of the function and the information to be sent.

Now with basic prerequisite to step learning 4 pillar of OOPS is as follows. Let us start with learning about the different characteristics of an Object-Oriented Programming language


Abstraction	- showing only relevant information
Encapsulation	- hiding the irrelavant information
Polymorphism	- many forms . patient
		overloading
Inheritance	- Re usability	, extends

OOPs Concepts are as follows: 

Class
Object 
Method and method passing
Pillars of OOPS
Abstraction
Encapsulation
Inheritance
Polymorphism
Compile-time polymorphism
Run-time polymorphism

---Class
A class is a user defined blueprint or prototype from which objects are created. 
It represents the set of properties or methods that are common to all objects of one type. 
In general, class declarations can include these components, in order: 

Modifiers: A class can be public or has default access (Refer this for details).
Class name: The name should begin with a initial letter (capitalized by convention).
Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
Body: The class body surrounded by braces, { }.

public class Product extends Demo implements Hello,Thanks
{
	int productId;
	
	public void addProduct()
	{
	
	}
}

Object is a basic unit of Object Oriented Programming and represents the real life entities. 
A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of: 

State : It is represented by attributes of an object. It also reflects the properties of an object.
Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects.
Identity : It gives a unique name to an object and enables one object to interact with other objects.

Method: A method is a collection of statements that perform some specific task and return result to the caller. A method can perform some specific task without returning anything. Methods allow us to reuse the code without retyping the code. In Java, every method must be part of some class which is different from languages like C, C++ and Python. 


Methods are time savers and help us to reuse the code without retyping the code.
Let us now discuss 4 pillars of OOPS:

Pillar 1: Abstraction

Data Abstraction is the property by virtue of which only the essential details are displayed to the user.The trivial or the non-essentials units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components.
Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviours of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.
Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of car or applying brakes will stop the car but he does not know about how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of accelerator, brakes etc in the car. This is what abstraction is. 
In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.

Pillar 2: Encapsulation

It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield. 

Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.
Todo---------------
Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.

Pillar 3: Inheritence 

Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class. 

Let us discuss some of frequent used important terminologies:

Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
Sub Class: The class that inherits the other class is known as subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

Pillar 4: Polymorphism

It refers to the ability of OOPs programming languages to differentiate between entities with the same name efficiently. This is done by Java with the help of the signature and declaration of these entities. 

Note: Polymorphism in Java are mainly of 2 types: 

Overloading	- Compile time polymorphism
Overriding 	- Later today - Run time polymorphism
Example


// Java program to Demonstrate Polymorphism
 
// This class will contain
// 3 methods with same name,
// yet the program will
// compile & run successfully
public class Sum {
 
    // Overloaded sum().
    // This sum takes two int parameters
    public int sum(int x, int y)
    {
        return (x + y);
    }
 
    // Overloaded sum().
    // This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
 
    // Overloaded sum().
    // This sum takes two double parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }
 
    // Driver code
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}


Arrays
==============

continous memory location

int num1,num2,num3,num4,num5;

int []num = new int[5000];

-subscript starts from 0
num[0]

int marks[] = { 23,78,91,87,65,87,87};

for(int i=0;i<5;i++)
{
	System.out.println(marks[i]);
}


for(int i=0;i<marks.length;i++)
{
	System.out.println(marks[i]);
}


String names[] = new String[5];

names[0] = "Jay";
names[1] = "Daniel";
names[2] = "Richard";
names[3] = "Tarun";
names[4] = "Ahmed";


//TODo - Please print all the names



this keyword in java 
----------------------------
without chaining

###Print product1 details
Product Id :-1
Product Name :NotAvailable
Product QOH :-1
Product Price :-1
###Print product2 details
Product Id :122
Product Name :Lakme
Product QOH :100
Product Price :30
###Print product3 details
Product Id :123
Product Name :Pendrive
Product QOH :0
Product Price :0
###Print product4 details
Product Id :124
Product Name :null
Product QOH :99
Product Price :100

----------------------------------------
###Print product1 details
Product Id :-1
Product Name :NotAvailable
Product QOH :-1
Product Price :-1
###Print product2 details
Product Id :122
Product Name :Lakme
Product QOH :100
Product Price :30
###Print product3 details
Product Id :123
Product Name :Pendrive
Product QOH :-1
Product Price :-1
###Print product4 details
Product Id :124
Product Name :NotAvailable
Product QOH :99
Product Price :100

































Inheritance
-------------------
extends

Employee					super/base/parent
	int employeeId

PermanentEmployee extends Employee

ContractEmployee extends Employee		sub/derived/child/


super

*child class can access parent class resources without creating an object
* super keyword is there to acccess super class methods and variables

Object class

	//Object class is the super class for all the classes in java



	* multiple inheritance is not allowed in java 

	extends Employee,Product


//is- a test

Overrding
===========
In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.



public
private
default
protected



Public, protected,default,private
public, default, protected, private
public, protected, default, private
public,default,protected private.


public
proctected
default
private

* while overriding , you can increase the accessbility, you cannot decrease it




**Difference between overriding and overloading
The difference between overloading is that overloading is when you change the parameters of a method while in the same class and overriding is when you change the implementation of a method in a child class


S.NO	
Method Overloading					Method Overriding



1.	Method overloading is a compile-time polymorphism.	Method overriding is a run-time polymorphism.
3.	It occurs within the class.	It is performed in two classes with inheritance relationships.
4.	Method overloading may or may not require inheritance.	Method overriding always needs inheritance.
5.	In method overloading, methods must have the same name and different signatures.	In method overriding, methods must have the same name and same signature.
6.	In method overloading, the return type can or can not be the same, but we just have to change the parameter.	In method overriding, the return type must be the same or co-variant.


** Can you overload static method ?
Yes,

** Can you override static method ?
No, we cannot override static methods, it is known  as hiding.


what is a co-variant.?

constructor invocation in inheritance

SubOrder static, order static, 0,10,9,15

Order class static block
SubOrder class static block
Order class instance block, i = 0
Order class constructor, i = 10
SubOrder class instance block, j = 9
SubOrder class constructor, j = 15


SubOrder class static block
Order class static block
Order class instance block,i= 0
Order class constructor,i= 10
SubOrder class instance block,j= 9
SubOrder class constructor,j= 15


Order class static block --> Order class instance block --> Order class constructor -->Suborder class static block --> Suborder class instance block --> Suborder class constructor


Order class static block
Suborder class static block
Order class instance block, i=0
Order class constructor, i=10
Suborder class instance block, j=9
Suborder class constructor, j=15

=======

Order class static block 
SubOrder class static block
Order class instance block,i= 0
Order class constructor,i= 10
SubOrder class instance block,j= 9
SubOrder class constructor,j= 15

=================================================================
Method overloading and overiding **

Abstract class
Interface

What is constructor ?
What are the OOPS concepts?
What is inheritance ?
What is static keyword in java ?
What is default constructor ?
What is overriding?
Rules for overriding ?
super and this keyword ?
Difference between overriding and overloading ?


=============Method and Parameters
void
any primivite or any object
public <RT> MN<parameters>
{
}








=









Day4 Agenda



Abstract class 
interfaces
====================

ABSTRACTION
- OOPS - 
Abstract class is a class which contains abstract method.

  *Cannot create an object of abstract class
Abstract is a java modifier applicable for classes and methods in java but not for Variables. 

Abstract can also inherit from an abstract class

*** Interface
==============
pure abstract 
you cannot have non abstract method in an interface
by default all the methods are abstract
by default all the variables are final (constant)


***Difference between abstract class and interface

all methods are abstract in an interface
Abstract class	Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
4) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
5) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
6) An abstract class can extend another Java class and implement multiple Java interfaces.	An interface can extend another Java interface only.
7) An abstract class can be extended using keyword "extends".	An interface can be implemented using keyword "implements".
8) A Java abstract class can have class members like private, protected, etc.	Members of a Java interface are public by default.
9)Example:
public abstract class Shape{
public abstract void draw();
}	Example:
public interface Drawable{
void draw();
}


class -->class		extends
class -> interface		implements
interface --> interface 	extends
interface --> class 		not possible	XX


final keyword
-----------------

class final 	- it cannot be inherited
method final 	- it cannot be overridden
variable final	- it cannot be changed once assigned, 













var-args
---------------
variable arguments
Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments. Variable Arguments in Java simplifies the creation of methods that need to take a variable number of arguments.




GC
-----------------------------------------
Garbage collection
c	- malloc		free
c++	- new		delete
java	- new		  X



System.gc();		- request the GC to run

Eligible for GC.

Object class
=============

	finalize method()


The purpose of a finalize() method can be overridden for an object to include the cleanup code or to dispose of the system resources that can be done before the object is garbage collected


** What is the purpose of GC ?
Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program

** Can we call the GC ?
You can call Garbage Collector explicitly, but JVM decides whether to process the call or not



**String

----------------------------------------------------

jdk1.0
** it is immutable (cannot be changed)
--java.lang
--group of characters
--final class
** -- how many ways are there to create string
Two ways to create string

1) String name="Daniel";
2) String name = new String("Richard");

** What is difference between == and equals method .


   //equals     - will check whether the two string values are same or not
        //==        - will check refernce of the two strings



**List out some string methods

Exercise Objective(s): String class, String immutability  

Exercise: Write class that declares the following String.
		“The quick brown fox jumps over the lazy dog”.
Perform the following modifications to the above string using appropriate methods.

1.	Print the character at the 12th index. 

2.	Check whether the String contains the word “is”. 
false		- 
3.	Add the string “and killed it” to the existing string. 

4.	Check whether the String ends with the word “dogs”. 
5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.                                
7.	Find the length of the String. 
8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”. 
9.	Replace the word “The” with the word “A”. 
10.	Split the above string into two such that two animal names do not come together. 
11.	Print the animal names alone separately from the above string. 
12.	Print the above string in completely lower case. 
13.	Print the above string in completely upper case.
14.	Find the index position of the character “a”. 
15.	Find the last index position of the character “e”. 

Recommended duration: 30 Mins


Solution :

package day4;

public class StringAssignmentSolution {

    public static void main(String[] args) {

        String string = "The quick brown fox jumps over the lazy dog";

        //print char at index 12
        System.out.println(string.charAt(12));
        //add string "and killed it" to existing string
        String string1 = string.concat(" and killed it");
        System.out.println(string1);
        //check weather string is equal to "The quick brown fox jumps over the lazy Dog"
        System.out.println(string.equals("The quick brown fox jumps over the lazy Dog"));
        //check weather string is equal to "THE QUICK BROWN..."
        System.out.println(string.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
        //find length of string
        System.out.println(string.length());
        //check weather string matches "The quick.... Dog"
        System.out.println(string=="the quick brown fox jumps over the lazy Dog");
        //replace word "The" with the word "A"
        String string2 = string.replace("The", "A");
        System.out.println(string2);
        //split string into two so
        String[] stringparts = string.split("j");
        String string3 = stringparts[0];
        String string4 = stringparts[1];
        System.out.println(string3 + " - " + string4);
        //print animal names alone
        String string5 = string.substring(15,19);
        String string6 = string.substring(39,43);
        System.out.println(string5 +" - "+ string6);
        //print above string in lower case
        String string7 = string6.toLowerCase();
        System.out.println(string7);
        //print above string in upper case
        String string8 = string7.toUpperCase();
        System.out.println(string8);
        //find index of character a
        System.out.println(string.indexOf('a'));
        //find index of character e
        System.out.println(string.indexOf('e'));
    }
}




Mutable

StringBuffer
	all the methods of string , replace


Length vs capacity


A string buffer or string builder's length is the number of characters it contains; its capacity is the number of character spaces that have been allocated. 


================self study
StringBuilder	- 
StringTokenizer




Object
==============
super class for all the classes in java

finalize
toString
equals
hashCode


wait
notify



Group discussion 

What is an abstract class ? Why we need it ?
What is an interface ?
Difference between interface and abstract class
What is String and some of the methods of string ?
Object class methods
	finalize
	toString
	equals
	hashCode
What is GC ? 
What is the use of final keyword ?





Day 5 
==============

12:00 PM - week1 wrap meeting
https://revature.zoom.us/j/92456091980

Wrapper classes
==================
Why we need it ?
 A Wrapper class is a class whose object wraps or contains primitive data types.

Need of Wrapper Classes

They convert primitive data types into objects. Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).


int	Integer
char	Character
float	Float



byte	1			Byte
short	2			Short
*int	4			Integer
long	8			Long


float	4
*double	8

boolean	false	1

char		2		Character




int num=65;
char p = (char)num;		
sout(p);				//A

byte b = 10;
int num1 = b;



float salary=98.7;

sout(salary+2);




Boxing	-AutoBoxing		-Converting primitive to objects
Unboxing - AutoBoxing		-Converting objects to primitives


Casting
	-Explicit
	-Implicit

Wrapper












Annotations
==============

JDK1.5

Enhanced for loop
AutoBoxing & AutoUnboxing


JDK1.8



Annotations
============
Meta data information
comments

Annotations are used to provide supplemental information about a program. 

Annotations start with ‘@’.
Annotations do not change the action of a compiled program.
Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, methods, classes, etc.
Annotations are not pure comments as they can change the way a program is treated by the compiler.


Two types of annotation :

1) Builtin 
	@Override
	@Deprecated
	.. many many
	@Test
	@Order
	
2) Custom annotation

package day5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Author {
    String authorName();
    String purpose();
    String dateCreated();
}


package day5;
@Author(authorName = "Tufaill", purpose = "demo", dateCreated = "6/5/22")
public class AnnotationDemo {

    int num1;

    @Deprecated
    public void display(){

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

    }
}




















Scanner 
==============
- java.util package
- used to take input from keyboard


package day5;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        String name = null;
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name :");
        name = scanner.next();
        System.out.println("Please enter your age :");
        age = scanner.nextInt();

        System.out.println("Welcome : "+name+ " and your age is :"+age);
    }
}

Exercise : 
WAP to accept five numbers and print the sum of all the positive numbers 


Enter five numbers :

12
12
-9
-7
2

Sum of all the positive numbers are : 26

(Optional) - You have entered 2 negative numbers.

Hint : Arrays, for loop, continue keyword


Exercise : WAP to accept five numbers and print the number of evens and odds and also negative numbers are not allowed.


Enter five numbers :

12
12
-9
	Sorry, Cant continue , because you have entered negative value


Enter five numbers :
12
19
12
88
23


The count of even numbers are :3
The count of odd numbers are :2

Hint : Arrays, for loop, break keyword

numbers[i]%2 == 0


Install Maven	-https://dlcdn.apache.org/maven/maven-3/3.8.5/binaries/apache-maven-3.8.5-bin.zip
Install Postgresql	-https://www.enterprisedb.com/postgresql-tutorial-resources-training?uuid=7c756686-90b4-4909-89ed-043e0705a76e&campaignId=7012J000001BfmaQAC

Install Dweaver
======================



I/O
=============================================


Deals with storing and retrieving data from files.


Input	- Reading


Output	-Write

java.io
		-Reader/Writer				-CharacterStreams(Correct)

InputReader
	FileInputReader
OutputReader
	FileOutputReader
does not support seralization

		-InputStream/OutputStream			- Byte Streams(Correct)
FileInputStream	
FileOutputStream
ObjectInput


File	- java.io package



use case : listing all files in directory

Write a program that creates a new file called BatchMates.txt 
and store it in a directory named Batch. Also list the files 
or subdirectories present in the drive/directory where 
the directory Batch exists, stating if it is a file or directory.

package day5;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        File f1 = new File("h:\\Batch\\BatchMates.txt");
        File f2 = new File("h:\\Batch");
        if(f2.exists() && f2.isDirectory()){
            System.out.println("Folder batch already exists");
        }
        else {
                f2.mkdir();
            System.out.println("Successfully created the folder -Batch");
        }
        System.out.println("Creating BatchMates.txt inside "+f2.getAbsolutePath());
        f1.createNewFile();
    }
}


Enter the file name to copy : h:\\home.txt

1) Not there h:\\ah.txt does not exist, Hence cannot continue

2) Enter the file name to paste : h:\\house.txt

Successfully copied h:\\home.txt to h:\\house.txt


Solution

package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFileSolution {

    public static void main(String[] args) throws IOException {

        //user to input read file and write name ?
        /* Please enter the full file name of the file to be copied
        h:\\ah.txt
            System.exit(0);
            h:\\ah.txt does not exist, Hence cannot continue

            Please enter the full file name where this to be copied
            h:\\jj.txt
         */
        //create complete program
        Scanner input = new Scanner(System.in);

        //1. Asking the user to input read file name
        System.out.println("Please enter the full name of the file to be copied:");
        String file = input.nextLine();
        File readFile = new File(file);

        //2. checking the existence of the read file
        if (!readFile.exists()) {
            //if file is not there , then exiting
            System.out.println("File does not exists, hence cannot continue");
            System.exit(0);
        }else{

            //3. continue
            System.out.println("Please enter the full name of the file to be pasted:");
            String writeFileName = input.nextLine();
            File writeFile = new File(writeFileName);
            FileInputStream readStream = new FileInputStream(readFile);          //byte stream
            FileOutputStream writeStream = new FileOutputStream(writeFile);
            int i = 0;
            while ((i = readStream.read()) != -1) {
                writeStream.write(i);
            }

            //closing the file
            readStream.close();
            writeStream.close();

            System.out.println("Successfully copied");
        }
    }
}





BufferredReader
===============
BufferedInputStream
It buffers the characters so that it can get the efficient reading of characters, arrays, etc.


======================
Object Seralization
	- is a process by which you reading and writing objects to a file.


ObjectInputStream		-read
ObjectOutputStream	-write



Marker interfaces





What is Wrapper class in java ?
What is annotation ?
What is Serilization ?


10 minutes




Week2 
============



Core Java - 

Exception Hanlding
Other topics

Maven

Git

AWS

JDBC

Logback


Day 6
========

Exception handling

Three types of errors 
1) Syntax error	
2) Logical error
3) Runtime errors (Exception Handling)



*Throwable
-	Error
-	Exception


CheckedException	- checked at compile time	- Exception and all its subclasses except RuntimeException
UncheckedException



Solution:

try
catch
finally




Throwable
	Exception
		RuntimeException




throw
throws	-throws the exception to the caller,delegate the exception 

------------------------



throw	- bring an exception


Userdefined exception
======================

-sub class exception or runtimexception

JDK1.7 	- try with resources	- no need to close the resources explicitlty





JDK
---

Maven
======
Dependency management tool
used for build process


Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation.



pom.xml
Project Object model
XML file

-- .M2 folder				local repository

mvn repository		- mvnrepository	central repository








JUnit Testing
=================
TDD - Test Driven Development

Why test the code?

Open source testing framework
junit - 5 - also know as jupiter

write test first

Use case : We have to create a calculator

add two numbers

Order Tests
------------------
	Why ?
	How ?

Methods stubs 
@BeforeAll	-static
@AfterAll		-static

@BeforeEach
@AfterEach


@Test is used to signal that the annotated method is a test method.
@Test methods must not be private or static and must not return a value.



Calculator.java

package day6;

public class Calculator {

    public int sum(int num1,int num2){
        return num1+num2;
    }

    public int multiply(int num1, int num2) {
            return num1*num2;
    }
}


CalculatorTest.java

import day6.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class CalculatorTest2 {

    Calculator calc;
    int expected =0;
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Welcome to Calculator Test");

    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Congratulations your tests completed.");
    }
    @BeforeEach
    public  void setUp(){
        calc = new Calculator();
        expected = 20;
        System.out.println("before each");
    }
    @AfterEach
    public  void tearDown(){
        calc= null;
        expected =0;
        System.out.println("after each");
    }
    @Test
    @DisplayName("Testing sum with two whole numbers - 2nd")
    @Order(2)
    public void testCalculatorSum1(){
        System.out.println("testCalculatorSum1 called");
              int actual =   calc.sum(10,10);
              assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing sum with one whole number and zero - 3rd")
    @Order(3)
    public void testCalculatorSum2(){
        System.out.println("testCalculatorSum2 called");
        int actual =   calc.sum(20,0);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing sum with one whole number and negative number - 1st")
    @Order(1)
    public void testCalculatorSum3(){
        System.out.println("testCalculatorSum3 called");
        int actual =   calc.sum(30,-10);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Testing multiply with two whole numbers ")
    @Order(4)
    public void testCalculatormultiply1(){
        System.out.println("testCalculatorMultiply1 called");
        int actual =   calc.multiply(10,2);
        assertEquals(expected,actual);
    }
}



Testing Exception
===================Hands-on 
Create two test cases to check the divide method.

calc.divide(40,2);



calc.divide(40,0);		-	ArithmeticException




15 minutes(4:55 PM EST)

Solution :

import Week2Day1.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)

public class CalculatorTest {
    Calculator calc;
    int expected = 0;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Welcome to the Calculator Test");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Thank you for using Calculator Test");
    }

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
        expected = 20;
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown(){
        calc = null;
        expected = 0;
    }

    // Testing
    @Test
    @DisplayName("Subtraction Test1")
    @Order(4)
    public void testCalculatorDifference(){
        int actual = calc.subtract(22, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Subtraction Test2")
    @Order(5)
    public void testCalculatorDifference2(){
        int actual = calc.subtract(40, 20);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Subtraction Test3")
    @Order(6)
    public void testCalculatorDifference3(){
        int actual = calc.subtract(19, -1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Addition Test1")
    @Order(1)
    public void testCalculator(){
        int actual = calc.add(18, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Addition Test2")
    @Order(2)
    public void testCalculator2(){
        int actual = calc.add(22, -2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Addition Test3")
    @Order(3)
    public void testCalculator3(){
        int actual = calc.add(20, 0);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplication Test1")
    @Order(7)
    public void testCalculatorMultiplyTest1(){
        int actual = calc.multiply(20, 1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplication Test2")
    @Order(8)
    public void testCalculatorMultiplyTest2(){
        int actual = calc.multiply(10, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplication Test3")
    @Order(9)
    public void testCalculatorMultiplyTest3(){
        int actual = calc.multiply(5, 4);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Testing convert to numbers \"20\" ")
    @Order(12)
    public void testConvertNumbers1(){
        System.out.println("testConvertNumbers1 called");
        int actual =   calc.convertToNumber("20");
        assertEquals(expected,actual);
    }

    //Handle exception in junit
    @Test
    @DisplayName("Testing convert to numbers \"Twenty\" ")
    @Order(13)
    public void testConvertNumbers2(){
        System.out.println("testConvertNumbers2 called");
        assertThrows(NumberFormatException.class, () -> {
            int actual =   calc.convertToNumber("Twenty");
            assertEquals(expected,actual);
        });
    }

    @Test
    @DisplayName("Division Test1")
    @Order(10)
    public void testCalculatorDivideTest1(){
        int actual = calc.divide(40, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Division Test2")
    @Order(11)
    public void testCalculatorDivideTest2(){
        System.out.println("divideTest2 called");
        assertThrows(ArithmeticException.class, () -> {
            int actual = calc.divide(40, 0);
            assertEquals(expected, actual);
        });
    }

}




=======================


Quiz has been assigned.







Group Discussion ?

What is exception handling ?
What is try /catch and finally block ?
**what is the difference between throw and throws
why we need custom exception?
**How to create custom  exception ?

** What is junit ?
How to write test in junit?
List some junit annotations and usage?














































. "Collections" is?
1534
QUESTION TYPE:Best Choice
DON'T EVALUATE:NO
STICKY:NO
TAGS:Core JavaJava Collections
CATEGORY:Java
SCORE:1
ANSWER OPTION(S):
NO	TEXT	CORRECT ANSWER?
1	
The interface that all java collections implement

NO
2	
A class filled with static methods used to manipulate collections

YES

---------

43. Which interface does not extend the Collection interface?
1535
QUESTION TYPE:Best Choice
DON'T EVALUATE:NO
STICKY:NO
TAGS:Core JavaJava Collections
CATEGORY:Java
SCORE:1
ANSWER OPTION(S):
NO	TEXT	CORRECT ANSWER?
1	
List

NO
2	
Set

NO
3	
Queue

NO
4	
Map

YES

**Details of collections later


Written Evalutaion	- Quiz

Day 7

Git
AWS
Unix


Any questions ?

Git 
-----------









Tom,Dick, Harry,Ahmed,Elisa

---------------------------------------
Day 1
	create controller
Day 2	
	update the code in controller by Tom





git commands
=============
git init	- 	create en empty local repository



  git config --global user.name "Tufail Ahmed"


git config --global user.email "tufailahmedkhan@gmail.com"



README.md	- welcome file of your repository


 git status

 git add .			-- add all the files

git commit -m "message"

git push



how can we add only one file
git add bye.txt
git add 


Create a repository named revature and put README.md in local as well as central repo
Create welcome.txt and write some message.
commit the changes in local and then in central repository







equals() vs ==?
equals 	- values				true
==	- reference of the two objects	false

String str1="Git";
String str2= new String("Git");



-----------------
Branching
rebase
merge


git init
git add .
git commit -m "message"
git push

README.md	-


tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (jayden)
$ git branch daniel

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (jayden)
$ git checkout daniel
Switched to branch 'daniel'

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (daniel)
$ git add JDBCDemo1.java

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (daniel)
$ git commit -m "daniel finished his task"
[daniel 935a7f3] daniel finished his task
 1 file changed, 8 insertions(+)
 create mode 100644 JDBCDemo1.java

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (daniel)
$ git push origin daniel
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 459 bytes | 459.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote:
remote: Create a pull request for 'daniel' on GitHub by visiting:
remote:      https://github.com/tufailahm/DMS/pull/new/daniel
remote:
To https://github.com/tufailahm/DMS.git
 * [new branch]      daniel -> daniel

tufai@DESKTOP-09F8TAM MINGW64 /f/DMS (daniel)
**	Create four branches - java,sql,docker,jenkins and push one file in each of these branch.




Merging
=============
**master branch will always have production ready code
java
	- AbstractClassDemo.java


AWS
==============
Amazon Web Services

What ?


ShoppingApp

security
db

Linux/Unix
DB				- RDS

Virtual machine	/ installation



Use case : For learning UNIX, we need a linux machine. 
Solution : You can create EC2 instances

EC2- Ubuntu	- 54.90.196.239		/keypair-downloads
		- 52.90.1.81		/devops2

Putty - remote servers

===================ec2 INSTANCES for windows machine

54.82.66.212
172.31.16.58


Administrator
Ssz24Rm5GtHLi.8%i6y)g;h4@eVbL4k)
Ssz24Rm5GtHLi.8%i6y)g;h4@eVbL4k)

Second Windows
User name	Administrator
Password	
rqahBVXv3NC7)$!ds!S@wnO9hXxOh(qc


Unix
==================
O.S
most popular alongwith windows
Linux


Unix File system

/

	bin

	dev

	home

		ubuntu

			sql/

			jenkins

	etc

	..
	
	..


Absolute path	- doesnt require where are you
	
	cp

Relative Path


Day 8
============

Unix
SQL = Postgresql


54.87.50.42

Permission in UNIX
----------------------------

users/owner
group
others

read
write
execute

U   G   O
rwxrwxr-x

  U   G  O
-rw-rw-r--

chmod +	- grant
           -  - revoke


chmod ugo-rwx records.txt

Numberic :

4	- read
2	- write
1	- execute

chmod 000 records.txt	- 	remove all the permissions
chmod 777 records.txt	- 	grant all the permissions to everyone
chmod 745 records.txt	- 	-rwxr--r-x 

Use case : -rw--w---x

chmod  621 records.txt


--wxrw-r-x		??

chmod 365	records.txt	


chmod ug+rw records.txt

User management 

tufail - U
daniel - G
richard - O

group : (hr) - tufail,daniel

tufail:)  hello.txt

/etc/passwd
/etc/group




 sudo useradd tufail		-- Add a user


 sudo passwd ahmed		- change password

 su tufail				- switch user


whoami

 sudo userdel ahmed		- delete



ubuntu@ip-172-31-20-106:~$ sudo groupadd software
ubuntu@ip-172-31-20-106:~$ sudo useradd -g software mohammad
ubuntu@ip-172-31-20-106:~$ sudo usermod -Gsoftware tufail
ubuntu@ip-172-31-20-106:~$ id software
id: ‘software’: no such user
ubuntu@ip-172-31-20-106:~$ id tufail
uid=1001(tufail) gid=1001(tufail) groups=1001(tufail),1002(software)
ubuntu@ip-172-31-20-106:~$ id mohammad
uid=1002(mohammad) gid=1002(software) groups=1002(software)




richard
daniel
mohan
trump

groups
hr
	daniel
	mohan

software
	richard
	trump


* please remove mohan from the user list


Editors
----------------
vi
pico

Shell Scripting
=============
	- programming techniques
	- set of statements






SQL
----------
Postgres

DBeaver - Universal sql commands - Great UI 


https://dbeaver.io/files/dbeaver-ce-latest-x86_64-setup.exe

https://github.com/tufailahm/devops/blob/master/db_scripts.zip


Todo 

**Stack & Heap




Day 9
=============

SQL 
*SQL Queries

Structurted Query Language



https://github.com/tufailahm/devops/blob/master/sql_ppt.zip

https://github.com/tufailahm/devops/blob/master/db_scripts.zip
**sub languages
** DQL - 	select
** DML - insert , delete , update
** DDL - create,alter,drop,truncate
** DCL - grant, revoke
** TCL - commit, rollback , savepoint


** Joins
** Subqueries
** Set operators
** Procedures


select is a command by which retrieve the data.

select first_name as "First Name" ,salary ,manager_id  from employees e ;

select * from employees e  where salary > 30000 ;

--AND,OR,NOT, IN, NOT IN , NULL, BETWEEN
select * from employees e  where salary > 30000 ;
select * from employees e  where salary > 10000 and manager_id = 110 ;
select * from employees e  where salary > 10000 OR manager_id = 110 ;
select * from employees e  where salary between 10000 and 20000;
select * from employees e  where job_id = 'IT_PROG'
--wild card % AND _ - like 
select * from employees e  where first_name = 'A%'	-- will not work because of =
select * from employees e  where first_name like  'A%'	-- will work because of like
select * from employees e  where first_name like  'T%'	-- will work because of like

select * from employees e  where first_name like  '_a%'	-- 

select * from employees e  where first_name like  '%a%'	

--hands on - list out all the names of employees that ends with a
--??

--using or 
select * from employees e  where job_id = 'IT_PROG' or job_id = 'AD_PRES' or job_id = 'PU_CLERK'

--using in
select * from employees e  where job_id in ('IT_PROG', 'AD_PRES' ,'PU_CLERK')

select * from employees e  where job_id not in ('IT_PROG', 'AD_PRES' ,'PU_CLERK')

--print all the employees who have not been allocated to a manager
select * from employees e  where manager_id  is null;

--hands on - list out all the names of employees that ends with a
-- print first_name,salary of all the employees who reports to manager 103
-- print all the employees who is getting salary more than 10,000 and also works in department 60
-- print all the employees whose last name starts with L
-- print all the employees (first_name,hire_date) who got hired after 25-06-05



Functions
===========

Aggregate functions 	- sum,max,min,avg,count

*** Group By clause

--Find max salary in each department
select department_id, max(salary) from employees;


group by clause - The SQL GROUP BY clause is used in collaboration with the SELECT statement to arrange identical data into groups. 
having clause - can be used only with group by and it is used to restrict the data in group by clause for aggregate functions.
The HAVING clause was added to SQL because the WHERE keyword cannot be used with aggregate functions


========Joins in SQL====================

employees	departments
first_name	, department_name

Neena		 Executive

Joins are used to display the data from more than one table using a join condition.

A JOIN clause is used to combine rows from two or more tables, based on a related column between them


Natural


Equi/Inner/Normal Join
select first_name, salary, d.department_name , l.city from employees e join departments d 
on e.department_id = d.department_id 
join locations l on d.location_id = l.location_id;


** Difference between inner join and outer join


* 
 * Inner Join: Returns only the rows that are common in both tables.
 * Outer Joins: 
 * 			   Full Outer Join:  Returns all rows from both tables.
 *             Left Outer Join:  Returns all rows from the left table plus the rows that the right table have in common.
 *             Right Outer Join: Returns all rows from the left table plus the rows that the right table have in common.
 * Self Join:  A self-join is a regular join that joins a table to itself. 
 *             In practice, we typically use a self join to compare rows within the same table.
 *             To form a self-join, you specify the same table twice with different table aliases and provide the join 
 *             predicate after the ON keyword.
 */


-- find all the information about employees
select * from employees e 

select * from departments d 

select * from jobs

select * from locations l 

select * from countries c 

--WHERE 
-- *

select first_name as "First Name" ,salary ,manager_id  from employees e ;

select * from employees e  where salary > 30000 ;

--AND,OR,NOT, IN, NOT IN , NULL, BETWEEN
select * from employees e  where salary > 30000 ;
select * from employees e  where salary > 10000 and manager_id = 110 ;
select * from employees e  where salary > 10000 OR manager_id = 110 ;
select * from employees e  where salary between 10000 and 20000;
select * from employees e  where job_id = 'IT_PROG'
--wild card % AND _ - like 
select * from employees e  where first_name = 'A%'	-- will not work because of =
select * from employees e  where first_name like  'A%'	-- will work because of like
select * from employees e  where first_name like  'T%'	-- will work because of like

select * from employees e  where first_name like  '_a%'	-- 

select * from employees e  where first_name like  '%a%'	

--hands on - list out all the names of employees that ends with a
--??

--using or 
select * from employees e  where job_id = 'IT_PROG' or job_id = 'AD_PRES' or job_id = 'PU_CLERK'

--using in
select * from employees e  where job_id in ('IT_PROG', 'AD_PRES' ,'PU_CLERK')

select * from employees e  where job_id not in ('IT_PROG', 'AD_PRES' ,'PU_CLERK')

--print all the employees who have not been allocated to a manager
select * from employees e  where manager_id  is null;

--hands on - list out all the names of employees that ends with a

--hands on - list out all the names of employees that ends with a
select * from employees e where first_name like '%a';	--ends with a


-- print first_name,salary of all the employees who reports to manager 103
-- print all the employees who is getting salary more than 10,000 and also works in department 60
-- print all the employees whose last name starts with L
-- print all the employees (first_name,hire_date) who got hired after 25-06-05

--print first)name and salary of employees who report to manager 103
select first_name as "First Name", salary from employees e where manager_id = 103;

--print all the employees who has salary more than 10000 and works in dept 60
select * from employees e where salary > 10000 and department_id = 60;

--print all the employees whose last name starts with L
select * from employees e where last_name like 'L%';

--print all employees (first_name, hire_date) who got hired after 25-06-05
select first_name as "First Name", hire_date from employees e where hire_date >= '25-06-05';

**--distinct

select distinct department_id  from employees e 


select column_name, data_type, character_maximum_length, column_default, is_nullable
from INFORMATION_SCHEMA.COLUMNS where table_name = 'employees'

** --sorting - order by 
select first_name ,salary , salary *12 AnnualSalary from employees e 
order by AnnualSalary desc ;

select first_name ,salary  from employees e 
order by salary,first_name ;


select first_name ,salary  from employees e 
order by 1;


=========================
--WAQ to sort the employees based on  hire date

----functions 
select upper('Tufail') 
select lower('AHMED')
select substring('ahmed',2,4) 

select * from employees e where lower(first_name) = 'steven';
select * from employees e where upper(first_name) = 'NEENA';

select upper(first_name) from employees e ;




==========
WAQ to print like this

select  *from  employees e ;

STEVEN SALARY IS 24000 $US
NEENA SALARY IS 17000 $US

select upper(concat(first_name,' salary is ',salary,' $us')) from employees e 


select * from employees e ;

---------Date functions

select hire_date-CURRENT_DATE  from employees e ;

select  to_date('12/05/2009') - hire_date from employees e ;

SELECT AGE(timestamp '2001-04-10', timestamp '1957-06-13');

SELECT CURRENT_TIME;

  SELECT DATEDIFF(to_date(hire_date), CURRENT_DATE) from employees e 
  
 --- To Fix 

  
 --Aggregate functions
  
  select count(*) from employees e ;
  
   select count(commission_pct) from employees e ;
   
  select max(salary),min(salary),avg(salary), sum(salary) from employees e ;
 
 select max(first_name) from employees e
  select min(first_name) from employees e
 select max(hire_date) from employees e 
 
 
 ---WAQ to count how many unique departments are there ?

 
 select count(distinct department_id) from employees e ;

  select distinct department_id from employees e ;
 
 

--Find max salary in each department
select department_id, max(salary) from employees
group by department_id
order by department_id 

-- Count number of employees reporting to each manager
select manager_id , count(employee_id) from employees e 
group by manager_id order by manager_id ;


--Count the number of employees working in each department 
select department_id , count(employee_id) from employees e 
group by department_id 
order by department_id 


-- Count number of employees reporting to each manager and display only details of managers 
-- who are having more than 10 employees report to them
--** ggregate functions are not allowed in WHERE
select manager_id , count(employee_id) from employees e 
where count(employee_id) > 10
group by manager_id order by manager_id ;

--Solution is us having clause

select manager_id , count(employee_id) from employees e 
group by manager_id 
having count(employee_id) > 7
order by manager_id ;


----Joins
select * from employees e 

select * from departments d 

--NATURAL JOIN

select first_name,department_name from employees e natural join departments d  

select department_name, city from departments d2  natural join locations l 

--using

select e.first_name ,e.employee_id ,e.salary ,d.department_name from employees e join departments d 
using (department_id)

--on
-- List all the managers department 
select e.first_name ,e.employee_id ,e.salary ,d.department_name from employees e join departments d 
on (e.employee_id = d.manager_id)


-- WAQ to display first_name,salary ,department_name, city
--Three way joins
 select first_name, salary, department_name, city from employees e join departments d 
using (department_id)
join locations l
using (location_id) ;


select first_name, salary, department_name, city from employees e 
join departments d on e.employee_id = d.manager_id  
join locations l on l.location_id = d.location_id 
and (d.manager_id = 149)
order by salary desc;

--self join

self join

select * from employees e 

Neena reports to Steven
Bruce reports to Alexander

select employee.first_name || ' reports to ' || manager.first_name 
from employees employee join employees manager
on manager.employee_id  = employee .manager_id  


---Inner Join

select first_name, salary, department_name, city from employees e 
join departments d on e.department_id = d.department_id
join locations l on l.location_id = d.location_id 		//106


//employees who does not belong to any department is not showing up in inner join

//departments which does not have any employee is also not showing up in inner join


---Outer join 
select *from employees e where department_id is null;
select *from departments d  where manager_id  is null;

--left
select first_name, salary, department_name from employees e 
left outer join departments d on e.department_id = d.department_id



--right 
select first_name, salary, department_name from employees e 
right outer join departments d on e.department_id = d.department_id

--full
select first_name, salary, department_name from employees e 
full outer join departments d on e.department_id = d.department_id

--------sub query

--who is getting better salary than Neena

select first_name from employees e where salary > 17000

select salary from employees e where first_name = 'Neena'

--subquery
select first_name from employees e where salary > ( select salary from employees e where first_name = 'Neena')

--find out the name of the person who has been hired on the same date neena was hired



select first_name from employees e where hire_date  = (select hire_date  from employees e where first_name = 'Neena')

--: more than one row returned by a subquery used as an expression
select first_name from employees e where hire_date  IN (select hire_date  from employees e where first_name = 'Alexander')


select * from employees e 

-- GET ME THE NAME/s of the employee/s who works in same job_id as Lex
select first_name from employees e where job_id in (select job_id from employees e where first_name = 'Lex')

-- get the details of the employee who is getting maximum salary
select * from employees e where salary = (select max(salary) from employees e);



---SET Operators
create table retired_employees
as
select * from employees e  where employee_id in (108,109,110,111,112)

delete from employees where employee_id in (108,109);

employees		not find 108,109
retured_employees	not find 100 and others 
but common 110,111,112 

select count(*) from employees e 				//107
select count(*) from retired_employees e 		//5


---union
select * from employees
union
select * from retired_employees	

---union all
select * from employees
union all
select * from retired_employees	


---insersect		-- only common datas
select * from employees
intersect
select * from retired_employees	

--minus is not supported in postgres











ToDo

	Person p = new Employee();
		
		Object o = p; // Up-Casting
		// Moving our reference variable UP the inheritance tree
		
		Employee e = (Employee) o; // Down-Casting
		// Moving our reference variable DOWN the inheritance tree
		// Potentially dangerous
		
//		Zoo z2 = (Zoo) o;
		
		// The instanceof operator will return true if the object IS-A instance of the Class
		// Then the down-cast would be safe
		if(o instanceof Zoo) {
			Zoo z2 = (Zoo) o;
		}


Reference links :

## Useful Links
* [Git Cheat Sheet](https://www.git-tower.com/blog/git-cheat-sheet)
* [Git Basics](https://youtu.be/0fKg7e37bQE)
* [Git Team Basics](https://youtu.be/oFYyTZwMyAg)
* [Hacker Rank](https://www.hackerrank.com)
  * Good source of practice. Use it often for practice.






























