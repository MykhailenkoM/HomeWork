package Address;

public class Main {
    public static void main(String[] args) {
        Address myAddress = new Address();

        myAddress.setIndex(44100);
        myAddress.setCountry("Ukraine");
        myAddress.setCity("Kyiv");
        myAddress.setStreet("Kramskogo");
        myAddress.setHouse(9);
        myAddress.setApartment(170);


    System.out.println("Моя адреса: " + "Індекс - " + myAddress.getIndex() + ", Країна - " + myAddress.getCountry() + ", Місто - " + myAddress.getCity() + ", вулиця - " + myAddress.getStreet() + ", будинок - " + myAddress.getHouse() + ", квартира - " + myAddress.getApartment());

    }
}
