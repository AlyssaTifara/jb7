public class Utama {
    public static void main(String[] args) {
        System.out.println("Program testing Class Manager & Staff");
        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        man[0] = new Manager();
        man[0].setNama("Renaldi");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5_000_000);
        man[0].setBagian("Adminitrasi");
    
        man[1] = new Manager();
        man[1].setNama("Tissa");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2_500_000);
        man[1].setBagian("Pemasaran");
    
        staff1[0] = new Staff();
        staff1[0].setNama("Tedjo");
        staff1[0].setNip("0003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10_000);

        staff1[1] = new Staff();
        staff1[1].setNama("Alderbaran");
        staff1[1].setNip("0004");
        staff1[1].setGolongan("3");
        staff1[1].setLembur(15);
        staff1[1].setGajiLembur(5_500);

        staff2[0] = new Staff();
        staff2[0].setNama("Atika");
        staff2[0].setNip("0005");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(7);
        staff2[0].setGajiLembur(20_000);

        staff2[1] = new Staff();
        staff2[1].setNama("Hendra");
        staff2[1].setNip("0006");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100_000);

        staff2[2] = new Staff();
        staff2[2].setNama("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setGolongan("3");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20_000);
        man[1].setStaff(staff1);
        man[0].setStaff(staff2);

        man[0].lihatInfo();
        man[1].lihatInfo();
        staff1[0].lihatInfo();
        staff1[1].lihatInfo();
        staff2[0].lihatInfo();
        staff2[1].lihatInfo();
        staff2[2].lihatInfo();
    }
}