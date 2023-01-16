# Retail-shopping


This is an retail shopping project using Spring Boot,Spring web-flow, Spring Rest Services and Hibernate. In this project we also used Spring Security with java and annotation configuration

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

# Runnig this project

1. Clone this project https://github.com/shaileshshandilya/retail-shopping.git  default branch is "main"
2. create databases schema in mysql - **retail_shopping_db**
3. edit **username** and **password** in **applicaton.properties** file
4. Run Project One time using Spring boot command - **mvn spring-boot:run** or using eclipse IDE run as Java Application
5. Run this Query in mysql

```sql
insert into online_shopping_db.user_detail(contact_number,email,enabled,first_name,last_name,password,role) values ('9876543210','admin@gmail.com',true,'admin','admin','$2a$10$6UVHQoHhpoYZxBB.k9r.deSLTT0RD1Yk8GdggRywGw0Snr8syRDtG','ADMIN')
```

**Password = 123456(in encoded Form)**

6. Then Again run project using boot
7. create user by signup

# Loging as admin 
1. Loging as admin by using username as admin@gmail.com and password as 123456
2.  Then add product by clicking on Manage Product. 
3. if category ar nod availbale in list please add new catogry 
4.verfy your product by clicking on view product option . 

#Register new User 
1. Click on Sign Up option and provide the details for new user
2. once user create with  then login with emailid and passowrd 
3. after login to retail-shopping application user can see the product and  detail of product. 
4. user can add product with qantity  to cart. 
5.  to make payment click on card (click  on user name right conner). 
6. view the cart and update the qantity 
7.click on checkout uption 
8. now shop staff have to provide details of customer 
9. once the customer details will provide and submit 
10. the discounted amount  will be apper based on below criteria 

		(A). If	the	user	is	an	employee	of	the	store,	he	gets	a	30%	discount
		(B). If	the	user	is	an	affiliate	of	the	store,	he	gets	a	10%	discount
		(C). If	the	user	has	been	a	customer	for	over	2	years,	he	gets	a	5%	discount.
		(D).For	every	$100	on	the	bill,	there	would	be	a	$	5	discount	(e.g.	for	$	990,	you	get	$	45	as	a	discount).
		(E). The	percentage	based	discounts	do	not	apply	on	groceries.(** this is not yet updated**)
		(F). A	user	can	get	only	one	of	the	percentage	based	discounts	on	a	bil
