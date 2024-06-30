
package pbo;

//inhertinance
public class GameVoucher extends TokoGame{
    //overriding
   
    
    public GameVoucher(String nama, String kode, String gendre, int harga){
        super(nama, kode, gendre, harga);
        
    }

    //seleksi
    public String getDapatVoucher(){
        String kodeH = getKode().substring(0, 3);
        if(kodeH.equals("G01")){
            return "selamat anda mendapat vocher game senilai 20.000";
        }else{
            return "anda tidak mendapat voucher";
        }
    }
    
    //polymorphim overriding
    @Override
    public String displayinfo(){
        return super.displayinfo()+"\nSistem: "+getDapatVoucher();
    }
    
}
