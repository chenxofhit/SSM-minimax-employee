package xyz.chenxofhit.ssm.service.impl;
import xyz.chenxofhit.ssm.dao.EmployeeDao;
import xyz.chenxofhit.ssm.entity.Employee;
import xyz.chenxofhit.ssm.entity.PageBean;
import xyz.chenxofhit.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public PageBean<Employee> findPageBean(Map<String, Object> param) {
        //获取current和size的值
        int current = (int) param.get("current");
        int size = (int) param.get("size");
        int begin = (current - 1) * size;
        //计算查询的起始行
        param.put("begin", begin);
        List<Employee> data = employeeDao.findEmployees(param);
        int count = employeeDao.findCount(param);
        return new PageBean<>(data, count, current, size);
    }

    /**
     * 添加员工
     */
    @Override
    public int save(Employee employee) {
        return employeeDao.save(employee);
    }

    /**
     * 更新员工
     */
    @Override
    public int update(Employee employee) {
        return employeeDao.update(employee);
    }

    /**
     * 删除员工
     */
    @Override
    public int delete(Integer id) {
        return employeeDao.delete(id);
    }

    /**
     * 删除多个员工
     */
    @Override
    public int deleteEmployees(Integer[] employeeIds) {
        return employeeDao.deleteEmployees(employeeIds);
    }

}
