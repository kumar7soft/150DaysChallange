package org.example.first10days;

public class MaximumPopulationYear {

    public int maximumPopulation(int[][] logs) {
        int[] years = new int[2051]; // array to store the count of people alive for each year

        // Iterate through the logs and update the count for each year
        for (int[] log : logs) {
            years[log[0]]++; // increment count for birth year
            years[log[1]]--; // decrement count for death year
        }

        int maxPopulation = 0;
        int maxPopulationYear = 0;
        int currentPopulation = 0;

        // Iterate through the years array to find the year with maximum population
        for (int i = 1950; i < 2051; i++) {
            currentPopulation += years[i];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxPopulationYear = i;
            }
        }

        return maxPopulationYear;
    }
}
