package Question1.HAS_A_RelationShip_Example;

/*
=>HAS-A Relationship is said to be formed when we create an object of another class into 
*the class say we have two class Nest class and Egg Class if we create an object of Egg Class in the
*next class using the constructor function then we can say   Nest HAS-A Egg   . And this type of 
*Relationship between two or more seperate class is called HAS-A Relationship
*/

public class Nest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Egg egg = new Egg();
		
		System.out.println("The color of the egg in the nest is "+egg.color);
	}

}
