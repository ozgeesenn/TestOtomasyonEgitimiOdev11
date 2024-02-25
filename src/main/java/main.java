public class main {

    public static void main(String[] args) {

        //SİNGLETON TASARIM ÖRNEĞİ
        Singleton singleton = Singleton.getInstance();
        singleton.methodYazdir();


        //BUİLDER TASARIM ÖRNEĞİ

        System.out.println("Builder example örneği: ");

        BuilderExample araba1 = BuilderExample.builder()
                .withMarka("Toyota")
                .withModel("CHR")
                .withYil(2023)
                .withRenk("Gri")
                .build();

        System.out.println("Araba Markası:" + araba1.getArabaMarka());
        System.out.println("Araba Modeli: "+ araba1.getArabaModel());
        System.out.println("Araba Yil: " + araba1.getYil());
        System.out.println("Araba Rengi: "+ araba1.getRenk());

    }


}
