public class Store
{
    private Product[] products;
    private int total = 0;


    public Store(int numberItems) {
        this.products = new Product[numberItems];
    }

    private boolean isFull() {
        return total == products.length;
    }

    private boolean isEmpty() {
        return total == 0;
    }

    public boolean add(Product product) {
        if(isFull())
            return false;
        else {
            products[total] = product;
            total++;
            return true;
        }
    } // end of add()

    public String listProducts() {
        if (isEmpty()) {
            return "No products in the store";
        } else {
            String listOfProducts = "";
            for (int i = 0; i < total; i++) {
                listOfProducts += i + ": " + products[i] + "\n";
            }
            return listOfProducts;
        }
    }
} // end of store class
