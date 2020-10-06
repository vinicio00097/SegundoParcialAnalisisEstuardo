package com.example.segundoparcial.Controller;

import com.example.segundoparcial.ImplementedServices.HardwareService;
import com.example.segundoparcial.Utils.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Hardware")
public class HardwareController {
    @Autowired
    private HardwareService hardwareService;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        List<Object> result=hardwareService.getAll();

        if(((int) result.get(0))==1){
            return new ResponseEntity<>(new JsonResponse("Success",11,result.get(1),"Hardware recuperado correctamente"), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new JsonResponse("Success",16,null,"Hubo un error al recuperar la lista de hardware."), HttpStatus.OK);
        }
    }
}
