package com.example.miguelangel.practicau5_3_applibre_duranocampomiguelangel;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class MyLocation implements LocationListener {
    MainActivity activity;
    public MainActivity getMainActivity() {
        return activity;
    }
    public void setMainActivity(MainActivity activity) {
        this.activity = activity;
    }
    @Override
    public void onLocationChanged(Location location) {
        location.getLatitude();
        location.getLongitude();
        String mensaje="Ubicacion Longitud:"+location.getLongitude()+"\n"+"Latitud: "+location.getLatitude();
        activity.direccion.setText(mensaje);
        activity.setLugar(location);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {
        activity.direccion.setText("GPS Encendido");
    }

    @Override
    public void onProviderDisabled(String provider) {
        activity.direccion.setText("GPS Apagado");
    }
}
