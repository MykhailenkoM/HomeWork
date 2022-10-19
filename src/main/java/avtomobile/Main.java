package avtomobile;

public class Main {
    public static void main(String[] args) {
        Avtomobile car = new Avtomobile();
        car.setColor("yellow");
        car.setDoor("2");
        System.out.println("Перший легковий автомобіль має характеристики: " +car);

        Avtomobile car2 = new Avtomobile();
        car2.setColor("blue");
        car2.setDoor("4");
        System.out.println("Другий легковий автомобіль має характеристики: " +car2);

        Avtomobile truck = new Avtomobile();
        System.out.println("Вантажний автомобіль має характеристики: " +truck);

        Avtomobile tank = new Avtomobile();
        tank.setColor("pink");
        System.out.println("Перший танк має характеристики: " +tank);

        Avtomobile tank2 = new Avtomobile();
        tank2.setColor("black");
        tank2.setDoor("1");
        System.out.println("Другий танк має характеристики: " +tank2);

        Avtomobile tank3 = new Avtomobile();
        tank3.setDoor("5");
        tank3.setWeight("30t");
        System.out.println("Третій танк має характеристики: " +tank3);

    }
}
