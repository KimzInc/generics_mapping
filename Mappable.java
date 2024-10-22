package com.kim;

import java.util.Arrays;

public interface Mappable {
    void render();

    // Splits such string -1.2970992760344477, 36.80997746360313
    // and return longitude and latitude
    static double[] stringToLotLon(String location){
        var splits = location.split(",");
        double lat = Double.parseDouble(splits[0]);
        double log = Double.parseDouble(splits[1]);
        return new double[]{lat,log};
    }
}

// abstract class don't get an error when interface
// methods are not implemented
// a class that implements this abstract class
// has to implement methods of Mappable interface
abstract class Point implements Mappable {
    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLotLon(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Point (" + location_r() + ")");
    }

    private String location_r(){
        return Arrays.toString(location);
    }
}

abstract class Line implements Mappable {
    private final double[][] locations;

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int i = 0;
        for (String location : locations) {
            this.locations[i++] = Mappable.stringToLotLon(location);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Line (" + location_r() + ")");
    }

    private String location_r(){
        return Arrays.deepToString(locations);
    }
}
