package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int average = calculateSum(sales) / 12;
        return average;
    }

    public int aboveAverageSales(long[] sales) {
        int aas = averageSales(sales);
        int numberOfMonths = 0;
        for (long sale : sales) {
            if (sale > aas) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
    public int belowAverageSales(long[] sales) {
        int aas = averageSales(sales);
        int numberOfMonths = 0;
        for (long sale : sales) {
            if (sale < aas) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}



