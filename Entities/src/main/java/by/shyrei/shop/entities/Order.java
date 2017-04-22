package by.shyrei.shop.entities;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Project OnlineShop
 * Created on 20.04.2017.
 * author Uladzimir
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends AbstractEntity implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column
    private Timestamp timestamp;
    @Column
    private Status status;
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "user_id")
    private User owner;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "orders_has_products",
            joinColumns = {@JoinColumn(name = "order_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")}
    )
    private List<Product> products;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        if (!super.equals(o)) return false;

        Order order = (Order) o;

        if (id != null ? !id.equals(order.id) : order.id != null) return false;
        if (timestamp != null ? !timestamp.equals(order.timestamp) : order.timestamp != null) return false;
        if (status != order.status) return false;
        return owner != null ? owner.equals(order.owner) : order.owner == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }
}
