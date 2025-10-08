public class Car {
    private String model;
    private String color;
    private String mark;


    public Car(String model, String color, String mark) {
        this.model = model;
        this.color = color;
        this.mark = mark;
    }

    private void required(Object O) {
        if (O == null)
            throw new IllegalArgumentException("O campo deve ser preenchido!");
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMark() {
        return mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car(" + "model: " + model + ", " + "color: " + color + ", " + "mark: " + mark + ")";
    }
}