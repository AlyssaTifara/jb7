public class PerkalianKu {
    void perkalian(int a, int b){
        System.out.println("Hasil Perkalian 2 Bilangan: " + a * b);
    }

    void perkalian(double a, double b){
        System.out.println("Hasil Perkalian 2 Bilangan: " + a * b);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}
