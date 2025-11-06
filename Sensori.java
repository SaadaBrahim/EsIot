import javax.xml.crypto.Data;
import java.time.LocalDate;

public class Sensori {
    private Ip ipPrivato;
    private Posizione posizioneOra;
    private Data ultimoCambioBat;
    private Data prossimaSostituzioneBat;
    private float qualitaAria;

    //metodiCos
    public Sensori(){

    }
    public Sensori(Ip ipPrivato, Posizione posizoneOra, Data ultimoCambioBat, Data prossimaSostituzioneBat){
        this.ipPrivato = ipPrivato;
        this.posizioneOra = posizoneOra;
        this.ultimoCambioBat = ultimoCambioBat;
        this.prossimaSostituzioneBat = prossimaSostituzioneBat;
    }


    // GetterSetter

    public Ip getIpPrivato() {
        return ipPrivato;
    }

    public void setIpPrivato(Ip ipPrivato) {
        this.ipPrivato = ipPrivato;
    }

    public Posizione getPosizioneOra() {
        return posizioneOra;
    }

    public void setPosizioneOra(Posizione posizioneOra) {
        this.posizioneOra = posizioneOra;
    }

    public Data getUltimoCambioBat() {
        return ultimoCambioBat;
    }

    public void setUltimoCambioBat(Data ultimoCambioBat) {
        this.ultimoCambioBat = ultimoCambioBat;
    }

    public Data getProssimaSostituzioneBat() {
        return prossimaSostituzioneBat;
    }

    public void setProssimaSostituzioneBat(Data prossimaSostituzioneBat) {
        this.prossimaSostituzioneBat = prossimaSostituzioneBat;
    }

    public float getQualitaAria() {
        return qualitaAria;
    }

    public void setQualitaAria(float qualitaAria) {
        this.qualitaAria = qualitaAria;
    }
}
