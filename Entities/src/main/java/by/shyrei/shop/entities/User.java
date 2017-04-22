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
@Table(name = "users")
public class User extends AbstractEntity {
    @Id @GeneratedValue
    private Long id;
    @Column
    private String email;
    @Column
    private String password;
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "role_id")
    private Role role;
}