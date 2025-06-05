package ru.netology.monthlySalesService.services;

public class StatsService {
    public long sumOfAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long SumOfAllSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long AverageMonthlySales(long[] sales) {
        long total = SumOfAllSales(sales);
        long average = total / 12;
        return average;
    }

    public int salesForTheMaximumAmountMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int salesForMinimumAmountMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberMonthsWithMinSales(long[] sales) {
        int minSales = 0;
        long average = SumOfAllSales(sales) / 12;
        for (long sale : sales) {
            if (sale < average) {
                minSales++;
            }
        }
        return minSales;
    }

    public int numberMonthsWithMaxSales(long[] sales) {
        int maxSales = 0;
        long average = SumOfAllSales(sales) / 12;
        for (long sale : sales) {
            if (sale > average) {
                maxSales++;
            }
        }
        return maxSales;
    }
}
