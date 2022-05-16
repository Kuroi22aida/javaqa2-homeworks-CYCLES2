package ru.netology.stats;

public class StatsService {

    public int averageAmountSales(int[] sales) {
        int sum = 0;
        int averageSum = 0;
        for (int sale : sales) {
            int totalSum = sum += sale;
            averageSum = totalSum / 12;
        }
        return averageSum;

    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberMonthsBelowAverageSales(int[] sales) {
        int sum = 0;
        int averageSum = 0;
        for (int sale : sales) {
            int totalSum = sum += sale;
            averageSum = totalSum / 12;
        }
        int count = 0;
        for (int sale : sales) {
            if (sale < averageSum)
                count++;
        }
        return count;

    }

    public int numberMonthsAboveAverageSales(int[] sales) {
        int sum = 0;
        int averageSum = 0;
        for (int sale : sales) {
            int totalSum = sum += sale;
            averageSum = totalSum / 12;
        }
        int count = 0;
        for (int sale : sales) {
            if (sale > averageSum)
                count++;
        }
        return count;

    }

}
