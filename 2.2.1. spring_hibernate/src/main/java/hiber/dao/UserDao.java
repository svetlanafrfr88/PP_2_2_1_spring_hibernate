package hiber.dao;

import hiber.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao {
    void add(User user);

    @Transactional
    User getUser(String model, int series);

    List<User> listUsers();
}
