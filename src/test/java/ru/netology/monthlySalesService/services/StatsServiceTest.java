package ru.netology.monthlySalesService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18; // сумма продаж за все месяцы
        long actual = service.SumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAverageMonthlySales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12; // среднее значение за год
        long actual = service.AverageMonthlySales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSalesForTheMaximumAmountMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // Ожидаемый месяц с максимальными продажами
        int actual = service.salesForTheMaximumAmountMonth(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSalesForMinimumAmountMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9; // Ожидаемый месяц с минимальными продажами
        int actual = service.salesForMinimumAmountMonth(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNumberMonthsWithMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // Ожидаемое количество месяцев с результатом продаж меньше среднего значения
        int actual = service.numberMonthsWithMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNumberMonthsWithMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5; // Ожидаемое количество месяцев с результатом продаж больше среднего значения
        int actual = service.numberMonthsWithMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}