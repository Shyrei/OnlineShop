package by.shyrei.shop;

import lombok.*;
import javax.persistence.*;

/**
 * Created by Uladzimir on 20.04.2017.
 */
@Entity
@Table(name = "roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role extends AbstractEntity {
    @Id @GeneratedValue
    private Long id;
    @Column
    private String name;
}