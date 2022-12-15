package br.com.gabriel.Family;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/Familys")
public class FamilysContoller {

    @RolesAllowed("user")
    @GetMapping
    public List<String> findall(){
       return Arrays.asList("Family1","Family2","Family3");
    }
}
