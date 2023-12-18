package emineOzbek.com.week2.Sunday.Oop;

public class Oop {
    public static void main(String[] args) {

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.name = "Kübra";
        ogretmen.setAge(34);

        ogretmen.okulaGider();

        toplam(2, 7);
        //System.out.println(toplam(2,7));

        islem();

        degerAraligi(3);

        toplam3(3);
        toplam3(3,5);

    }

    public static void toplam(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void islem() {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                return;
                //break;
            }
        }
        System.out.println("-------");
    }

    public static boolean degerAraligi(int a) {
        return a<5;
    }

    public static void toplam3(int a){

    }
    public static void toplam3(int a, int b){

    }
}
