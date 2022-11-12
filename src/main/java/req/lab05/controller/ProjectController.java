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
import req.lab05.model.Project;
import req.lab05.service.interfaces.ProjectService;

@Controller
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping(value = "/add")
    public String create(Model model) {
        model.addAttribute("project", new Project());
        return "create-project";
    }

    @PostMapping(value = "/add")
    public String create(@Validated @ModelAttribute("project") Project project, BindingResult result) {
        if (result.hasErrors()) {
            return "create-project";
        }
        projectService.create(project);
        return "redirect:/projects";
    }

    @GetMapping
    public String allProjects(Model model) {
        model.addAttribute("listProjects", projectService.getAll());
        return "list-projects";
    }
}
