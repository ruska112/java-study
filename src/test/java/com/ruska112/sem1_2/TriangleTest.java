package com.ruska112.sem1_2;

import com.ruska112.lab1.c3d.Point3D;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    Triangle rightTriangle;
    Triangle isoscelesTriangle;

    @Before
    public void setup() {
        rightTriangle = new Triangle(new Point3D(0, 0, 0), new Point3D(3, 0, 0), new Point3D(0, 4, 0));
        isoscelesTriangle = new Triangle(new Point3D(0, 0, 1), new Point3D(4, 0, 1), new Point3D(0, 4, 1));
    }

    @Test
    public void getPerimeterTest() {
        assertEquals(12, rightTriangle.getPerimeter());
    }
}