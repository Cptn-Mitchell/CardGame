package DAO;


import Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;


@Component
public interface UserRepository extends JpaRepository<Users, Integer> {


    @Query("from Users")
    Users findUserById(@Param("userId") int id);

    @Query("from Users where username = :username")
    Users findUsername(@Param("username") String name);

    @Query("from Users where password = :password")
    Users findPassword(@Param("password") String name);

    @Query("from Users where tryId = :tryId")
    Users findTryId(@Param("tryId") int id);
}




