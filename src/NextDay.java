public class NextDay {
    public static final String CONCATST = "/";

    public String getNextDay(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    nextDay = 1;
                    nextMonth++;
                } else {
                    nextDay++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    nextDay = 1;
                    nextMonth++;
                } else {
                    nextDay++;
                }
                break;
            case 2:
                if (isLeapYear(year)) {
                    if (day == 29) {
                        nextDay = 1;
                        nextMonth++;
                    } else {
                        nextDay++;
                    }
                } else {
                    if (day == 28) {
                        nextDay = 1;
                        nextMonth++;
                    } else {
                        nextDay++;
                    }
                }
                break;
            case 12:
                if (day == 31) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear++;
                } else {
                    nextDay++;
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }

        return nextDay + CONCATST + nextMonth + CONCATST + nextYear;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
