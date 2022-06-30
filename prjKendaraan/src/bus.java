public class bus extends mobil {
    protected int kpsPenumpang, kpsBagasi;
    protected float jumlah;

    public bus(){
        this.kpsPenumpang = 0;
        this.kpsBagasi = 0;
        this.jumlah = 0;
    }

    public bus(String noPlat, String merk, float pajak, int kpsPenumpang, int kpsBagasi){
        super(noPlat, merk, pajak);
        this.kpsPenumpang = kpsPenumpang;
        this.kpsBagasi = kpsBagasi;
    }

    public float hitungPajak(){
        jumlah = pajak + (pajak * kpsPenumpang * kpsBagasi * 0.00005f);
        return pajak;
    }

    
    public void infoBus(){
        System.out.println("Kapsitas Penumpang: " + kpsPenumpang + "orang");
        System.out.println("Kapsitas Bagasi: " + kpsBagasi + "kg");
        System.out.println("");
    }

    @Override
    public void tampilInfo(){
        super.tampilInfo();
        infoBus();
    }
}
