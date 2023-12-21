public class Car <T extends  Vehicle> implements Printer {
    private String name;
    private Color color;

    public Car(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }

    @Override
    public void printer() {
        System.out.println("Car{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}'
    );
    }
}
