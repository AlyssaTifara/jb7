public class main_manusia {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();


        manusia.bernapas();
        manusia.makan();

        dosen.bernapas();
        dosen.makan();
        dosen.lembur();

        mahasiswa.bernapas();
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}