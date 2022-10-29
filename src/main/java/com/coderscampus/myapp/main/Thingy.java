package com.coderscampus.myapp.main;

//Create a Thingy class
public class Thingy {
int x;  // Create a class attribute

// Create a class constructor for the Thingy class
public Thingy() {
 x = 5;  // Set the initial value for the class attribute x
}

public static void main(String[] args) {
 Thingy myObj = new Thingy(); // Create an object of class Thingy (This will call the constructor)
 System.out.println(myObj.x); // Print the value of x
}
}

//Outputs 5