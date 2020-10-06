package com.example.segundoparcial.ImplementedServices;

import com.example.segundoparcial.Dao.IHardwareDAO;
import com.example.segundoparcial.Model.Hardware;
import com.example.segundoparcial.Service.IHardware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HardwareService implements IHardware {
    @Autowired
    private IHardwareDAO hardwareDAO;

    @Override
    public List<Object> getAll() {
        try {
            return Arrays.asList(1,hardwareDAO.findAll());
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public Optional<Hardware> get() {
        return Optional.empty();
    }

    @Override
    public List<Object> delete(int id) {
        try {
            hardwareDAO.deleteById(id);

            return Collections.singletonList(1);
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> add(Hardware object) {
        try {
            return Arrays.asList(1,hardwareDAO.save(object));
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }

    @Override
    public List<Object> update(Hardware object) {
        try{
            return Arrays.asList(1,hardwareDAO.save(object));
        }catch (Exception e){
            e.printStackTrace();
            return Collections.singletonList(0);
        }
    }
}
