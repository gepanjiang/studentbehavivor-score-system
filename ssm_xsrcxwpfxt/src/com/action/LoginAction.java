//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Admin;
import com.entity.Student;
import com.entity.Teacher;
import com.service.AdminService;
import com.service.StudentService;
import com.service.TeacherService;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/login", produces = "text/plain;charset=utf-8")
public class LoginAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private AdminService adminService;
	@Autowired
	@Resource
	private TeacherService teacherService;
	@Autowired
	@Resource
	private StudentService studentService;

	// 管理员登录 1 验证用户名是否存在 2 验证密码是否正确
	@RequestMapping("login.action")
	public String login() {
		String username = this.getRequest().getParameter("username");
		String password = this.getRequest().getParameter("password");
		String role = this.getRequest().getParameter("role");
		if ("管理员".equals(role)) {
			Admin adminEntity = new Admin();
			adminEntity.setUsername(username);
			List<Admin> adminlist = this.adminService.getAdminByCond(adminEntity);
			if (adminlist.size() == 0) {
				this.getRequest().setAttribute("message", "用户名不存在");
				return "index";
			} else {
				Admin admin = adminlist.get(0);
				if (password.equals(admin.getPassword())) {
					this.getSession().setAttribute("adminid", admin.getAdminid());
					this.getSession().setAttribute("username", admin.getUsername());
					this.getSession().setAttribute("realname", admin.getRealname());
					this.getSession().setAttribute("role", role);
				} else {
					this.getRequest().setAttribute("message", "密码错误");
					return "index";
				}
			}
			return "main";
		} else if ("教师".equals(role)) {
			Teacher teacherEntity = new Teacher();
			teacherEntity.setUsername(username);
			List<Teacher> teacherlist = this.teacherService.getTeacherByCond(teacherEntity);
			if (teacherlist.size() == 0) {
				this.getRequest().setAttribute("message", "用户名不存在");
				return "index";
			} else {
				Teacher teacher = teacherlist.get(0);
				if (password.equals(teacher.getPassword())) {
					this.getSession().setAttribute("adminid", teacher.getTeacherid());
					this.getSession().setAttribute("teacherid", teacher.getTeacherid());
					this.getSession().setAttribute("username", teacher.getUsername());
					this.getSession().setAttribute("realname", teacher.getRealname());
					this.getSession().setAttribute("role", role);
				} else {
					this.getRequest().setAttribute("message", "密码错误");
					return "index";
				}
			}
			return "main";
		} else {
			Student studentEntity = new Student();
			studentEntity.setUsername(username);
			List<Student> studentlist = this.studentService.getStudentByCond(studentEntity);
			if (studentlist.size() == 0) {
				this.getRequest().setAttribute("message", "用户名不存在");
				return "index";
			} else {
				Student student = studentlist.get(0);
				if (password.equals(student.getPassword())) {
					this.getSession().setAttribute("adminid", student.getStudentid());
					this.getSession().setAttribute("studentid", student.getStudentid());
					this.getSession().setAttribute("username", student.getUsername());
					this.getSession().setAttribute("realname", student.getRealname());
					this.getSession().setAttribute("role", role);
				} else {
					this.getRequest().setAttribute("message", "密码错误");
					return "index";
				}
			}
			return "main";
		}
	}

	// 管理员退出登录
	@RequestMapping("exit.action")
	public String exit() {
		this.getSession().removeAttribute("adminid");
		this.getSession().removeAttribute("teacherid");
		this.getSession().removeAttribute("studentid");
		this.getSession().removeAttribute("realname");
		this.getSession().removeAttribute("username");
		this.getSession().removeAttribute("role");
		this.getSession().removeAttribute("message");
		return "index";
	}
}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
