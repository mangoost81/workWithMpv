package presenter;

import ui.View;
import weather_api.Service;
import weather_api.WeatherService;

import java.security.Provider;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new WeatherService();
    }

    public void getInfo(String sity) {
        String answer = service.get(sity);
        view.printAnswer(answer.toString());
    }
}
