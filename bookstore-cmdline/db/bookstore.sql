CREATE DATABASE bookstore;

USE bookstore;

create table PUBLISHER (
       CODE VARCHAR(4) NOT NULL,
       PUBLISHER_NAME VARCHAR(100) NOT NULL,
       PRIMARY KEY (CODE)
);

create table BOOK ( 
      ISBN VARCHAR(50) NOT NULL,
      BOOK_NAME VARCHAR(100) NOT NULL,
      PUBLISHER_CODE VARCHAR(4),
      PRIMARY KEY(ISBN),
      FOREIGN KEY (PUBLISHER_CODE) REFERENCES PUBLISHER(CODE)
      );
      
create table CHAPTER (
      BOOK_ISBN VARCHAR(50) NOT NULL,
      CHAPTER_NUM INT NOT NULL,
      TITLE varchar(100) NOT NULL,
      PRIMARY KEY(BOOK_ISBN, CHAPTER_NUM),
      FOReiGN KEY(BOOK_ISBN) REFERENCES BOOK (ISBN)
      );
      
 select p.PUBLISHER_NAME, b.Book_name, c.CHAPTER_NUM, c.TITLE
from chapter c join book b on c.BOOK_ISBN = b.ISBN
			join publisher p on b.publisher_code = p.code
where b.ISBN = '9876123456';