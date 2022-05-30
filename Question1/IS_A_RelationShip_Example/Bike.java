package Question1.IS_A_RelationShip_Example;

/*
=>IS-A Relationship is said to be formed when the a class inherits the other class 
*say we have a class called TwoWheeler and another class called Bike as there will be all properties 
*that bike will have which TwoWheeler will have so we inherit the TwoWheeler Class into the Bike Class
*and then we can Say Bike IS-A TwoWheeler . This relationship between the PArent Class and the Child Class
*is Called IS-A Relationship.
*/


public class Bike extends TwoWheeler{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike = new Bike();
		
		System.out.println("No. of wheels Bike have"+bike.noOfWheels);
		
		bike.detail();

	}

}
