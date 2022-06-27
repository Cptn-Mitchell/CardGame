package Service;

import DAO.UserRepository;
import Model.Cart;
import DAO.CartRepository;
import Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CartService {

    CartRepository cartRepository;
    UserRepository userRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getOrderByOrderId(int orderId){return cartRepository.getOrderByOrderId(orderId);}
    public List<Cart> getOrderByUserId(int userId){return cartRepository.getOrderByUserId(userId);}
    public List<Cart> getAllOrders(){return cartRepository.getAllOrders();}
    public void postCart(Cart cart) {
        cartRepository.save(cart);

    }
    public void updateCart(Cart cart){
        cartRepository.save(cart);

    }


}
