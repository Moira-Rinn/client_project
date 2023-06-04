package com.smcr.client_onboarding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smcr.client_onboarding.models.ClientBriefModel;
import com.smcr.client_onboarding.services.ClientBriefService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/project")
public class ClientBriefController {
	  
//	  @GetMapping("/form")
//	  public String showForm(Model model) {
//	    model.addAttribute("projectForm", new ClientBriefModel());
//	    return "project-form";
//	  }
//	  
//	  @PostMapping("/submit")
//	  public String submitForm(ClientBriefModel ClientBrief) {
//	    
//	    return "redirect:/project/success";
//	  }
//	  
//	  @GetMapping("/success")
//	  public String showSuccessPage() {
//	    return "success-page";
//	  }
	  
	  @Autowired
		private  ClientBriefService clientBriefService;
	  @Autowired
	  	private ClientBriefModel clientBrief;
		
	// **********************POST ROUTES*************************
		
	//MAIN PAGE
		@GetMapping("/apartments")
		public String apartments(
			Model model,
			HttpServletRequest request
			) {
				if(request.getSession().getAttribute("userId")==null)
					return "redirect:/"; 
				model.addAttribute("user", clientBriefService.findById((Long)request.getSession().getAttribute("userId")));
				return "clientBriefList.jsp";
		}
	//ADD NEW POST
		@GetMapping("/client_brief/new")
		public String newApartment(
			@ModelAttribute("newClientBrief") ClientBriefModel clientBrief,
//			@ModelAttribute("newStar") Star stars,
			HttpServletRequest request
			) {
				if(request.getSession().getAttribute("userId")!=null)
					return "addEditClientBrief.jsp";
				return "redirect:/";
		}
	//CREATE NEW POST 
		@PostMapping("/client_brief/create")
		public String addApartment(
			@Valid 
			@ModelAttribute("newClientBrief") ClientBriefModel clientBrief, 
			BindingResult results
			) {
				if(results.hasErrors()) 
					return "addEditApartment.jsp";
				clientBriefService.createClientBrief(clientBrief);
				return "redirect:/apartments/details/"+clientBrief.getId();
		}
	//GET POST DETAILS 
		@GetMapping("/client_brief/details/{id}")
		public String apartmentDetails(
			@Valid
			@PathVariable("id") Long id, 
//			@ModelAttribute("newStars") Possible newPossible,
//			@ModelAttribute("newResponse") Response response,
			Model model, 
			BindingResult res,
			HttpServletRequest request
			) {
				model.addAttribute("clientBrief", clientBriefService.findById(id).orElseThrow(RuntimeException::new));
				if(request.getSession().getAttribute("userId")!=null) 
					return "clientBriefDetails.jsp";
				return "redirect:/";
		}
	//EDIT POST
		@GetMapping("/client_brief/edit/{id}")
		public String update(
			@PathVariable("id") Long id,
			Model model,
			HttpServletRequest request
			) {
				model.addAttribute("updateApartment", clientBriefService.findById(id)); //.orElseThrow(RuntimeException::new));
				if(request.getSession().getAttribute("userId")!=null)
					return "addEditClientBrief.jsp";
				return "redirect:/";
		}
	//UPDATE POST
		@PutMapping("client_brief/update/{id}")
		public String update(
			@Valid 
			@ModelAttribute("updateApartment") ClientBriefModel updateClientBrief, 
			BindingResult result,
			@PathVariable("id") Long id,
			Model model
			) {
				if(result.hasErrors()) {
					model.addAttribute("updateApartment", clientBriefService.findById(id)); //.orElseThrow(RuntimeException::new));
					return "addEditApartment.jsp";
				}
				this.clientBriefService.update(updateClientBrief, id);
				return "redirect:/apartments";
		}
	//DELETE POST AND ASSOCIATED STARS
		@DeleteMapping("/apartments/delete/{id}")
		public String deleteApartment(
			@PathVariable("id") Long id
			) {
//				List<Possible> allPossibles = possibleService.findAll();
//				apartmentService.delete(allPossibles, id);
				clientBriefService.delete(id);
				return "redirect:/apartments";

		}
	}

