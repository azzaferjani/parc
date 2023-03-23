package tn.ommp.parc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.ommp.parc.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

} 
