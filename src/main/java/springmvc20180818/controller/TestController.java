package springmvc20180818.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springmvc20180818.dto.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Emma on 2018/8/18.
 */
@Controller
//@RestController 写这个就可以省略 @ResponseBody
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    //传过来的参数
    /*
    * 校验处理方法一
    * */
    public void test(@RequestBody @Validated User user,
                     //@RequestParam(name="username")String name,
                     BindingResult bindingResult)
    {

           if (bindingResult.hasErrors()){
               //拿map存错误的东西,捕获异常在这里
               Map<String,String> error=new HashMap<String, String>();
               for (FieldError error1:bindingResult.getFieldErrors()){
                       error.put(error1.getField(),error1.getDefaultMessage());
                   } throw new IllegalArgumentException(String.valueOf(error));
               }
    }



    /*
    *
    * 校验处理方法二
    * */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleError(IllegalArgumentException ex) {
        //百度猜吧
        String message=ex.getMessage().replaceAll("[{}]","");

        return ResponseEntity.badRequest().body(message);
    }

}
