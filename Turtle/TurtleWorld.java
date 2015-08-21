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
        Turtle turtle5 = new Turtle(turtleWorld);
        Turtle turtle6 = new Turtle(turtleWorld);
        Turtle turtle7 = new Turtle(turtleWorld);
        Turtle turtle8 = new Turtle(turtleWorld);
        turtle.setColor(Color.CYAN);
        turtle.setPenColor(Color.BLUE);
        turtle.setShellColor(Color.BLACK);
        turtle.penDown();
        
        while(1==1)
        {
          
            turtle.forward(50);
            
            turtle.turnLeft();
            turtle.backward();
            turtle4.turnLeft();
            turtle3.forward(50);
            turtle.turnLeft();
            turtle.forward(50);
            turtle4.turnLeft();
            turtle.forward(500);
            turtle3.turnLeft();
            turtle.forward(50);
            turtle.turnLeft();
            turtle2.forward(300);
            turtle2.turnLeft();
            turtle3.forward(50);
            turtle4.forward(50);
            turtle.turnLeft();
            turtle3.forward(50);
            turtle4.turnLeft();
            turtle.forward(500);
            turtle3.forward(50);
            turtle.turnLeft();
            turtle.forward(50);
            turtle3.turnLeft();
            turtle3.forward(500);
            turtle5.forward(50);
            turtle7.turnLeft();
            turtle8.forward(50);
            turtle.turnLeft();
            turtle5.forward(500);
            turtle.forward(50);
            turtle6.turnLeft();
            turtle7.forward(50);
            turtle8.turnLeft();
            turtle7.forward(500);
        }
    }
}
