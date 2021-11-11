package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        return calculateSum(sales) / sales.length;
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
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowTheAverage(int[] sales) {
        int counter = 0;
        int sum = averageSales(sales);

        for (int sale : sales) {

            if (sale < sum) {
                counter++;
            }
        }
        return counter;
    }

    public int aboveTheAverage(int[] sales) {
        int counter = 0;
        int sum = averageSales(sales);

        for (int sale : sales) {

            if (sale > sum) {
                counter++;
            }
        }
        return counter;
    }
}
