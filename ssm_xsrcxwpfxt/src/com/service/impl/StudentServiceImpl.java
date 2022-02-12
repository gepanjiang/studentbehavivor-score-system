//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.StudentDAO;
import com.entity.Student;
import com.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	@Resource
	private StudentDAO studentDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertStudent(Student student) {
		return this.studentDAO.insertStudent(student);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateStudent(Student student) {
		return this.studentDAO.updateStudent(student);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteStudent(String studentid) {
		return this.studentDAO.deleteStudent(studentid);
	}

	@Override // 继承接口的查询全部
	public List<Student> getAllStudent() {
		return this.studentDAO.getAllStudent();
	}

	@Override // 继承接口的按条件精确查询
	public List<Student> getStudentByCond(Student student) {
		return this.studentDAO.getStudentByCond(student);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Student> getStudentByLike(Student student) {
		return this.studentDAO.getStudentByLike(student);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Student getStudentById(String studentid) {
		return this.studentDAO.getStudentById(studentid);
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
