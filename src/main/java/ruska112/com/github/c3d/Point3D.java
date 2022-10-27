package com.first_blood.c3d;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getDistance(Point3D point2) {
        double result;
        double x2 = Math.pow((this.x - point2.getX()), 2);
        double y2 = Math.pow((this.y - point2.getY()), 2);
        double z2 = Math.pow((this.z - point2.getZ()), 2);
        result = Math.sqrt(x2 + y2 + z2);
        return result;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public boolean equals(Point3D point3D) {
        return this.x == point3D.getX() && this.y == point3D.getY() && this.z == point3D.getZ();
    }

    public void print() {
        System.out.printf("(x = %f; y = %f, z = %f)", this.x, this.y, this.z);
    }

    public void println() {
        System.out.printf("(x = %f; y = %f, z = %f)\n", this.x, this.y, this.z);
    }
}