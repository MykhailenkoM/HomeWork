package ClassRoom;

public class BadPupil extends Pupil{
    BadPupil(String name){
        this.name = name;
    }
    @Override
    void study() {
        System.out.println("Цей учень вчиться погано");
    }

    @Override
    void read() {
        System.out.println("Цей учень читає погано");
    }

    @Override
    void write() {
        System.out.println("Цей учень пише погано");
    }

    @Override
    void relax() {
        System.out.println("Шаройобиться, тому не вчиться");
    }
}
