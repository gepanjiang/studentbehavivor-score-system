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
import com.dao.TeacherDAO;
import com.entity.Teacher;
import com.service.TeacherService;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	@Resource
	private TeacherDAO teacherDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertTeacher(Teacher teacher) {
		return this.teacherDAO.insertTeacher(teacher);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateTeacher(Teacher teacher) {
		return this.teacherDAO.updateTeacher(teacher);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteTeacher(String teacherid) {
		return this.teacherDAO.deleteTeacher(teacherid);
	}

	@Override // 继承接口的查询全部
	public List<Teacher> getAllTeacher() {
		return this.teacherDAO.getAllTeacher();
	}

	@Override // 继承接口的按条件精确查询
	public List<Teacher> getTeacherByCond(Teacher teacher) {
		return this.teacherDAO.getTeacherByCond(teacher);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Teacher> getTeacherByLike(Teacher teacher) {
		return this.teacherDAO.getTeacherByLike(teacher);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Teacher getTeacherById(String teacherid) {
		return this.teacherDAO.getTeacherById(teacherid);
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
