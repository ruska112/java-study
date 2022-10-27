package com.ruska112.c3d;

public class Vector3DProcessor {
    public static Vector3D sumOfTwoVectors(Vector3D v, Vector3D u) {
        Vector3D tmp = new Vector3D();
        tmp.endPoint.setX(v.getX() + u.getX());
        tmp.endPoint.setY(v.getY() + u.getY());
        tmp.endPoint.setZ(v.getZ() + u.getZ());
        return tmp;
    }

    public static Vector3D subtractionOfTwoVectors(Vector3D v, Vector3D u) {
        Vector3D tmp = new Vector3D();
        tmp.endPoint.setX(v.getX() - u.getX());
        tmp.endPoint.setY(v.getY() - u.getY());
        tmp.endPoint.setZ(v.getZ() - u.getZ());
        return tmp;
    }

    public static double scalarComposition(Vector3D v, Vector3D u) {
        return ((v.getX() * u.getX()) + (v.getY() * u.getY()) + (v.getZ() * u.getZ()));
    }

    public static Vector3D vectorComposition(Vector3D v, Vector3D u) {
        double m1 = (v.getY() * u.getZ()) - (v.getZ() * u.getY());
        double m2 = -((v.getX() * u.getZ()) - (v.getZ() * u.getX()));
        double m3 = (v.getX() * u.getY()) - (v.getY() * u.getX());
        return new Vector3D(m1, m2, m3);
    }

    public static boolean isCollinear(Vector3D v, Vector3D u) {
        boolean result = false;
        if (v.getX() != 0 && v.getY() != 0 && v.getZ() != 0) {
            double x = v.getX() / u.getX();
            double y = v.getY() / u.getY();
            double z = v.getZ() / u.getZ();
            if ((x == y && y == z)) {
                result = true;
            }
        }
        if ((v.getX() == 0) && (v.getY() == 0) && !result) {
            result = true;
        }
        if ((v.getX() == 0) && (v.getZ() == 0) && !result) {
            result = true;
        }
        if ((v.getY() == 0) && (v.getZ() == 0) && !result) {
            result = true;
        }
        if (v.getZ() == 0 && !result) {
            double x = v.getX() / u.getX();
            double y = v.getY() / u.getY();
            if (x == y) {
                result = true;
            }
        }
        if (v.getY() == 0 && !result) {
            double x = v.getX() / u.getX();
            double z = v.getZ() / u.getZ();
            if (x == z) {
                result = true;
            }
        }
        if (v.getX() == 0 && !result) {
            double y = v.getY() / u.getY();
            double z = v.getZ() / u.getZ();
            if (y == z) {
                result = true;
            }
        }
        return result;
    }
}
