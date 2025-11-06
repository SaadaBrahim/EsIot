import java.util.Arrays;

public class Registro {
    private int nSensoriRegistrati;
    private Sensori[] listaSensori;

    // metodiCos
    public Registro(){
    this.nSensoriRegistrati = 0;
    this.listaSensori = new Sensori[10];
    }

    //metodi

    private void raddoppiaSpazio() {
        listaSensori = Arrays.copyOf(listaSensori, listaSensori.length * 2);
        System.out.println("spazio raddoppiato a " + listaSensori.length + " elementi.");
    }

    public void aggiungiSensore(Sensori nuovoSensore) {
        if (nSensoriRegistrati == listaSensori.length) {
            raddoppiaSpazio(); // se pieno rad spazio
        }
        listaSensori[nSensoriRegistrati] = nuovoSensore;
        nSensoriRegistrati++;
    }




}


