package fowox.spring.sfgpetclinic.controllers;

import fowox.spring.sfgpetclinic.sevices.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/list"})
    public String listOfOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/list";
    }
}
