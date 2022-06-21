package DAO;

import Model.Tries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;


@Component
public interface TriesRepository extends JpaRepository<Tries, Integer> {


    @Query("from Tries ")
    Tries findTriesById(@Param("tryId") int id);
}
