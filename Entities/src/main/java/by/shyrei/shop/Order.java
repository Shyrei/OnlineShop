package by.shyrei.shop;

import lombok.*;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by Uladzimir on 20.04.2017.
 */
@Entity
@Table(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order extends AbstractEntity {
    @Id
    @GeneratedValue
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
}
