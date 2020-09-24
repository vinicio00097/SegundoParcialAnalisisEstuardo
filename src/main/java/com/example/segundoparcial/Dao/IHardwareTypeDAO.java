package com.example.segundoparcial.Dao;

import com.example.segundoparcial.Model.HardwareType;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHardwareTypeDAO extends JpaRepository<HardwareType,Integer> {
}
