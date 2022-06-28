package CardGame.Controller;
import CardGame.Model.Product;

import CardGame.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("product")
public class ProductController {
    ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @GetMapping("product/{name}")
    public Product getProductName(@PathVariable String name){
        return productService.getProductName(name);
    }
    @GetMapping("product/{id}")
    public Product getProductById(@PathVariable String id){
        return productService.getProductById(id);
    }


    @PostMapping
    public void createProduct(@RequestBody Product p){
        productService.createProduct(p);
    }

    @PostMapping("/updateProduct")
    public Product update(@RequestBody Product product){
        productService.update(product);
        return product;
    }

}


