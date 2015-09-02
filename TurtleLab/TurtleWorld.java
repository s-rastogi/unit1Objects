
import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle.setColor(Color.CYAN);
        turtle.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.MAGENTA);
        turtle3.setPenColor(Color.MAGENTA);
        turtle4.setPenColor(Color.MAGENTA);
        turtle.setShellColor(Color.BLACK);
        turtle.penDown();
        turtle2.penDown();
        turtle2.penDown();
        turtle2.penDown();
        int x =1;
        while (x<5000)
        {
          
            turtle.forward(50);
            turtle.turn(60);
            turtle.forward(50);
            turtle2.forward(100);
            turtle.forward(80);
            turtle2.turn(60);
            
            x+=1;
            
        }
    }
}

