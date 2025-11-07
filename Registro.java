import java.util.Arrays;

public class Registro {
    private int nSensoriRegistrati;
    private Sensori[] listaSensori;

    // metodiCos
    public Registro(){
    this.nSensoriRegistrati = 0;
    this.listaSensori = new Sensori[3];
    }

    //metodi

    public void stampaSensori() {
        System.out.println("Sensori registrati:");
        for (int i = 0; i < nSensoriRegistrati; i++) {
            System.out.println("- " + listaSensori[i]);
        }
    }

    private void raddoppiaSpazio() {
        listaSensori = Arrays.copyOf(listaSensori, listaSensori.length * 2);
        System.out.println("Spazio raddoppiato a " + listaSensori.length + " elementi.");
    }


    public void aggiungiSensore(Sensori nuovoSensore) {
        if (nSensoriRegistrati == listaSensori.length) {
            raddoppiaSpazio(); // se pieno rad spazio
        }
        listaSensori[nSensoriRegistrati] = nuovoSensore;
        nSensoriRegistrati++;
    }

    public void deleteSensore(Sensori sensoreDaCanc) {
        for (int i = 0; i < nSensoriRegistrati; i++) {
            if (listaSensori[i].equals(sensoreDaCanc)) {

                for (int j = i; j < nSensoriRegistrati - 1; j++) {
                    listaSensori[j] = listaSensori[j + 1];
                }
                listaSensori[nSensoriRegistrati - 1] = null;
                nSensoriRegistrati--;
                return;
            }
        }
    }



}


