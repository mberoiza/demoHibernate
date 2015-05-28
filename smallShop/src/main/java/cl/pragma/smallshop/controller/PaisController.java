/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.pragma.smallshop.controller;

import cl.pragma.smallshop.dao.beans.domain.Pais;
import cl.pragma.smallshop.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author mberoiza
 */
@Controller
public class PaisController {
     
    private PaisService paisService;
     
    @Autowired(required=true)
    @Qualifier(value="paisService")
    public void setPaisService(PaisService ps){
        this.paisService = ps;
    }
     
    @RequestMapping(value = "/paises", method = RequestMethod.GET)
    public String listPaises(Model model) {
        model.addAttribute("pais", new Pais());
        model.addAttribute("listPaises", this.paisService.listPaises());
        return "pais";
    }
     
    //For add and update person both
    @RequestMapping(value= "/pais/add", method = RequestMethod.POST)
    public String addPais(@ModelAttribute("pais") Pais p){
         
        if(p.getId() == null){
            this.paisService.addPais(p);
        }else{
            this.paisService.updatePais(p);
        }
         
        return "redirect:/paises";
         
    }
     
    @RequestMapping("/remove/{id}")
    public String removePais(@PathVariable("id") String id){
         
        this.paisService.removePais(id);
        return "redirect:/paises";
    }
  
    @RequestMapping("/edit/{id}")
    public String editPais(@PathVariable("id") String id, Model model){
        model.addAttribute("pais", this.paisService.getPais(id));
        model.addAttribute("listPaises", this.paisService.listPaises());
        return "pais";
    }
     
}