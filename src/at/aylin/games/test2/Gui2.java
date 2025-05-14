package at.aylin.games.test2;

public class Gui2 implements Gui{
    private Scanner scanner = new Scanner(System.in);

    private List<Product> products = new ArrayList<>();

    @Override
    public void start() {
        while(true){
            System.out.println("1) show products");
            System.out.println("2) ...");
            int selection = scanner.nextInt();

            if (selection==1){
                for (Product product:this.products
                ) {
                    System.out.println(product.getTitle());
                }
            }

        }

    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }
}
