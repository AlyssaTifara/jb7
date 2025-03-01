public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur){
        this.lembur = lembur;
    }
    public int getLembur(){
        return lembur;
    }
    public void setGajiLembur(double gajiLembur){
        this.gajiLembur = gajiLembur;
    }
    public double getGajiLembur(){
        return gajiLembur;
    }
    public double getGaji(){
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo(){
        System.out.println("-----------------------------");
        System.out.println("NIP             : " + super.getNip());
        System.out.println("Nama            : " + super.getNama());
        System.out.println("Golongan        : " + super.getGolongan());
        System.out.println("Jumlah Lembur   : " + this.getLembur());
        System.out.println("Gaji Lembur     : " + this.getGajiLembur());
        System.out.printf("Gaji            : %.0f\n", this.getGaji());
        // System.out.println("-----------------------------");
    }
}