package com.sylphe.app.fakeclient;

import com.sylphe.app.dto.LocData;

import java.util.Random;

/**
 * Created by myks7 on 2016-03-15.
 */
public class GpsInfo {

    private static double lat=-0.0009,lng=-0.0009;
    public GpsInfo(){

    }

    public LocData getLocation(){
        if(lat<0.001) {
            lng += 0.0001;
            lat += 0.0001;
        }else if(lat>=0.001){
            lng = -0.0009;
            lat = -0.0009;
        }
        return new LocData(33.454844+ lat,126.564959+ lng);
    }
}
