package CardGame.Controller;

import CardGame.Model.Sales;
import CardGame.Service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sales")
public class SalesController {
    SalesService salesService;
    @Autowired
    public SalesController(SalesService salesService) {
        this.salesService = salesService;
    }
    @GetMapping
    public List<Sales> getAllSales() {
        return salesService.getAllSales();
    }
    @PostMapping
    public void createSales(@RequestBody Sales s){
        salesService.createSales(s);
    }
}