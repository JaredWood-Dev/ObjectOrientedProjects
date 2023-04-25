package Assignments.UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NC1Test {

    int rows = 4, cols = 4;
    public boolean[][] cells = {
            { true, false,  false, true  },
            { false, true,  true,  false },
            { false, false, false, true  },
            { false, true,  true,  true  }  };
    //Problem: The output is returning 2 neighbors, while the expected output is 3
    @Test
    void count() {
        int locR = 0;
        int locC = 0;
        Assertions.assertEquals(live(locR-1,locC-1), 0);
        Assertions.assertEquals(live(locR-1,locC), 0);
        Assertions.assertEquals(live(locR-1,locC+1), 0);
        Assertions.assertEquals(live(locR,locC-1), 0);
        //Middle Value
        Assertions.assertEquals(live(locR,locC+1), 0);
        Assertions.assertEquals(live(locR+1,locC-1), 0);
        Assertions.assertEquals(live(locR+1,locC), 0);
        Assertions.assertEquals(live(locR+1,locC+1), 1);
    }

    @Test
    int live(int r, int c) {
        //Checking if in bounds is correct
        if (r < 0 || r >= rows) return 0;
        if (c < 0 || c >= cols) return 0;

        //Correct Code
        return (cells[r][c]) ? 1 : 0;
        //Incorrect Code
        //return (!cells[r][c]) ? 1 : 0;
    }
}