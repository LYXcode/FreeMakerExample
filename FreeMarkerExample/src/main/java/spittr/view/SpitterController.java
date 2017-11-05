package spittr.view;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import spittr.entity.Spitter;
import spittr.service.SpitterService;

@Controller
@RequestMapping("/spitter")
public class SpitterController  {
	
  @Autowired  
  @Qualifier("mySpitterService")
  private SpitterService spitterService;
  
  @RequestMapping(value="/register", method=GET)
  public String showRegistrationForm() {
    return "registerForm";
  }
  
  @RequestMapping(value="/register", method=POST)
  public String processRegistration(@RequestPart("profilePicture") MultipartFile profilePicture, Spitter spitter) throws IllegalStateException, IOException {
      
	Spitter newSpitter =  spitterService.save(spitter);
	if	(null != newSpitter) {
		profilePicture.transferTo(new File("/Users/mingqiu/images/"+newSpitter.getId()+".jpeg"));
		return "redirect:/spitter/" + newSpitter.getUsername();
	}else {
	     return "registerForm";
	}
  }
  
  @RequestMapping(value="/{username}", method=GET)
  public String showSpitterProfile(@PathVariable String username, Model model) {
    Spitter spitter = spitterService.findByUsername(username);
    model.addAttribute(spitter);
    return "profile";
  }
  
}
