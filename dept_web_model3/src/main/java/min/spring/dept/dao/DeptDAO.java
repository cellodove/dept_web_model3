package min.spring.dept.dao;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.Transactional;

import min.spring.dept.dto.DeptDTO;

// 자동으로 Bean 객체로 등록하고 DAO 클래스를 지원한다.
@Repository
// 메소드를 호출할 때 자동으로 인터셉트를 한다.
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DeptDAO {
// 의존관계를 자동으로 설정한다.
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

// 데이터의 목록을 반환한다.
	public List<DeptDTO> selectAll() {
		return sqlSessionTemplate.selectList("selectAll");
	}

// 트랜잭션을 설정하고 주석 처리를 하면 자동 커밋이 된다.
	@Transactional
// 데이터를 입력한다.
	public void insert(DeptDTO deptDTO) {
		sqlSessionTemplate.insert("insert", deptDTO);
	}

// 데이터를 검색한다.
	public DeptDTO select(int deptno) {
		return sqlSessionTemplate.selectOne("select", deptno);
	}

// 데이터를 수정한다.
	public void update(DeptDTO deptDTO) {
		sqlSessionTemplate.update("update", deptDTO);
	}

// 데이터를 삭제한다.
	public void delete(int deptno) {
		sqlSessionTemplate.delete("delete", deptno);
	}
}