package secondsemester.fixationexercises2;

public class Ex03Obj {
    private String model;

    private int yearOfManufacture;

    private String color;

    private String plate;

    public Ex03Obj(String model, int yearOfManufacture, String color, String plate) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
