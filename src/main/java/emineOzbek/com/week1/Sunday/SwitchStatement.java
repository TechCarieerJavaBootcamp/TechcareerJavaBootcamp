package emineOzbek.com.week1.Sunday;

public class SwitchStatement {
    public static void main(String[] args) {

        int sayi = 4;

        switch (sayi) {
            case 1:
                System.out.println("Sayı 1 case'ine girdi.");
                break;
            case 2:
                System.out.println("Sayı 2 case'ine girdi.");
            case 3:
                System.out.println("Sayı 3 case'ine girdi.");
                break;
            default:
                System.out.println("Sayı 1, 2, 3 case'ine girmedi.");
        }

        String today = "SSalı";
        switch (today) {
            case "Pazartesi":
                System.out.println("Bugün günlerden Pazartesi.");
                break;
            case "Salı":
                System.out.println("Bugün günlerden Salı.");
                break;
            case "Çarşamba":
                System.out.println("Bugün günlerden Çarşamba.");
                break;
            case "Perşembe":
                System.out.println("Bugün günlerden Perşembe.");
                break;
            case "Cuma":
                System.out.println("Bugün günlerden Cuma.");
                break;
            case "Cumartesi":
                System.out.println("Bugün günlerden Cumartesi.");
                break;
            case "Pazar":
                System.out.println("Bugün günlerden Pazar.");
                break;
            default:
                System.out.println("Hatalı giriş.");
        }
    }
}
