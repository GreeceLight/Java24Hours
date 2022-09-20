package com.java24hours;

import java.awt.*;

public class Point4D extends Point3D{
    public int t;

    public Point4D(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    public void move(int x, int y, int z, int t) {
        super.move(x, y, z);
        this.t = t;
    }

    public void translate(int x, int y, int z, int t) {
        super.translate(x, y, z);
        this.t += t;
    }
}
