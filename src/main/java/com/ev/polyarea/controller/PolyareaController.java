package com.ev.polyarea.controller;

import com.ev.polyarea.model.RpVertices;
import com.ev.polyarea.service.PolyGoneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@CrossOrigin
public class PolyareaController {

    @Autowired
    PolyGoneService service;

    @GetMapping("/GetRPVertices")
    public ResponseEntity<Object> getRpVertices(@RequestParam("lat") double lat,
                                                @RequestParam("long") double lon,
                                                @RequestParam("Soc") int soc) {
        log.info("lat: {}, lon:{}, soc:{}",lat,lon,soc);
        RpVertices vertices=service.getData(lat,lon,soc);
        return new ResponseEntity<>(vertices, HttpStatus.OK);
    }

    @PostMapping("/store")
    public ResponseEntity<Object> save(@RequestParam("lat") double lat,
                                       @RequestParam("long") double lon,
                                       @RequestBody RpVertices vertices) {
        RpVertices obj=service.save(lat,lon,vertices);
        return  new ResponseEntity<>(obj,HttpStatus.OK);

    }
    @GetMapping("/test")
    public ResponseEntity<Object> test() {
        return new ResponseEntity<>("okay",HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public String deleteOne(@RequestParam("lat") double lat,
                          @RequestParam("long") double lon) {
        service.delete(lat,lon);
        return  "Successfully Deleted";
    }
    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        service.deleteAll();
        return "Successfully deleted All";
    }
}
