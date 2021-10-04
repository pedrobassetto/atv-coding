package com.pedrobassetto.orderandpaymentservice.service;

import com.pedrobassetto.orderandpaymentservice.dto.PaymentDTO;
import com.pedrobassetto.orderandpaymentservice.entity.Payment;
import com.pedrobassetto.orderandpaymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentRepository repository;

    @Autowired
    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public PaymentDTO findById(Integer idTransacao) {
        Payment payment = repository.findById(idTransacao);
        PaymentDTO paymentDTO = this.transformPaymentDTO(payment);
        return paymentDTO;
    }

    public void save(PaymentDTO paymentDTO) {
        Payment payment = this.transformPayment(paymentDTO);
        this.repository.save(payment);
    }

    public void update(int idTransacao, PaymentDTO paymentDTO) {
        if (repository.findById(idTransacao) != null) {
            repository.update(idTransacao, paymentDTO);
        }
    }

    public void delete(int idTransacao) {
        repository.delete(idTransacao);
    }

    private PaymentDTO transformPaymentDTO(Payment payment) {
        PaymentDTO paymentDTO = new PaymentDTO(
            payment.getIdTransacao(),
            payment.getNumCartao(),
            payment.getDtValidCartao(),
            payment.getVlrCompra(),
            payment.getBandeira()
        );
        return paymentDTO;
    }

    private Payment transformPayment(PaymentDTO paymentDTO) {
        Payment payment = new Payment(
                paymentDTO.getIdTransacao(),
                paymentDTO.getNumCartao(),
                paymentDTO.getDtValidCartao(),
                paymentDTO.getVlrCompra(),
                paymentDTO.getBandeira()
        );
        return payment;
    }
}
