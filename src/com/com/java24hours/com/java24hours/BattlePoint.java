package com.java24hours;

import java.util.ArrayList;
import java.awt.*;;

public class BattlePoint {
    ArrayList<Point> targets = new ArrayList<Point>();

    public BattlePoint() {
        //create targets to shoot at
        createTargets();
        //show map
        showMap();
        //shoot at three points
        shoot(7, 4);
        shoot(3, 3);
        shoot(9, 2);
        //display the map again
        showMap();
    }

    public void showMap() {
        System.out.println("\n   1  2  3  4  5  6  7  8  9");
        for (int column = 1; column < 10; column++) {
            for (int row = 1; row < 10; row++) {
                if (row == 1){
                    System.out.print(column + " ");
                }
                System.out.print(" ");
                Point cell = new Point(row, column);
                if (targets.indexOf(cell) > -1) {
                    //a target is in this position
                    System.out.print("X");
                } else{
                    //No target is here
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void createTargets() {
        Point p1 = new Point(5,9);
        targets.add(p1);
        Point p2 = new Point(4,5);
        targets.add(p2);
        Point p3 = new Point(9,2);
        targets.add(p3);
    }

    private void shoot(int x, int y){
        Point shot = new Point(x, y);
        System.out.println("Firing at (" + y + ", " + y + ") ...");
        if(targets.indexOf(shot) > -1){
            System.out.println("You sank my battlepoint!");
            targets.remove(shot);
        }
        else{
            System.out.println("miss.");
        }
    }

    public static void main(String[] args) {
        new BattlePoint();
    }
}
