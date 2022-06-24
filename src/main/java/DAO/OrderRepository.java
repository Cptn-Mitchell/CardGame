package DAO;


import Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

// Let's set up our queries, so our endpoints know how to manuever through our database,
// in order to acquire the information we want.
@Transactional
public interface OrderRepository extends JpaRepository<Order, Integer> {
    @Query("FROM Order where userId= :userId")
    Order getOrderByUserId(@Param("userId")int userId);
    @Query("FROM Order where orderID= :orderId")
    Order getOrderByOrderId(@Param("orderId")int orderId);
    @Query("FROM Order where paymentId= :paymentId")
    Order getOrderByPaymentId(@Param("paymentId")int paymentId);

    @Query("* FROM Order")
    static List<Order> getAll() {
        return null;
    }

}
