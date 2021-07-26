package project.minhduc.thymeleaf.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import project.minhduc.thymeleaf.entity.student;

import java.io.File;


@Controller
public class HomeController {
    @RequestMapping("/Test")
    public String hello(Model model){
//        model.addAttribute("message","FPT<b>Poly</b>");
//        ObjectMapper mapper = new ObjectMapper();
//        String path = "https://restfulspringboot-default-rtdb.firebaseio.com/";
//        student std = mapper.readValue(new File(path),student.class);
        return "home/contact";
    }
    @RequestMapping("/Test2")
    public String hello2(Model model){

//        ObjectMapper mapper = new ObjectMapper();
//        String path = "https://restfulspringboot-default-rtdb.firebaseio.com/";
//        student std = mapper.readValue(new File(path),student.class);
        return "home/contact";
    }
    @RequestMapping("/Test3")
    public String hello3(Model model){

//        ObjectMapper mapper = new ObjectMapper();
//        String path = "https://restfulspringboot-default-rtdb.firebaseio.com/";
//        student std = mapper.readValue(new File(path),student.class);
        return "home/trangchu";
    }

}
