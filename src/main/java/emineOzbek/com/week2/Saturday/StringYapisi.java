package emineOzbek.com.week2.Saturday;

public class StringYapisi {
    public static void main(String[] args) {

        String string1 = new String("Emine");
        String string4 = new String("Emine");
        String str = "Emine";
        String string2 = "Beliz";
        String string3;
        string3 = "Can";
        string2 = "Can";

        if (string2 == string3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string2.equals(string3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string1 == string4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string1.equals(string4)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string2 == string3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string2.equals(string3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string1 == str) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (string1.equals(str)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        String variable = "Emine";
        String varible2 = new String("Emine");
        System.out.println(variable == varible2);
        System.out.println(variable.equals(varible2));

        String name = "Hüseyin";
        String nameLastName = name + " Coşkun";
        System.out.println(nameLastName);

        String name2 = "Yağmur";
        name2 = "Muhammed";
        System.out.println(name2);

        String name3 = new String("Emre");
        name3 = "Yunus";

        String isim = new String("Nisa");  // R101
        isim = "Emine";                           // A101
        isim = new String("Nisa");         // B101
        isim = "Emine";                            // A101

        isim.intern();


        String sayac = "Sayaç Değeri: ";
        for (int i = 0; i < 10; i++) {
            sayac = sayac + i;
            System.out.println(sayac);
        }

        StringBuilder stringBuilder = new StringBuilder("Sayaç Değeri: ");
        for (int i = 0; i < 10; i++) {
            stringBuilder = stringBuilder.append(i);
            System.out.println(stringBuilder);
        }


        String cumle = "Merhaba Dünyalı!";
        cumle = cumle.substring(3, 8);
        System.out.println(cumle);

    }
}
