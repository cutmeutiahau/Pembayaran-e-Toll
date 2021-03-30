
/**
 * Write a description of class MesinPembayaran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CardScanner
{
   private Pay card;
   
   public CardScanner() {
       card = null; 
    }
    
    public void Scan(Pay jenisKartu) {
        card = jenisKartu;
    }
    
   public void Payment() {
       if(card != null) {
        card.MemprosesData();
        }
        else {
        System.out.println("Harap Tempelkan kartu anda");
        }
    }
     
}
