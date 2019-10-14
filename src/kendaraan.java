import java.util.Scanner;

public class kendaraan {
    private int id;
    protected float jawal,jarak;
    private float bahan;
   
    public kendaraan(){
        Scanner a = new Scanner(System.in);
        System.out.println("Masukkan ID : ");
        id = a.nextInt();
        System.out.println("Masukkan Jarak awal : ");
        jawal = a.nextFloat();
        System.out.println("Masukkan Jarak tempuh : ");
        jarak = a.nextFloat();
        System.out.println("Masukkan Jumlah Bahan Bakar : ");
        bahan = a.nextFloat();
    }

    public kendaraan(int id, float jawal, float jarak, float bahan) {
        this.id = id;
        this.jawal = jawal;
        this.jarak = jarak;
        this.bahan = bahan;
    }

    public int getId() {
        return id;
    }

    public float getBahan() {
        return bahan;
    }
   
    public float total(){
        return jarak + jawal;
    }

   
   
    
    public float efektifitas(){
        return (float) (Math.exp(jarak/Math.abs(bahan))*Math.log10(2));
    }
    public void info(){
        System.out.println("ID Kendaraan : "+ id);
        System.out.println("Total jarak : "+total());
        System.out.println("Jumlah Bahan Bakar : "+bahan);
      
    }
}