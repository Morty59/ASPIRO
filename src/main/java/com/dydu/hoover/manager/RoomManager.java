package com.dydu.hoover.manager;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import com.dydu.hoover.manager.listener.SensorEventListener;
import com.dydu.hoover.model.Room;
import com.dydu.hoover.state.Direction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoomManager {

	private static final Logger LOG = LoggerFactory
			.getLogger(RoomManager.class);

	private final Room room;
	// private Robot robot;
	
	protected List<SensorEventListener> sensorListener = new ArrayList<SensorEventListener>();
	
	// private Point startPoint;
	
	/**
	 * RoomManager immuable constructor
	 * @param room
	 */
	public RoomManager(Room room) {
		Room newRoom = null;
		try {
			newRoom = room.clone();
		} catch (CloneNotSupportedException e) {
			newRoom = new Room(null);
			LOG.error("Problème avec la pièce : ", e);
		}finally {
			this.room = newRoom;
		}
	}
	
	/**
	 * Start clean with robot position in room
	 * @param startPosition
	 */
	public void StartClean(Point startPosition) {		
		if(this.room.getLength()>0) {
			 this.sensorListener.add(new SensorEventListener(this.room, Direction.UP));
			 this.sensorListener.add(new SensorEventListener(this.room, Direction.DOWN));
			 this.sensorListener.add(new SensorEventListener(this.room, Direction.LEFT));
			 this.sensorListener.add(new SensorEventListener(this.room, Direction.RIGHT));
		}else {
			System.out.println("La pièce est impossible à nettoyer");
		}
	}
	
	/**
	 * Get real robot position
	 * @param positionToMove
	 * @return
	 */
	// private Point projectionPoint(Point startPosition, Point positionToMove) {
	// 	return new Point(startPosition.x+positionToMove.x, startPosition.y+positionToMove.y);
	// }
	
	/**
	 * Manage collision event
	 */
	// private void fireCollision() {
	// 	//TODO
	// }
}
