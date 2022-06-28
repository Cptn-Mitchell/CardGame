package CardGame.DAO;

import CardGame.Model.Orders;
import CardGame.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderRepository extends JpaRepository<Orders, Integer> {


    @Query("from Orders where orderId = :orderId")
    Product findOrderById(@Param("orderId") String id);

    @Query("from Orders")
    public List<Orders> findAll();
}