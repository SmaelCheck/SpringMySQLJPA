package com.smael.SpringMySQLJPA.Resource;

import com.smael.SpringMySQLJPA.Entity.Room;
import com.smael.SpringMySQLJPA.Repository.IRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/room")
public class RoomResource {

    @Autowired
    IRoomRepository iRoomRepository;

    @GetMapping( value = "/all")
    public List<Room> getAll(){
        return iRoomRepository.findAll();
    }
    @GetMapping( value = "/{label}")
    public List<Room> findByLabel(@PathVariable final String label){
        return iRoomRepository.findByLabel(label);
    }

    @RequestMapping (value = "/add", method = RequestMethod.POST)
    public List<Room> persist(@RequestBody final Room aRoom){
        //System.out.println(">>>>>>>>>>>>> "+aRoom);
        iRoomRepository.save(aRoom);
        return iRoomRepository.findAll();
    }
}