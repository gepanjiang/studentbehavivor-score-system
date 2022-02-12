//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Teacher;

@Service("teacherService")
public interface TeacherService {
	// 插入数据 调用teacherDAO里的insertTeacher配置
	public int insertTeacher(Teacher teacher);

	// 更新数据 调用teacherDAO里的updateTeacher配置
	public int updateTeacher(Teacher teacher);

	// 删除数据 调用teacherDAO里的deleteTeacher配置
	public int deleteTeacher(String teacherid);

	// 查询全部数据 调用teacherDAO里的getAllTeacher配置
	public List<Teacher> getAllTeacher();

	// 按照Teacher类里面的字段名称精确查询 调用teacherDAO里的getTeacherByCond配置
	public List<Teacher> getTeacherByCond(Teacher teacher);

	// 按照Teacher类里面的字段名称模糊查询 调用teacherDAO里的getTeacherByLike配置
	public List<Teacher> getTeacherByLike(Teacher teacher);

	// 按主键查询表返回单一的Teacher实例 调用teacherDAO里的getTeacherById配置
	public Teacher getTeacherById(String teacherid);

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
