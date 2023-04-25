package Assignments.UnitTesting;

public class Main {
    public static void main(String[] args)
    {
        boolean[][] grid = {
                { true, false,  false, true  },
                { false, true,  true,  false },
                { false, false, false, true  },
                { false, true,  true,  true  }  };

        INeighborCounter nc = new NC1(grid);

        int neighbors = nc.Count(2,3);
        System.out.println("Number of alive neighbors: " + neighbors);
        //Actual Output : 2
        //Expected Output : 3
    }
}
