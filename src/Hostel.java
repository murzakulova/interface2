public class Hostel extends Person implements Money {
    public Hostel(String address, String name, int age, String gender) {
        super(address, name, age, gender);
    }

    @Override
    public void money() {
        System.out.println("Аренда:20 тысяч в месяц");
    }

    @Override
    public String toString() {
        return "Hostel{}" + super.toString();
    }
}
