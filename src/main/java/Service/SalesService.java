package Service;

import DAO.SalesRepository;
import Model.Sales;
import Model.Tries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesService {
    SalesRepository salesRepository;

    @Autowired
    public SalesService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }
    public List<Sales> getAllSales(){
        return salesRepository.findAll();
    }
    public void createSales(Sales s) {
        salesRepository.save(s);
    }
}