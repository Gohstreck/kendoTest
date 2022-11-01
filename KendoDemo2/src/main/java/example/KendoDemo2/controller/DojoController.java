package example.KendoDemo2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.KendoDemo2.model.Dojo;
import example.KendoDemo2.service.DojoService;

@RestController
@RequestMapping("/api/dojo/")
public class DojoController {
    @Autowired
    DojoService dojoService;


    @GetMapping("get-all")
    public ArrayList<Dojo> getAll(){
        return dojoService.getDojos();
    }

    @PostMapping("save-dojo")
    public Dojo save(@RequestBody Dojo user){
        return dojoService.save(user);
    }
}
