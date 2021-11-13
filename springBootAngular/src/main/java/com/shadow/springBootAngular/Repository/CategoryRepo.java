package com.shadow.springBootAngular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shadow.springBootAngular.model.Category;

public interface CategoryRepo  extends JpaRepository<Category, Long> {

}