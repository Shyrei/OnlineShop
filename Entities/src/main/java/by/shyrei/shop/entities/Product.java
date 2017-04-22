package by.shyrei.shop.entities;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Project OnlineShop
 * Created on 20.04.2017.
 * author Uladzimir
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product extends AbstractEntity implements Serializable{
    @Id @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private int price;
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "category_id")
    private Category category;
}