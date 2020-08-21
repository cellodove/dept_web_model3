package min.spring.dept.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import min.spring.dept.dao.DeptDAO;
import min.spring.dept.dto.DeptDTO;

// 자동으로 Bean 객체로 등록하고 서비스 레이어를 지원한다.
@Service
public class DeptService {
// 의존관계를 자동으로 설정한다.
	@Autowired
	private DeptDAO deptDAO;

// 데이터 목록에 대한 비즈니스 로직을 처리한다.
	public List<DeptDTO> list() {
		return deptDAO.selectAll();
	}

// 데이터 입력에 대한 비즈니스 로직을 처리한다.
	public void write(DeptDTO deptDTO) {
		deptDAO.insert(deptDTO);
	}

// 데이터 검색에 대한 비즈니스 로직을 처리한다.
	public DeptDTO read(int deptno) {
		return deptDAO.select(deptno);
	}

// 데이터 수정에 대한 비즈니스 로직을 처리한다.
	public void update(DeptDTO deptDTO) {
		deptDAO.update(deptDTO);
	}

// 데이터 삭제에 대한 비즈니스 로직을 처리한다.
	public void delete(int deptno) {
		deptDAO.delete(deptno);
	}
}