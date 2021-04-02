/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking.service.implement;

import cabbooking.model.rider.Rider;
import cabbooking.service.interfac.StorageService;

/**
 *
 * @author vinay
 */
public class RiderService implements cabbooking.service.interfac.RiderService{
    
    private StorageService storageService;
    
    public RiderService(StorageService storageService) {
        this.storageService = storageService;
    }

    @Override
    public Boolean register(Rider rider) {
        this.storageService.saveRider(rider);
        return true;
    }
    
}
