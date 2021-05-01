
package uygone;


public class Kitap {
    private String ad;
    private String yazar;
    private final String ISBN;
    private static int kitapSayisi;
    
    public Kitap(String ad, String yazar, String ISBN) {
        this.ad = ad;
        this.yazar = yazar;
        this.ISBN = ISBN;
        kitapSayisi++;
    }

    @Override
    public String toString() {
        return "Kitap{" + "ad=" + ad + ", yazar=" + yazar + ", ISBN=" + ISBN + '}';
    }
    
    public static String IsbnNedir(){
    
        return "ISBN kitaplari ayirt etmek icin essiz bir numaradir.";
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public static int getKitapSayisi() {
        return kitapSayisi;
    }

   

    
    

    public String getISBN() {
        return ISBN;
    }
    
    
}
