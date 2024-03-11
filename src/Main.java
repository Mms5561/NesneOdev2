public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler = new Ogrenci[]{
                new Ogrenci(null, null, "1973", "104", 0.0, "001",0),
                new Ogrenci("Gökhan", "Bilgisayar Mühendisliği", "1985", "104", 0.0,"001",0),
                new Ogrenci("Ayşe", "Makine Mühewndisliği", "1985", "104", 0.0, "001",2),
                new Ogrenci("Elif", "Mekatronik Mühendisliği", "2020", "123", 1.98, "001",4)
        };

        System.out.println("Öğrencilerin Bilgileri");
        int temp = 1;
        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println("OGR-" + temp + " " + ogrenci.getAd() + " " + ogrenci.getBolum() + " " + ogrenci.getOgrenciNo() + " " + ogrenci.getGano());
            temp++;

        }
        int ogrSiraa = 0;
        for (Ogrenci ogrenci : ogrenciler) {
            ogrSiraa++;
            if (ogrenci.getDersSayisi() != 0) {
                System.out.println(ogrSiraa + ". öğrencinin ödeyeceği harç : " + ogrenci.getHarcHesapla() * 10);

            }
        }
    }
}