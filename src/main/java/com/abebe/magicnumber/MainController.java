package com.abebe.magicnumber;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {
    @RequestMapping("/home")
    public String showWithName(@RequestParam("number") int number)
    {
        int k = number;
        String val="";
       while(number>1){
            if(number%2==0){
                number=number/2;
            }
            else{
                number=3*number +1;
            }
            val +=Integer.toString(number)+"<br/>";
        }
     System.out.println(number);
        return "Starting number:"+k +"<br/>"+val;
    }

}
