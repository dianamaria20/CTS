package ro.ase.acs.builder.models;

public class Reservation {
    private boolean isWindowPosition;
    private boolean isErgoChairs;
    private boolean isDecoratedTable;
    private boolean isAmbientalMusic;
    private String musicType;

    public Reservation(boolean isWindowPosition, boolean isErgoChairs, boolean isDecoratedTable, boolean isAmbientalMusic, String musicType) {
        this.isWindowPosition = isWindowPosition;
        this.isErgoChairs = isErgoChairs;
        this.isDecoratedTable = isDecoratedTable;
        this.isAmbientalMusic = isAmbientalMusic;
        this.musicType = musicType;
    }

    protected void setWindowPosition(boolean windowPosition) {
        isWindowPosition = windowPosition;
    }

    protected void setErgoChairs(boolean ergoChairs) {
        isErgoChairs = ergoChairs;
    }

    protected void setDecoratedTable(boolean decoratedTable) {
        isDecoratedTable = decoratedTable;
    }



    protected void setAmbientalMusic(boolean ambientalMusic) {
        isAmbientalMusic = ambientalMusic;
    }

    protected void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "isWindowPosition=" + isWindowPosition +
                ", isErgoChairs=" + isErgoChairs +
                ", isDecoratedTable=" + isDecoratedTable +
                ", isAmbientalMusic=" + isAmbientalMusic +
                ", musicType='" + musicType + '\'' +
                '}';
    }
}
