package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.nesting1.SportSocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() {
    }

    /**
     * @param args ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        // TODO

        /*
         * Davide Cassani , dcassani, 53 // * Bernie Ecclestone, becclestone, 83
         * 
         * Fernando Alonso, falonso, 34
         */
        final SportSocialNetworkUserImpl<User> dcassani = new SportSocialNetworkUserImpl<User>("Davide", "Cassani",
                "dcassani");
        final SportSocialNetworkUserImpl<User> becclestone = new SportSocialNetworkUserImpl<User>("Bernie",
                "Ecclestone", "becclestone");
        final SportSocialNetworkUserImpl<User> falonso = new SportSocialNetworkUserImpl<User>("Fernando", "Alonso",
                "falonso");

        /*
         * TODO: alonso is a fan of soccer and bike and practices F1: add these sports
         * to Alonso
         * 
         * falonso.addSport(SportSocialNetworkUserImpl.F1);
         * 
         * ...
         */
        falonso.addSport(SportSocialNetworkUserImpl.SOCCER);
        falonso.addSport(SportSocialNetworkUserImpl.F1);

        System.out.println("Alonso practices F1: " + falonso.hasSport(SportSocialNetworkUserImpl.F1));
        System.out.println("Alonso does not like volley: " + !falonso.hasSport(SportSocialNetworkUserImpl.VOLLEY));

        /*
         * Cassani practiced bike and loves F1 and MotoGP
         */
        dcassani.addSport(SportSocialNetworkUserImpl.BIKE);
        dcassani.addSport(SportSocialNetworkUserImpl.F1);
        dcassani.addSport(SportSocialNetworkUserImpl.MOTOGP);
        System.out.println(
                "Cassani has been a professional biker: " + dcassani.hasSport(SportSocialNetworkUserImpl.BIKE));
        System.out.println("Cassani does not like soccer: " + !dcassani.hasSport(SportSocialNetworkUserImpl.SOCCER));

        /**
         * Ecclestone is the de-facto owner of F1 but also a fan of basket.
         */
        becclestone.addSport(SportSocialNetworkUserImpl.F1);
        becclestone.addSport(SportSocialNetworkUserImpl.BASKET);
        System.out.println(
                "Bernie's the boss when it comes to F1: " + becclestone.hasSport(SportSocialNetworkUserImpl.F1));
        System.out.println(
                "Bernie does love playing also basket: " + becclestone.hasSport(SportSocialNetworkUserImpl.BASKET));

    }
}
