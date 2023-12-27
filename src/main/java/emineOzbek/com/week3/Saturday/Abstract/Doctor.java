package emineOzbek.com.week3.Saturday.Abstract;

public abstract class Doctor {

    private String name;

    public void muayene(){
        System.out.println("Doktor muayene eder.");
    }

    public abstract void uzmanlık();

    public void maasZammiHesapla(int mevcutMaas, int calistigiYil, int zamKatsyisi){
        mevcutMaas = mevcutMaas * calistigiYil * zamKatsyisi;
        System.out.println(mevcutMaas);
    }



}
