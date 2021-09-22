package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'Begin less checked range, End more checked range',0,10000,90",
            "'Begin and End less checked range',0,90,0",
            "'Begin less checked range, End equals minimum range limit',0,100,1",
            "'Begin less checked range, End in checked range',0,300,8",
            "'Begin and End in checked range',200,300,3",
            "'Begin in checked range, End more checked range',8100,20000,10",
            "'Begin equals maximum range limit, End more checked range',9801,10000,1",
            "'Begin and End more checked range',10000,20000,0",
            "'Begin and End swaped',500,200,0",
    })
    void getAmountSquaresInRange(String test, int begin, int end, int expected) {
        SQRService service = new SQRService();
        int actual = service.getAmountSquaresInRange(begin, end);
        assertEquals(expected, actual);
    }
}