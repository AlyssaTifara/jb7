public class PerkalianKu {
    void perkalian(int a, int b){
        System.out.println("Hasil Perkalian 2 Bilangan: " + a * b);
    }

    void perkalian(int a, int b, int c){
        System.out.println("Hasil Perkalian 3 Bilangan: " + a * b * c);
    }

    public static void main(String[] args) {
        PerkalianKu objek = new PerkalianKu();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}
