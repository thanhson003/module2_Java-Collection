import java.util.ArrayList;
import java.util.Collections;

public class ProductManager {
    ArrayList<Product> productList = new ArrayList<>();
    public void addProduct(Product product) {
        productList.add(product);
    }
    public void editProduct(Product product) {
        for (Product products : productList) {
            if (products.getId() == product.getId()) {
                products.setName(product.getName());
                products.setPrice((int) product.getPrice());
                break;
            }
        }
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++){
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }

    public void showProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public void searchProduct(String name) {
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
            }
        }
    }

    public void sortProductByPriceAscending() {
        productList.sort((p1, p2) -> Integer.compare((int) p1.getPrice(), (int) p2.getPrice()));
    }

    public void sortProductByPriceDescending() {
        productList.sort((p1, p2) -> Integer.compare((int) p2.getPrice(), (int) p1.getPrice()));
    }
}
