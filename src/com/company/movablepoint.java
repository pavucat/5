package com.company;

public class movablepoint implements Movable{
    int x;
    int y;
    int xspeed;
    int yspeed;
    movablepoint(int x, int y, int xspeed, int yspeed)
    {
        this.x=x;
        this.y=y;
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }

    @Override
    public String toString() {
        return "movablepoint{" +
                "x=" + x +
                ", y=" + y +
                ", xspeed=" + xspeed +
                ", yspeed=" + yspeed +
                '}';
    }
    public void moveup()
    {
        y++;
    };
    public void movedown()
    {
        y--;
    }
    public void left()
    {
        x--;
    }
    public void right()
    {
        x++;
    }
}
