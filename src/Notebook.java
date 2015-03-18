/*      Tikslai

        TODO Įsisavinti darbo su java aplinka pirminius įgūdžius. Sugebėti kompiuterinėje klasėje paruošti pradini java programos tekstą, sukompiliuoti ir paleisti. Sugebeti "skaityti" java dokumentaciją pateiktąja tema (pvz., java klasė java.lang.String).
        TODO Įsisavinti java programos struktūra: komentarai, klasė, main() metodas, kiti metodai, komandines eilutes parametrų perdavimas, išvestis į standartinį išvedimo srautą (System.out.println() metodas).
        TODO Įsisavinti pagrindines java programavimo kalbos "procedūrines" konstrukcijas: tipai, operacijos, priskyrimas, "standartinės" klasės objekto sukūrimas, metodo iškvietimas, programos valdymo sakiniai. Visiems privaloma žinoti pagrindines operacijas su klase java.lang.String (eilučių sujungimas, patikrinimas, ar viena įeina į kitą, eilutės dalies atskyrimas ir t.t.)
        TODO Sugebėti panaudoti duotosios klasės/paketo funkcionalumą pateiktajai problemai spręsti (žr. konkrečios užduoties formulavimą).
        TODO Sugebėti apibrėžti klasę kaip mažiausią programos statybinį elementą, suprasti kokias paslaugas klasė teikia, kuri jos dalis yra vieša, o kuri ne. Sugebėti apibrėžti tinkamus konstruktorius. Sugebėti sukurti klasės objektus su reikiamą būsena bei metodų kvietimais pertvarkyti būseną į norimą
        TODO Vertinant bus kreipiamas dėmesys, kaip pradinis programos tekstas atitinka java taikomus formatavimo ir žymėjimo principus.

        Užduotis

        DONE Programoje parašyti klasę, kuri geba užtikrinti reikiamą modeliuojamo objekto funkcionalumą. Klasėje turi būti apibrėžti:
            DONE konstruktoriuose, iš kurių vienas beargumentis, panaudoti this() konstrukciją (iš konstruktoriaus su argumentais kreiptis į beargumentį).
            DONE laukai, kuriems prieiga užtikrinama get/set metodais. Bent vienas laukas turi būti inicijuotas pradine reikšme.
            DONE (nestatinius) metodus. Bent vienas metodas turi būti perkrautas (overloaded).
            DONE apibrėžti metodą println(), kuris išveda objekto turinį į išvedimo srautą.
            DONE įtraukti į klasės apibrėžimą ir prasmingai panaudoti static bei final elementus
            TODO apibrėžti kitą (testinę klasę), kuri sukurtų pirmosios klasės objektus, jais pasinaudotų, kviesdama metodus, ir išvedinėtų laukų būsenas.
        DONE Programoje turi būti galimybė įvesti duomenis iš klaviatūros ir padarytas duomenų išvedimas (į konsolę).
        DONE Programos klasių veikimas turi būti prasmingas ir atitikti įgyvendinamą temą/sistemą.
*/

/**
 * Created by Dominykas Ablingis
 */
public class Notebook {
    public static void main(String[] args){
        if ((args.length == 1) && args[0].equals("test")) {
            Tests.constructorTest();
            return;
        }
        UserInterface.start();
    }
}

/*
 * Kaip saugoti csv
 * Kaip skaidyti (package?)
 * nestatiniai metodai
 * println-toString
 * testing
 * terminal
 */