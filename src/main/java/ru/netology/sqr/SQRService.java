package ru.netology.sqr;

public class SQRService {
    String testName;
    int rangeBegin;
    int rangeEnd;
    int expected;

    public SQRService(String testName, int rangeBegin, int rangeEnd, int expected) {
        this.testName = testName;
        this.rangeBegin = rangeBegin;
        this.rangeEnd = rangeEnd;
        this.expected = expected;
    }

    public int findSquaresInRange (int rangeBegin, int rangeEnd) {
        if (rangeBegin > rangeEnd) {
            int temp = rangeEnd;
            rangeEnd = rangeBegin;
            rangeBegin = temp;
        }
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeBegin && i * i <= rangeEnd) {
                result++;
            }
        }
        return result;
    }


}
