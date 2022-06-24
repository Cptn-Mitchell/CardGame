package Controller;


import Model.Order;
import Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }
    @GetMapping()
    public List<Order>getAll(){
        return orderService.getAll();
    }
    @GetMapping("order/{orderId}");
    public Order getOrderByOrderID(@PathVariable("orderId")int orderId){
        return orderService.getOrderByOrderId(orderId);

    }

}
