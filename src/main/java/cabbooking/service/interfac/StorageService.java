/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking.service.interfac;

import cabbooking.model.booking.Booking;
import cabbooking.model.driver.Driver;
import cabbooking.model.rider.Rider;
import cabbooking.model.vehicle.Vehicle;
import java.util.List;

/**
 *
 * @author vinay
 */
public interface StorageService {
    Boolean saveRider(Rider rider);
    Boolean saveDriver(Driver driver);
    Boolean saveVehicle(Vehicle vehicle);
    Boolean updateLocation(Vehicle vehicle);
    Boolean book(Booking booking);
    Vehicle find(Double lat, Double lon, Double maxDistance);
    List<Booking> rideHistory(String riderUserId);
    Boolean endTrip(Long timeStamp, String bookingId);
}
