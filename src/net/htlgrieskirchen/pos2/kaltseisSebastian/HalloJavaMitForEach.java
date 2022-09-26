package net.htlgrieskirchen.pos2.kaltseisSebastian;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavaMitForEach {

    public List<String>list = new ArrayList<>();

    public void addString()
    {
        list.add("Hallo");
        list.add("Welt");
    }

    public void printOut()
    {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public void printOutWithListForEach()
    {
        list.forEach((String s)-> System.out.println(s));

        Consumer<String>consumer = (String s)-> System.out.println(s);

        list.forEach(System.out::println);
    }
}
