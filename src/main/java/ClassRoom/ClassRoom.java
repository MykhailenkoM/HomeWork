package ClassRoom;

public class ClassRoom {
    private Pupil[] pupils;

        ClassRoom(Pupil ...pupils){
            this.pupils = pupils;
        }

    public Pupil[] getPupil() {
        return pupils;
    }
}
