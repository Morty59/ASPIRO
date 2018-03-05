package com.dydu.hoover.manager.listener;

import java.awt.Point;
import java.util.EventListener;

import com.dydu.hoover.manager.event.SensorEvent;

public interface ICollisionEventListener extends EventListener {
	public Point collisionPoint(SensorEvent move);
}
