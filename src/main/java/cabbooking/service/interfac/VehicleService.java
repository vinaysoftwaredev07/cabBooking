/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking.service.interfac;

import cabbooking.model.vehicle.Vehicle;

/**
 *
 * @author vinay
 */
public interface VehicleService {
    Boolean registerVehicle(Vehicle vehicle);
    Boolean updateLocation(Vehicle vehicle);
    Vehicle find(Double lat, Double lon);
}
