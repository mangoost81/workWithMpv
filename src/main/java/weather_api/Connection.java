package weather_api;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {
    private static final String apiKey = "7b68cd1bbffd4eb9aa8174359241004";

    public String getJson(String sity) throws Exception{
        StringBuilder sb = new StringBuilder();
        URL url = new URL("http://api.weatherapi.com/v1/current.json?key="+ apiKey + "&q=" + sity);
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNext()) {
            sb.append(scanner.nextLine());
        }

        System.out.println("от сервера пришел ответ: " + sb);
        return sb.toString();

    }
}
