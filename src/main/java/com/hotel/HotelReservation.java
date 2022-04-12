package com.hotel;

import java.util.HashMap;
import java.util.Map;

public class HotelReservation {

    private Map<String, Hotel> listOfHotels = new HashMap<String, Hotel>();

    public void addHotel(String hotelName, int weekdayRate, int weekendrate, int rating,
                         int rewardCusWeekdayRate, int rewardCusWeekendRate) {
        Hotel hotel = new Hotel(hotelName, weekdayRate, weekendrate, rating, rewardCusWeekdayRate,
                rewardCusWeekendRate);
        listOfHotels.put(hotelName, hotel);
        System.out.println("Hotel " + hotelName + " added  successfully!");
    }
}
