//Create a rectangle class

//Variables
/**

Length // int
width // int
**/

//Methods:

/**
changeSize
draw

**/
//All set methods

/**
getLength
getWidth

**/
//All get methods

//Create a triangle class

//Variables
/**
length
height

**/

//Methods are the same as prior

//Create an oval class

//Variables
/**
height
width
**/

//create a class called SimpleShape

/**
SimpleShape class{
	String color;
	int xPos;
	int yPos;
	boolean isVisible;
	
	getColor(){
	
	getXpos(){
	
	getYpos(){
	
	isVisible(){
	
	changeColor(){
	
	setVisible(){
	
	moveHorizontal(){

	moveVertical(){
	
	SlowMoveHorizontal(){
	
	SlowMoveVertical(){
	
	SlowMoveDiagonal(){
	
	erase(){
**/
// now we can erase what the others have in common

// Inheritance: a subclass can inherit all of the variables and 
// methods of a superclass by extending the superclass.
/**
public class **Rectangle** extends *SimpleShape*{  *-Superclass **-subclass
Rectangle will inherit the variables and methods of SimpleShape.

Rectangle r = new Rectangle();
r.*slowMoveHorizontal*(50); *-Inherited method that we can use due to being extended
**/