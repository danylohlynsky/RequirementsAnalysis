package req.lab05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import req.lab05.model.GeneralRisk;
import req.lab05.model.Project;
import req.lab05.model.Risk;
import req.lab05.service.interfaces.GeneralRiskService;
import req.lab05.service.interfaces.ProjectService;
import req.lab05.service.interfaces.RiskService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/risks")
public class RiskController {
    @Autowired
    RiskService riskService;
    @Autowired
    ProjectService projectService;
    @Autowired
    GeneralRiskService generalRiskService;

    @GetMapping(value = "/add/{project_id}")
    public String create(@PathVariable("project_id") long id, Model model) {

        Project project = projectService.getById(id);
        ArrayList<Risk> risks = new ArrayList<>();
        List<GeneralRisk> generalRisks = generalRiskService.allGeneralRisks();
        for (var generalRisk : generalRisks) {
            risks.add(new Risk(generalRisk, project));
        }
        model.addAttribute("generalRisks", generalRisks);
        model.addAttribute("risks", risks);
        return "add-risks";
    }

    @PostMapping(value = "/add")
    public String create(@Validated @ModelAttribute("risks") List<Risk> risks, BindingResult result) {
        if (result.hasErrors()) {
            return "add-risks";
        }
        riskService.addRisks(risks);
        return "redirect:/projects";
    }
}
