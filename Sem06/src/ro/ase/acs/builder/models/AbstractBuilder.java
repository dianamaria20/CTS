package ro.ase.acs.builder.models;

import ro.ase.acs.builder.models.Reservation;

public interface AbstractBuilder {

    public abstract Reservation getReservation();
    public AbstractBuilder setterIsWindowPosition(Boolean isWindowPosition) ;



    public AbstractBuilder setErgoChairs(boolean ergoChairs);

    public AbstractBuilder setDecoratedTable(boolean decoratedTable);

    public AbstractBuilder setAmbientalMusic(boolean ambientalMusic);

    public AbstractBuilder setMusicType(String musicType);

}
