package homeworks;

public class Homework20 {

    public static void main(String[] args) {
        System.out.println(citiWeather("Berlin", "Monday"));
        System.out.println(citiWeather("London", "Tuesday"));
        System.out.println(citiWeather("Lissabon", "Wednesday"));
        System.out.println(citiWeather("Paris", "Thursday"));
        System.out.println(citiWeather("Moscow", "Friday"));
        System.out.println(citiWeather("Minsk", "Saturday"));
        System.out.println(citiWeather("Saratov", "Sunday"));
    }

    public static int citiWeather(String city, String weekday) {
        int degreeUp = 0;
        switch (weekday) {
            case "Monday":
                degreeUp = 0;
                break;
            case "Tuesday":
                degreeUp = 1;
                break;
            case "Wednesday":
                degreeUp = 2;
                break;
            case "Thursday":
                degreeUp = 3;
                break;
            case "Friday":
                degreeUp = 4;
                break;
            case "Saturday":
                degreeUp = 5;
                break;
            case "Sunday":
                degreeUp = 6;
                break;
            default:
                degreeUp = 0;
                break;
        }
        return degreeUp + citiWeatherSimple(city) - 6;
    }

    public static int citiWeatherSimple(String city) {
        int degree = 0;

        switch (city) {
            case "Berlin":
                degree = 20;
                break;
            case "London":
                degree = 17;
                break;
            case "Lissabon":
                degree = 25;
                break;
            case "Paris":
                degree = 23;
                break;
            case "Moscow":
                degree = 19;
                break;
            case "Minsk":
                degree = 18;
                break;
            case "Saratov":
                degree = 15;
                break;
            default:
                degree = 0;
                break;
        }
        return degree + 6;
    }


}
