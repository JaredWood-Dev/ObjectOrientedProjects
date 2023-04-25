package Assignments.GameOfLife;

public class Board {
    Cell[][] map;
    Board()
    {
        //Instantiate all the cells
        map = new Cell[20][20];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = new Cell(this, i, j);
                map[i][j].game = this;
                map[i][j].loc = new Location(i,j);
            }
        }

        //Loop through again and find the neighbors
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j].setNeighbors();
            }
        }
    }

    Cell getNeighbor(int r, int c)
    {
        if (r < 0 || c < 0 || r > map.length-1 || c > map.length-1)
        {
            return null;
        }
        else {
            return map[r][c];
        }
    }

    void checkNext()
    {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j].setNeighbors();
                map[i][j].nextAlive = map[i][j].willLive();
            }
        }
    }

    void nextGeneration()
    {
        checkNext();

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j].alive = map[i][j].nextAlive;
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j].InitNeighbors();
            }
        }
    }

    void printMap()
    {
        System.out.println("Here's the map:");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].isAlive())
                {
                    System.out.print("X");
                }
                else
                {
                    System.out.print(".");
                }
                System.out.print("  ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }

    Cell[][] getMap()
    {
        return map;
    }
}
