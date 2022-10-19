package abstractHandler;

public class Main {
    public static void runHandler(AbstractHandler abstractHandler) {
        abstractHandler.change();
        abstractHandler.create();
        abstractHandler.open();
        abstractHandler.save();
    }

    public static void qualifierHandler(AbstractHandler handler){
        String name = handler.getClass().getName();
        if (name.contains(".xml")){
            runHandler(handler);
        } else if (name.contains(".doc")) {
            runHandler(handler);
        } else if (name.contains(".txt")) {
            runHandler(handler);
        }
    }

    public static void main(String[] args) {
        AbstractHandler handler = new DOCHandler();
        qualifierHandler(handler);
        qualifierHandler(new XMLHandler());
        qualifierHandler(new TXTHandler());
    }

}
