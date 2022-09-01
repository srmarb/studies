class Pessoa {

    private int age;
    private String name;


    public Pessoa() {

    }

    public Pessoa(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}