package DAO;

import Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface CartRepository extends JpaRepository<Cart, Integer> {


    @Query("FROM Cart where orderId = :orderId")
    public List<Cart> getOrderByOrderId(@Param("orderId")int orderId);
    @Query("FROM Cart where userId = :userId")
    public List<Cart> getOrderByUserId(@Param ("userId")int userId);
    @Query("* From Cart" )
    public List<Cart> getAllOrders();




}
