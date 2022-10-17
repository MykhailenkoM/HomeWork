package ClassRoom;

public class GoodPupil extends Pupil{
    GoodPupil(String name) {
        this.name = name;
    }

    @Override
    void study() {
        System.out.println("Цей учень вчиться добре");
    }

    @Override
    void read() {
        System.out.println("Цей учень читає добре");
    }

    @Override
    void write() {
        System.out.println("Цей учень пише добре");
    }

    @Override
    void relax() {
        System.out.println("Не задрот, тому трохи відпочиває");
    }
}
