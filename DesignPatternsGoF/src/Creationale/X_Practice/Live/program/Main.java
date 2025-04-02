package Creationale.X_Practice.Live.program;

import Creationale.X_Practice.Live.models.*;

public class Main {
    public static void main(String[] args) {
        LiveBroadcastFactory liveBroadcastFactory = new LiveBroadcastFactory();

//        LiveBroadcast facebookLive = liveBroadcastFactory.createLiveBroadcast("Facebook");
//        facebookLive.addComentariu("Great live!");
//
//        LiveBroadcast youtubeLive = liveBroadcastFactory.createLiveBroadcast("YouTube");
//        youtubeLive.addComentariu("Nice view!");
//
//        LiveBroadcast twitchLive = liveBroadcastFactory.createLiveBroadcast("Twitch");
//
//        System.out.println("Facebook Live:");
//        System.out.println(facebookLive);
//
//        System.out.println("YouTube Live:");
//        System.out.println(youtubeLive);
//
//        System.out.println("Twitch Live:");
//        System.out.println(twitchLive);

        LiveBroadcastCreator fotbalFactory = new FotbalFactory();
        LiveBroadcastCreator baschetFactory = new BaschetFactory();
        LiveBroadcastCreator handbalFactory = new HandbalFactory();

        Sport fotbal = fotbalFactory.createSport("FCSB", "Rapid");
        Sport baschet = baschetFactory.createSport("Dinamo", "U Cluj");
        Sport handbal = handbalFactory.createSport("CSM", "Steaua");

        LiveBroadcast fotbalLive = fotbal.startLiveBroadcast(liveBroadcastFactory, "Facebook");
        LiveBroadcast baschetLive = baschet.startLiveBroadcast(liveBroadcastFactory, "Youtube");
        LiveBroadcast handbalLive = handbal.startLiveBroadcast(liveBroadcastFactory, "Facebook");

        System.out.println("Fotbal Live:");
        System.out.println(fotbalLive);

        System.out.println("Baschet Live:");
        System.out.println(baschetLive);

        System.out.println("Handbal Live:");
        System.out.println(handbalLive);
    }
}
