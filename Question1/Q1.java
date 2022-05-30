package Question1;

/*Q1) Explain the difference between IS-A and Has-A relationship with the help of an
* example and explain about access modifiers and their accessibility?
*
*		=>IS-A Relationship is said to be formed when the a class inherits the other class 
*say we have a class called TwoWheeler and another class called Bike as there will be all properties 
*that bike will have which TwoWheeler will have so we inherit the TwoWheeler Class into the Bike Class
*and then we can Say Bike IS-A TwoWheeler . This relationship between the PArent Class and the Child Class
*is Called IS-A Relationship.
*
*		=>HAS-A Relationship is said to be formed when we create an object of another class into 
*the class say we have two class Nest class and Egg Class if we create an object of Egg Class in the
*next class using the constructor function then we can say   Nest HAS-A Egg   . And this type of 
*Relationship between two or more seperate class is called HAS-A Relationship
*
*
*		=>Access modifiers(public , private, protected and default) :-
*		
*			Public :- if a member of a class is defined with a public access modifiers then the member
*can be accessed everywhere within the package and outside the package  . So we can say the scope 
*of access of public access modifier is Globla.
*			public int a = 100;
*
*			Private :- If a member of a class is defined with a private access modifier then the member 
*can only be accessed within that class and no where else . To access the  we need to set getter and
*setter methods . So we can say that the scope of access of private access modifier is limited within
*the class where it is defied.
*			private int a = 50;
*
*   		Protected :- If a member of a class is defined with a protected access modifier then the member 
*can only be accessed within the package and to access the members defined in protected access modifier
*outside the package we need to Inherit the Class only then we can access the members defined.  So we
*can say that the scope of access of Protected access modifier is limited within the package in which the class
* is defined and to access the class members outside the package we need to inherit the class.
* 			protected int a = 20;
* 
* 
* 			default :- If a member of a class is defined with a default access modifier then the member 
*can only be accessed within the package and no where else. If no access modifier is given/mentioned 
*in the signature of the member then the member is treated to have the default access modifier
*
* 			int a =10;  -- > this will be treated to have the default access modifier  
* 
*  So we can say that the scope of access of default access modifier is limited within
*the package where it is defied.
*
*
*
*
*/


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
