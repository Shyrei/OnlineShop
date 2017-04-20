package by.shyrei.shop;

import lombok.*;
import javax.persistence.*;

/**
 * Created by Uladzimir on 20.04.2017.
 */
@Entity
@Table(name = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category extends AbstractEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "category_id")
    private Category category;
}
