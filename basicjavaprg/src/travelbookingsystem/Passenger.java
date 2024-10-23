package travelbookingsystem;

public class Passenger {
    private String type; 
    private double discount;

    public Passenger(String type) {
        this.type = type;
        setDiscount();
    }

    private void setDiscount() {
        switch (type.toLowerCase()) {
            case "adult":
                this.discount = 0; 
                break;
            case "child":
                this.discount = 50; 
                break;
            case "senior":
                this.discount = 30; 
                break;
            default:
                throw new IllegalArgumentException("Invalid passenger type");
        }
    }

    public double getDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }
}
