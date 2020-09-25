public class PriceComparator implements Comparable<Product> {

    @Override
    public int compareTo(Product o) {
        if (!(o.getPrice() < o.getPrice())) {
            if (o.getPrice() == o.getPrice()){
                return 0;
            }else {
                return -1;
            }
        } else {
            return 1;
        }
    }
}
