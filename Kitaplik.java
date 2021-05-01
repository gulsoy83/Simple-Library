
package uygone;

public class Kitaplik {
    private Raf[] raflar;

    public Kitaplik(int rafSayisi, int rafKapasitesi) {
        this.raflar = new Raf[rafSayisi];
        for (int i = 0; i < raflar.length; i++) {
            raflar[i] = new Raf(rafKapasitesi);
        }
    }
    public void kitapEkle(Kitap book, int rafNo){
        raflar[rafNo].kitapEkle(book);
    }
    
    public void kitapSil(int rafNo, int siraNo){
        raflar[rafNo].KitapSilSıraNo(siraNo);
    }
    public void kitapSil(int rafNo, Kitap book){
        raflar[rafNo].kitapSil(book);
        
    }
    public void rafGoster (int rafNo){
        System.out.println(rafNo+". Raf gosteriliyor..");
        raflar[rafNo].rafGoster();
    }
    public void tumRaflariGoster(){
        System.out.println("Tum raflar gosteriliyor..");
        for (int i = 0; i < this.raflar.length; i++) {
            //System.out.println(i+". Raf: ");
            rafGoster(i);
        }
  
            
        }
    public Kitap kitapAra (String kitapAdi){
        for (int i = 0; i < raflar.length; i++) {
            for (Kitap b1 : raflar[i].getKitaplar()) {
                if(b1 !=null && b1.getAd().equals(kitapAdi)){
                    System.out.println(i+". rafta bulundu.");
                    System.out.println("");
                    return b1;
                }
                
            }
        }
        System.out.println("Aranan kitap bulunamadi.");
        return null;
    }
    
}
