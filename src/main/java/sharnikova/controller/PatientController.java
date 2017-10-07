package sharnikova.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sharnikova.datamodel.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sharnikova.service.PatientService;

import java.util.List;
import java.util.Map;

/**
 * @author Irina Sharnikova
 *         irina.sharnikova@yandex.ru
 */
@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

//    @RequestMapping(method= RequestMethod.GET, value="/")
//    public String getPatients(Model model) {
//        model.addAttribute("patient", new Patient());
//        return "patient";
//    }

//    @RequestMapping(method= RequestMethod.GET, value="/patient/{insuranceNumber}")
//    public Patient getPatient(@PathVariable String insuranceNumber) {
//        return patientService.getPatient( Long.parseLong( insuranceNumber ));
//    }

//    @RequestMapping(method= RequestMethod.GET, value="/patient/{surname}")
//    public List<Patient> getPatients(@PathVariable String surname) {
//        return patientService.getPatient(surname);
//    }
//
//    @RequestMapping(method= RequestMethod.DELETE, value="/patient/{insuranceNumber}")
//    public void deletePatient(@PathVariable String insuranceNumber) {
//        patientService.deletePatient( Long.parseLong( insuranceNumber ) );
//    }

    @RequestMapping(method= RequestMethod.POST, value="add")
    public String addPatient(@ModelAttribute("patient") Patient patient, BindingResult result) {
        patientService.addPatient( patient );
        return "redirect:/index";
    }

//    @RequestMapping(method= RequestMethod.PUT, value="/patient/update")
//    public void updatePatient(@RequestBody Patient patient) {
//        patientService.updatePatient( patient );
//    }
}
