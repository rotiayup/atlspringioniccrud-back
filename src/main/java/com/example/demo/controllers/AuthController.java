package com.example.demo.controllers;

import com.example.demo.services.IUserService;
        import com.example.demo.entities.User;
//aitorx import com.javaspringadibidealucasmoy.adibidealucasmoy1.utils.JWTUtil;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    //All with the aitorrrautowired mark is to undestand the difference between using @Autowired or not

    @Autowired//aitorrrautowired
    private UserService vuserService;//aitorrrautowired
    //aitorrrautowired private final UsuarioDao vusuarioDao;

//aitorx    @Autowired//aitorrrautowired
//aitorx     private JWTUtil jwtUtil;//aitorrrautowired

    //aitorrrautowired private final JWTUtil jwtUtil;

    //aitorrrautowired public AuthController(UsuarioDao vusuarioDao, JWTUtil jwtUtil) {
    //aitorrrautowired this.vusuarioDao = vusuarioDao;
    //aitorrrautowired this.jwtUtil = jwtUtil;
    //aitorrrautowired }
/*
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody User vusuario) {

        User vusuarioLogeado = vuserService.obtenerUsuarioPorCredenciales(vusuario);

        System.out.println(vusuario);//aitorrr

        if (vusuarioLogeado != null) {

//aitorx             String vtokenJwt = jwtUtil.create(String.valueOf(vusuarioLogeado.getId()), vusuarioLogeado.getEmail());

//aitorx             return vtokenJwt;
            return "ok";//aitorx
        };
        return "FAIL";
    }
*/
}

