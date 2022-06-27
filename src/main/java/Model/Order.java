package Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

// Let's make our order table, simple with spring.
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class Order {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    @Column
    private String userId;
    @Column
    private double total;
    @Column
    private int paymentId;
    @Column
    private int salesId;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn (name="userId", nullable = false)
    private Users user;





}
