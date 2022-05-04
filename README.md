
## PostgreSQL-with-SpingBoot-CURD-Project

Usage

It's to create Database in PostgreSQL using SpingBoot. The server is connected to Postman. 


## Post
1. POST    localhost:8080/addProduct



  Create a product entry




Body 
{
    
    "name":"mobile",
    "quantity":1,
    "price":15000

}
##  Get 

To Get the total list of products

localhost:8080/products


[
    {

        "id": 1,
        "name": "mobile",
        "quantity": 1,
        "price": 15000.0
    },
    {
        "id": 2,
        "name": "laptop",
        "quantity": 5,
        "price": 55000.0
    },
    {
        "id": 3,
        "name": "earphone",
        "quantity": 15,
        "price": 3025.0
    },
    {
        "id": 4,
        "name": "Macbook",
        "quantity": 13,
        "price": 543025.0
    },
    {
        "id": 5,
        "name": "Ipad",
        "quantity": 5,
        "price": 55000.0
    },
## Delete

To Delete the certain item by using Product id

localhost:8080/delete/6
## Put

To Update certain product details by using " Product id"

localhost:8080/update

{
    
    "id": 5,
    "name":"Ipad",
    "quantity":5,
    "price":55000

}
## PostgreSQL

Check Every Steps using command 



## select * from productinfo


