import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class zad6 {

    public static void main(String[] args) throws FileNotFoundException {


          File file = new File("plik.txt");
         Scanner odczyt = new Scanner(file);
        int start =0;
        int licznik=1;
        int nowylicznik=1;


        Map<String,Integer> mapka=new TreeMap<>();

    while(odczyt.hasNextLine()){ // skanuje dopoki sa linie

        String testString = odczyt.nextLine().replace(".","").replace(",","").toLowerCase();
        char[] tabChar = testString.toCharArray();



        for(int i=0; i<tabChar.length;i++){
            if(tabChar[i]==' '){

                if(start==0){ // dla pierwszego wyrazu
                    String chwilowy = testString.substring(start,i);
                    mapka.put(chwilowy, licznik);
                }
                else{ // dla dalszych wyrazow
                    String chwilowy = testString.substring(start+1,i);
                    if(mapka.containsKey(chwilowy)){
                        mapka.put(chwilowy, licznik);
                    }
                    else
                        mapka.put(chwilowy, licznik);
                }
                start=i;

            }
            if(i==tabChar.length-1){ // dla ostatniego wyrazu

                String chwilowy = testString.substring(start+1,tabChar.length);
                mapka.put(chwilowy,licznik);
            }
        }

        System.out.println(mapka.keySet());
        System.out.println("ilosc elementow : "+mapka.size());

    }
}}
//========================DONE
