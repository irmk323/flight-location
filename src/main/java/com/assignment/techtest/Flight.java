// Copyright (C) 2017 Snowflake Software Ltd. All rights reserved.
package com.assignment.techtest;

import java.time.Instant;

/**
 * The class representing a Flight.
 */
public class Flight {

    /** The aerodrome the flight is arriving at. */
    private final String arrivalAerodrome;

    /** The date/time the flight is arriving. */
    private final Instant arrivalTime;

    /** The aerodrome the flight is departing from. */
    private final String departureAerodrome;

    /** The date/time the flight is departing. */
    private final Instant departureTime;
    
    private final Coordinate currentLocation;
    

    /**
     * Construct a flight.
     *
     * @param arrivalAerodrome The aerodrome the flight is arriving at.
     * @param arrivalTime The date/time the flight is arriving.
     * @param departureAerodrome The aerodrome the flight is departing from.
     * @param departureTime The date/time the flight is departing.
     */
    public Flight(final String arrivalAerodrome, final Instant arrivalTime, final String departureAerodrome,
    		final Instant departureTime, Coordinate currentLocation) {
        this.arrivalAerodrome = arrivalAerodrome;
        this.arrivalTime = arrivalTime;
        this.departureAerodrome = departureAerodrome;
        this.departureTime = departureTime;
        this.currentLocation = currentLocation;
    }

    /**
     * Gets the aerodrome the flight is arriving at.
     *
     * @return the arrival aerodrome.
     */
    public String getArrivalAerodrome() {
        return arrivalAerodrome;
    }

    /**
     * Gets the date/time the flight is arriving.
     *
     * @return the arrival time.
     */
    public Instant getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Gets the aerodrome the flight is departing from.
     *
     * @return the departure aerodrome.
     */
    public String getDepartureAerodrome() {
        return departureAerodrome;
    }

    /**
     * Gets the date/time the flight is departing.
     *
     * @return the departure time.
     */
    public Instant getDepartureTime() {
        return departureTime;
    }
    
    /**
     * Gets the locations
     *
     * @return current location.
     */
    public Coordinate getCurrentLocation() {
        return currentLocation;
    }
}
