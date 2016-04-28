package com.johnstinson99_at_gmail;

/**
 * Point specified with Polar coordinates in x, y plane
 * with random angle (theta), radius (r) and angular velocity.
 * x(), y() and z() methods allow access to cartesian coords.
 */

public class Point {
    double r, theta, angularVelocity;
    float z;

    Point(){
        r = Math.random()*400;
        theta = Math.random()*2*Math.PI;
        angularVelocity = Math.random()/20;
        z = -(float)(Math.random() * 200);
    }

    float x(){return (float)(r*Math.cos(theta));}
    float y(){return (float)(r*Math.sin(theta));}
    float z(){return z;}

    void move() {theta += angularVelocity;}
}
