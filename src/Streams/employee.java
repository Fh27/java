package Streams;

public class employee {
    private final String name;
    private  final int sal;

    public String getName() {
        return name;
    }

    public employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
    public int getSal() {
        return sal;
    }
}
