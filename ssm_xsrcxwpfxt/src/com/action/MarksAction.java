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

import com.entity.Marks;
import com.entity.Programs;
import com.entity.Student;
import com.entity.Teacher;
import com.service.MarksService;
import com.service.ProgramsService;
import com.service.StudentService;
import com.service.TeacherService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/marks", produces = "text/plain;charset=utf-8")
public class MarksAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private MarksService marksService;
	@Autowired
	@Resource
	private TeacherService teacherService;
	@Autowired
	@Resource
	private StudentService studentService;
	@Autowired
	@Resource
	private ProgramsService programsService;

	// 准备添加数据
	@RequestMapping("createMarks.action")
	public String createMarks() {
		List<Student> studentList = this.studentService.getAllStudent();
		this.getRequest().setAttribute("studentList", studentList);
		List<Programs> programsList = this.programsService.getAllPrograms();
		this.getRequest().setAttribute("programsList", programsList);
		return "addmarks";
	}

	// 添加数据
	@RequestMapping("addMarks.action")
	public String addMarks(Marks marks) {
		double total = 0;
		List<Programs> programsList = this.programsService.getAllPrograms();
		for (Programs p : programsList) {
			String pnum = this.getRequest().getParameter("num_" + p.getProgramsid());
			System.out.println(pnum);
			total += Double.parseDouble(pnum);
		}
		String teacherid = (String) this.getSession().getAttribute("teacherid");
		marks.setTeacherid(teacherid);
		marks.setAddtime(VeDate.getStringDateShort());
		marks.setScore("" + VeDate.getDouble(total));
		this.marksService.insertMarks(marks);
		return "redirect:/marks/createMarks.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteMarks.action")
	public String deleteMarks(String id) {
		this.marksService.deleteMarks(id);
		return "redirect:/marks/getAllMarks.action";
	}

	// 批量删除数据
	@RequestMapping("deleteMarksByIds.action")
	public String deleteMarksByIds() {
		String[] ids = this.getRequest().getParameterValues("marksid");
		for (String marksid : ids) {
			this.marksService.deleteMarks(marksid);
		}
		return "redirect:/marks/getAllMarks.action";
	}

	// 更新数据
	@RequestMapping("updateMarks.action")
	public String updateMarks(Marks marks) {
		this.marksService.updateMarks(marks);
		return "redirect:/marks/getAllMarks.action";
	}

	// 显示全部数据
	@RequestMapping("getTeacherMarks.action")
	public String getTeacherMarks(String number) {
		String teacherid = (String) this.getSession().getAttribute("teacherid");
		Marks marks = new Marks();
		marks.setTeacherid(teacherid);
		List<Marks> marksList = this.marksService.getMarksByCond(marks);
		PageHelper.getUserPage(marksList, "marks", "getTeacherMarks", 10, number, this.getRequest());
		return "tlistmarks";
	}

	@RequestMapping("getStudentMarks.action")
	public String getStudentMarks(String number) {
		String studentid = (String) this.getSession().getAttribute("studentid");
		Marks marks = new Marks();
		marks.setStudentid(studentid);
		List<Marks> marksList = this.marksService.getMarksByCond(marks);
		PageHelper.getUserPage(marksList, "marks", "getStudentMarks", 10, number, this.getRequest());
		return "slistmarks";
	}

	@RequestMapping("getAllMarks.action")
	public String getAllMarks(String number) {
		List<Marks> marksList = this.marksService.getAllMarks();
		PageHelper.getPage(marksList, "marks", null, null, 10, number, this.getRequest(), null);
		return "listmarks";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryMarksByCond.action")
	public String queryMarksByCond(String cond, String name, String number) {
		Marks marks = new Marks();
		if (cond != null) {
			if ("teacherid".equals(cond)) {
				marks.setTeacherid(name);
			}
			if ("studentid".equals(cond)) {
				marks.setStudentid(name);
			}
			if ("score".equals(cond)) {
				marks.setScore(name);
			}
			if ("addtime".equals(cond)) {
				marks.setAddtime(name);
			}
			if ("memo".equals(cond)) {
				marks.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.marksService.getMarksByLike(marks), "marks", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "querymarks";
	}

	// 按主键查询数据
	@RequestMapping("getMarksById.action")
	public String getMarksById(String id) {
		Marks marks = this.marksService.getMarksById(id);
		this.getRequest().setAttribute("marks", marks);
		List<Teacher> teacherList = this.teacherService.getAllTeacher();
		this.getRequest().setAttribute("teacherList", teacherList);
		List<Student> studentList = this.studentService.getAllStudent();
		this.getRequest().setAttribute("studentList", studentList);
		return "editmarks";
	}

	public MarksService getMarksService() {
		return marksService;
	}

	public void setMarksService(MarksService marksService) {
		this.marksService = marksService;
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
