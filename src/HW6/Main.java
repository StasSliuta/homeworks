package HW6;

public class Main {
    public static void main(String[] args) {
        Candy jelly = new Jelly("jelly", 358, 23);
        Candy caramels = new Caramels("caramels", 474, 48);
        Candy chocolate = new Chocolate("chocolate", 425, 35);
        Candy bubbleGum = new BubbleGum("bubbleGum", 359, 44);
        Gift gift = new Gift();
        gift.addCandy(jelly);
        gift.addCandy(caramels);
        gift.addCandy(chocolate);
        gift.addCandy(bubbleGum);
        gift.selectSugar();
        gift.lvlsugar(370);
        gift.weightOfGift();
    }
}