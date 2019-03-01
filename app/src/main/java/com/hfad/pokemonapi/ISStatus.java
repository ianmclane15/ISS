package com.hfad.pokemonapi;

import com.google.android.gms.maps.model.LatLng;

public class ISStatus {
    private LatLng issposition;
    private String message;
    private int timestamp;

    public ISStatus(LatLng issposition, String message, int timestamp) {
        this.issposition = issposition;
        this.message = message;
        this.timestamp = timestamp;
    }

    public LatLng getIssposition() {
        return issposition;
    }

    public void setIssposition(LatLng issposition) {
        this.issposition = issposition;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

}
