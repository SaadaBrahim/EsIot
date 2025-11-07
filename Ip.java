public class Ip {
    private String SBM;
    private String ip;

    public Ip(String SBM, String ip){
        this.SBM = SBM;
        this.ip = ip;
    }


    public String toString(){
        return "ipAddress {" +
                "SubnetM =" + SBM +
                ", IP = " + ip + "}";

    }


    // GetterSetter

    public String getSBM() {
        return SBM;
    }

    public void setSBM(String SBM) {
        this.SBM = SBM;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean equals(Ip ip2) {
        if (SBM.equals(ip2.SBM) && ip.equals(ip2.ip)) {
            return true;
        } else {
            return false;
        }
    }



}
