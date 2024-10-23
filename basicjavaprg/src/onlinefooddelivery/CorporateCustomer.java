package onlinefooddelivery;

class CorporateCustomer extends Customer {
    @Override
    public double getDiscountRate() {
        return 0.15; // 15% discount
    }
}
