package com.company.capgemini.pack.March04;

public class Box {
    int side;
    String color;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args)
    {
        Box b1=new Box();
        Box b2 = new Box();
        Box b3 = new Box();
        b1.setSide(4);
        b1.setColor("Blue");
        b2.setSide(6);
        b2.setColor("White");
        b3.setSide(8);
        b3.setColor("Green");
        System.out.println("Box1 side : "+b1.getSide());
        System.out.println("Box1 color : "+b1.getColor());
        System.out.println("Box2 side : "+b2.getSide());
        System.out.println("Box2 color : "+b2.getColor());
        System.out.println("Box3 side : "+b3.getSide());
        System.out.println("Box3 color : "+b3.getColor());
    }
}