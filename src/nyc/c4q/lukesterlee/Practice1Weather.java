package nyc.c4q.lukesterlee;

/**
 * Access Code 2.1
 * Created by Luke Lee on 6/15/2015.
 *
 * JSON Parsing Practice 1
 *
 * This exercise demonstrates how to parse JSON data.
 */
public class Practice1Weather {

    // http://api.openweathermap.org/data/2.5/weather?zip=11367,us
    private static final String JSON_URL_ENDPOINT = "http://api.openweathermap.org/data/2.5/weather?zip=";
    private static final String JSON_URL_SUFFIX = ",us";

    private static String jsonString = "";

    public static void main(String[] args) {

        // TODO : Goal 1 - print entire json string
        System.out.println(getJsonString());

        // TODO : Goal 2 - print humidity
        System.out.println(getHumidity());

        // TODO : Goal 3 - print weather description from index 0
        System.out.println(getDescription());

    }

    // Goal 1
    private static String getJsonString() {
        String result = "";

        // TODO : Step 0 - create a completed json url string by adding your own zip code

        // TODO : Step 1 - create an URL instance with Step 0's result

        // TODO : Step 2 - create a Http Url Connection with Step 1's URL

        // TODO : Step 3 - get inputstream from Step 2 and create an instance of BufferedReader

        // TODO : Step 4 - create a string builder instance

        // TODO : Step 5 - read json file until the end of the line and write into string builder and save it into String variable "result"

        return result;
    }

    // Goal 2
    private static int getHumidity() {
        int humidity = -1;




        return humidity;
    }

    // Goal 3
    private static String getDescription() {
        String description = "";



        return description;
    }
}
