package emsi.g1g11.patients1mvc.web;


import com.sun.org.apache.xpath.internal.operations.Mod;
import emsi.g1g11.patients1mvc.entities.Patient;
import emsi.g1g11.patients1mvc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.awt.print.Pageable;
import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;
@GetMapping(path = "/index")
    public String patients(Model model,
                           @RequestParam(name="page",defaultValue ="0" ) int page,
                           @RequestParam(name="size",defaultValue ="5" ) int size,
                           @RequestParam(name="Keyword",defaultValue = "" ) String Keyword){
    Page<Patient> pagePatients=patientRepository.findByNomContains(Keyword,PageRequest.of(page,size));
    model.addAttribute("listPatients",pagePatients.getContent());
    //stocker le nb des pages
    model.addAttribute("pages",new int[pagePatients.getTotalPages()]);
     model.addAttribute("currentPage",page);
     model.addAttribute("Keyword",Keyword);

    return "patients";
    }
    @GetMapping("/delete")
    public String delete(Long id,String Keyword,int page){
    patientRepository.deleteById(id);
    return "redirect:/index?page="+page+"&Keyword="+Keyword;
    }
    @GetMapping("/")
    public String home(){
        return "redirect:/index";}
    @GetMapping("/patients")
    @ResponseBody
    public  List<Patient> lisPatients(){
    return patientRepository.findAll();
    }
    @GetMapping("/formPatients")
public String formPatients(Model model){
    model.addAttribute("patient",new Patient());
    return "formPatients";
    }
    @PostMapping(path = "/save")
    public String save(Model model, @Valid Patient patient, BindingResult bindingResult,
                       @RequestParam(defaultValue = "0") int page ,
                       @RequestParam(defaultValue ="") String Keyword){
    if(bindingResult.hasErrors())  return "formPatients";
     patientRepository.save(patient);
     return "redirect:/index?page="+page+"&Keyword="+Keyword;
    }
    @GetMapping("/editPatient")
    public String editPatient(Model model,Long id,String Keyword,int page){
    Patient patient=patientRepository.findById(id).orElse(null);
       if(patient==null)throw new RuntimeException("Patient introuvable");
        model.addAttribute("patient",patient);
        model.addAttribute("page",page);
        model.addAttribute("Keyword",Keyword);

        return "editPatient";
    }
}
