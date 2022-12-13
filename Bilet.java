package bilet;
import java.util.Scanner;
public class Bilet {
    public static void main(String[] args) {
        
     Scanner i = new Scanner(System.in);

        int km,age,choose;
        double normPrc;
        double perKm = 0.10;
        double chld = 0.5;
        double teen = 0.1;
        double old = 0.3;
        double twice = 0.2;
        double topDsc;
        boolean isDsc = false;
        double topPrc , bthDsc;

        System.out.print("Tek yön'mü Çift yön'mü? tek yöse '2' çift yönse '1' yazınız : ");
         
        choose = i.nextInt();
        
        System.out.print("Yaşınız : ");

        age = i.nextInt();

        System.out.print("Uzaklığı km cinsinden giriniz : ");

        km = i.nextInt();

        i.close();

        normPrc = km*perKm;

        if((choose == 1) || (choose == 2) && (age > 0)&&(km > 0)){
            if(age < 12){
                topDsc = normPrc * chld;
                if(choose == 1){
                    isDsc = true;
                }
            } else if( age <= 24){
                topDsc = normPrc * teen;
                if(choose == 1){
                    isDsc = true;
                }
            } else if(age > 65){
                topDsc = normPrc*old;
                if(choose == 1){
                    isDsc = true;
                }
            } else{
                topDsc = 0;
                if(choose == 1){
                    isDsc = true;
                }
            }
         

           topPrc = normPrc - topDsc ;
            bthDsc = 2 * (topPrc - (topPrc * twice));

            if ((age < 25) || (age > 65)) {
                if (isDsc) {
                    System.out.println("Yaş indirimi ve Gidiş-Dönüş indirimi vardır.");
                    System.out.println("Biletinizin toplam fiyatı: " + bthDsc + " TL");
                } else {
                    System.out.println("Yaş indirimi vardır." + " TL ");
                    System.out.println("Biletinizin toplam fiyatı: " + topPrc + " TL");
                }
            } else {
                if (isDsc) {
                    System.out.println("Gidiş-Dönüş indirimi vardır");
                    System.out.println("Biletinizin toplam fiyatı: " + bthDsc + " TL");
                } else {
                    System.out.println("İndirim yok.");
                    System.out.println("Biletinizin toplam fiyatı : " + normPrc + " TL");
                }
         
         
           }
       
         } else {
               System.out.print("Hatalı giriş yaptınız!");
               }
       
        }
          
    }
       
            
            
    


    
    

