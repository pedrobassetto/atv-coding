package com.pedrobassetto.orderandpaymentservice.repository;

import com.pedrobassetto.orderandpaymentservice.dto.OrderDTO;
import com.pedrobassetto.orderandpaymentservice.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private List<Order> orders = new ArrayList<>();

    public Order findById(Integer id){
        for (Order order : orders) {
            if (order.getIdPedido() == id) {
                return order;
            }
        }
        return null;
    }

    public void save(Order order) {
        orders.add(order);
    }

    public void update(int idPedido, OrderDTO orderDTO) {
        Order auxOrder = this.findById(idPedido);
        auxOrder.setShippingAddress(orderDTO.getShippingAddress());
        auxOrder.setDscPedido(orderDTO.getDscPedido());
        auxOrder.setQtdItensPedido(orderDTO.getQtdItensPedido());
        auxOrder.setVlrUnitario(orderDTO.getVlrUnitario());
        auxOrder.setVlrTotal(orderDTO.getVlrTotal());
        auxOrder.setFormaPagamento(orderDTO.getFormaPagamento());
        auxOrder.setDtPedido(orderDTO.getDtPedido());
        auxOrder.setStatusPedido(orderDTO.getStatusPedido());
        auxOrder.setIdTransacao(orderDTO.getIdTransacao());
        auxOrder.setNumCartao(orderDTO.getNumCartao());
        auxOrder.setBandeira(orderDTO.getBandeira());
    }

    public void delete(int idPedido) {
        Order order = this.findById(idPedido);
        if(order != null){
            orders.remove(order);
        }
    }
}
