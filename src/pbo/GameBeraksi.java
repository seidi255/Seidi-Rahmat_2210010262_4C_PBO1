
package pbo;
import java.util.Scanner;

public class GameBeraksi {
    public static void main(String[] args) {
        //objek
       // TokoGame gme = new TokoGame("gundam","G01","action",120000);
         
       // System.out.println(gme.displayinfo());
        //System.out.println(gme.displayinfo("Bar-bar game center"));
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //aray
            GameVoucher[] gme = new  GameVoucher[2];

            //perulangan menggunakan for
            for(int i=0; i<gme.length; i++) {
                System.out.println("=====================");
                System.out.print("Masukan nama Game"+(i+1)+": ");
                String nama = scanner.nextLine();
                System.out.print("Masukan kode"+(i+1)+": ");
                String kode = scanner.nextLine();
                System.out.print("Masukan gendre"+(i+1)+": ");
                String gendre = scanner.nextLine();
                System.out.print("Masukan Harga"+(i+1)+": ");
                int harga = scanner.nextInt();
                scanner.nextLine();

                //objek
                gme[i]= new GameVoucher(nama, kode, gendre, harga);
            }

            for(GameVoucher data:gme){
                System.out.println(data.displayinfo());
        }
        
        }catch(NumberFormatException e){
             System.out.println("kesalahan format nomor: "+e.getMessage());       
        }
        catch (Exception e){
            System.out.println("kesalahan umum: "+e.getMessage());
            
        }
    }
}
