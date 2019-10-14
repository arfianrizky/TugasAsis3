import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int x;
        Scanner c = new Scanner(System.in);
       
        System.out.println("Silahkan pilih: ");
        System.out.println("1. Mobil\n2. Sepeda Motor");
        System.out.println("Masukkan pilihan 1 atau 2 :");
        x = c.nextInt();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
         
       
        if (1==x){
            mobil b =new mobil();
            b.info();
            if (b.jarak>0 && b.jarak <= 500 && b.getBahan() > 0 && b.getBahan() <= 500) {
            System.out.println("efektif dengan nilai keefektivitasan : "+ b.efektifitas());
            
        } else {System.out.println("tidak efektif");
        }
       }
       
        else if(2==x){  sepedamotor a = new sepedamotor();
            a.info();
             if (a.jarak>0 && a.jarak <= 500 && a.getBahan() > 0 && a.getBahan() <= 500) {
            System.out.println("efektif dengan nilai keefektivitasan : "+ a.efektifitas());
            
        } else {System.out.println("tidak efektif");
        }
        }else{
            System.out.println("Input Salah GOBLOK!!!");
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        
    }
}