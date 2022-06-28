package CardGame.DAO;


import CardGame.Model.Product;
import CardGame.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {


    @Query("from Product where productId = :productId")
    Product findProductById(@Param("productId") String id);

    @Query("from Product where productName = :productName")
    Product findProductName(@Param("productName") String name);

    @Query("from Product")
    public List<Product> findAll();
}


