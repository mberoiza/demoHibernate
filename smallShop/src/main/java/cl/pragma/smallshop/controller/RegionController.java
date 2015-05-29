/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.pragma.smallshop.controller;

import cl.pragma.smallshop.dao.beans.domain.Region;
import cl.pragma.smallshop.service.RegionService;
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
public class RegionController {
     
    private RegionService regionService;
     
    @Autowired(required=true)
    @Qualifier(value="regionService")
    public void setRegionService(RegionService rs){
        this.regionService = rs;
    }
     
    @RequestMapping(value = "/regiones", method = RequestMethod.GET)
    public String listRegiones(Model model) {
        model.addAttribute("region", new Region());
        model.addAttribute("listRegiones", this.regionService.listRegiones());
        return "region";
    }
     
    //For add and update person both
    @RequestMapping(value= "/region/add", method = RequestMethod.POST)
    public String addRegion(@ModelAttribute("region") Region r){
         
        if(r.getId() == null){
            this.regionService.addRegion(r);
        }else{
            this.regionService.updateRegion(r);
        }
         
        return "redirect:/regiones";
         
    }
     
    @RequestMapping("/region/remove/{id}")
    public String removeRegion(@PathVariable("id") int id){
         
        this.regionService.removeRegion(id);
        return "redirect:/regiones";
    }
  
    @RequestMapping("/region/edit/{id}")
    public String editRegion(@PathVariable("id") int id, Model model){
        model.addAttribute("region", this.regionService.getRegion(id));
        model.addAttribute("listRegiones", this.regionService.listRegiones());
        return "region";
    }
     
}