public class sedan extends mobil {
    private String fasKeamanan, fasKenyamanan;
    private float jumlah;
    private int kapCC;

    public sedan(){
        this.fasKeamanan = null;
        this.kapCC = 0;
        this.fasKenyamanan = null;
        this.jumlah = 0;
    }

    public sedan(String noPlat, String merk, float pajak, String fasKeamanan, String fasKenyamanan,  int kapCC){
        super(noPlat, merk, pajak);
        this.fasKeamanan = fasKeamanan;
        this.fasKenyamanan = fasKenyamanan;
        this.kapCC = kapCC;
    }
    
    public float hitungPajak(){
        jumlah = pajak + (pajak * kapCC * 0.00005f);
        return pajak;
    }

    public void infoSedan(){
        System.out.println("Fasilitas Keamanan Penumpang: " + fasKeamanan);
        System.out.println("Fasilitas Kenyamanan Penumpang: " + fasKenyamanan);
        System.out.println("Kapasitas CC Mobil Penumpang: " + kapCC);
        System.out.println(" ");
    } 

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        infoSedan();
    }

}
