package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'Is range', 200, 300, 3",
                    "'Is full range', 100, 9801, 90",
                    "'Is revert range', 9801, 100, 90",
                    "'Is zero squares', 1, 99, 0",
                    "'Is zero squares', 9802, 20000, 0",
                    "'Is limit range one square', 100, 100, 1",
                    "'Is limit range one square', 9801, 9801, 1",
                    "'Is negative range', -9801, -100, 0",
                    "'Is limit range one square', 99, 101, 1",
                    "'Is limit range one square', 9800, 9802, 1",
                    "'Is zero range and square', 0, 0, 0"
            }, delimiter = ','
    )
    void findSquaresInRange(String testName, int rangeBegin, int rangeEnd, int expected) {

        SQRService service = new SQRService(testName, rangeBegin, rangeEnd, expected);

        int actual = service.findSquaresInRange(rangeBegin, rangeEnd);

        assertEquals(expected, actual);
    }

}