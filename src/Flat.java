public class Flat extends Person implements Money {
    public Flat(String address, String name, int age, String gender) {
        super(address, name, age, gender);
    }

    @Override
    public void money() {
        System.out.println("Государственная услуга: 50 тысяч за месяц");
    }

    @Override
    public String toString() {
        return "Flat{}" + super.toString();
    }
}
