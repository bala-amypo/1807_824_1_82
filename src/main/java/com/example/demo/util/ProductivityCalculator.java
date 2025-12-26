package com.example.demo.util;

public class ProductivityCalculator {

    public static double computeScore(double h, int t, int m) {
        if (Double.isNaN(h) || h <= 0 || t < 0 || m < 0) return 0.0;
        double score = (h * t) - (m * 2);
        if (score < 0) return 0.0;
        if (score > 100) return 100.0;
        return Math.round(score * 100.0) / 100.0;
    }
}
