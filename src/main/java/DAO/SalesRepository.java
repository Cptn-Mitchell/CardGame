package DAO;

import Model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;


@Component
public interface SalesRepository extends JpaRepository<Sales, Integer> {


    @Query("from Sales ")
    Sales findSalesById(@Param("salesId") int id);
}