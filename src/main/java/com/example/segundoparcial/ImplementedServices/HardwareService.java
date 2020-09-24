package com.example.segundoparcial.ImplementedServices;

import com.example.segundoparcial.Dao.IHardwareDAO;
import com.example.segundoparcial.Model.Hardware;
import com.example.segundoparcial.Service.IHardware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HardwareService implements IHardware {
    @Autowired
    private IHardwareDAO hardwareDAO;

    @Override
    public List<Hardware> getAll() {
        return hardwareDAO.findAll();
    }

    @Override
    public Optional<Hardware> get() {
        return Optional.empty();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Hardware add(Hardware object) {
        return null;
    }

    @Override
    public Hardware update(Hardware object) {
        return null;
    }
}
