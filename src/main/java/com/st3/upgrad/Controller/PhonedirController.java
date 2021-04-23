package com.st3.upgrad.Controller;

import com.st3.upgrad.Model.Phonedir;
import com.st3.upgrad.Repository.PhonedirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhonedirController {
    @Autowired
    private PhonedirRepository phonedirRepository;

    @GetMapping("/dashboard")
    public  String Dashboard(Model model){
        model.addAttribute("contact",new Phonedir());
        return "dashboard";
    }
    @PostMapping("/add_contact")
    public String addContact(Phonedir phonedir){
        phonedirRepository.save(phonedir);
        return "contact_added";
    }
}
