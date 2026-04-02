public class Main {
        public static void main(String[] args) {
            ProductManager manager = new ProductManager();

            System.out.println("========== 1. THÊM SẢN PHẨM ==========");
            manager.addProduct(new Product("Laptop Dell", 15000000, 101));
            manager.addProduct(new Product("Bàn phím cơ", 1200000, 102));
            manager.addProduct(new Product("Chuột Logitech", 500000, 103));
            manager.addProduct(new Product("Màn hình LG", 4500000, 104));

            System.out.println("Danh sách sản phẩm hiện tại:");
            manager.showProduct();

            System.out.println("\n========== 2. SỬA SẢN PHẨM (ID = 102) ==========");
            Product updatedProduct = new Product("Bàn phím cơ Xịn", 1800000, 102);
            manager.editProduct(updatedProduct);

            System.out.println("Danh sách sau khi sửa:");
            manager.showProduct();

            System.out.println("\n========== 3. TÌM KIẾM SẢN PHẨM ==========");
            System.out.println("Tìm từ khóa: 'màn hình lg'");
            manager.searchProduct("màn hình lg");

            System.out.println("\n========== 4. SẮP XẾP GIÁ TĂNG DẦN ==========");
            manager.sortProductByPriceAscending();
            manager.showProduct();

            System.out.println("\n========== 5. SẮP XẾP GIÁ GIẢM DẦN ==========");
            manager.sortProductByPriceDescending();
            manager.showProduct();

            System.out.println("\n========== 6. XÓA SẢN PHẨM (ID = 101) ==========");
            manager.deleteProduct(101);

            System.out.println("Danh sách sau khi xóa:");
            manager.showProduct();
        }
    }

