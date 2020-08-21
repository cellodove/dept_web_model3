package min.spring.dept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import min.spring.dept.dto.DeptDTO;
import min.spring.dept.service.DeptService;

// 자동으로 Bean 객체로 등록하고 컨트롤러를 구현한다.
@Controller
public class DeptController {
// 의존관계를 자동으로 설정한다.
	@Autowired
	private DeptService deptService;

// 데이터의 목록 뷰를 실행하며 http://localhost/dept/list의 웹주소가 된다.
	@RequestMapping(value = "/list", method = RequestMethod.GET)
// 뷰에 전달할 객체 정보를 저장하고 객체를 반환한다.
	public String list(Model model) {
// 데이터의 목록을 속성으로 추가한다.
		model.addAttribute("list", deptService.list());
		return "./selectAll/list";
	}

// 데이터의 입력 화면 뷰를 실행하며 http://localhost/dept/insert의 웹주소가 된다.
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return "./insert/insert";
	}

// 데이터의 입력 뷰를 실행하며 폼의 action 속성값이 된다.
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(DeptDTO deptDTO) {
		deptService.write(deptDTO);
		return "redirect:/";
	}

//데이터의 검색 화면 뷰를 실행하며 http://localhost/dept/search의 웹주소가 된다.
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search() {
		return "./select/search";
	}

//데이터의 검색 뷰를 실행하며 폼의 action 속성값이 된다.
	@RequestMapping(value = "/search", method = RequestMethod.POST)
//뷰에 전달할 객체 정보를 저장하고 객체를 반환한다.
	public String search(Model model, DeptDTO deptDTO) {
//데이터의 검색 목록을 속성으로 추가한다.
		model.addAttribute("search", deptService.read(deptDTO.getDeptno()));
		return "./select/search_result";
	}

//데이터의 수정 화면 뷰를 실행하며 http://localhost/dept/update의 웹주소가 된다.
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update() {
		return "./update/update";
	}

//데이터의 수정 뷰를 실행하며 폼의 action 속성값이 된다.
	@RequestMapping(value = "/update", method = RequestMethod.POST)
//update 모델명을 설정하여 모델의 프로퍼티값을 자동으로 뷰까지 전달한다.
	public String update(@ModelAttribute("update") DeptDTO deptDTO) {
		deptService.update(deptDTO);
		return "./update/update_result";
	}

//데이터의 삭제 화면 뷰를 실행하며 http://localhost/dept/delete의 웹주소가 된다.
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete() {
		return "./delete/delete";
	}

//데이터의 삭제 뷰를 실행하며 폼의 action 속성값이 된다.
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
//delete 모델명을 설정하여 모델의 프로퍼티값을 자동으로 뷰까지 전달한다.
	public String delete(@ModelAttribute("delete") DeptDTO deptDTO) {
		deptService.delete(deptDTO.getDeptno());
		return "./delete/delete_result";
	}
}