package spring_web01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class HelloController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "안녕하세요...");// msg 속성에 "안녕하세요..."를 담겠다
		mav.setViewName("hello"); // hello.jsp가 view 역할을 하겠다
		return mav;
	}
}
