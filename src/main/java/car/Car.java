package car;

public class Car {

    private int year;
    private String color;
    private double speed;
    private int weight;

    public Car() {
        year = 5;
        color = "black";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car(int year, String color, double speed) {
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    public Car(int year, String color, double speed, int weight) {
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }


}
