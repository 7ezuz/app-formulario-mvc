package pe.edu.idat.app_formularios_mvc.controller;

import org.springframework.stereotype.Controller;
import org.thymeleaf.expression.Strings;

@Controller
public class PromedioController {

    public Strings frmPromedio(){
        return "frmpromedio";
    }
}
