package pt.ua.icm.tc.weatherapp.network;

import java.util.HashMap;

import pt.ua.icm.tc.weatherapp.datamodel.WeatherType;

public interface WeatherTypesResultsObserver {
    public void receiveWeatherTypesList(HashMap<Integer, WeatherType> descriptorsCollection);
    public void onFailure(Throwable cause);
}
