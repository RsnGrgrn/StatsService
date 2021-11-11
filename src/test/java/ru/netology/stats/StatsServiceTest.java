package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldCalculateSum() {

        int expected = 180;

        int actual = service.calculateSum(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSales() {

        int expected = 15;

        int actual = service.averageSales(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {

        int expected = 8;

        int actual = service.maxSales(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {

        int expected = 9;

        int actual = service.minSales(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBelowTheAverage() {

        int expected = 5;

        int actual = service.aboveTheAverage(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAboveTheAverage() {

        int expected = 5;

        int actual = service.belowTheAverage(monthSales);

        assertEquals(expected, actual);
    }

}