package com.example.mypoint;

import java.lang.Math;
import java.util.Optional;
import java.util.Random;


import java.awt.Color;
public class TestMyPoint{

    public static void main(String [] args){

        double widthCanvas = 600;
        double heightCanvas = 600;

        //Generate various MyPoint Objects around the perimeter of the canvas
        MyPoint r = new MyPoint(widthCanvas, 0.5 * heightCanvas, null);
        MyPoint n = new MyPoint(widthCanvas, heightCanvas, null);
        MyPoint v = new MyPoint(0.5 * widthCanvas, heightCanvas, null);
        MyPoint h = new MyPoint(0,widthCanvas, null);
        MyPoint u = new MyPoint(0, 0.5 * heightCanvas, null);
        MyPoint t = new MyPoint();
        MyPoint p = new MyPoint(0.5 * widthCanvas,0, null);
        MyPoint k = new MyPoint(widthCanvas,0, null);

        // q is the center point of the canvas
        MyPoint q = new MyPoint(0.5 * widthCanvas, 0.5 * heightCanvas, null);

        // Print the points
        System.out.println(r);
        System.out.println(n);
        System.out.println(v);
        System.out.println(h);
        System.out.println(u);
        System.out.println(t);
        System.out.println(p);
        System.out.println(k);
        System.out.println(q);

        // Check the angle r, n, v, h, u, t and p make with q
        System.out.println("\n Angle of the line extending from " + r + "to [origin] " + q + ": " + r.angleX(q));
        System.out.println(" Angle of the line extending from " + n + "to [origin] " + q + ": " + n.angleX(q));
        System.out.println(" Angle of the line extending from " + v + "to [origin] " + q + ": " + v.angleX(q));
        System.out.println(" Angle of the line extending from " + h + "to [origin] " + q + ": " + h.angleX(q));
        System.out.println(" Angle of the line extending from " + u + "to [origin] " + q + ": " + u.angleX(q));
        System.out.println(" Angle of the line extending from " + t + "to [origin] " + q + ": " + t.angleX(q));
        System.out.println(" Angle of the line extending from " + p + "to [origin] " + q + ": " + p.angleX(q));
        System.out.println(" Angle of the line extending from " + k + "to [origin] " + q + ": " + k.angleX(q));

        System.out.println("\n p is the same as q: " + p.equals(q));
        System.out.println(" p is the same as p: " + p.equals(p));
    }
}
