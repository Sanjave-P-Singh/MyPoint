package com.example.mypoint;

import java.lang.Math;
import java.util.Optional;
import java.util.Random;

import java.awt.Color;

// Class "MyPoint
class MyPoint{

    double x, y;
    MyColor color;

    //Constructors
    MyPoint() {setPoint(0,0); this.color = MyColor.YELLOW; }
    MyPoint(double x, double y, MyColor color){setPoint(x,y); this.color = Optional.ofNullable(color).orElse(MyColor.YELLOW); }
    MyPoint(MyPoint p, MyColor color){setPoint(p); this.color = Optional.ofNullable(color).orElse(MyColor.YELLOW); }

    //Set Methods
    public void setPoint(double x, double y){this.x = x; this.y = y;}
    public void setPoint(MyPoint p){this.x = p.getX(); this.y = p.getY(); }
    public void setColor(MyColor color){ this.color = color; }

    //Get Methods
    public double getX(){ return x; }
    public double getY(){return y; }
    public MyColor getColor(){ return color; }

    //Shift the points x and y coordinates by any given amount
    public void translate(double dx, double dy){ setPoint(x + dx, y + dy); }

    //Compute the distance between this point and the origin (0,0)
    public double distanceFromOrigin(){ return Math.sqrt(x * x + y* y); }

    //Compute the distance between this point and some other point
    public double distance(MyPoint p){

        double dx = x - p.getX();
        double dy = y-p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    //Computer the angle (in degrees) with the x-axis of the line extending from this point to point p
    public double angleX(MyPoint p){

        double dx = p.getX() - x;
        double dy = p.getY() - y;

        return Math.toDegrees(Math.atan2(dy, dx));
    }

    //Are the two points the same?
    public boolean equals(MyPoint p){ return (x == p.getX() && y == p.getY()); }

    @Override
    public String toString(){return "Point p(" + x +", " + y + ") Color" +  color.getAWTColor(); }
}


