package com.example.segundoparcial.Controller;

import com.example.segundoparcial.ImplementedServices.UsersService;
import com.example.segundoparcial.Model.Users;
import com.example.segundoparcial.Utils.JsonResponse;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        List<Object> result=usersService.getAll();

        if(((int) result.get(0))==1){
            return new ResponseEntity<>(new JsonResponse("Success",21,result.get(1),"Usuarios obtenidos correctamente."), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse("Fail",26,null,"Ha ocurrido un error al obtener los usuarios."), HttpStatus.OK);
        }
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable int id){
        List<Object> result=usersService.delete(id);

        if(((int) result.get(0))==1){
            return new ResponseEntity<>(new JsonResponse("Success",22,null,"Usuario eliminado correctamente"),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse("Fail",27,null,"Ha ocurrido un error al eliminar el usuario."),HttpStatus.OK);
        }
    }

    @PostMapping("/Create")
    public ResponseEntity<Object> create(@RequestBody Users user){
        List<Object> result=usersService.add(user);

        if(((int) result.get(0))==1){
            return new ResponseEntity<>(new JsonResponse("Success",23,result.get(1),"Usuario creado correctamente"),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse("Fail",28,null,"Ha ocurrido un error al crear el usuario"),HttpStatus.OK);
        }
    }

    @PutMapping("/Edit")
    public ResponseEntity<Object> edit(@RequestBody Users user){
        List<Object> result=usersService.update(user);

        return switch ((int) result.get(0)) {
            case 0 -> new ResponseEntity<>(new JsonResponse("Success", 29, null, "Ha ocurrido un error al editar el usuario."), HttpStatus.OK);
            case 1 -> new ResponseEntity<>(new JsonResponse("Success", 24, result.get(1), "Usuario actualizado correctamente"), HttpStatus.OK);
            case 2 -> new ResponseEntity<>(new JsonResponse("Success", 30, null, "No se actualizó el usuario debido a que no hay piezas de hardware suficientes."), HttpStatus.OK);
            default -> new ResponseEntity<>(HttpStatus.OK);
        };

    }
}
