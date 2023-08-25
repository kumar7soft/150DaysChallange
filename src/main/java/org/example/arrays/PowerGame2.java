package org.example.arrays;

import java.util.*;

class Player implements Comparable<Player> {
    int strength;

    public Player(int strength) {
        this.strength = strength;
    }

    @Override
    public int compareTo(Player other) {
        return Integer.compare(this.strength, other.strength);
    }
}

public class PowerGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            Player[] teamA = new Player[n];
            Player[] teamB = new Player[n];

            for (int j = 0; j < n; j++) {
                teamA[j] = new Player(scanner.nextInt());
            }

            for (int j = 0; j < n; j++) {
                teamB[j] = new Player(scanner.nextInt());
            }

            Arrays.sort(teamA);
            Arrays.sort(teamB);

            int wins = 0;
            int bIndex = 0;

            for (int aIndex = 0; aIndex < n; aIndex++) {
                if (bIndex >= n) {
                    break;
                }

                if (teamA[aIndex].strength > teamB[bIndex].strength) {
                    wins++;
                    bIndex++;
                }
            }

            System.out.println(wins);
        }
    }
}

