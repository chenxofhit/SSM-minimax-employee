package xyz.chenxofhit.ssm.service.impl;

import xyz.chenxofhit.ssm.dao.DepartmentDao;
import xyz.chenxofhit.ssm.entity.Department;
import xyz.chenxofhit.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departDao;
    /**
     * 查询所有部门
     */
    @Override
    public List<Department> findAllDeparts() {
        return departDao.findAllDeparts();
    }
}
