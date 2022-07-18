package com.company;

import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {

    public static void main(String[] args)
    {

        Random rnd = new Random();
        Scanner in = new Scanner (System.in);

        // First Task
        int[] dataPoints;

        dataPoints =  new int[100];

        for (int r = 0; r < dataPoints.length; r++)
        {
            dataPoints[r] = rnd.nextInt(100) + 1;
        }

        for (int r = 0; r < dataPoints.length; r++)
        {
            System.out.printf ("%3d |", dataPoints[r]);
        }

        System.out.println("The average is: " + SafeInput.getAverage(dataPoints));

        // Linear Scan -- Second Task
        System.out.println ();
        System.out.println ();
        for (int r = 0; r < dataPoints.length; r++)
        {
            System.out.printf ("%3d |", dataPoints[r]);
            if (r % 20 == 0)
            {
                System.out.println ();
            }
        }

        System.out.println ();
        int count = 0;
        int findNumber;
        findNumber = SafeInput.getRangedInt (in, "What number would you like to find in the above array? ", 1, 100 );

        boolean foundNumber = false;

        for (int r = 0; r < dataPoints.length; r++)
        {
            if (dataPoints[r] == findNumber)
            {
                count++;
                foundNumber = true;
            }
        }
        System.out.println("The entered value: '" + findNumber + "' has been found " + count + " times.");

        if (!foundNumber)
        {
            System.out.println ("The entered value: " + findNumber + " cannot be found.");
        }

        int numberPosition = 0;
        numberPosition = SafeInput.getRangedInt (in, "Which number will you like to find the position of from the above array? ", 1, 100 );
        for (int r = 0; r < dataPoints.length; r++)
        {
            if (dataPoints[r] == findNumber)
            {
               foundNumber = true;
               System.out.println("The entered value: " + numberPosition + " has been found at array index " + r);
               break;
            }

        }
        if (!foundNumber)
        {
            System.out.println ("The entered value: " + findNumber + " cannot be found.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int r = 0; r < dataPoints.length; r++)
        {
            if (min > dataPoints[r])
            {
                min = dataPoints[r];
            }
            if (max < dataPoints[r])
            {
                max = dataPoints[r];
            }
        }
        System.out.println ("\nThe minimum value is: " + min + ", and the maximum value is: " + max);

    }
}


