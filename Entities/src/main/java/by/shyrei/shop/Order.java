package by.shyrei.shop;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Uladzimir on 20.04.2017.
 */
public class Order extends AbstractEntity {
    private Long id;
    private Timestamp timestamp;
    private Status status;
    private User owner;
    List<Product> products;
}
