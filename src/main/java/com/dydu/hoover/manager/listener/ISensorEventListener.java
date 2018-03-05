package com.dydu.hoover.manager.listener;

import java.util.EventListener;

import com.dydu.hoover.manager.event.SensorEvent;

public interface ISensorEventListener extends EventListener {
	public void sensor(SensorEvent sensor);
}
