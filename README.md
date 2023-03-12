# sqlDeployee
* This project is used for store the information of product.
* This project is used to performe deployemt operation in ec2 machine.
## Framwork and Language use in this Project
* Springboot 
* java
* terminus is used to deploye our project in online server.
## Dependencies
* Spring Web
* SQL Database
* hibernate
* lombok
* jpa
* Swagger
## Flow of project
### Create four layers model , controller, repository.
### In model layer create product class:-
* In model layer create a product class in this class used few annotation like @Entity, @Data, @Id, @Genrationvalue. 
### In controller layer to performe performe HttpRequest:-
* In this layer used annotation like @restController @Getmapping to featching data and @Postmapping to adding data.
* In repository layer exteds jpsRepositor.
## Constraints:
* product model will have-
* Id
* title
* description
## Endpoints to provided :
* Add-product.
* get-all product.
