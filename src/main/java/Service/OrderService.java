package Service;

import DAO.OrderRepository;
import Model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository=orderRepository;

    }
    public List<Order> getAll(){
        return OrderRepository.getAll();
    }
    public Order getOrderByOrderId(int orderId){
        return orderRepository.getOrderByOrderId(orderId);

    }
    public Order getOrderByUserId(int userId){
        return orderRepository.getOrderByUserId(userId);

    }
    public Order getOrderByPaymentId(int paymentId){
        return orderRepository.getOrderByPaymentId(paymentId);

    }


}
