package CardGame.Service;

import CardGame.DAO.OrderRepository;
import CardGame.Model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Orders> getAllOrder() {
        return orderRepository.findAll();
    }

    public void createOrder(Orders o) {
        orderRepository.save(o);
    }

    public void update(Orders orders) {
        orderRepository.save(orders);
    }
}
