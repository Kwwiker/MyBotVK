import com.vk.api.sdk.objects.messages.Message;

import java.io.IOException;

public class Weather extends Command implements ServiceCommand {

    public Weather(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) {
        if (message.getBody().split(" ").length == 2) {
            new VKManager().sendMessage("Погода в " + message.getBody().split(" ")[1] + "\n"
                    + getWeather(message.getBody().split(" ")[1]), message.getUserId());
        } else {
            new VKManager().sendMessage("Погода в rostov_na_donu\n" + getWeather(), message.getUserId());
        }
    }

    @Override
    public void service() {

    }

    public String getWeather() {
        String weather;
        try {
            weather = new WeatherParser().getWeatherTodayDescription();
        } catch (IOException e) {
            weather = "Не удалось получить погоду";
        }
        return weather;
    }

    public String getWeather(String city) {
        String weather;
        try {
            weather = new WeatherParser(city).getWeatherTodayDescription();
        } catch (IOException e) {
            weather = "Не удалось получить погоду";
        }
        return weather;
    }
}
