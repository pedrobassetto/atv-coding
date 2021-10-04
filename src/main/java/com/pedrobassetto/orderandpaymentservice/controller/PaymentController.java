package com.pedrobassetto.orderandpaymentservice.controller;

import com.pedrobassetto.orderandpaymentservice.dto.PaymentDTO;
import com.pedrobassetto.orderandpaymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService service;

    @GetMapping("/payment/findById/{id}")
    public ResponseEntity findById(@PathVariable("id") Integer idTransacao){
        PaymentDTO paymentDTO = service.findById(idTransacao);
        return new ResponseEntity<>(paymentDTO, HttpStatus.OK);
    }

    @PostMapping("/payment/save")
    public ResponseEntity<String> save(@RequestBody PaymentDTO paymentDTO) {
        service.save(paymentDTO);
        return new ResponseEntity<>("http://localhost:8080/payment/findById/" + paymentDTO.getIdTransacao(),
                HttpStatus.ACCEPTED);
    }

    @PostMapping("/payment/update/{id}")
    public ResponseEntity<PaymentDTO> update(@PathVariable("id") int idTransacao, @RequestBody PaymentDTO paymentDTO) {
        service.update(idTransacao, paymentDTO);
        return new ResponseEntity<>(paymentDTO, HttpStatus.ACCEPTED);
    }

    @GetMapping("/payment/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int idTransacao) {
        service.delete(idTransacao);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
