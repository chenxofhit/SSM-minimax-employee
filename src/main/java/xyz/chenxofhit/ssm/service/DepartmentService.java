package xyz.chenxofhit.ssm.service;
import xyz.chenxofhit.ssm.entity.Department;
import java.util.List;
/**
 * 部门的业务层
 */
public interface DepartmentService {
    /**
     * 查询所有部门
     */
    List<Department> findAllDeparts();
}
