package Lab7.DiscountedProduct;

public class Main
{
    public static void main(String [] args)
    {
        DiscountedProduct Rastishka = new DiscountedProduct(10, "Rastishka", "Yoghurt", "Danone",
                15, 13.5, 10, 8, 4, false);

        DiscountedProduct Svitoch = new DiscountedProduct(15, "Svitoch", "Chokolate", "Nestle");

        DiscountedProduct Tomatoes = new DiscountedProduct();

        System.out.println("First Product:\n" + Rastishka);

        System.out.println("Second Product:\n" + Svitoch);

        System.out.println("Second Product:\n" + Tomatoes);

        DiscountedProduct.printStaticMaxDiscount();

        Tomatoes.printMaxDiscount();
     }
}
