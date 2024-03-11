public class Ogrenci {
    private String ad;
    private String bolum;
    private String girisYili;
    private String bolumKodu;
    private double gano;
    private String ogrenciNo;
    private String sira;
    private double harcHesapla;
    private int dersSayisi;
    private double yil;



    public Ogrenci(String ad, String bolum, String girisYili, String bolumKodu, double gano, String sira, int dersSayisi) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrenciNo = ogrenciNoOlustur(girisYili, bolumKodu, sira);
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        this.sira = sira;
        this.dersSayisi = dersSayisi;
        this.harcHesapla =  harcHesapla(dersSayisi, (int) yil);
    }

    public Ogrenci(String ad, String bolum, String girisYili, String bolumKodu, double gano) {//OVERLOAD
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.bolumKodu = bolumKodu;
        this.gano = gano;
        this.ogrenciNo = ogrenciNoOlustur(girisYili,  bolumKodu, sira);
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getGirisYili() {
        return girisYili;
    }

    public double harcHesapla(int dersSayisi, double yil){
        double harc = dersSayisi * 24;
        return harc;
    }

    public double getHarcHesapla() {
        return harcHesapla;
    }

    public void setHarcHesapla(double harcHesapla) {
        this.harcHesapla = harcHesapla;
    }

    public int getDersSayisi() {
        return dersSayisi;
    }

    public void setDersSayisi(int dersSayisi) {
        this.dersSayisi = dersSayisi;
    }

    public double getYil() {
        return yil;
    }

    public void setYil(double yil) {
        this.yil = yil;
    }

    public void setGirisYili(String girisYili) {
        this.girisYili = girisYili;
    }

    public String getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public double getGano() {
        if(gano>4||gano<0){
            throw new IllegalArgumentException("Gano istenilen aralıkta değil!!!");
        }
        return gano;
    }

    public void setGano(double gano) {this.gano = gano;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSira() {
        return sira;
    }

    public void setSira(String sira) {
        this.sira = sira;
    }

    private String ogrenciNoOlustur(String girisYili, String bolumKodu, String girisSirasi) {
        String numaraaa=girisYili+bolumKodu+girisSirasi;
        return numaraaa;
    }

    }