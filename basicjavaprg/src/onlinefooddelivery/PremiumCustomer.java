package onlinefooddelivery;

class PremiumCustomer extends Customer {
    @Override
    public double getDiscountRate() {
        return 0.10; // 10% discount
    }
}
