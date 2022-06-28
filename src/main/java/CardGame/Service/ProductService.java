package CardGame.Service;

import CardGame.DAO.ProductRepository;

import CardGame.Model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Component
public class ProductService {
    ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product getProductById(String id) {
        return productRepository.findProductById(id);
    }

    public Product getProductName(String name) {
        return productRepository.findProductName(name);
    }


    public void createProduct(Product p) {
        productRepository.save(p);
    }

    public void update(Product products) {
        productRepository.save(products);
    }
}

