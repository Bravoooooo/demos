package com.hasaker.springdemo.commonbeans;

import java.util.List;

public class ChooseCities {
    private List<City> cities;

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public List<City> getCities() {
        return cities;
    }
}
