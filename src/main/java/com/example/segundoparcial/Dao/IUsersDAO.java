package com.example.segundoparcial.Dao;

import com.example.segundoparcial.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersDAO extends JpaRepository<Users,Integer> {
}
