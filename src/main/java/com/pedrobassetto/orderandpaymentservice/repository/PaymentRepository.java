package com.pedrobassetto.orderandpaymentservice.repository;

import com.pedrobassetto.orderandpaymentservice.dto.PaymentDTO;
import com.pedrobassetto.orderandpaymentservice.entity.Payment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PaymentRepository {

    private List<Payment> payments = new ArrayList<Payment>();

    public Payment findById(Integer idTransacao) {
        for (Payment payment : payments) {
            if (payment.getIdTransacao() == idTransacao) {
                return payment;
            }
        }
        return null;
    }

    public void save(Payment payment) {
        this.payments.add(payment);
    }

    public void update(int idTransacao, PaymentDTO paymentDTO) {
        Payment newPayment = this.findById(idTransacao);
        newPayment.setIdTransacao(paymentDTO.getIdTransacao());
        newPayment.setNumCartao(paymentDTO.getNumCartao());
        newPayment.setBandeira(paymentDTO.getBandeira());
        newPayment.setDtValidCartao(paymentDTO.getDtValidCartao());
    }

    public void delete(Integer idTransacao) {
        Payment payment = this.findById(idTransacao);
        if(payment != null){
            payments.remove(payment);
        }

    }

}
