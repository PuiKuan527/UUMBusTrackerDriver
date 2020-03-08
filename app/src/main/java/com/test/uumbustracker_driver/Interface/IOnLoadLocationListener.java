package com.test.uumbustracker_driver.Interface;

import com.test.uumbustracker_driver.MyLatLng;

import java.util.List;

public interface IOnLoadLocationListener {
    void OnLoadLocationSuccess(List<MyLatLng> latLngs);
    void OnLoadLocationFailed(String Message);
}
