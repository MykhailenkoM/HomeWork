package ClassRoom;

public class Main {
    public static void main(String[] args) {
        Pupil Sasha = new ExcelentPupil("Sasha");
        Pupil Kostya = new BadPupil("Kostya");
        Pupil Grisha = new GoodPupil("Grisha");

        ClassRoom classRoom = new ClassRoom(Sasha, Kostya, Grisha);
        Pupil[] pupils = classRoom.getPupil();

        for (int i =0; i < pupils.length; i++){
            System.out.println(pupils[i].name);
            pupils[i].study();
            pupils[i].read();
            pupils[i].write();
            pupils[i].relax();
        }

    }
}
