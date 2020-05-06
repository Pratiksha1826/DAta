package Demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SugarController
{
	@ResponseBody
	@RequestMapping("/sugar")
	public void display()
	{
		System.out.println("in display method");
	}

}
