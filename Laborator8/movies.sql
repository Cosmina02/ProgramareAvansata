create table movies (
movie_id varchar2(10),
title varchar2(30),
release_date date,
duration int,
score float
);

create table genres(
gen_id varchar2(10),
name varchar2(20)
);

create table movie_gen(
id_movie varchar2(10) references movies(movie_id),
id_gen varchar2(10) references genres(gen_id)
);



