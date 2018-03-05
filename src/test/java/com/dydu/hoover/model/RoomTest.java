package com.dydu.hoover.model;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.MockitoAnnotations;

@RunWith(JUnit4.class)
public class RoomTest {

    private String[][] matrixTest;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        this.matrixTest=new String[2][3];
        matrixTest[1][1] = "M";
        matrixTest[1][2] = " ";
    }

    @Test
    public void cloneRoomTest() {
        Room room = new Room(matrixTest);
        try {
            room.setStartClean(new Point(1,2));
            Room cloneRoom = room.clone();
            Assert.assertTrue(room != cloneRoom);
            Assert.assertEquals(cloneRoom.getWidth(), room.getWidth());
            Assert.assertTrue(room.getStartClean() != cloneRoom.getStartClean());
            Assert.assertEquals(room.getStartClean().x, cloneRoom.getStartClean().x);
            Assert.assertEquals(room.getStartClean().y, cloneRoom.getStartClean().y);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            Assert.assertFalse(false);
        }

    }

    @Test
    public void getPositionIsWallTest() {
        Room room = new Room(matrixTest);
        Assert.assertTrue(room.getPositionIsWall(new Point(1,1)));
        Assert.assertFalse(room.getPositionIsWall(new Point(1,2)));
    }

    @Test
    public void getWidthTest() {
        Room room = new Room(matrixTest);
        Assert.assertNotNull(room);
        Assert.assertEquals(3, room.getWidth());
    }

    @Test
    public void getLengthTest() {
        Room room = new Room(matrixTest);
        Assert.assertNotNull(room);
        Assert.assertEquals(2, room.getLength());
    }
}