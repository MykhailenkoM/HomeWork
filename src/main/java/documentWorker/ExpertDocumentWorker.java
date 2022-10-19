package documentWorker;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public String toString() {
        return "У Вас версія програми 'Expert'";
    }

    @Override
    void saveDocument(){
        System.out.println("Документ збережено в новому форматі");
    }
}
