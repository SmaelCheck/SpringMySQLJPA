package com.smael.SpringMySQLJPA.Repository;

import com.smael.SpringMySQLJPA.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByLabel(String lastname);
}
