/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking.model.vehicle;

/**
 *
 * @author vinay
 */
public class Vehicle {
    private String carNumber;
    private Double lat;
    private Double lon;
    private String type;
    private Boolean isAvailable;
    private String driverId;

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public String getType() {
        return type;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public String getDriverId() {
        return driverId;
    }
    
    
}
