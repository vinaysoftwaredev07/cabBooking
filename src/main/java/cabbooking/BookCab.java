/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking;

import cabbooking.model.booking.Booking;
import cabbooking.model.driver.Driver;
import cabbooking.model.rider.Rider;
import cabbooking.model.vehicle.Vehicle;
import cabbooking.service.interfac.BookingService;
import cabbooking.service.interfac.DriverService;
import cabbooking.service.interfac.RiderService;
import cabbooking.service.interfac.StorageService;
import cabbooking.service.interfac.VehicleService;
import java.util.List;

/**
 *
 * @author vinay
 */
public class BookCab {
    private static StorageService storageService = new cabbooking.service.implement.StorageService();
    private static RiderService riderService = new cabbooking.service.implement.RiderService(storageService);
    private static DriverService driverService = new cabbooking.service.implement.DriverService(storageService);
    private static VehicleService vehicleService = new cabbooking.service.implement.VehicleService(storageService);
    private static BookingService bookingService = new cabbooking.service.implement.BookingService(vehicleService, storageService);
    
    public static void main(String args[]){
        try{
            Rider rider = new Rider();
            rider.setName("Rider");
            rider.setCountryCode("+91");
            rider.setPhoneNumber("9090909981");
            riderService.register(rider);

            Driver driver = new Driver();
            driver.setName("Driver");
            driver.setCountryCode("+91");
            driver.setPhoneNumber("9090909982");
            driverService.register(driver);

            Vehicle vehicle = new Vehicle();
            vehicle.setCarNumber("KA01HK");
            vehicle.setLat(1D);
            vehicle.setLon(1D);
            vehicleService.registerVehicle(vehicle);

            vehicle.setLat(2D);
            vehicle.setLon(2D);
            vehicleService.updateLocation(vehicle);

            bookingService.book("+919090909981", 1D, 2D);

            List<Booking> bookingHistory = bookingService.history("+919090909981");
            System.out.println(" ******* bookingHistory ******* "+bookingHistory);
        }catch (Exception e){
            System.out.println("BookCab Main Exception : "+e.getMessage());
        }


    }
}
