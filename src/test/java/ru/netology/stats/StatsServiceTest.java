package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    StatsService service = new StatsService();

    @Test
    void minSales() {
        long expected = 9;
        long actual = service.minSales(sale);

        assertEquals(expected, actual);

    }
    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.maxSales(sale);

        assertEquals(expected, actual);

    }
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.calculateSum(sale);

        assertEquals(expected, actual);
    }
    @Test
    void averageSales() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.averageSales(sale);

        assertEquals(expected, actual);
    }
    @Test
    void aboveAverageSales() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.aboveAverageSales(sale);

        assertEquals(expected, actual);
    }
    @Test
    void belowAverageSales() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.belowAverageSales(sale);

        assertEquals(expected, actual);
    }

}
