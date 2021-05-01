
package uygone;

public class Raf {
    private Kitap[] kitaplar;
    
    public Raf (int kapasite){
      this.kitaplar = new Kitap[kapasite];  
    }
    
    public void kitapEkle(Kitap book){
        int i=0;
        while(i<kitaplar.length && kitaplar[i]!=null)
            i++;
        if (i!=this.kitaplar.length){
            this.kitaplar[i]= book;
        }
        
    }
    
    public void KitapSilSıraNo(int siraNo){
        if (siraNo<kitaplar.length)
            kitaplar[siraNo]=null;
        
    }
    public void kitapSil (Kitap book){
           int i=0;
        while(i<kitaplar.length && kitaplar[i]!= book)
            i++;          
        if(i!=kitaplar.length){
            kitaplar[i]=null;
        }
    }
         public void rafGoster(){
             //System.out.println("Raf gosteriliyor...");
             System.out.println("");
             for (int i = 0; i < kitaplar.length; i++) {
                 System.out.println(kitaplar[i]);
                 
             }
             System.out.println(" ");
         } 

    public Kitap[] getKitaplar() {
        return kitaplar;
    }

}
