/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking.service.implement;

import cabbooking.common.model.Constant;
import cabbooking.model.vehicle.Vehicle;
import cabbooking.service.interfac.StorageService;

/**
 *
 * @author vinay
 */
public class VehicleService implements cabbooking.service.interfac.VehicleService{

    private StorageService storageService;
    
    public VehicleService(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public Boolean registerVehicle(Vehicle vehicle) {
        this.storageService.saveVehicle(vehicle);
        return true;
    }

    @Override
    public Boolean updateLocation(Vehicle vehicle) {
        this.storageService.updateLocation(vehicle);
        return true;
    }

    @Override
    public Vehicle find(Double lat, Double lon) {
        Vehicle vehicle = this.storageService.find(lat, lon, Constant.MAX_DISTANCE);
        if(vehicle == null){
            throw new RuntimeException("Vehicle not available");
        }
        return vehicle;
    }
    
}
