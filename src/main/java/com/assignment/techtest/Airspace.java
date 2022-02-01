// Copyright (C) 2017 Snowflake Software Ltd. All rights reserved.
package com.assignment.techtest;

/**
 * The class representing an Airspace.
 */
public class Airspace {

    /** The bottom left coordinate of this airspace. */
    private final Coordinate bottomLeft;

    /** The top right coordinate of this airspace. */
    private final Coordinate topRight;

    /**
     * Construct an Airspace.
     *
     * @param bottomLeft the bottom left coordinate of this airspace.
     * @param topRight the top right coordinate of this airspace.
     */
    public Airspace(final Coordinate bottomLeft, final Coordinate topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    /**
     * Gets the bottom left coordinate of this airspace.
     *
     * @return the bottom left.
     */
    public Coordinate getBottomLeft() {
        return bottomLeft;
    }

    /**
     * Gets the top right coordinate of this airspace.
     *
     * @return the top right.
     */
    public Coordinate getTopRight() {
        return topRight;
    }
}
