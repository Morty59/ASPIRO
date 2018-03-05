package com.dydu.hoover.manager.listener;

import java.awt.Point;

import com.dydu.hoover.manager.event.SensorEvent;
import com.dydu.hoover.model.Room;

public class CollisionEventListener implements ICollisionEventListener {

	private final Room room;
	private final Point realStartPosition;
	
	public CollisionEventListener(Room room, Point startPosition) {
		this.room = room;
		this.realStartPosition = startPosition;
	}
	
	public Point collisionPoint(SensorEvent move) {
		return null;
	}

	protected Point projectionPoint(Point positionToMove) {
		return new Point(realStartPosition.x+positionToMove.x, realStartPosition.y+positionToMove.y);
	}

}
