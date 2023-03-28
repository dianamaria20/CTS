package ro.ase.acs.builder.models;

public class Builder implements AbstractBuilder {
        Reservation reservation;
    @Override
    public Reservation getReservation() {
        return reservation;
    }

    public Builder() {
        reservation = new Reservation(false, false, false, false, null);
    }

    public AbstractBuilder setterIsWindowPosition(Boolean isWindowPosition) {
        reservation.setWindowPosition(isWindowPosition);
        return this;
    }

    public AbstractBuilder setErgoChairs(boolean ergoChairs) {
        reservation.setErgoChairs(ergoChairs);
        return this;
    }

    public AbstractBuilder setDecoratedTable(boolean decoratedTable) {
        reservation.setDecoratedTable(decoratedTable);
        return this;
    }


    public AbstractBuilder setAmbientalMusic(boolean ambientalMusic) {
        reservation.setAmbientalMusic(ambientalMusic);
        return this;
    }

    public AbstractBuilder setMusicType(String musicType) {
        reservation.setMusicType(musicType);
        return this;
    }
}
