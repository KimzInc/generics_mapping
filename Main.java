package com.kim;

public class Main {
    public static void main(String[] args) {
        //Park[]
        // we can use var because Java can infer that
        // it's a Park array

       var nationalParksKenya = new Park[]{
               new Park("Nairobi National Park", "-1.3784318139800535, 36.860633099612"),
               new Park("Hells Gate National Park", "-0.8757452995563694, 36.31737685276355"),
               new Park("Masai Mara National Reserve", "-1.4821037631977843, 35.12999887189672"),
       };

       //pass the above array of parks to Park Layer

        Layer<Park> parkLayer = new Layer<>(nationalParksKenya);
        parkLayer.renderLayer();

        System.out.println("************* Rivers ***************");
        var riversInAfrica = new River[]{
                new River("Nile River", "15.991241358355754,32.57038439996679", "28.567353662794492, 30.80903284032969"),
                new River("River Congo", "-2.5523441744944617,16.183307670974965", "-0.5997248288668532, 17.763792671651288"),
                new River("Niger River", "13.72725280333719,-6.020164684552198","14.228693214168022, -4.493497985579901"),
        };

        Layer<River> riverLayer = new Layer<>(riversInAfrica);
        riverLayer.renderLayer();

    }
}