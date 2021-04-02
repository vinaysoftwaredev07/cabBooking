/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking.model.booking;

/**
 *
 * @author vinay
 */
public class Booking {
    private String bookingId;
    private String riderUserId;
    private String carNumber;
    private long startTime;
    private long endTime;
    private String status;

    public String getBookingId() {
        return bookingId;
    }

    public String getRiderUserId() {
        return riderUserId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setRiderUserId(String riderUserId) {
        this.riderUserId = riderUserId;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
