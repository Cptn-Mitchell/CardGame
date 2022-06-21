package Controller;

import Model.Tries;
import Model.Users;
import Service.TriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tries")
public class TriesController {
    TriesService triesService;

    @Autowired
    public TriesController(TriesService triesService) {
        this.triesService = triesService;
    }

    @GetMapping
    public List<Tries> getAllTries() {
        return triesService.getAllTries();
    }

    @PostMapping
    public void createTries(@RequestBody Tries t){
        triesService.createTries(t);
    }
}