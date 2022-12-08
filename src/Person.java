public abstract class Person {
    private String address;
    private String name;
    private int age;
    private String gender;

    public Person(String address, String name, int age, String gender) {
        this.address = address;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address: " + address + '\'' +
                " name: " + name + '\'' +
                " age: " + age +
                " gender: " + gender + '\'' +
                '}';
    }
}
