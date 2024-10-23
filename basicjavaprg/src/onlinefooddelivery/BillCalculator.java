package onlinefooddelivery;

class BillCalculator {
    
    public double calculateBill(double orderAmount) {
        return orderAmount; 
    }

    
    public double calculateBill(double orderAmount, double discount) {
        return orderAmount - discount; 
    }

    
    public double calculateBill(double orderAmount, double discount, Customer customer) {
        double discountRate = customer.getDiscountRate();
        double discountAmount = orderAmount * discountRate;
        return orderAmount - discountAmount; 
    }
}
