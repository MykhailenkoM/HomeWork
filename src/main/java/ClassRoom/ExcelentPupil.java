package ClassRoom;

public class ExcelentPupil extends Pupil{
    ExcelentPupil(String name){
        this.name = name;
    }

    @Override
    void study() {
        System.out.println("Цей учень вчиться на відмінно");
    }

    @Override
    void read() {
        System.out.println("Цей учень читає на відмінно");
    }

    @Override
    void write() {
        System.out.println("Цей учень пише на відмінно");
    }

    @Override
    void relax() {
        System.out.println("Задрот, тому не відпочиває");
    }
}
