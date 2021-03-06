package com.bymolly.springboot_3033;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    CourseRepository courseRepository;
    @RequestMapping("/")
    public String listCourses(Model model)
    model.addAttribute("courses", courseRepository.findAll());
    return "list";
}

@GetMapping("/add")
public String courseFormModel(Model model){
    model.addAttribute("course", new Course());
    return "courseform";
}

@PostMapping("/process")
public String processForm(@Valid Course course,
                          BindingResult result){
    if (result.hasErrors()){
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
            public String showCourse(@PathVariable("id")) long id, Model model)
}
model.addAttribute("course", courseRepository.findById(id).get());
return "show";
        }

