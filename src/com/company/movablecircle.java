package com.company;

import java.util.Scanner;

public class movablecircle implements Movable{
    Scanner in = new Scanner(System.in);
    int r=in.nextInt();
    movablepoint center = new movablepoint(0, 0, 0, 0);
    movablecircle(int x, int y, int xspeed, int yspeed)
    {
        center.x=x;
        center.y=y;
        center.xspeed=xspeed;
        center.yspeed=yspeed;
    }

    public void moveup()
    {
        center.y+=center.yspeed;
    };
    public void movedown()
    {
        center.y-=center.yspeed;
    }
    public void left()
    {
        center.x-=center.xspeed;
    }
    public void right()
    {
        center.x+=center.xspeed;
    }

    @Override
    public String toString() {
        return "movablecircle{" +
                "r=" + r +
                ", center=" + center +
                '}';
    }
}
