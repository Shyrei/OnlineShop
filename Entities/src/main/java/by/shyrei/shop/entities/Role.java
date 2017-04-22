package by.shyrei.shop.entities;

import lombok.*;
import javax.persistence.*;

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
@Table(name = "roles")
public class Role extends AbstractEntity {
    @Id @GeneratedValue
    private Long id;
    @Column
    private String name;
}