package Assignments.GameOfLife;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File input = new File("C:\\Users\\jster\\ObjectOrientedProjects\\Assignments\\GameOfLife\\input.txt");
        Scanner sc = new Scanner(input);

        int generations = 5;
        Board m1 = new Board();

        for (int i = 0; i < 20; i++) {
            if (sc.hasNext())
            {
                String line = sc.nextLine();
                String[] lineChars = line.split("");

                for (int j = 0; j < 20; j++) {
                    if (lineChars[j].equals("X"))
                    {
                        m1.getMap()[i][j].setStatus(true);
                    }
                    else
                    {
                        m1.getMap()[i][j].setStatus(false);
                    }
                }
            }

        }

        generations = sc.nextInt() - 1;

        m1.printMap();
        for (int i = 0; i < generations; i++) {
            m1.nextGeneration();
            m1.printMap();
        }



    }


}
