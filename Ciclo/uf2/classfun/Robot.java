package cat.itb.martamacias7e4.dam.m03.uf2.classfun;

import java.util.Scanner;

public class Robot {
    double x;
    double y;
    double velocity;

    public Robot(double x, double y, double velocity){
        this.x = x;
        this.y = y;
        this.velocity = velocity;
    }

    public static Robot getRobot() {
        return new Robot(0,0, 1);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVelocity() {
        return velocity;
    }

    public void moveUp(){
        y = y+getVelocity();
    }
    public void moveDown(){
        y = y-getVelocity();
    }
    public void moveRight(){
        x = x+getVelocity();
    }
    public void moveLeft(){
        x = x-getVelocity();
    }
    public void moreVeloc(){
        velocity = velocity+0.5;
    }
    public void lessVeloc(){
        velocity = velocity-0.5;
    }
}
