//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Student;

@Service("studentService")
public interface StudentService {
	// 插入数据 调用studentDAO里的insertStudent配置
	public int insertStudent(Student student);

	// 更新数据 调用studentDAO里的updateStudent配置
	public int updateStudent(Student student);

	// 删除数据 调用studentDAO里的deleteStudent配置
	public int deleteStudent(String studentid);

	// 查询全部数据 调用studentDAO里的getAllStudent配置
	public List<Student> getAllStudent();

	// 按照Student类里面的字段名称精确查询 调用studentDAO里的getStudentByCond配置
	public List<Student> getStudentByCond(Student student);

	// 按照Student类里面的字段名称模糊查询 调用studentDAO里的getStudentByLike配置
	public List<Student> getStudentByLike(Student student);

	// 按主键查询表返回单一的Student实例 调用studentDAO里的getStudentById配置
	public Student getStudentById(String studentid);

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
