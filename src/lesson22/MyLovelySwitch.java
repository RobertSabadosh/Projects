package lesson22;

public class MyLovelySwitch {

    public static int cityWeather(String city, String weekday) {
        int degreeUp = 0;
        switch (weekday) {
            case "Monday":
                return 0;
            case "Tuesday":
                return 1;
            case "Wednesday":
                return 2;
            case "Thursday":
                return 3;
            case "Friday":
                return 4;
            case "Saturday":
                return 5;
            case "Sunday":
                return 6;
            default:
                return 0;
        }
    }
}