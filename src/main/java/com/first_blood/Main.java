package com.first_blood;

import com.first_blood.base.*;
import com.first_blood.c3d.Point3D;
import com.first_blood.c3d.Vector3D;
import com.first_blood.c3d.Vector3DArray;
import com.first_blood.c3d.Vector3DProcessor;
import com.first_blood.triangle.Triangle;

import javax.sound.midi.Track;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HelloWorld hw = new HelloWorld();
        hw.main();

        Point3D p1 = new Point3D(0, 0, 0);
        Point3D p2 = new Point3D(0, 4, 0);
        Point3D p3 = new Point3D(4, 0, 0);

        Triangle right = new Triangle(p1, p2, p3);

        System.out.println(right.getPerimeter());
        System.out.println(right.getArea());
        right.getMedianPoint().println();
    }
}
