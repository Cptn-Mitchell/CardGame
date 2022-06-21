package Service;

import DAO.TriesRepository;
import Model.Tries;
import Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TriesService {
    TriesRepository triesRepository;

    @Autowired
    public TriesService(TriesRepository triesRepository) {
        this.triesRepository = triesRepository;
    }
    public List<Tries> getAllTries(){
        return triesRepository.findAll();
    }
    public void createTries(Tries t){
        triesRepository.save(t);
    }
}