package kr.co.mlec.body;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.mlec.form.MemberVO;

@RequestMapping("/ajax")
@RestController
public class RestBodyController {
	
	@RequestMapping("/restBody.do")
	public String resStringBody() {
		return "OK, 성공";
	}
	
	@RequestMapping("/restBody.json")
	public Map<String, String> resJsonBody() {
		Map<String, String> result = new HashMap<>();
		result.put("id", "hong");
		result.put("name", "홍길동");
		result.put("addr", "서울");
		
		return result;
	}
	
	@RequestMapping("/restVOBody.json")
	public MemberVO resJsonVOBody() {
		
		MemberVO member = new MemberVO();
		member.setId("hong");
		member.setPassword("1234");
		member.setName("홍길동");
		
		return member;
	}
	
	@RequestMapping("/restStringListBody.json")
	public List<String> resJsonStringListBody() {
		List<String> list = new ArrayList<>();
		
		for(int i = 1; i < 4; i++) {
			list.add(String.valueOf(i));
		}
		
		return list;
	}
	
	@RequestMapping("/restVOListBody.json")
	public List<MemberVO> resJsonVOListBody() {
		List<MemberVO> list = new ArrayList<>();
		
		for(int i = 1; i < 4; i++) {
			MemberVO member = new MemberVO();
			member.setId("hong" + i);
			member.setPassword("1234");
			member.setName("홍길동" + i);
			
			list.add(member);
		}
		
		return list;
	}
}



















