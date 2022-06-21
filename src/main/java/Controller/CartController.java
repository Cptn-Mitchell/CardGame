package Controller;

import Model.Users;
import Model.Cart;
import Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("Cart")
public class CartController {

    CartService cartService;

    @Autowired
    public CartController(CartService cartService){this.cartService = cartService;}
    @GetMapping("{orderID}")
    public List <Cart> getOrderByOrderId(@PathVariable int orderId){return cartService.getOrderByOrderId(orderId);}
    @GetMapping("OrderID/{orderID}")
    public List <Cart> getOrderByUserId(@PathVariable int userId){return cartService.getOrderByUserId(userId);}
    @GetMapping
    public List<Cart> getAllOrders(){return cartService.getAllOrders();}

    /* Create a new cart with the amount, the user ID and the orderID
    @PostMapping("submit")
    public void postCart(@RequestBody Map<String , Object> c){
        return cartService.postCart();
    }
    */
}


