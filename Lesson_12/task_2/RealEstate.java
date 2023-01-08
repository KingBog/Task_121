package Lesson_12.task_2;

public class RealEstate implements Comparable<RealEstate> {
    private int price;
    private int plost;
    private int room;

    public RealEstate(int price, int plost, int room) {
        this.price = price;
        this.plost = plost;
        this.room = room;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPlost() {
        return plost;
    }

    public void setPlost(int plost) {
        this.plost = plost;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "price=" + price +
                ", plost='" + plost + '\'' +
                ", room=" + room +
                '}';
    }

    @Override
    public int compareTo(RealEstate o) {
        int resul=getPrice()-o.getPrice();
        if (resul!=0){
            return getPrice()-o.getPrice();
        }else
            return o.getPlost()-getPlost();
    }
}
