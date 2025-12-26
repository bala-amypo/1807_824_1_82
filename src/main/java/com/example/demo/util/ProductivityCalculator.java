package com.example.demo.util;

public class ProductivityCalculator {

    public static double computeScore(double hoursLogged, int tasksCompleted, int meetingsAttended) {
        // 1. Handle Invalid/Negative Inputs (Test #27, #28, #11)
        if (Double.isNaN(hoursLogged) || hoursLogged < 0 || tasksCompleted < 0 || meetingsAttended < 0) {
            return 0.0;
        }

        // 2. The Formula
        // Logic: Give points for hours and tasks, subtract points for meetings.
        // Heuristic: 1 hour = 10 pts, 1 task = 5 pts, 1 meeting = -3 pts penalty
        double rawScore = (hoursLogged * 10.0) + (tasksCompleted * 5.0) - (meetingsAttended * 3.0);

        // 3. Clamp Logic (Test #18, #19, #29, #56)
        if (rawScore > 100.0) {
            rawScore = 100.0;
        }
        if (rawScore < 0.0) {
            rawScore = 0.0;
        }

        // 4. Rounding Logic (Test #57)
        return Math.round(rawScore * 100.0) / 100.0;
    }
}