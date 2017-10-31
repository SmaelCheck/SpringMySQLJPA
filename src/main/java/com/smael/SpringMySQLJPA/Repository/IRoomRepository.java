package com.smael.SpringMySQLJPA.Repository;

import com.smael.SpringMySQLJPA.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRoomRepository extends JpaRepository<Room, Long>  {
    //List<Room> findByLabel(String lastname);
    Room findByLabel(String lastname);
}
