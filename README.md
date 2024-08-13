# Proyecto de CRUD para la Entidad Customer en Spring Boot

Este proyecto es una aplicación Spring Boot que implementa un CRUD básico para la entidad Customer.

Entidad Seleccionada

    Tabla: Customer

Endpoints Disponibles
1. Crear un Cliente

    URL: http://localhost:8080/api/customer/saveCustomer
    Método HTTP: POST
    Descripción: Crea un nuevo registro de cliente en la base de datos.
    Cuerpo de la Solicitud:

    ```json

    {
        "id": "string",
        "namecustomer": "string",
        "lastnamecustomer": "string",
        "emailcustomer": "string",
        "longcustomer": "string",
        "latcustomer": "string",
        "birthdate": "string",
        "city" : {
            "id": "long",
            "name": "string"
        }
        
    }
    ```

    Respuesta: El cliente creado.

2. Actualizar un Cliente

    URL: http://localhost:8080/api/customer/updateCustomer/{customerId}
    Método HTTP: PUT
    Descripción: Actualiza un registro existente de cliente en la base de datos.
    Parámetros de Ruta:
        customerId: ID del cliente a actualizar.

    Respuesta: El cliente actualizado.

3. Eliminar un Cliente

    URL: http://localhost:8080/api/customer/deleteCustomer/{customerId}
    Método HTTP: DELETE
    Descripción: Elimina un registro de cliente en la base de datos.
    Parámetros de Ruta:
        customerId: ID del cliente a eliminar.
    Respuesta: ID del cliente eliminado.

4. Obtener Todos los Clientes

    URL: http://localhost:8080/api/customer/allCustomers
    Método HTTP: GET
    Descripción: Recupera todos los registros de clientes en la base de datos.
