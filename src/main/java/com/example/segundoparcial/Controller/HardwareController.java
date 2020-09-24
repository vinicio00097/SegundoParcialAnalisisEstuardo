package com.example.segundoparcial.Controller;

import com.example.segundoparcial.ImplementedServices.HardwareService;
import com.example.segundoparcial.Utils.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hardware")
public class HardwareController {
    @Autowired
    private HardwareService hardwareService;

    @GetMapping("")
    public ResponseEntity<Object> index(){
        return new ResponseEntity<>(new JsonResponse("Success",11,hardwareService.getAll(),"Hardware recuperado correctamente"), HttpStatus.OK);
    }
}
