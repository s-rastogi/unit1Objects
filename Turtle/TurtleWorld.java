import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.forward(50);
        turtle.turnLeft();
        turtle.backward();
        turtle.turnLeft();
        turtle.forward(50);
        turtle.turnLeft();
        turtle.forward(50);
        turtle.turnLeft();
        turtle.forward(500);
        turtle.turnLeft();
        turtle.forward(50);
        turtle.turnLeft();
        turtle.forward(300);
        turtle.turnLeft();
        turtle.forward(50);
    }
}
