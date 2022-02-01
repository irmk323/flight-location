// Copyright (C) 2017 Snowflake Software Ltd. All rights reserved.
package com.assignment.techtest;

/**
 * The class representing a coordinate (x, y).
 */
public class Coordinate {

    /** The X component of this coordinate (can have values -180 to +180). */
    private final double x;

    /** The Y component of this coordinate (can have values -90 to +90). */
    private final double y;

    /**
     * Construct a coordinate.
     *
     * @param x the X component of this coordinate (can have values -180 to +180).
     * @param y the Y component of this coordinate (can have values -90 to +90).
     */
    public Coordinate(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the X component of this coordinate (can have values -180 to +180).
     *
     * @return the x.
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the Y component of this coordinate (can have values -90 to +90).
     *
     * @return the y.
     */
    public double getY() {
        return y;
    }
}
