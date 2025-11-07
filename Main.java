import java.util.Date;

public class Main {
    public static void main(String args[]){
        Registro R = new Registro();
        Sensori s1 = new Sensori();
        Sensori s2 = new Sensori(new Ip("/24", "175.92.0.3"), new Posizione(0.10, 1.19), new Date(), new Date());

        s1.setIpPrivato(new Ip("/24", "175.92.0.3"));
        s1.setPosizioneOra(new Posizione(0.10,1.19));
        s1.setProssimaSostituzioneBat(new Date());
        s1.setUltimoCambioBat(new Date());

        R.stampaSensori();

        R.aggiungiSensore(s1);
        R.stampaSensori();

        R.aggiungiSensore(s2);


        Sensori s3 = new Sensori(new Ip("/16", "175.92.1.54"), new Posizione(1,4), new Date(), new Date());
        R.aggiungiSensore(s3);
        R.stampaSensori();


        R.deleteSensore(s1);
        R.stampaSensori();

        System.out.println("il sensore 1 e ugulae al sensore 2 ? " + s1.equals(s2));
        System.out.println("il sensore 1 e ugulae al sensore 2 ? " + s1.equals(s3));


    }
}
