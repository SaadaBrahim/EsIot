import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

public class Sensori {
    private Ip ipPrivato;
    private Posizione posizioneOra;
    private Date ultimoCambioBat;
    private Date prossimaSostituzioneBat;
    private float qualitaAria;

    //metodiCos
    public Sensori(){

    }
    public Sensori(Ip ipPrivato, Posizione posizoneOra, Date ultimoCambioBat, Date prossimaSostituzioneBat){
        this.ipPrivato = ipPrivato;
        this.posizioneOra = posizoneOra;
        this.ultimoCambioBat = ultimoCambioBat;
        this.prossimaSostituzioneBat = prossimaSostituzioneBat;
    }

    @Override
    public String toString() {
        return "Sensore {" +
                "ipPrivato=" + ipPrivato +
                ", posizioneOra=" + posizioneOra +
                ", ultimoCambioBat=" + ultimoCambioBat +
                ", prossimaSostituzioneBat=" + prossimaSostituzioneBat +
                ", qualitaAria=" + qualitaAria +
                '}';
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

    public Date getUltimoCambioBat() {
        return ultimoCambioBat;
    }

    public void setUltimoCambioBat(Date ultimoCambioBat) {
        this.ultimoCambioBat = ultimoCambioBat;
    }

    public Date getProssimaSostituzioneBat() {
        return prossimaSostituzioneBat;
    }

    public void setProssimaSostituzioneBat(Date prossimaSostituzioneBat) {
        this.prossimaSostituzioneBat = prossimaSostituzioneBat;
    }

    public float getQualitaAria() {
        return qualitaAria;
    }

    public void setQualitaAria(float qualitaAria) {
        this.qualitaAria = qualitaAria;
    }
}
