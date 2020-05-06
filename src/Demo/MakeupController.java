package Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MakeupController {

	//@ResponseBody
	@RequestMapping("/kit")
	public String add()
	{
//		return "WEB-INF/views/Makeup.jsp";
		return "Makeup";
	}

}
