package lesson22;

public class HW20 {

    public static void main(String[] args) {

        System.out.println(cityWeather("Berlin", "Monday"));
        System.out.println(cityWeather("London", "Tuesday"));
        System.out.println(cityWeather("Lissabon", "Wednesday"));
        System.out.println(cityWeather("Paris", "Thursday"));
        System.out.println(cityWeather("Moscow", "Friday"));
        System.out.println(cityWeather("Minsk", "Saturday"));
        System.out.println(cityWeather("Saratov", "Sunday"));
    }

    public static int cityWeather(String city, String weekday) {
        int degreeUp = 8;
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
        return degreeUp + cityWeatherSimple(city) - 6;
    }

    public static int cityWeatherSimple(String city) {
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
