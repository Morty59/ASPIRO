package com.dydu.hoover.manager.listener;

import java.awt.Point;

import com.dydu.hoover.manager.event.CollisionEvent;
import com.dydu.hoover.manager.event.SensorEvent;
import com.dydu.hoover.model.Room;
import com.dydu.hoover.state.Direction;

public class SensorEventListener implements ISensorEventListener {

	private final Room room;
	private final Direction direction;
	
	public SensorEventListener(Room room, Direction direction) {
		this.room = room;
		this.direction = direction;
	}
	
	public void sensor(SensorEvent sensor) {
		Point positionToTest = (Point) sensor.getSource();
		switch (this.direction){
			case UP:
				break;
			case DOWN:
				break;
			case LEFT:
				break;
			case RIGHT:
				break;
		}
		if(this.room.getPositionIsWall(positionToTest)) {
			CollisionEvent ce = new CollisionEvent(positionToTest);
			ce.notifyAll();	
		};
	}

}
