package ro.ase.acs.builder.models;

public class Builder2 implements AbstractBuilder{
    private boolean isWindowPosition;
    private boolean isErgoChairs;
    private boolean isDecoratedTable;
    private boolean isAmbientalMusic;
    private String musicType;
    @Override
    public Reservation getReservation() {
       return new Reservation(isWindowPosition, isErgoChairs, isDecoratedTable, isAmbientalMusic, musicType);
    }
    public Builder2() {
        isWindowPosition = false;
        isErgoChairs = false;
        isDecoratedTable = false;
        isAmbientalMusic = false;
        musicType = null;
    }
    public AbstractBuilder setterIsWindowPosition(Boolean isWindowPosition) {
        this.isWindowPosition = isWindowPosition;
        return this;
    }
    @Override
    public AbstractBuilder setErgoChairs(boolean ergoChairs) {
        this.isErgoChairs = ergoChairs;
        return this;
    }

    @Override
    public AbstractBuilder setDecoratedTable(boolean decoratedTable) {
        this.isDecoratedTable = decoratedTable;
        return this;
    }

    @Override
    public AbstractBuilder setAmbientalMusic(boolean ambientalMusic) {
        this.isAmbientalMusic = isAmbientalMusic;
        return this;
    }

    @Override
    public AbstractBuilder setMusicType(String musicType) {
        this.musicType = musicType;
        return this;
    }
}
