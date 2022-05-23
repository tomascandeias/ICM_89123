package pt.ua.icm.tc.weatherapp.network;

import java.util.List;

import pt.ua.icm.tc.weatherapp.datamodel.Weather;


public interface ForecastForACityResultsObserver {
    public void receiveForecastList(List<Weather> forecast);
    public void onFailure(Throwable cause);
}
