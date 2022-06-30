public class mobil {
    protected String noPlat, merk;
    protected float pajak;

    public mobil(){
        noPlat = null;
        merk = null;
        pajak = 0;
    }

    public mobil(String noPlat, String merk, float pajak){
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
    }

    public void tampilInfo(){
        System.out.println("No. Plat Mobil: " + noPlat);
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Pajak Mobil: " + pajak);
        System.out.println(" ");
    }
}
