import java.util.*;

public class ProductManager {
    public static ArrayList<Product> productsLists = new ArrayList<>();

    public static void main(String[] args) {


        Product product1 = new Product(1, "Book", 15000);
        Product product2 = new Product(2, "Pen", 20000);
        Product product3 = new Product(3, "Eraser", 5000);

        productsLists.add(product1);
        productsLists.add(product2);
        productsLists.add(product3);

        ProductManager productManager = new ProductManager();
        productManager.sortProductByPriceAscending();
        productManager.sortProductByPriceDecrease();

    }
    Scanner scanner = new Scanner(System.in);
    public void addProduct(){
        System.out.println("Nhập tên sp");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sp");
        double price = scanner.nextDouble();
        if (productsLists.add(new Product(productsLists.size()+1, name,price))){
            System.out.println("Thêm thành công");
        }else {
            System.out.println("Không thành công");
        }
    }

    public void editProduct(){
        System.out.println("Nhập ID sp cần sửa");
        int id = scanner.nextInt();
        if (id >= 1 && id <= productsLists.size()){
            System.out.println("Nhập tên mới cho sp " + productsLists.get(id-1).getName()+" : ");
        String newName = scanner.nextLine();
        productsLists.get(id-1).setName(newName);
            System.out.println("Sửa thành công");
        }else {
            System.out.println("ID không đúng");
        }
    }
    public void deleteProduct(){
        System.out.println("Nhập ID sp muốn xóa: ");
        int id = scanner.nextInt();
        if (id >= 1 && id <= productsLists.size()){
            productsLists.remove(id-1);
            System.out.println("Xóa thành công");
        }else {
            System.out.println("ID không đúng");
        }
    }

    public void displayListProduct(){
        for (Product product :productsLists){
            System.out.println(product.toString());
        }
    }

    public void findProductByName(){
        System.out.println("Nhập tên sp");
        String nameNeedFind = scanner.nextLine();
        boolean checkFind = true;
        for (Product product : productsLists){
            if (nameNeedFind.equals(product.getName())){
                System.out.println(product.toString());
                checkFind = false;
            }
        }
        if ((checkFind)){
            System.out.println("Tên không tồn tại");
        }
    }
    public void sortProductByPriceAscending(){
        Collections.sort(productsLists);
        displayListProduct();
    }
    public void sortProductByPriceDecrease(){
        Collections.reverse(productsLists);
        displayListProduct();
    }
}