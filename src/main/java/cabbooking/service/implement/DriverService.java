/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking.service.implement;

import cabbooking.model.driver.Driver;
import cabbooking.service.interfac.StorageService;

/**
 *
 * @author vinay
 */
public class DriverService implements cabbooking.service.interfac.DriverService{

    private StorageService storageService;
       
    public DriverService(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public Boolean register(Driver driver) {
        this.storageService.saveDriver(driver);
        return true;
    }
    
}
