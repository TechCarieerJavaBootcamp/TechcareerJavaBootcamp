package emineOzbek.com.week3.Saturday.Abstract;

public class EyeDoctor extends Doctor{

    @Override
    public void uzmanlık() {
        System.out.println("Uzmanlık alanı gözdür.");
    }

    @Override
    public void maasZammiHesapla(int mevcutMaas, int calistigiYil, int zamKatsyisi){
        int oran = (mevcutMaas* calistigiYil) * 10/100;
        mevcutMaas = (mevcutMaas * calistigiYil * zamKatsyisi) + oran;
        System.out.println(mevcutMaas);
    }

}
