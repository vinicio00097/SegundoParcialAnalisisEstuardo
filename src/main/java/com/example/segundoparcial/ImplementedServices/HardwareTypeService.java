package com.example.segundoparcial.ImplementedServices;

import com.example.segundoparcial.Dao.IHardwareTypeDAO;
import com.example.segundoparcial.Model.HardwareType;
import com.example.segundoparcial.Service.IHardwareType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class HardwareTypeService implements IHardwareType {
    @Autowired
    private IHardwareTypeDAO hardwareTypeDAO;

    @Override
    public List<Object> getAll() {

        try {
            return Arrays.asList(1,hardwareTypeDAO.findAll());
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public Optional<HardwareType> get() {
        return Optional.empty();
    }

    @Override
    public List<Object> delete(int id) {
        try {
            hardwareTypeDAO.deleteById(id);
            return Collections.singletonList(1);
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> add(HardwareType object) {
        try {
            return Arrays.asList(1,hardwareTypeDAO.save(object));
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> update(HardwareType object) {
        try {
            return Arrays.asList(1,hardwareTypeDAO.save(object));
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }
}
