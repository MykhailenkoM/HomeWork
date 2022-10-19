package documentWorker;

public class DocumentWorker {
    public String toString() {
        return "У Вас базова версія програми";
    }

    void openDocument(){
        System.out.println("Документ відкритий");
    }

    void editDocument(){
        System.out.println("Зміна документа доступна тільки у версії 'Pro'");
    }

    void saveDocument(){
        System.out.println("Збереження документа доступна тільки у версії 'Pro'");
    }


}
