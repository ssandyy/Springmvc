package com.ssandyy.springmvcone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssandyy.springmvcone.model.Alien;


@Controller
public class HomeController {

	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Alien");
	}
	
    @RequestMapping("/")
    public String home() {
        System.out.println("Home page req..!");
        return "index";
    }


////////////////////////////////////////////////////////////////////////////////////////////////


    // adding data using @ModelAttribute anotation (note: fied name sholud be same in class then only it will auto assign)
    @RequestMapping("addalien")
    public String addalien(@ModelAttribute("aliendetails") Alien alien) {
        return "alien";
    }


	/*
	@RequestMapping("addalien")
	public String addalien(@RequestParam("aid") int id, @RequestParam("name") String name, @RequestParam("technology") String technology, ModelMap mm) {
		Alien alien = new Alien();
		alien.setAid(id);
		alien.setName(name);
		alien.setTechnology(technology);

		mm.addAttribute("aliendetails", alien);
		return "alien";
	}*/


////////////////////////////////////////////////////////////////////////////////////////////////

    // using Model Or ModelMap class along with addAttribute() instead of "ModelandView with addObject() method"
    @RequestMapping("add")
    public String add(@RequestParam("number1") int num1, @RequestParam("number2") int num2, Model m) {
        int sum = num1 + num2;
        m.addAttribute("sum", sum);
        return "result";
    }


	/*
	// using ModelandView class in Springboot
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("number1") int num1, @RequestParam("number2") int num2){
		int sum = num1 + num2;
		ModelAndView mv = new ModelAndView();
		mv.addObject("sum", sum);
		mv.setViewName("result");
		return mv;
	}*/


	/*@RequestMapping("add")
	public String add(@RequestParam("number1") int num1, @RequestParam("number2") int num2, HttpSession session){
		int sum = num1 + num2;
		session.setAttribute("sum", sum);
		return "result.jsp";
	}*/
//   OR

    // Something mixed with servlet and spring
	/*@RequestMapping("add")
	public String add(HttpServletRequest request){
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		int sum = num1 + num2;

		// send data to result page using session
		HttpSession session = request.getSession();
		session.setAttribute("sum", sum);

		//return "result.jsp?sum="+sum;
		return "result.jsp";
	}*/
////////////////////////////////////////////////////////////////////////////////////////////////


}
