public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("Telefon");
        product.setPrice(3500);
        product.setStockAmount(7);
        product.setDescription("Samsung A8 2022");

        Product product1 = new Product(1,"Leptop","Lenovo",10000,53,"Süper PC");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}