package abstractHandler;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Відкритий файл формату .xml");
    }

    @Override
    void create() {
        System.out.println("Створений файл формату .xml");
    }

    @Override
    void change() {
        System.out.println("Змінений файл формату .xml");
    }

    @Override
    void save() {
        System.out.println("Збережений файл формату .xml");
    }
}
