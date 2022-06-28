package CardGame.Controller;

import CardGame.Model.Orders;
import CardGame.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("order")
public class OrderController {
    OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @GetMapping
    public List<Orders> getAllOrder(){
        return orderService.getAllOrder();
    }
    @PostMapping
    public void createOrder(@RequestBody Orders o){
        orderService.createOrder(o);
    }

    @PostMapping("/updateOrder")
    public Orders update(@RequestBody Orders order){
        orderService.update(order);
        return order;
    }
}
