package documentWorker;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    public String toString() {
        return "У Вас версія програми 'Pro'";
    }

    @Override
    void editDocument(){
        System.out.println("Документ змінено");
    }

    @Override
    void saveDocument(){
        System.out.println("Документ збережено в старому форматі, збереження в інших форматах доступно в версії 'Expert'");
    }

}
