package com.dydu.hoover.model;

import java.awt.Point;
import java.util.HashSet;

import com.dydu.hoover.state.Direction;

public class Robot implements Cloneable{
	/**
	 * The robot position
	 */
	private Point position;
	/**
	 * Number of point to browse
	 */
	private int nbPointToBrowse;
	/**
	 * A way where the robot is passed
	 */
	private HashSet<Point> way;
	/**
	 * Current robot direction
	 */
	private Direction currentDirection;
	
	
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	public int getNbPointToBrowse() {
		return nbPointToBrowse;
	}
	public void setNbPointToBrowse(int nbPointToBrowse) {
		this.nbPointToBrowse = nbPointToBrowse;
	}
	public HashSet<Point> getWay() {
		return way;
	}
	public void setWay(HashSet<Point> way) {
		this.way = way;
	}
	public Direction getCurrentDirection() {
		return currentDirection;
	}
	public void setCurrentDirection(Direction currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	@Override
	public Robot clone() throws CloneNotSupportedException {
		Robot clone = (Robot) super.clone();
		clone.setWay(new HashSet<Point>(this.way));
		
		return clone;
	}
	
	
}
