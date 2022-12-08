public class Hotel extends Person implements Money {

    public Hotel(String address, String name, int age, String gender) {
        super(address, name, age, gender);
    }

    @Override
    public void money() {
        System.out.println("Аренда:20 тысяч в месяц");
    }

    @Override
    public String toString() {
        return "Hotel{}" + super.toString();
    }
}



