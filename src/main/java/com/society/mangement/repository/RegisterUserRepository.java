package com.society.mangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.society.mangement.bean.RegisterSocietyUser;

@Repository
public interface RegisterUserRepository extends JpaRepository<RegisterSocietyUser, Long>{

}
