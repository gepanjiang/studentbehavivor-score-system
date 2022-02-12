//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Clazz;
import com.entity.Student;
import com.service.ClazzService;
import com.service.StudentService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/student", produces = "text/plain;charset=utf-8")
public class StudentAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private StudentService studentService;
	@Autowired
	@Resource
	private ClazzService clazzService;

	// 修改密码
	@RequestMapping("editpwd.action")
	public String editpwd() {
		String studentid = (String) this.getSession().getAttribute("studentid");
		String password = this.getRequest().getParameter("password");
		String repassword = this.getRequest().getParameter("repassword");
		Student student = this.studentService.getStudentById(studentid);
		if (password.equals(student.getPassword())) {
			student.setPassword(repassword);
			this.studentService.updateStudent(student);
		} else {
			this.getRequest().setAttribute("message", "旧密码错误");
		}
		return "editpwd1";
	}

	// 准备添加数据
	@RequestMapping("createStudent.action")
	public String createStudent() {
		List<Clazz> clazzList = this.clazzService.getAllClazz();
		this.getRequest().setAttribute("clazzList", clazzList);
		return "addstudent";
	}

	// 添加数据
	@RequestMapping("addStudent.action")
	public String addStudent(Student student) {
		student.setAddtime(VeDate.getStringDateShort());
		this.studentService.insertStudent(student);
		return "redirect:/student/createStudent.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteStudent.action")
	public String deleteStudent(String id) {
		this.studentService.deleteStudent(id);
		return "redirect:/student/getAllStudent.action";
	}

	// 批量删除数据
	@RequestMapping("deleteStudentByIds.action")
	public String deleteStudentByIds() {
		String[] ids = this.getRequest().getParameterValues("studentid");
		for (String studentid : ids) {
			this.studentService.deleteStudent(studentid);
		}
		return "redirect:/student/getAllStudent.action";
	}

	// 更新数据
	@RequestMapping("updateStudent.action")
	public String updateStudent(Student student) {
		this.studentService.updateStudent(student);
		return "redirect:/student/getAllStudent.action";
	}

	// 显示全部数据
	@RequestMapping("getAllStudent.action")
	public String getAllStudent(String number) {
		List<Student> studentList = this.studentService.getAllStudent();
		PageHelper.getPage(studentList, "student", null, null, 10, number, this.getRequest(), null);
		return "liststudent";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryStudentByCond.action")
	public String queryStudentByCond(String cond, String name, String number) {
		Student student = new Student();
		if (cond != null) {
			if ("username".equals(cond)) {
				student.setUsername(name);
			}
			if ("password".equals(cond)) {
				student.setPassword(name);
			}
			if ("realname".equals(cond)) {
				student.setRealname(name);
			}
			if ("sex".equals(cond)) {
				student.setSex(name);
			}
			if ("birthday".equals(cond)) {
				student.setBirthday(name);
			}
			if ("minzu".equals(cond)) {
				student.setMinzu(name);
			}
			if ("jiguan".equals(cond)) {
				student.setJiguan(name);
			}
			if ("contact".equals(cond)) {
				student.setContact(name);
			}
			if ("address".equals(cond)) {
				student.setAddress(name);
			}
			if ("clazzid".equals(cond)) {
				student.setClazzid(name);
			}
			if ("memo".equals(cond)) {
				student.setMemo(name);
			}
			if ("addtime".equals(cond)) {
				student.setAddtime(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.studentService.getStudentByLike(student), "student", nameList, valueList, 10, number, this.getRequest(),
				"query");
		name = null;
		cond = null;
		return "querystudent";
	}

	// 按主键查询数据
	@RequestMapping("getStudentById.action")
	public String getStudentById(String id) {
		Student student = this.studentService.getStudentById(id);
		this.getRequest().setAttribute("student", student);
		List<Clazz> clazzList = this.clazzService.getAllClazz();
		this.getRequest().setAttribute("clazzList", clazzList);
		return "editstudent";
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
