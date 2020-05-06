package Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sir")
public class CricketBatController
{
	@ResponseBody
	@RequestMapping("/bat")
	public void set()
	{
		System.out.println("in set");
	}

}
