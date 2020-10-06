package com.example.segundoparcial.ImplementedServices;

import com.example.segundoparcial.Dao.IUsersDAO;
import com.example.segundoparcial.Model.Users;
import com.example.segundoparcial.Service.IUser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.*;

@Service
public class UsersService implements IUser {
    @Autowired
    private IUsersDAO usersDAO;

    @Override
    public List<Object> getAll() {
        try {
            return Arrays.asList(1,usersDAO.findAll());
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public Optional<Users> get() {
        return Optional.empty();
    }

    @Override
    public List<Object> delete(int id) {
        try{
            usersDAO.deleteById(id);
            return Collections.singletonList(1);
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> add(Users object) {
        try{
            return Arrays.asList(1,usersDAO.save(object));
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> update(Users object) {
        try{
            return Arrays.asList(1,usersDAO.save(object))  ;
        } catch (DataIntegrityViolationException e){
            e.printStackTrace();
            return Collections.singletonList(2);
        } catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }
}
