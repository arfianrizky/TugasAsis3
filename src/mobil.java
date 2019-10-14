import java.util.Scanner;

public class mobil extends kendaraan{
    private String nama, tipe;
    private int mesin;
    
    public mobil(){
        
        Scanner b = new Scanner(System.in);
        System.out.println("Masukkan Nama Mobil : ");
        nama = b.nextLine();
        System.out.println("Masukkan Tipe Mobil : ");
        tipe = b.nextLine();
        System.out.println("Masukkan Kapasitas Mesin : ");
        mesin = b.nextInt();
       
        
    }

    public mobil(String nama, String tipe, int mesin) {
        this.nama = nama;
        this.tipe = tipe;
        this.mesin = mesin;
    }

    public mobil(String nama, String tipe, int mesin, int id, float jawal, float jarak, float bahan) {
        super(id, jawal, jarak, bahan);
        this.nama = nama;
        this.tipe = tipe;
        this.mesin = mesin;
    }

   

   

    public String getNama() {
        return nama;
    }

    public String getTipe() {
        return tipe;
    }

   

  
    public void info(){
        super.info();
        System.out.println("Nama mobil :" +nama);
        System.out.println("Tipe mobil :" + tipe);
     
    }
    
    
}