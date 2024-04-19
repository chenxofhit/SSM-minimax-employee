package xyz.chenxofhit.ssm.dao;
import xyz.chenxofhit.ssm.entity.Department;
import org.apache.ibatis.annotations.*;
import java.util.List;
/**
 * 部门的DAO类
 */
public interface DepartmentDao {
    /**
     * 查询所有部门
     */
    @Select("select * from depart")
    List<Department> findAllDeparts();
}
