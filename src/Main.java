public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(" Тургенева 23", "Раяна", 23, "жен");
        Flat flat1 = new Flat("Тургенева 24", "Сумая", 18, "жен");
        Flat flat2 = new Flat("Тургенева 25", "Нуржигит", 22, "муж");
        Hostel hostel = new Hostel("Молодежная 6", "Максат", 19, "муж");
        Hotel hotel = new Hotel("Ленина 17", "Туран", 21, "муж");
        Hotel hotel1 = new Hotel("Октябриский 1", "Гулина", 19, "жен");
        System.out.println(flat + "\n" + flat1 + "\n" + flat2);
        flat.money();
        System.out.println(hostel);
        hostel.money();
        System.out.println(hotel + "\n" + hotel1);
        hotel.money();
    }
}