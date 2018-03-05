package com.dydu.hoover.model;

import java.awt.Point;

public class Room implements Cloneable{

	/**
	 * Clean start point
	 */
	private Point startClean;
	/**
	 * Matrix room
	 */
	private final String[][] matrix;

	public Point getStartClean() {
		return startClean;
	}
	public void setStartClean(Point startClean) {
		this.startClean = startClean;
	}
	public int getWidth() {
		return matrix.length > 0 ? matrix[0].length : 0;
	}
	public int getLength() {
		return matrix.length;
	}

	public Room(String[][] matrix){
		if(matrix !=null){
			this.matrix = matrix.clone();
		}else{
			this.matrix = new String[0][0];
		}
	}

	@Override
	public Room clone() throws CloneNotSupportedException {
		Room newRoom = (Room) super.clone();
		if(this.startClean != null){
			newRoom.startClean = (Point) this.startClean.clone();
		}
		return newRoom;
	}
	
	/**
	 * Test if position is a wall
	 * @param position
	 * @return 
	 */
	public boolean getPositionIsWall(Point position) {
		return matrix[position.x][position.y].equals("M");
	}
	
}
