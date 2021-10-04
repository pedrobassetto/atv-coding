Exercício 1 e 2 de de Coding 
---

OrderService 
---
###FindById (Procura Pedido a partir do ID)
   * Request (GET):
        * URL: http://localhost:8080/findById/1
   * Response:
     * {
       "email": "contato@pedrobassetto.com",
       "nomeCompleto": "Pedro Bassetto",
       "shippingAddress": "Rua da arvore, 10",
       "idPedido": 1,
       "dscPedido": [
       "asdfg",
       "qwerty",
       "zxcvbn"
       ],
       "qtdItensPedido": "1",
       "vlrUnitario": [
       10.00,
       20.00
       ],
       "vlrTotal": 30.00,
       "formaPagamento": "Cartao",
       "dtPedido": "04/10/2021",
       "statusPedido": "Pendente",
       "idTransacao": "1",
       "numCartao": "0000.0000.0000.0000",
       "validadeCartao": "10/2029",
       "bandeira": "Visa"
       }

###Save 
* Request (POST):
  * URL: http://localhost:8080/save
  * Body: {
    "email" : "contato@pedrobassetto.com",
    "nomeCompleto" : "Pedro Bassetto",
    "shippingAddress" : "Rua da arvore, 10",
    "idPedido" : "1",
    "dscPedido" : ["asdfg","qwerty", "zxcvbn"],
    "qtdItensPedido" : 1,
    "vlrUnitario" : [10.00, 20.00],
    "vlrTotal" : 30.00,
    "formaPagamento" : "Cartao",
    "dtPedido" : "04/10/2021",
    "statusPedido": "Pendente",
    "idTransacao" : "1",
    "numCartao" : "0000.0000.0000.0000",
    "validadeCartao" : "10/2029",
    "bandeira" : "Visa"
} 
* Response:  
  * http://localhost:8080/findById/1

###Update 
* Request (POST)
  * URL: http://localhost:8080/update/1
  * Body: {
    "shippingAddress" : "Rua da arvore, 20",
    "dscPedido" : ["asdfg","qwerty"],
    "qtdItensPedido" : 1,
    "vlrUnitario" : [10.00, 30.00],
    "vlrTotal" : 40.00,
    "formaPagamento" : "Cartao",
    "dtPedido" : "04/10/2021",
    "statusPedido": "Ativo",
    "idTransacao" : "1",
    "numCartao" : "0000.0000.0000.0000",
    "validadeCartao" : "10/2029",
    "bandeira" : "Visa"
    }
* Response: 
  * {
    "email": null,
    "nomeCompleto": null,
    "shippingAddress": "Rua da arvore, 20",
    "idPedido": null,
    "dscPedido": [
    "asdfg",
    "qwerty"
    ],
    "qtdItensPedido": "1",
    "vlrUnitario": [
    10.00,
    30.00
    ],
    "vlrTotal": 40.00,
    "formaPagamento": "Cartao",
    "dtPedido": "04/10/2021",
    "statusPedido": "Ativo",
    "idTransacao": "1",
    "numCartao": "0000.0000.0000.0000",
    "validadeCartao": "10/2029",
    "bandeira": "Visa"
    }
###Delete
  * Request: 
    * URL: http://localhost:8080/delete/1
  * Response: 
    * STATUS 200

PaymentService
---
####FindById
* Request (GET):
  * URL: http://localhost:8080/payment/findById/1
  * Response:
    * {
      "idTransacao": 1,
      "numCartao": "0000.0000.0000.0000",
      "dtValidCartao": "12/2029",
      "vlrCompra": 1000.00,
      "bandeira": "Mastercard"
      }
    
####Save
* Request (POST):
  * URL: http://localhost:8080/payment/save
  * Body: {
    "idTransacao" : 1,
    "numCartao" : "0000.0000.0000.0000",
    "dtValidCartao": "12/2029",
    "vlrCompra" : 1000.00,
    "bandeira" : "Mastercard"
    }
* Response:
  * http://localhost:8080/payment/findById/1
####Update
* Request (POST):
  * URL: http://localhost:8080/payment/update/1
  * Body: {
    "idTransacao" : 1,
    "numCartao" : "0000.0000.0000.0001",
    "dtValidCartao": "12/2030",
    "bandeira" : "Mastercard"
    }
* Response:
  * {
    "idTransacao": 1,
    "numCartao": "0000.0000.0000.0001",
    "dtValidCartao": "12/2030",
    "vlrCompra": null,
    "bandeira": "Mastercard"
    }
####Delete
  * Request:
    * URL: http://localhost:8080/payment/delete/1
  * Response:
    * STATUS 200