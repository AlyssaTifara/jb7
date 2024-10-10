public class Main_Segitiga{
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        int sudutC = segitiga.totalSudut(60); 
        System.out.println("---------------------");
        System.out.println("Sudut ketiga : " + sudutC);

        int sudutD = segitiga.totalSudut(45, 60); 
        System.out.println("Sudut ketiga : " + sudutD);

        int keliling1 = segitiga.keliling(3, 4, 5); 
        System.out.println("Keliling     : " + keliling1);

        double keliling2 = segitiga.keliling(3, 4); 
        System.out.println("Keliling     : " + keliling2);
        System.out.println("---------------------");
    }
}