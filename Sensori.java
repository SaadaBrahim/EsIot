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


    public String toString() {
        return "Sensore {" +
                "ipPrivato = " + ipPrivato.toString() +
                ", posizioneOra = " + posizioneOra.toString() +
                ", ultimoCambioBat = " + ultimoCambioBat +
                ", prossimaSostituzioneBat = " + prossimaSostituzioneBat +
                ", qualitaAria = " + qualitaAria + "}";

    }

    public boolean equals(Sensori s) {
        if (s == null) return false;

        if (!ipPrivato.equals(s.ipPrivato)) return false;
        if (!posizioneOra.equals(s.posizioneOra)) return false;
        if ((ultimoCambioBat == null && s.ultimoCambioBat != null) ||
                (ultimoCambioBat != null && !ultimoCambioBat.equals(s.ultimoCambioBat))) return false;
        if ((prossimaSostituzioneBat == null && s.prossimaSostituzioneBat != null) ||
                (prossimaSostituzioneBat != null && !prossimaSostituzioneBat.equals(s.prossimaSostituzioneBat))) return false;
        if (qualitaAria != s.qualitaAria) return false;

        return true;
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
