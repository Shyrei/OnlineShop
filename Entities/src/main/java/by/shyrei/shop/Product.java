package by.shyrei.shop;

import lombok.*;
import javax.persistence.*;

/**
 * Created by Uladzimir on 20.04.2017.
 */
@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends AbstractEntity {
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