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

import com.entity.Bonus;
import com.entity.Programs;
import com.entity.Student;
import com.entity.Teacher;
import com.service.BonusService;
import com.service.ProgramsService;
import com.service.StudentService;
import com.service.TeacherService;
import com.util.PageHelper;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/bonus", produces = "text/plain;charset=utf-8")
public class BonusAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private BonusService bonusService;
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
	@RequestMapping("createBonus.action")
	public String createBonus() {
		List<Student> studentList = this.studentService.getAllStudent();
		this.getRequest().setAttribute("studentList", studentList);
		List<Programs> programsList = this.programsService.getAllPrograms();
		this.getRequest().setAttribute("programsList", programsList);
		return "addbonus";
	}

	// 添加数据
	@RequestMapping("addBonus.action")
	public String addBonus(Bonus bonus) {
		String teacherid = (String) this.getSession().getAttribute("teacherid");
		bonus.setTeacherid(teacherid);
		bonus.setAddtime(VeDate.getStringDateShort());
		this.bonusService.insertBonus(bonus);
		return "redirect:/bonus/createBonus.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteBonus.action")
	public String deleteBonus(String id) {
		this.bonusService.deleteBonus(id);
		return "redirect:/bonus/getAllBonus.action";
	}

	// 批量删除数据
	@RequestMapping("deleteBonusByIds.action")
	public String deleteBonusByIds() {
		String[] ids = this.getRequest().getParameterValues("bonusid");
		for (String bonusid : ids) {
			this.bonusService.deleteBonus(bonusid);
		}
		return "redirect:/bonus/getAllBonus.action";
	}

	// 更新数据
	@RequestMapping("updateBonus.action")
	public String updateBonus(Bonus bonus) {
		this.bonusService.updateBonus(bonus);
		return "redirect:/bonus/getAllBonus.action";
	}

	// 显示全部数据
	@RequestMapping("getAllBonus.action")
	public String getAllBonus(String number) {
		List<Bonus> bonusList = this.bonusService.getAllBonus();
		PageHelper.getPage(bonusList, "bonus", null, null, 10, number, this.getRequest(), null);
		return "listbonus";
	}

	@RequestMapping("getTeacherBonus.action")
	public String getTeacherBonus(String number) {
		String teacherid = (String) this.getSession().getAttribute("teacherid");
		Bonus bonus = new Bonus();
		bonus.setTeacherid(teacherid);
		List<Bonus> bonusList = this.bonusService.getBonusByCond(bonus);
		PageHelper.getUserPage(bonusList, "bonus", "getTeacherBonus", 10, number, this.getRequest());
		return "tlistbonus";
	}
	
	@RequestMapping("getStudentBonus.action")
	public String getStudentBonus(String number) {
		String studentid = (String) this.getSession().getAttribute("studentid");
		Bonus bonus = new Bonus();
		bonus.setStudentid(studentid);
		List<Bonus> bonusList = this.bonusService.getBonusByCond(bonus);
		PageHelper.getUserPage(bonusList, "bonus", "getStudentBonus", 10, number, this.getRequest());
		return "slistbonus";
	}
	
	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryBonusByCond.action")
	public String queryBonusByCond(String cond, String name, String number) {
		Bonus bonus = new Bonus();
		if (cond != null) {
			if ("teacherid".equals(cond)) {
				bonus.setTeacherid(name);
			}
			if ("studentid".equals(cond)) {
				bonus.setStudentid(name);
			}
			if ("programsid".equals(cond)) {
				bonus.setProgramsid(name);
			}
			if ("reason".equals(cond)) {
				bonus.setReason(name);
			}
			if ("num".equals(cond)) {
				bonus.setNum(name);
			}
			if ("addtime".equals(cond)) {
				bonus.setAddtime(name);
			}
			if ("memo".equals(cond)) {
				bonus.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.bonusService.getBonusByLike(bonus), "bonus", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "querybonus";
	}

	// 按主键查询数据
	@RequestMapping("getBonusById.action")
	public String getBonusById(String id) {
		Bonus bonus = this.bonusService.getBonusById(id);
		this.getRequest().setAttribute("bonus", bonus);
		List<Teacher> teacherList = this.teacherService.getAllTeacher();
		this.getRequest().setAttribute("teacherList", teacherList);
		List<Student> studentList = this.studentService.getAllStudent();
		this.getRequest().setAttribute("studentList", studentList);
		List<Programs> programsList = this.programsService.getAllPrograms();
		this.getRequest().setAttribute("programsList", programsList);
		return "editbonus";
	}

	public BonusService getBonusService() {
		return bonusService;
	}

	public void setBonusService(BonusService bonusService) {
		this.bonusService = bonusService;
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
