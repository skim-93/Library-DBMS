# Library-DBMS

Seungku Kim

This project is about Creating database and systems desgin which includes User Interfaces
and Various queries in different scenario. 

The database I built was for the library database systems, which allow library staff to 
be able to store and use the data for their daily operation.

- ConnectionManager.java - contains connection between java UI application with SQL server
- Login.java - this is where you want to start your application running, which contains 
		login verification as well as email validation for duplicated emails.

-------------------------------------------------------------------------------------
Kim_Seungku_Queries.sql

- contains 7 easy operational queries which are followed
/* 1. Registering the Librian Staffs */
/* 2. Registering Customer */
/* 3. find a Book with a title*/
/* 4. Customer Reserve a Book*/
/* 5. Customer Pay Fine */
/* 6. Find a Customer with Email */
/* 7. Customer Borrowing a book */

- contains 5 complex analytical queries scenarios
/* 1. Find the books that has been issued in this libaray so far */
/* 2. Find most frequent violation that customer */
/* 3. What category type of book is most frequently issued? */
/* 4. Find a book that has least average time of issued */
/* 5. Find a publisher that give most frequently issued book */

---------------------------------------------------------------------------------------
TCSS445-UI.pdf

- This can be used as walk through for the java UI application, which contains following
1. Login
* includes valid and invalid cases of log in, and picture of what kind of message is sent
for each situation

2. Registration
* Includes valid and invalid cases of registration, invalid cases of trying to register with
duplicated Email

3. Reports
* Shows the Cutomer List for all the customer that are registered in the library systems.
* other reports that would give the reports that are used in the Kim_Seungku_Queries.sql

4. Menu - Add/Delete
* Basic operations such as add/delete customer, books, cd, violation, and equipements. 
-------------------------------------------------------------------------------------

By looking in details of how I created the project, new students who are trying to study
for how to build UI or sql queries will be able to understand the concept easily. And
it would be good review for people who are already an expert in this subject.




