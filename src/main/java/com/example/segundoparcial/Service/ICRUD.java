package com.example.segundoparcial.Service;

import java.util.List;
import java.util.Optional;

public interface ICRUD<T>{
    List<Object> getAll();
    Optional<T> get();
    List<Object> delete(int id);
    List<Object> add(T object);
    List<Object> update(T object);
}
