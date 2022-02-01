package com.assignment.techtest;

import java.time.Instant;

public class LocationLogic {
	
    public LocationLogic() {

    	Flight flight = new Flight("UK", Instant.parse("2020-02-01T10:15:30.00Z"),
    			"Japan", Instant.parse("2020-02-02T10:15:30.00Z"), new Coordinate(5, 5));
    	Airspace airspace = new Airspace(new Coordinate(0, 0), new Coordinate(10, 10));
    	
    	System.out.println("Current location ( X , Y ) is ( " + flight.getCurrentLocation().getX() +  
    			", "  + flight.getCurrentLocation().getY() + " )"); 
    	
    	boolean checkFlightWithinAirspace = checkFlightWithinAirspace(flight.getCurrentLocation(), airspace.getBottomLeft(), airspace.getTopRight());
    	System.out.println("Is the flight is within the airspace? : " + checkFlightWithinAirspace);    	
    }
	
	public boolean checkFlightWithinAirspace(Coordinate currentLocation , Coordinate bottomLeft, Coordinate topRight ) {
		if(bottomLeft.getX() <= currentLocation.getX() && currentLocation.getX() <= topRight.getX()
				&& bottomLeft.getY() <= currentLocation.getY()  && currentLocation.getY() <= topRight.getY()) {
			return true;
		}else {
			return false;
		}
	}
}

