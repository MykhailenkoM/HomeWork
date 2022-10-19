package avtomobile;

public class Avtomobile {
    private String weight;
    private String door;
    private String color;

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public void setColor(String color) {
        this.color = color;
    }

        public Avtomobile() {
            color = "white";
            door = "3";
            weight = "9t";
        }

        @Override
    public String toString() {
        return "weight = " + weight + "; color = " + color + "; door = " + door;
        }

}
