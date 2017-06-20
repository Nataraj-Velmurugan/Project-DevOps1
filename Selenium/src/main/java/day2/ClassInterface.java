/*package day2;

public class ClassInterface {

}


[9:34 PM, 1/24/2017] +91 99949 87517: 15)	Class and Interface with Example:
Class:
1) Class can have abstract and non-abstract methods.	
2) Class doesn't support multiple inheritance.	
3) Class can have final, non-final, static and non-static variables.	
4) Class can have static methods, main method and constructor.	
5) Class can provide the implementation of interface.	
6) The abstract keyword is used to declare abstract class.	
7) Class Can Be Instantiated.
8) A Class can inherit only one Class and can implement many interfaces.
9) In Class every Object will have the same behavior unless overridden.
10)In class all the methods should be having a definition unless decorated with an abstract keyword.

Interface:
1) Interface can have only abstract methods.
2) Interface supports multiple inheritance.
3) Interface has only static and final variables.
4) Interface can't have static methods, main method or constructor.
5) Interface can't provide the implementation of abstract class.
6) The interface keyword is used to declare interface.
7) Interface Cannot be instantiated.
8) An Interface cannot inherit any classes while it can extend many interfaces.
9) In Interface every Object will have to define its own behavior by implementing the contract defined.
10) In Interface all the methods are abstract by default and they will not have a definition.

Note: Java 8 introduced “Default Method” or (Defender methods), which allows us to add new methods with declaration and definition (like a normal method)to the Interfaces without breaking the existing implementation of these Interface.

Example for Class:
Public class FirefoxDriver implements WebDriver()
{
public void get(String sURL)
{
  System.out.println("URL="+sURL);
}

}
Example for Interface:
Public Interface WebDriver()
{
  int iNum = 10;
  public void get(String URL);
}                        
[9:34 PM, 1/24/2017] +91 99949 87517: DQ1: driver.switchTo().alert().dismiss();                        
[9:35 PM, 1/24/2017] +91 99402 24214: DQ1
driver.switchTo().alert().dismiss();                        
[10:43 PM, 1/24/2017] +91 87544 86576: Interface:

1.Class cannot Extend Interface only Implements it.
2.Interface an Extend another Interface but then the class which implements the interface need to implemented the methods of both interface .
3.Interface can not hold constructor.
4.Interface can not hold instance fields/variables.
5.By default all the methods of Interface are public so no need to provide access modifiers.

Example:
Public Interface WebDriver()
{

  int iNum = 10;
  public void get(String URL);

}

class:

1.A subclass can extend only one abstract class but it can implement multiple interfaces.
2.Abstract classes can extend other class and implement interfaces but interface can only extend other interfaces.
3.We can run an abstract class if it has main() method but we can’t run an interface because they can’t have main method implementation.
4.Interfaces are used to define contract for the subclasses whereas abstract class also define contract but it can provide other methods implementations for subclasses to use.
5.Abstract classes can have constructors but interfaces can’t have constructors.*/