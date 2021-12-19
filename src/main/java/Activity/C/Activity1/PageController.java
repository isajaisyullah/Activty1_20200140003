/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity.C.Activity1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Isa Jaisyullah
 */
@Controller
public class PageController {
    
    Tabel table = new Tabel();
    
    @RequestMapping("/dataktp")
    public String getTable(Model kirim){
        ArrayList<List<String>> hasil = new ArrayList<>();
        
        hasil = table.Data();
        
        kirim.addAttribute("data", hasil);
        
        return "view";
    }
}
