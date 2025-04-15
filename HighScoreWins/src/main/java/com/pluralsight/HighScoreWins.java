package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user to enter the score
        System.out.print("Please enter a game score: ");
        String scoreInput = input.nextLine().trim();

        // Split into team names and scores using the pipe
        String[] parts = scoreInput.split("\\|");

        String teams = parts[0];     // "Home:Visitor"
        String scores = parts[1];    // "21:9"

        // Split the team names
        String[] teamNames = teams.split(":");
        String team1 = teamNames[0];
        String team2 = teamNames[1];

        // Split the scores
        String[] scoreValues = scores.split(":");
        int score1 = Integer.parseInt(scoreValues[0]);
        int score2 = Integer.parseInt(scoreValues[1]);

        // Determine the winner
        String winner;
        if (score1 > score2) {
            winner = team1;
        } else if (score2 > score1) {
            winner = team2;
        } else {
            winner = "It's a tie!";
        }

        // Display the result
        System.out.println("Winner: " + winner);
    }
}
