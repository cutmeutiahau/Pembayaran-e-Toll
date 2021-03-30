
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
     public static void main (String args[]){
         MemberCard kartuMember = new MemberCard();
         CreditCard kartuKredit = new CreditCard();
         
         CardScanner card1 = new CardScanner();
         CardScanner card2 = new CardScanner();
         
         card1.Scan(kartuMember);
         card2.Scan(kartuKredit);
         
         card1.Payment();
         card2.Payment();
     }   
         
}