import java.util.Date;

public class Main {
    public static void main(String args[]){
        Registro R = new Registro();
        Sensori s1 = new Sensori();
        Sensori s2 = new Sensori(new Ip(), new Posizione(), new Date(), new Date());

        s1.setIpPrivato(new Ip());
        s1.setPosizioneOra(new Posizione());
        s1.setProssimaSostituzioneBat(new Date());
        s1.setUltimoCambioBat(new Date());

        R.stampaSensori();

        R.aggiungiSensore(s1);
        R.stampaSensori();

        R.aggiungiSensore(s2);


        Sensori s3 = new Sensori(new Ip(), new Posizione(), new Date(), new Date());
        R.aggiungiSensore(s3);
        R.stampaSensori();


        R.deleteSensore(s1);
        R.stampaSensori();



    }
}
