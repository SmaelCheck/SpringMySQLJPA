package com.smael.SpringMySQLJPA.Repository;

import com.smael.SpringMySQLJPA.Entity.Membre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMembreRepository extends JpaRepository<Membre, Integer>{
    List<Membre> findByLastname(String lastname);
//    void delete (Membre aMembre);
//    void add(Membre aMembre);
//    boolean isExist(Membre aMembre);
}
