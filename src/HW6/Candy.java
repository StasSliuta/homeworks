package HW6;

import java.util.Comparator;

public class Candy {
    String name;
    int weight;
    int sugar;

    Candy(String n, int w, int s) {
        name = n;
        sugar = s;
        weight = w;
    }

    public int getSugar() {
        return sugar;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return name + ", sugar = " + getSugar() + ", weight = " + getWeight();
    }
}
class Jelly extends Candy {
        Jelly(String n, int s, int w) {
            super(n, s, w);
        }
    }

    class Caramels extends Candy {
        Caramels(String n, int s, int w) {
            super(n, s, w);
        }
    }

    class Chocolate extends Candy{
         Chocolate(String n, int s, int w) {
             super(n, s, w);
         }
    }

    class BubbleGum extends Candy{
        BubbleGum(String n, int s, int w) {
            super(n, s, w);
        }
    }

    class SelectSugar implements Comparator<Candy> {
        public int compare(Candy a, Candy b) {
            return a.sugar - b.sugar;
        }
    }