package com.pedrobassetto.orderandpaymentservice.controller;

import com.pedrobassetto.orderandpaymentservice.dto.OrderDTO;
import com.pedrobassetto.orderandpaymentservice.exception.EntityNotFoundException;
import com.pedrobassetto.orderandpaymentservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping("/findById/{id}")
    public ResponseEntity findById(@PathVariable("id") Integer idPedido) throws EntityNotFoundException {
        OrderDTO orderDTO = service.findById(idPedido);
        return new ResponseEntity<>(orderDTO, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody OrderDTO orderDTO) {
        service.save(orderDTO);
        return new ResponseEntity<>("http://localhost:8080/findById/" + orderDTO.getIdPedido(),
                HttpStatus.ACCEPTED);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<OrderDTO> update(@PathVariable("id") int idPedido, @RequestBody OrderDTO orderDTO) throws EntityNotFoundException {
        service.update(idPedido, orderDTO);
        return new ResponseEntity<>(orderDTO, HttpStatus.ACCEPTED);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int idPedido) {
        service.delete(idPedido);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
