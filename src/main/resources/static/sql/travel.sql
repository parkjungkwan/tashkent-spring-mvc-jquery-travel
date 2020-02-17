-- users, locations, hotels, rooms, opinions, reservations
-- tourisms, festivals, articles, favors, replies
-- articles, festivals, hotels, locations, opinions
-- replies, reservations, rooms, tourisms, users
create table users(userid varchar(30) primary key,
        passwd varchar(30) ,
        username varchar(30) ,
        nickname varchar(30) ,
        birth varchar(30) ,
        phone_num varchar(30)
)default character set utf8 collate utf8_general_ci;
create table locations(location_seq primary key auto_increment,
        address varchar(50),
        latitude varchar(30),
        longitude varchar(30)
)default character set utf8 collate utf8_general_ci;
create table hotels(hotel_seq int(10) primary key auto_increment,
      name varchar(30),
      phone_num varchar(30),
      image varchar(500),
      area varchar(10),
      information varchar(1500),
      location_seq int(10),
      foreign key (location_seq) references locations(location_seq)
)default character set utf8 collate utf8_general_ci;
create table rooms(room_seq int(10) primary key auto_increment,
      room_type varchar(50),
      image varchar(500),
      price int(10),
      hotel_seq int(10),
      foreign key(hotel_seq) references hotels(hotel_seq)
 )default character set utf8 collate utf8_general_ci;
create table opinions(opinion_seq int(10) primary key auto_increment,
      opinion varchar(500),
      rating varchar(10),
      userid varchar(30),
      hotel_seq int(10) ,
      foreign key(hotel_seq) references hotels(hotel_seq)
 )default character set utf8 collate utf8_general_ci;
create table reservations(reservation_seq int(10) primary key auto_increment,
      checkin_date varchar(30),
      checkout_date varchar(30),
      payment int(10),
      room_seq int(10),
      festival_seq int(10),
      userid varchar(30),
      foreign key(userid) references users(userid),
      foreign key(room_seq) references rooms(room_seq),
      foreign key(festival_seq) references rooms(festival)
)default character set utf8 collate utf8_general_ci;
create table tourisms(tourism_seq int(10) primary key auto_increment,
	title varchar(30),
    area varchar(10),
	information varchar(2000),
	phone_num varchar(30),
    image varchar(500),
    location_seq int(10),
    foreign key (location_seq) references locations(location_seq)
)default character set utf8 collate utf8_general_ci;
create table festivals(festival_seq int(10) primary key auto_increment,
   title varchar(100) ,
   image varchar(300),
   term varchar(30),
   information varchar(500),
   location_seq int(10),
   foreign key (location_seq) references locations(location_seq)
)default character set utf8 collate utf8_general_ci;
create table articles(article_seq int(10) primary key auto_increment,
     userid varchar(20),
     image varchar(500),
     title varchar(100),
     content varchar(500),
     modify_date varchar(20),
     tourism_seq int(10),
     festival_seq int(10),
     category varchar(10),
     foreign key (festival_seq) references festival(festival_seq),
     foreign key (tourism_seq) references tourism(tourism_seq),
     foreign key(userid) references users(userid)
 )default character set utf8 collate utf8_general_ci;
create table favors(favor_seq int(10) primary key  auto_increment,
	article_seq int(10) not null ,
	favor_check varchar(10),
	foreign key (article_seq) references articles(article_seq)
)default character set utf8 collate utf8_general_ci;
create table replies
     (reply_seq int(10) primary key auto_increment,
     content varchar(500) ,
     article_seq int(10),
     foreign key (article_seq ) references aritlces(article_seq)
)default character set utf8 collate utf8_general_ci;

