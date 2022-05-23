package pt.ua.icm.tc.weatherapp.network;

import java.util.HashMap;

import pt.ua.icm.tc.weatherapp.datamodel.City;


public interface  CityResultsObserver {
    public void receiveCitiesList(HashMap<String, City> citiesCollection);
    public void onFailure(Throwable cause);
}
