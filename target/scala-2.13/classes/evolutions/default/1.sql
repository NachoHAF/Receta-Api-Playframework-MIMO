# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table authors (
  id_author                     bigserial not null,
  author_name                   varchar(255),
  author_profile_id_profile     bigint,
  create_time                   timestamptz not null,
  update_time                   timestamptz not null,
  constraint uq_authors_author_profile_id_profile unique (author_profile_id_profile),
  constraint pk_authors primary key (id_author)
);

create table authorprofiles (
  id_profile                    bigserial not null,
  name_real                     varchar(255),
  email                         varchar(255),
  phone                         varchar(255),
  direction                     varchar(255),
  constraint pk_authorprofiles primary key (id_profile)
);

create table categories (
  id_category                   bigserial not null,
  category_name                 varchar(255),
  create_time                   timestamptz not null,
  update_time                   timestamptz not null,
  constraint pk_categories primary key (id_category)
);

create table ingredients (
  id_ingredient                 bigserial not null,
  name_ingredient               varchar(255),
  create_time                   timestamptz not null,
  update_time                   timestamptz not null,
  constraint pk_ingredients primary key (id_ingredient)
);

create table recipes (
  id_recipe                     bigserial not null,
  recipe_name                   varchar(255),
  category_id_category          bigint,
  author_id_author              bigint,
  create_time                   timestamptz not null,
  update_time                   timestamptz not null,
  constraint pk_recipes primary key (id_recipe)
);

create table recipes_ingredients (
  recipes_id_recipe             bigint not null,
  ingredients_id_ingredient     bigint not null,
  constraint pk_recipes_ingredients primary key (recipes_id_recipe,ingredients_id_ingredient)
);

alter table authors add constraint fk_authors_author_profile_id_profile foreign key (author_profile_id_profile) references authorprofiles (id_profile) on delete restrict on update restrict;

create index ix_recipes_category_id_category on recipes (category_id_category);
alter table recipes add constraint fk_recipes_category_id_category foreign key (category_id_category) references categories (id_category) on delete restrict on update restrict;

create index ix_recipes_author_id_author on recipes (author_id_author);
alter table recipes add constraint fk_recipes_author_id_author foreign key (author_id_author) references authors (id_author) on delete restrict on update restrict;

create index ix_recipes_ingredients_recipes on recipes_ingredients (recipes_id_recipe);
alter table recipes_ingredients add constraint fk_recipes_ingredients_recipes foreign key (recipes_id_recipe) references recipes (id_recipe) on delete restrict on update restrict;

create index ix_recipes_ingredients_ingredients on recipes_ingredients (ingredients_id_ingredient);
alter table recipes_ingredients add constraint fk_recipes_ingredients_ingredients foreign key (ingredients_id_ingredient) references ingredients (id_ingredient) on delete restrict on update restrict;


# --- !Downs

alter table if exists authors drop constraint if exists fk_authors_author_profile_id_profile;

alter table if exists recipes drop constraint if exists fk_recipes_category_id_category;
drop index if exists ix_recipes_category_id_category;

alter table if exists recipes drop constraint if exists fk_recipes_author_id_author;
drop index if exists ix_recipes_author_id_author;

alter table if exists recipes_ingredients drop constraint if exists fk_recipes_ingredients_recipes;
drop index if exists ix_recipes_ingredients_recipes;

alter table if exists recipes_ingredients drop constraint if exists fk_recipes_ingredients_ingredients;
drop index if exists ix_recipes_ingredients_ingredients;

drop table if exists authors cascade;

drop table if exists authorprofiles cascade;

drop table if exists categories cascade;

drop table if exists ingredients cascade;

drop table if exists recipes cascade;

drop table if exists recipes_ingredients cascade;

