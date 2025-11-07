public class Posizione {
    private double latitudine;
    private double longitudine;

    public Posizione(double LAT, double LON){
        latitudine = LAT;
        longitudine = LON;
    }

    public String toString(){
            return "posizione {" +
                    "latitudine =" + latitudine +
                    ", longitudine = " + longitudine + "}";

        }


    public double getLatitudine() {
        return latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

    public void setLatitudine(double latitudine) {
        this.latitudine = latitudine;
    }

    public void setLongitudine(double longitudine) {
        this.longitudine = longitudine;
    }

    public boolean equals(Posizione p) {
        if (latitudine == p.latitudine && longitudine == p.longitudine) {
            return true;
        } else {
            return false;
        }
    }


}