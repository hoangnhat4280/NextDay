import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayTest {

    @Test
    @DisplayName("Case 1/1/2018")
    public void testNextDayOfD1M1Y2018() {
        NextDay nextDay = new NextDay();
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String result = nextDay.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 31/1/2018")
    public void testNextDayOfD31M1Y2018() {
        NextDay nextDay = new NextDay();
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String result = nextDay.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 30/4/2018")
    public void testNextDayOfD30M4Y2018() {
        NextDay nextDay = new NextDay();
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        String result = nextDay.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 28/2/2018")
    public void testNextDayOfD28M2Y2018() {
        NextDay nextDay = new NextDay();
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = nextDay.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 29/2/2020")
    public void testNextDayOfD29M2Y2020() {
        NextDay nextDay = new NextDay();
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String result = nextDay.getNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case 31/12/2018")
    public void testNextDayOfD31M12Y2018() {
        NextDay nextDay = new NextDay();
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String result = nextDay.getNextDay(day, month, year);
        assertEquals(expected, result);
    }
}
