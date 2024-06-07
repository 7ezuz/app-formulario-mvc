package pe.edu.idat.app_formularios_mvc.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Data
public class PromedioModel {
    private Integer ec1;
    private Integer ec2;
    private Integer ec3;
    private Integer ef;

    @Controller
    public static class PromedioController {

        @GetMapping("/promedio")
        public String frmPromedio(){
            return "frmpromedio";
        }
    }
}
}
