//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Student;

@Repository("studentDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface StudentDAO {

	/**
	 * StudentDAO 接口 可以按名称直接调用student.xml配置文件的SQL语句
	 */

	// 插入数据 调用entity包student.xml里的insertStudent配置 返回值0(失败),1(成功)
	public int insertStudent(Student student);

	// 更新数据 调用entity包student.xml里的updateStudent配置 返回值0(失败),1(成功)
	public int updateStudent(Student student);

	// 删除数据 调用entity包student.xml里的deleteStudent配置 返回值0(失败),1(成功)
	public int deleteStudent(String studentid);

	// 查询全部数据 调用entity包student.xml里的getAllStudent配置 返回List类型的数据
	public List<Student> getAllStudent();

	// 按照Student类里面的值精确查询 调用entity包student.xml里的getStudentByCond配置 返回List类型的数据
	public List<Student> getStudentByCond(Student student);

	// 按照Student类里面的值模糊查询 调用entity包student.xml里的getStudentByLike配置 返回List类型的数据
	public List<Student> getStudentByLike(Student student);

	// 按主键查询表返回单一的Student实例 调用entity包student.xml里的getStudentById配置
	public Student getStudentById(String studentid);

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
