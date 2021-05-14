package kr.co.mlec.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class MemberController {

	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}
	
	// /form/join.do => id=hong&password=1234&name=홍길동
	@RequestMapping("/join.do")
	public ModelAndView join(MemberVO member) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/form/memberInfo");
		mav.addObject("member", member);
		
		return mav;
		
	}
	/*
	public String join(MemberVO member) {
		
		return "form/memberInfo";
	}
	*/
	/*
	public String join(HttpServletRequest request, 
			@RequestParam("id")String id, 
			@RequestParam("password")String password, 
			@RequestParam("name")String name) {
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		
		request.setAttribute("member", member);
		
		return "form/memberInfo";
	}
	*/
}
















