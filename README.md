# project-for-job
 
Java 1.8
Spring 2.1.7

Dependencies:
    spring-boot-starter-actuator
    spring-boot-starter-data-jpa
    spring-boot-starter-jdbc
    spring-boot-starter-thymeleaf
    spring-boot-starter-web
    spring-boot-starter-devtools
    lombook 1.18.8
    database h2 1.4.199


Details of program.

Purpose of this program:

    1. Store CarCustomers
    2. Find By id of CarCustomers
    3. Return all CarCustomers

Attributese of CarCustomer:

    1. identifier            id
    2. additional field1     firstname
    3. additional field2     surname

Used databases:
    1. H2 Database (in-memory SQL)


Please use :

    1. http://localhost:8080/find-customer/all          to return all carCustomers
    2. http://localhost:8080/find-customer/byId?id=#    to return specific(#) id carCustomers


If Json format is needed use:

    1. http://localhost:8080/api                        to return all carCustomers
    2. http://localhost:8080/api/{id}                   to return specific id carCustomers


To Post in PostMan use:

    1.Use   http://localhost:8080/api
    2.Content-Type = application/json                   in parameters of PostMan

