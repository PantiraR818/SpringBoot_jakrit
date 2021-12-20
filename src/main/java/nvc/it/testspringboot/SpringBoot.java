package nvc.it.testspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SpringBoot {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "<center><h1>Spring Boot_New</h1><hr><h2>ชื่อนักศึกษา : นายจักรกฤต ภู่ประเสริฐ<br>รหัสนักศึกษา : 63309010002<br><hr><a href='/aboutme'>Go to Aboutme Page</a><br><br><a href='/contact'>Go to Contat Me Page</a></h2></center>";
    }

    @RequestMapping("/aboutme")
    @ResponseBody
    public String aboutme(){
        return "<center><h1>About Me</h1><hr><h2>Name : Jakrit Pooprasert<br>March<br><hr><a href='/'>Go to Page</a><br><br><a href='/contact'>Go to Contact Me Page</a></h2></center>";
    }

    @RequestMapping("/contact")
    @ResponseBody
    public String contact(){
        return "<center><h1>Contact Me</h1> <hr><h2> Facebook : Jakrit Pooprasert<br>097-31359-15<br>e-mail: jakrit0234@gmail.com<hr><br><a href='/'>Go to Page</a><br><br><a href='/aboutme'>Go to About Me Page</a></h2></center>";
    }
}

