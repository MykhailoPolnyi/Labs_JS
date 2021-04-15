package Lab7.DiscountedProduct;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class DiscountedProduct
{
    static private double maxDiscount = 90;

    private double discount;

    private String productName;

    private  String productType;

    private String producer;

    private double startingPrice;

    private double priceWithDiscount;

    private int discountDurationDays;

    private double customersRate;

    protected int maxProductsNum;

    protected boolean isWholesaleDiscount;

    public void setValues(double discount, String productName, String productType, String producer,
                             double startingPrice, double priceWithDiscount, int discountDurationDays,
                             double customersRate, int maxProductsNum, boolean isWholesaleDiscount) {
        this.discount = discount;
        this.productName = productName;
        this.productType = productType;
        this.producer = producer;
        this.startingPrice = startingPrice;
        this.priceWithDiscount = priceWithDiscount;
        this.discountDurationDays = discountDurationDays;
        this.customersRate = customersRate;
        this.maxProductsNum = maxProductsNum;
        this.isWholesaleDiscount = isWholesaleDiscount;
    }

    public DiscountedProduct(double discount, String productName, String productType, String producer,
                             double startingPrice, double priceWithDiscount, int discountDurationDays,
                             double customersRate, int maxProductsNum, boolean isWholesaleDiscount){
        this.setValues(discount, productName, productType, producer,
        startingPrice, priceWithDiscount, discountDurationDays, customersRate, maxProductsNum, isWholesaleDiscount);
    }

    public DiscountedProduct(double discount, String productName, String productType, String producer) {
        this(discount, productName, productType, producer, 0, 0, 0, 0, 0, false);
    }

    public DiscountedProduct(){
        this(0, null, null, null);
    }

    public void resetValues(double discount, String productName, String productType, String producer,
                          double startingPrice, double priceWithDiscount, int discountDurationDays,
                          double customersRate, int maxProductsNum, boolean isWholesaleDiscount) {
        this.setValues(discount, productName, productType, producer,
                startingPrice, priceWithDiscount, discountDurationDays,
                customersRate, maxProductsNum, isWholesaleDiscount);
    }

    public static void printStaticMaxDiscount(){
        System.out.println(maxDiscount);
    }

    public void printMaxDiscount(){
        System.out.println(maxDiscount);
    }

    public static double getMaxDiscount(){
        return maxDiscount;
    }

    public static void setMaxDiscount(double maxDiscountValue){
        maxDiscount = maxDiscountValue;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) throws ValueException {
        if (discount > maxDiscount) {
            throw new ValueException("Discount value cannot be more than maxDiscount: " + maxDiscount);
        } else {
            this.discount = discount;
            this.priceWithDiscount = this.startingPrice * this.discount / 100;
        }
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
        this.priceWithDiscount = this.startingPrice * this.discount/100;
    }

    public double getPriceWithDiscount() {
        return priceWithDiscount;
    }

    public void setPriceWithDiscount(double priceWithDiscount)
            throws ValueException{
        double new_discount = priceWithDiscount/this.startingPrice * 100;
        if (new_discount>maxDiscount){
            throw new ValueException("Discount value cannot be more than maxDiscount: " + maxDiscount);
        }
        this.priceWithDiscount = priceWithDiscount;
        this.discount = new_discount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getDiscountDurationDays() {
        return discountDurationDays;
    }

    public void setDiscountDurationDays(int discountDurationDays) {
        this.discountDurationDays = discountDurationDays;
    }

    public double getCustomersRate() {
        return customersRate;
    }

    public void setCustomersRate(double customersRate) {
        this.customersRate = customersRate;
    }

    public int getMaxProductsNum() {
        return maxProductsNum;
    }

    public void setMaxProductsNum(int maxProductsNum) {
        this.maxProductsNum = maxProductsNum;
    }

    public boolean isWholesaleDiscount() {
        return isWholesaleDiscount;
    }

    public void setWholesaleDiscount(boolean wholesaleDiscount) {
        isWholesaleDiscount = wholesaleDiscount;
    }

    @Override
    public String toString() {
        return "DiscountedProduct{" +
                "discount=" + discount +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", producer='" + producer + '\'' +
                ", startingPrice=" + startingPrice +
                ", priceWithDiscount=" + priceWithDiscount +
                ", discountDurationDays=" + discountDurationDays +
                ", customersRate=" + customersRate +
                ", maxProductsNum=" + maxProductsNum +
                ", isWholesaleDiscount=" + isWholesaleDiscount +
                '}';
    }
}
