package iot.lab7.products;

public class Main
{
    public static void main(String [] args) {
        DiscountedProduct rastishka = new DiscountedProduct(10, "Rastishka", "Yoghurt", "Danone",
                15, 10, 8, 4, false);
        DiscountedProduct svitoch = new DiscountedProduct(15, "Svitoch", "Chokolate", "Nestle");
        DiscountedProduct tomatoes = new DiscountedProduct();

        System.out.println("First Product:\n" + rastishka);
        System.out.println("Second Product:\n" + svitoch);
        System.out.println("Third Product:\n" + tomatoes);

        DiscountedProduct.printStaticMaxDiscount();
        tomatoes.printMaxDiscount();
     }
}
