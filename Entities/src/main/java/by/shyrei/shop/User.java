package by.shyrei.shop;

import lombok.*;
import javax.persistence.*;

/**
 * Created by Uladzimir on 20.04.2017.
 */
@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbstractEntity {
    @Id @GeneratedValue
    private Long id;
    @Column
    private String email;
    @Column
    private String password;
    @ManyToOne(cascade = CascadeType.ALL) @JoinColumn(name = "role_id")
    private Role role;

    public User() {
    }
}