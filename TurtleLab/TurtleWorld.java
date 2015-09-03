
import java.awt.Color;

public class TurtleWorld
{  
    public static void main(String args[])
    throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle.setColor(Color.CYAN);
        turtle.setPenColor(Color.YELLOW);
        turtle2.setPenColor(Color.RED);
        turtle3.setPenColor(Color.MAGENTA);
        turtle4.setPenColor(Color.BLUE);
        turtle.setShellColor(Color.BLACK);
        turtle.penDown();
        turtle2.penDown();
        turtle3.penDown();
        turtle4.penDown();
        int x =1;
        while (x<470)
        {
          
            turtle.forward(50);
            turtle.turn(60);
            turtle.forward(50);
            turtle2.forward(100);
            turtle2.turn(60);
            turtle2.forward(100);
            turtle3.forward(50);
            turtle3.turn(300);
            turtle3.forward(50);
            turtle4.forward(100);
            turtle4.turn(300);
            turtle4.forward(100);
            Thread.sleep(10);
            x+=1;
            
        }
    }
}

