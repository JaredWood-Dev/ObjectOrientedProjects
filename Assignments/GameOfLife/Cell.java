package Assignments.GameOfLife;

import java.util.Arrays;

public class Cell
{
    boolean alive;
    boolean nextAlive;
    Board game;
    Location loc;
    Cell[] neighbors = new Cell[8];
    //This array follows the following pattern:
    //0, 1, 2
    //3, X, 4
    //5, 6, 7

    Cell(Board gameBoard, int x, int y)
    {
        game = gameBoard;

        alive = false;

        loc = new Location(x, y);

        //Initalize the neighbros
        InitNeighbors();

    }

    void InitNeighbors()
    {
        Arrays.fill(neighbors, null);
    }

    void setNeighbors()
    {
        //Find the Neighbors
        neighbors[0] = game.getNeighbor(loc.x-1, loc.y-1);
        neighbors[1] = game.getNeighbor(loc.x-1, loc.y);
        neighbors[2] = game.getNeighbor(loc.x-1, loc.y+1);
        neighbors[3] = game.getNeighbor(loc.x, loc.y-1);
        //Mid
        neighbors[4] = game.getNeighbor(loc.x, loc.y+1);
        neighbors[5] = game.getNeighbor(loc.x+1, loc.y-1);
        neighbors[6] = game.getNeighbor(loc.x+1, loc.y);
        neighbors[7] = game.getNeighbor(loc.x+1, loc.y+1);
    }

    boolean isAlive()
    {
        return alive;
    }

    boolean willLive()
    {
        int liveNeighbors = 0;
        //Where the logic goes for if the cell will live on to the next generation
        for (int i = 0; i < neighbors.length; i++) {
            if (neighbors[i] != null)
            {
                if (neighbors[i].isAlive())
                {
                    liveNeighbors++;
                }
            }
        }

        //Rules
        //If Alive:
        //  < 2 dies
        //  = 2 or = 3 lives
        //  > 3 dies
        //If Dead:
        //  = 3 lives

        if (alive)
        {
            if (liveNeighbors < 2)
                return false;
            if (liveNeighbors == 2 || liveNeighbors == 3)
                return true;
            if (liveNeighbors > 3)
                return false;
        }
        if (!alive)
        {
            if (liveNeighbors == 3)
                return true;
        }
        return false;
    }

    //For testing purposes
    void setStatus(Boolean life)
    {
        this.alive = life;
        //System.out.println("Loc: x: " + loc.x + " y: " + loc.y);
    }
}
