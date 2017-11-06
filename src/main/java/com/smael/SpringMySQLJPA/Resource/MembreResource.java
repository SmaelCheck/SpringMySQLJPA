package com.smael.SpringMySQLJPA.Resource;

import com.smael.SpringMySQLJPA.Entity.Membre;
import com.smael.SpringMySQLJPA.Repository.IMembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value ="/membre/")
public class MembreResource {

    @Autowired
    IMembreRepository iMembreRepository;

    @RequestMapping(value="/", method = GET)
    public ModelAndView addMember(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("./access/membre-add");
        return mav;
    }

    @RequestMapping(value="/add", method = POST)
    public void postAddMember(HttpServletRequest request){
        String fname = request.getParameter("firstname"),
               lname = request.getParameter("lastname"),
               username = request.getParameter("username"),
               email = request.getParameter("email"),
               passcode = request.getParameter("passcode"),
                phone = request.getParameter("phone"),
               passrepeat = request.getParameter("passcode2");

        Membre aMembre = new Membre();
        aMembre.setFirstname(fname);
        aMembre.setLastname(lname);
        aMembre.setUsername(username);
        // Revoir la date
        aMembre.setAge(23);
        aMembre.setEmail(email);
        aMembre.setPhone(phone);
        aMembre.setPassword(passcode);
        iMembreRepository.save(aMembre);

    }

    @GetMapping( value = "/all")
    public List<Membre> getAll(){
        return iMembreRepository.findAll();
    }
    @GetMapping( value = "/{lastname}")
    public List<Membre> findByName(@PathVariable final String lastname){
        return iMembreRepository.findByLastnameIgnoreCase(lastname);
    }

    @PostMapping(value = "/load")
    public List<Membre> persist(@RequestBody final Membre aMembre){
        iMembreRepository.save(aMembre);
        return iMembreRepository.findAll();

    }

    @PostMapping(value = "/load1")
    public List<Membre> load(@RequestBody final Membre aMembre){
        iMembreRepository.save(aMembre);
        return iMembreRepository.findByLastnameIgnoreCase(aMembre.getLastname());
    }
}
