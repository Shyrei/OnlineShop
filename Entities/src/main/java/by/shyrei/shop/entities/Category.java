package by.shyrei.shop.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
@Table(name = "categories")
public class Category extends AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "category_id")
    private Category category;
}
