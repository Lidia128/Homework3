public class Main {
    public static void main(String[] args) {

    //Задача № 1
        System.out.println("Задача № 1");
        System.out.println();
    int dog=8;
        System.out.println("Значенное переменной dog с типом int равно " +dog );
    byte cat=3;
        System.out.println("Значенное переменной cat с типом byte равно " +cat );
    short fish=5;
        System.out.println("Значенное переменной fish с типом short равно " +fish );
    long mouse=18L;
        System.out.println("Значенное переменной mouse с типом long равно " +mouse );
    float kg=2.5f;
        System.out.println("Значенное переменной kg с типом float равно " +kg );
    double gramm=5.12;
        System.out.println("Значенное переменной gramm с типом double равно " +gramm );
        System.out.println();
    //Задача № 2
        System.out.println("Задача № 2");
        System.out.println();
    float apple=27.12f;
        System.out.println(apple);
    long metr=987678965549L;
        System.out.println(metr);
    byte bried=2;
        System.out.println(bried);
    int flower=786;
        System.out.println(flower);
    boolean year=1>2;
        System.out.println(year);
    char task=569;
        System.out.println(task);
    short kilo=-159;
        System.out.println(kilo);
    int thing=27897;
        System.out.println(thing);
    double age=67.;
        System.out.println(age);
        System.out.println();
    //задача № 3
        System.out.println("Задача № 3");
        System.out.println();
    int ludmilaIvanovna=23;
    int annaSergeevna=27;
    int ekaterinaAndreevna=30;
    int totalPaper=480;
    int paperStudent=totalPaper/(ludmilaIvanovna+annaSergeevna+ekaterinaAndreevna);
        System.out.println("На каждого ученика расчитано " +paperStudent+ " листов бумаги.");
        System.out.println();
    //Задача № 4
        System.out.println("Задача № 4");
        System.out.println();
    int bottal2Minit=16;
    int bottal20Minit=bottal2Minit*10;
        System.out.println("За 20 минут машина произвела бутылок " +bottal20Minit+ " штук.");
    int bottal1Houre=bottal20Minit*3;
    int bottal1Day=bottal1Houre*24;
        System.out.println("За 1 сутки машина произвела бутылок " +bottal1Houre+ " штук.");
    int bottal3Day=bottal1Day*3;
        System.out.println("За 3 дня машина произвела бутылок " +bottal3Day+ " штук.");
    long bottal1Month=bottal1Day*30L;
        System.out.println("За 1 месяц машина произвела бутылок " +bottal1Month+ " штук.");
        System.out.println();
    //Задача № 5
        System.out.println("Задача № 5");
        System.out.println();
    int allColor=120;
    int whiteColor=2;
    int brownColor=4;
    int allClass=120/(whiteColor+brownColor);
    int onliWhite=allClass*2;
    int onliBrown=allClass*4;
        System.out.println("В школе, где " +allClass+ " классов, нужно " +onliWhite+ " банок белой краски и "
                +onliBrown+ " коричневой краски");
        System.out.println();
    //Задача № 6
        System.out.println("Задача № 6");
        System.out.println();
        int bananas=80;
        int milk=105;
        int actCrem=100;
        int egg=70;
        int all=(bananas*5)+(milk*2)+(actCrem*2)+(egg*4);
        System.out.println("Завтрак весит " +all+ " грамм");
        float allKg=all/1000f ;
        System.out.println("Завтрак весит " +allKg+ " килограм");
        System.out.println();
    //Задача № 7
        System.out.println("Задача № 7");
        System.out.println();
        int allWeight=7000;
        int weight250=250;
        int weight500=500;
        int weightSlowly=allWeight/weight250;
        System.out.println("Потеря веса по " +weight250+ " грамм за " +weightSlowly+ " дней");
        int weightFast=allWeight/weight500;
        System.out.println("Потеря веса по " +weight500+ " грамм за " +weightFast+ " дней");
        int weightMidl=(weightSlowly+weightFast)/2;
        System.out.println("Потеря веса по в среднем за " +weightMidl+ " дней");
        System.out.println();
    //Задача № 8
        System.out.println("Задача № 8");
        System.out.println();
        int masha=67760;
        int denis=83690;
        int kristina=76230;
        double mashaNew=masha*1.1;
        int mashaOldIncome=masha*12;
        double mashaNewIncome=mashaNew*12;
        double mashaTotalIncome=mashaNewIncome-mashaOldIncome;
        System.out.println("Маша теперь получает " +mashaNew+ " рублей. Годовой доход вырос на " +mashaTotalIncome+ " рублей");
        double denisNew=denis*1.1;
        double denisOldIncome=denis*12;
        double denisNewIncome=denisNew*12;
        double denisTotalIncome=denisNewIncome-denisOldIncome;
        System.out.println("Денис теперь получает " +denisNew+ " рублей. Годовой доход вырос на " +denisTotalIncome+ " рублей");
        double kristinaNew=kristina*1.1;
        double kristinaOldIncome=kristina*12;
        double kristinaNewIncome=kristinaNew*12;
        double kristinaTotalIncome=kristinaNewIncome-kristinaOldIncome;
        System.out.println("Кристина теперь получает " +kristinaNew+ " рублей. Годовой доход вырос на " + kristinaTotalIncome+ " рублей");













    }
}