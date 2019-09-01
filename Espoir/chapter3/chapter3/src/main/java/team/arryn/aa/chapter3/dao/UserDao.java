package team.arryn.aa.chapter3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.arryn.aa.chapter3.PO.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
