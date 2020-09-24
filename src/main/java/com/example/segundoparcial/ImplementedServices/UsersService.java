package com.example.segundoparcial.ImplementedServices;

import com.example.segundoparcial.Dao.IUsersDAO;
import com.example.segundoparcial.Model.Users;
import com.example.segundoparcial.Service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService implements IUser {
    @Autowired
    private IUsersDAO usersDAO;

    @Override
    public List<Users> getAll() {
        return usersDAO.findAll();
    }

    @Override
    public Optional<Users> get() {
        return Optional.empty();
    }

    @Override
    public void delete(int id) {
        usersDAO.deleteById(id);
    }

    @Override
    public Users add(Users object) {
        try{
            return usersDAO.save(object);
        }catch (Exception e){
            e.printStackTrace();
            return new Users();
        }
    }

    @Override
    public Users update(Users object) {
        return usersDAO.save(object);
    }
}
