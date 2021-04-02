/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabbooking.model.rider;

import cabbooking.common.model.PersonalInfo;
import java.util.List;

/**
 *
 * @author vinay
 */
public class Rider extends PersonalInfo{
    private List<String> bookingHistory;

    public List<String> getBookingHistory() {
        return bookingHistory;
    }

    public void setBookingHistory(List<String> bookingHistory) {
        this.bookingHistory = bookingHistory;
    }
}
