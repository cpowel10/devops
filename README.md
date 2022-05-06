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











