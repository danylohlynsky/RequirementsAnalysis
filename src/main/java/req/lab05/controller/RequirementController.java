package req.lab05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import req.lab05.model.*;
import req.lab05.service.interfaces.GeneralRiskService;
import req.lab05.service.interfaces.RequirementService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("requirements")
public class RequirementController {
    @Autowired
    GeneralRiskService generalRiskService;

    @Autowired
    private RequirementService requirementService;

    @GetMapping(value = "/add")
    public String create(Model model) {
        model.addAttribute("requirement", new Requirement());
        return "create-requirement";
    }

    @PostMapping(value = "/add")
    public String create(@Validated @ModelAttribute("requirement") Requirement requirement, BindingResult result) {
        if (result.hasErrors()) {
            return "create-project";
        }
        requirementService.create(requirement);
        return "redirect:/projects";
    }

    @GetMapping
    public String allProjects(Model model) {
        model.addAttribute("listRequirements", requirementService.getAll());
        return "list-requirements";
    }

}
