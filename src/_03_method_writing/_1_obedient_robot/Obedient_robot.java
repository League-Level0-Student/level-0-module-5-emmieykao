package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
	static Robot Kylo= new Robot("batman");
public static void main(String[] args) {
	String color=JOptionPane.showInputDialog(null, "My name is Kylo the batpuppy. What is your favorite color? Red, green, or blue?");
	if(color.equals("red")) {
	Kylo.setPenColor(255, 0, 0);}
	else if(color.equals("green")) {
		Kylo.setPenColor(0, 255, 0);}
	else if(color.equals("blue")) {
		Kylo.setPenColor(0, 0, 255);}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, I can't draw in that color.");
	}
String shape=JOptionPane.showInputDialog("Would you like me to draw a square, a triangle, or a circle?");
	if (shape.equals("square")) {
		JOptionPane.showMessageDialog(null, "No problem!");
		drawSquare();
	}
	else if (shape.equals("triangle")) {
		JOptionPane.showMessageDialog(null, "No problem!");
		drawTriangle();
	}
	else if (shape.equals("circle")){
		JOptionPane.showMessageDialog(null, "Hmmm... This one is a little tricky.");
		drawCircle();
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, I can't draw that.");
	}

}

static void drawSquare() {
	
	Kylo.moveTo(200, 400);
	Kylo.penDown();
	Kylo.setSpeed(25);
	for (int i = 0; i < 4; i++) {
		Kylo.move(200);
		Kylo.turn(90);}
	}
	static void drawTriangle() {
		
		Kylo.moveTo(200, 400);
		Kylo.penDown();
		Kylo.setSpeed(25);
		for (int i = 0; i < 3; i++) {
			Kylo.move(200);
			Kylo.turn(120);}
		}
	static void drawCircle() {
		
		Kylo.moveTo(200, 400);
		Kylo.penDown();
		Kylo.setSpeed(25);
		for (int i = 0; i < 60; i++) {
			Kylo.move(10);
			Kylo.turn(6);
		}
		
	}}

