package com.example.segundoparcial.ImplementedServices;

import com.example.segundoparcial.Dao.IHardwareTypeDAO;
import com.example.segundoparcial.Model.HardwareType;
import com.example.segundoparcial.Service.IHardwareType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HardwareTypeService implements IHardwareType {
    @Autowired
    private IHardwareTypeDAO hardwareTypeDAO;

    @Override
    public List<HardwareType> getAll() {
        return hardwareTypeDAO.findAll();
    }

    @Override
    public Optional<HardwareType> get() {
        return Optional.empty();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public HardwareType add(HardwareType object) {
        return null;
    }

    @Override
    public HardwareType update(HardwareType object) {
        return null;
    }
}
