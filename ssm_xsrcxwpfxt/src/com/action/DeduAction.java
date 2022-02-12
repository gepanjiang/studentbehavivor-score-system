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
import com.entity.Dedu;
import com.service.DeduService;
import com.entity.Teacher;
import com.entity.Student;
import com.entity.Programs;
import com.service.TeacherService;
import com.service.StudentService;
import com.service.ProgramsService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/dedu", produces = "text/plain;charset=utf-8")
public class DeduAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private DeduService deduService;
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
	@RequestMapping("createDedu.action")
	public String createDedu() {
		List<Student> studentList = this.studentService.getAllStudent();
		this.getRequest().setAttribute("studentList", studentList);
		List<Programs> programsList = this.programsService.getAllPrograms();
		this.getRequest().setAttribute("programsList", programsList);
		return "adddedu";
	}

	// 添加数据
	@RequestMapping("addDedu.action")
	public String addDedu(Dedu dedu) {
		String teacherid = (String) this.getSession().getAttribute("teacherid");
		dedu.setTeacherid(teacherid);
		dedu.setAddtime(VeDate.getStringDateShort());
		this.deduService.insertDedu(dedu);
		return "redirect:/dedu/createDedu.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteDedu.action")
	public String deleteDedu(String id) {
		this.deduService.deleteDedu(id);
		return "redirect:/dedu/getAllDedu.action";
	}

	// 批量删除数据
	@RequestMapping("deleteDeduByIds.action")
	public String deleteDeduByIds() {
		String[] ids = this.getRequest().getParameterValues("deduid");
		for (String deduid : ids) {
			this.deduService.deleteDedu(deduid);
		}
		return "redirect:/dedu/getAllDedu.action";
	}

	// 更新数据
	@RequestMapping("updateDedu.action")
	public String updateDedu(Dedu dedu) {
		this.deduService.updateDedu(dedu);
		return "redirect:/dedu/getAllDedu.action";
	}

	// 显示全部数据
	@RequestMapping("getAllDedu.action")
	public String getAllDedu(String number) {
		List<Dedu> deduList = this.deduService.getAllDedu();
		PageHelper.getPage(deduList, "dedu", null, null, 10, number, this.getRequest(), null);
		return "listdedu";
	}

	@RequestMapping("getTeacherDedu.action")
	public String getTeacherDedu(String number) {
		String teacherid = (String) this.getSession().getAttribute("teacherid");
		Dedu dedu = new Dedu();
		dedu.setTeacherid(teacherid);
		List<Dedu> deduList = this.deduService.getDeduByCond(dedu);
		PageHelper.getUserPage(deduList, "dedu", "getTeacherDedu", 10, number, this.getRequest());
		return "tlistdedu";
	}

	@RequestMapping("getStudentDedu.action")
	public String getStudentDedu(String number) {
		String studentid = (String) this.getSession().getAttribute("studentid");
		Dedu dedu = new Dedu();
		dedu.setStudentid(studentid);
		List<Dedu> deduList = this.deduService.getDeduByCond(dedu);
		PageHelper.getUserPage(deduList, "dedu", "getStudentDedu", 10, number, this.getRequest());
		return "slistdedu";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryDeduByCond.action")
	public String queryDeduByCond(String cond, String name, String number) {
		Dedu dedu = new Dedu();
		if (cond != null) {
			if ("teacherid".equals(cond)) {
				dedu.setTeacherid(name);
			}
			if ("studentid".equals(cond)) {
				dedu.setStudentid(name);
			}
			if ("programsid".equals(cond)) {
				dedu.setProgramsid(name);
			}
			if ("reason".equals(cond)) {
				dedu.setReason(name);
			}
			if ("num".equals(cond)) {
				dedu.setNum(name);
			}
			if ("addtime".equals(cond)) {
				dedu.setAddtime(name);
			}
			if ("memo".equals(cond)) {
				dedu.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.deduService.getDeduByLike(dedu), "dedu", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "querydedu";
	}

	// 按主键查询数据
	@RequestMapping("getDeduById.action")
	public String getDeduById(String id) {
		Dedu dedu = this.deduService.getDeduById(id);
		this.getRequest().setAttribute("dedu", dedu);
		List<Teacher> teacherList = this.teacherService.getAllTeacher();
		this.getRequest().setAttribute("teacherList", teacherList);
		List<Student> studentList = this.studentService.getAllStudent();
		this.getRequest().setAttribute("studentList", studentList);
		List<Programs> programsList = this.programsService.getAllPrograms();
		this.getRequest().setAttribute("programsList", programsList);
		return "editdedu";
	}

	public DeduService getDeduService() {
		return deduService;
	}

	public void setDeduService(DeduService deduService) {
		this.deduService = deduService;
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
