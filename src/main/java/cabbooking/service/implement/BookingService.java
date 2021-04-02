/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking.service.implement;

import cabbooking.model.booking.Booking;
import cabbooking.model.vehicle.Vehicle;
import cabbooking.service.interfac.StorageService;
import cabbooking.service.interfac.VehicleService;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author vinay
 */
public class BookingService implements cabbooking.service.interfac.BookingService{
    
    private final VehicleService vehicleService;
    private final StorageService storageService;

    public BookingService(VehicleService vehicleService, StorageService storageService) {
        this.vehicleService = vehicleService;
        this.storageService = storageService;
    }

    @Override
    public Booking book(String riderUserId, Double lat, Double lon) {
        Booking booking = new Booking();
        try{
            Vehicle vehicle = vehicleService.find(lat, lon);
            booking.setBookingId(UUID.randomUUID().toString());
            booking.setCarNumber(vehicle.getCarNumber());
            booking.setRiderUserId(riderUserId);
            storageService.book(booking);
            return booking;
        }catch(Exception e){
            System.out.println("BookService book Exception : " + e.getMessage());
            return booking;
        }
    }

    @Override
    public List<Booking> history(String riderUserId) {
        List<Booking> bookingHistory = storageService.rideHistory(riderUserId);
        return bookingHistory;
    }

    @Override
    public Boolean endTrip(Long timeStamp, String bookingId) {
        storageService.endTrip(timeStamp, bookingId);
        return true;
    }
    
}
