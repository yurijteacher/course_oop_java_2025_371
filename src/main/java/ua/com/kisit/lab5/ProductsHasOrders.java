package ua.com.kisit.lab5;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ProductsHasOrders {

    private Long id;
    private Products product;
    private Orders order;
    private int quantity;

    @Override
    public String toString() {
        return "ProductsHasOrders{" +
                "id=" + id +
                ", product=" + product +
                ", order=" + order +
                ", quantity=" + quantity +
                '}';
    }
}
