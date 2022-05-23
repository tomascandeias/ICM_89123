package pt.ua.icm.tc.weatherapp;

import java.util.HashMap;
import java.util.List;

import pt.ua.icm.tc.weatherapp.datamodel.City;
import pt.ua.icm.tc.weatherapp.datamodel.Weather;
import pt.ua.icm.tc.weatherapp.datamodel.WeatherType;
import pt.ua.icm.tc.weatherapp.network.CityResultsObserver;
import pt.ua.icm.tc.weatherapp.network.ForecastForACityResultsObserver;
import pt.ua.icm.tc.weatherapp.network.IpmaWeatherClient;
import pt.ua.icm.tc.weatherapp.network.WeatherTypesResultsObserver;

public class Model {
    private String name;

    public Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                '}';
    }
}
