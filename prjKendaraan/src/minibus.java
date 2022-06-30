public class minibus extends bus implements interfaceSedan{
    private String tipe;
    private float jumlah;
    interfaceSedan interfaceSedan;

    public minibus(){
        this.tipe = null;
    }

    public minibus(String noPlat, String merk, float pajak, String fasKeamanan, String fasKenyamanan, int kapCC, int kpsPenumpang, int kpsBagasi, String tipe){
        super(noPlat, merk, pajak, kpsPenumpang, kpsBagasi);
        this.tipe = tipe;
        interfaceSedan = new childSedan(noPlat, merk, pajak, fasKeamanan, fasKenyamanan, kapCC);
    }

    @Override
    public void infoSedan() { //override dari infoSedan
      interfaceSedan.infoSedan();
    }

    public void infoMiniBus(){ //membuat infoMiniBus
        if(tipe == "Pribadi"){
            System.out.println("Tipe MiniBus: Pribadi, digunakan sebagai kendaraan pribadi\n");
        }
        else if(tipe == "Wagon"){
            System.out.println("Tipe MiniBus: Wagon, digunakan sebagai kendaraan angkut/travel\n");
        }
    }

    @Override
    public void tampilInfo(){ //override dgn memuat tampilInfo
        System.out.println("========================   Info Mini Bus   ========================");
        interfaceSedan.tampilInfo();
        infoBus();
        infoMiniBus();
    }
    @Override
    public float hitungPajak(){ //membuat fungsi untuk menghitung pajak
        if(tipe == "Pribadi"){
            jumlah = (interfaceSedan.hitungPajak() * 0.05f) + (super.hitungPajak() * 0.03f);
        }
        else if(tipe == "Wagon"){
            jumlah = (interfaceSedan.hitungPajak() * 0.03f) + (super.hitungPajak() * 0.05f);
        }
        return pajak;
    }

}
