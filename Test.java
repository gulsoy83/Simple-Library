
package uygone;


public class Test {

    
    public static void main(String[] args) {
        Kitap k1 = new Kitap("Mat","Yazar1","12345");
        /*System.out.println(k1);
        k1.setAd("Kitab2");
        System.out.println(k1);
        System.out.println(Kitap.IsbnNedir());
        */
        Kitap k2 = new Kitap ("Tarih","at","214");
        //System.out.println(k2);
        
        
        Kitap k3 = new Kitap ("1984","ayse","214");
        Kitap k4 = new Kitap ("2023","ayse","214");
        Kitap k5 = new Kitap ("Fizik","ayse","214");
        Kitap k6 = new Kitap ("Kimya","ayse","214");
        System.out.println(Kitap.getKitapSayisi());
        
        
        /*Raf rafbir = new Raf(10);
        rafbir.kitapEkle(k1);
        rafbir.kitapEkle(k2);
        rafbir.kitapEkle(k3);
        rafbir.rafGoster();
        
        rafbir.KitapSilSıraNo(1);
        rafbir.rafGoster();
        rafbir.kitapSil(k3);
        rafbir.rafGoster();
        */
        Kitaplik salon = new Kitaplik(5,15);
        salon.kitapEkle(k1, 0);
        salon.kitapEkle(k2, 0);
        salon.kitapEkle(k3, 1);
        salon.kitapEkle(k4, 2);
        salon.kitapEkle(k5, 3);
        salon.kitapEkle(k6, 2);
        
        salon.tumRaflariGoster();
        salon.kitapAra("Fizik");
        salon.rafGoster(2);
        salon.kitapSil(0, k1);
        salon.kitapSil(1,0 );
        salon.tumRaflariGoster();
        salon=null;
        
    }
    
}
