import weather_api.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = new Connection();
        try {
            connection.getJson("moscow");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
