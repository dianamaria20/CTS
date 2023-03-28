package ro.ase.acs.builder.main;

import ro.ase.acs.builder.models.AbstractBuilder;
import ro.ase.acs.builder.models.Builder;
import ro.ase.acs.builder.models.Builder2;
import ro.ase.acs.builder.models.Reservation;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new Builder();
        builder.setAmbientalMusic(true)
                .setMusicType("Jazz");
        Reservation reservation = builder.getReservation();
        System.out.println(reservation.toString());
       // reservation.setMusicType("Rock");
       // System.out.println(reservation.toString());

        //Reservation reservation2 = builder.getReservation();

        Reservation reservation1 = new Builder().setAmbientalMusic(true)
                .setMusicType("Ceva")
                .getReservation();
        System.out.println(reservation1.toString());
        System.out.println('\n');



        AbstractBuilder builder2 = new Builder2();
        Reservation reservation2 = builder2.setAmbientalMusic(true)
                .setMusicType("Rock")
                .getReservation();
        System.out.println(reservation2.toString());

        Reservation reservation3 = builder2.setMusicType("Pop")
                .getReservation();
        System.out.println(reservation3.toString());






    }
}
