package hs.selmi.booki.rest;

import hs.selmi.booki.service.LivreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class DiagnosticController {

    @Autowired
    LivreServiceImpl service;

    @RequestMapping(value = "/diagnostic/getAllBooks")
    public ResponseEntity returnAllBooks(){
        return new ResponseEntity(service.getAllBooks(),HttpStatus.OK);
    }

}
