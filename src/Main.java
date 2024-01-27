import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        String myString =  "esto es una cadena de texto";

        myString = "now i change the valor of my string";

        System.out.println(myString);


        Integer myInteger = 10;
        myInteger = myInteger +5;

        int val1 = 20;

        System.out.println(myInteger);

        String result = (val1 > 10) ? "is the TRUE section" : "is the FALSE section";
        System.out.println(result);

        String name = "Nicolas";

        int myInt = 7;
        int myInt2 = 2;
        Integer myInteger3 = 20;


        List<String> myList = new ArrayList();
        myList.add(name);
        myList.add(myInteger3.toString());

        Map <String, String> myMap = new HashMap();
        Map<String, Integer> myMap2 = new HashMap();

        myMap.put("string", name);
        myMap.put("string", "nicolas");
        myMap2.put("Integer", myInteger3);

        System.out.println(myMap);
    }

    


    //comentario en una sola linea

    /*comentario en bloque
     todo esto esta en comentario*/



}

