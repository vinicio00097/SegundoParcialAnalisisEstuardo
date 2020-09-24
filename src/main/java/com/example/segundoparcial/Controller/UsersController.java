package com.example.segundoparcial.Controller;

import com.example.segundoparcial.ImplementedServices.UsersService;
import com.example.segundoparcial.Model.Users;
import com.example.segundoparcial.Utils.JsonResponse;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        return new ResponseEntity<>(new JsonResponse("Success",21,usersService.getAll(),"Usuarios obtenidos correctamente."), HttpStatus.OK);
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id){
        usersService.delete(id);
        return new ResponseEntity<>(new JsonResponse("Success",22,null,"Usuario eliminado correctamente"),HttpStatus.OK);
    }

    @PostMapping("/Create")
    public ResponseEntity<Object> create(@RequestBody Users user){
        return new ResponseEntity<>(new JsonResponse("Success",23,usersService.add(user),"Usuario creado correctamente"),HttpStatus.OK);
    }

    @PutMapping("/Edit")
    public ResponseEntity<Object> edit(@RequestBody Users user){
        System.out.println(new JSONObject(user));
        return new ResponseEntity<>(new JsonResponse("Success",24,usersService.update(user),"Usuario creado correctamente"),HttpStatus.OK);
    }
}
