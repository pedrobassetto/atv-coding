package com.pedrobassetto.orderandpaymentservice.service;

import com.pedrobassetto.orderandpaymentservice.dto.OrderDTO;
import com.pedrobassetto.orderandpaymentservice.entity.Order;
import com.pedrobassetto.orderandpaymentservice.exception.EntityNotFoundException;
import com.pedrobassetto.orderandpaymentservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository repository){
        this.repository = repository;
    }

    public OrderDTO findById(Integer id) throws EntityNotFoundException {
        Order order = repository.findById(id);

        if (order == null)
            throw new EntityNotFoundException("ID " + id + " não encontrado.");

        OrderDTO orderDTO = this.transformOrder(order);

        return orderDTO;
    }

    public void save(OrderDTO orderDTO) {
        Order order = this.transformOrderDTO(orderDTO);
        this.repository.save(order);
    }

    public void update(int idPedido, OrderDTO orderDTO) throws EntityNotFoundException {
        if (repository.findById(idPedido) != null){
            repository.update(idPedido, orderDTO);
        }else{
            throw new EntityNotFoundException("ID " + idPedido + " não encontrado.");
        }
    }

    public void delete(int idPedido) {
        repository.delete(idPedido);
    }

    public OrderDTO transformOrder(Order order){
        OrderDTO orderDTO = new OrderDTO(
                order.getEmail(),
                order.getNomeCompleto(),
                order.getShippingAddress(),
                order.getIdPedido(),
                order.getDscPedido(),
                order.getQtdItensPedido(),
                order.getVlrUnitario(),
                order.getVlrTotal(),
                order.getFormaPagamento(),
                order.getDtPedido(),
                order.getStatusPedido(),
                order.getIdTransacao(),
                order.getNumCartao(),
                order.getValidadeCartao(),
                order.getBandeira()
        );

        return orderDTO;
    }

    public Order transformOrderDTO(OrderDTO orderDTO){
        Order order = new Order(
                orderDTO.getEmail(),
                orderDTO.getNomeCompleto(),
                orderDTO.getShippingAddress(),
                orderDTO.getIdPedido(),
                orderDTO.getDscPedido(),
                orderDTO.getQtdItensPedido(),
                orderDTO.getVlrUnitario(),
                orderDTO.getVlrTotal(),
                orderDTO.getFormaPagamento(),
                orderDTO.getDtPedido(),
                orderDTO.getStatusPedido(),
                orderDTO.getIdTransacao(),
                orderDTO.getNumCartao(),
                orderDTO.getValidadeCartao(),
                orderDTO.getBandeira()
        );

        return order;
    }

}
