package objectclassdemo;

public class ProductClient {

    public static void main(String[] args) {
        Product product1 = new Product(1,"lakme",99,100);
        Product product2 = new Product(2,"lakme",99,100);
        Product product3 = product1;

        System.out.println(product1.equals(product2));
        System.out.println(product1.equals(product3));

        System.out.println("##Printing all the products :");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println("##Printing hashcode :");
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product3.hashCode());

    }
}
