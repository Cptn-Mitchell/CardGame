package Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Status;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Cart {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @Column
    private double amount;
    @Column
    private int checkoutId;
    @Column
    private Status orderStatus;
    @Column
    private int orderId;
   @ManyToOne
   @JoinColumn(name="userId", nullable = false)
   private Users user;
   @ManyToOne
   @JoinColumn(name="orderId", nullable = false)
    private Order order;

    private enum Status {
        PENDING,
        APPROVED,
        DENIED
    }


}
