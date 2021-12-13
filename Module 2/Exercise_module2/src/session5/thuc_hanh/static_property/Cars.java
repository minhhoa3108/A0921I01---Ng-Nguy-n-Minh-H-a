package session5.thuc_hanh.static_property;

public class Cars {
    private String name;
    private String engine;
    public static int numberOfCars;

    public Cars(String name, String egine){
        this.name = name;
        this.engine = egine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
