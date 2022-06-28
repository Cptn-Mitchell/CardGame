package CardGame.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Orders {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    @ManyToOne
    @JoinColumn(name="product_Id", nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name="user_Id", nullable = false)
    private Users users;
    @Column
    private int quantity;
    @Column
    private double orderTotal;
    @Column
    private orderStatus PaymentStatus;

    public enum orderStatus{
        PENDING,
        PURCHASED
    }
}
