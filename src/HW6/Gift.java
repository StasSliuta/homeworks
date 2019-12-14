package HW6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gift {
    List<Candy> candies = new ArrayList<>();

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public void selectSugar() {
        Collections.sort(candies, new SelectSugar());
        for (int i = 0; i < candies.size(); i++)
        System.out.println(candies.get(i));
    }

    public void lvlsugar(int level) {
        System.out.println("Candies with sugar level less than " + level + ":");
        candies.stream()
                .filter(x -> x.getSugar() <= level)
                .forEach(System.out::println);
    }

    public void weightOfGift() {
        int sum = candies.stream()
                .mapToInt(x -> x.getWeight()).sum();
        System.out.println("Weight of gift is " + sum);
    }
}