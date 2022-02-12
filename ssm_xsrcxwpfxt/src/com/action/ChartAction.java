//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Bonus;
import com.entity.Clazz;
import com.entity.Dedu;
import com.entity.Marks;
import com.entity.Score;
import com.entity.Student;
import com.service.BonusService;
import com.service.ClazzService;
import com.service.DeduService;
import com.service.MarksService;
import com.service.StudentService;
import com.util.Excel;
import com.util.VeDate;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/chart", produces = "text/plain;charset=utf-8")
public class ChartAction extends BaseAction {
	@Autowired
	@Resource
	private ClazzService clazzService;
	@Autowired
	@Resource
	private StudentService studentService;
	@Autowired
	@Resource
	private MarksService marksService;
	@Autowired
	@Resource
	private BonusService bonusService;
	@Autowired
	@Resource
	private DeduService deduService;

	@RequestMapping("preChart.action")
	public String preChart() {
		List<Clazz> clazzList = this.clazzService.getAllClazz();
		this.getRequest().setAttribute("clazzList", clazzList);
		return "chart";
	}

	@RequestMapping("chartPie.action")
	@ResponseBody
	public String chartPie() throws JSONException {
		String banner = "学生日常行为评分报表";
		String s1 = "班级,学生,综合成绩,加分,扣分,总成绩";
		String[] strTitle = s1.split(",");
		List<String[]> strList = new ArrayList<String[]>();
		String clazzid = this.getRequest().getParameter("clazzid");
		Student student = new Student();
		student.setClazzid(clazzid);
		List<Student> studentList = this.studentService.getStudentByCond(student);
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		int d4 = 0;
		int d5 = 0;
		for (Student s : studentList) {
			double total = 0;
			double mtotal = 0;
			double dtotal = 0;
			double btotal = 0;
			Marks marks = new Marks();
			marks.setStudentid(s.getStudentid());
			List<Marks> mList = this.marksService.getMarksByCond(marks);
			for (Marks m : mList) {
				mtotal += Double.parseDouble(m.getScore());
			}
			mtotal = VeDate.getDouble(mtotal / mList.size());
			Bonus bonus = new Bonus();
			bonus.setStudentid(s.getStudentid());
			List<Bonus> bList = this.bonusService.getBonusByCond(bonus);
			for (Bonus b : bList) {
				btotal += Double.parseDouble(b.getNum());
			}
			Dedu dude = new Dedu();
			dude.setStudentid(s.getStudentid());
			List<Dedu> dList = this.deduService.getDeduByCond(dude);
			for (Dedu d : dList) {
				dtotal += Double.parseDouble(d.getNum());
			}
			total = mtotal + btotal - dtotal;
			Score score = new Score();
			score.setClazzname(s.getClazzname());
			score.setJiafen("" + btotal);
			score.setKoufen("" + dtotal);
			score.setRealname(s.getRealname());
			score.setZongfen("" + total);
			score.setZonghe("" + mtotal);
			String strTemp = s.getClazzname() + "," + s.getRealname() + "," + mtotal + "分," + btotal + "分," + dtotal + "分," + total + "分";
			String[] str = strTemp.split(",");
			strList.add(str);
			if (total < 60) {
				d1 = d1 + 1;
			}
			if (total >= 60 || total < 70) {
				d2 = d2 + 1;
			}
			if (total >= 70 || total < 80) {
				d3 = d3 + 1;
			}
			if (total >= 80 || total < 90) {
				d4 = d4 + 1;
			}
			if (total >= 90) {
				d5 = d5 + 1;
			}
		}
		JSONArray cate = new JSONArray();
		cate.put("60分以下");
		cate.put("70分以下");
		cate.put("80分以下");
		cate.put("90分以下");
		cate.put("90分以上");
		JSONArray count = new JSONArray();
		count.put(d1);
		count.put(d2);
		count.put(d3);
		count.put(d4);
		count.put(d5);
		JSONObject json = new JSONObject();
		json.put("count", count.toString());
		json.put("cate", cate.toString().replaceAll("\"", ""));

		Excel excel = new Excel();
		String paths = this.getSession().getServletContext().getRealPath("/");
		String url = excel.getExcel(strList, strTitle, banner, paths);
		JSONArray path = new JSONArray();
		path.put(url);
		json.put("url", url.toString().replaceAll("\"", "").replace("\\", "/").replace("\\", ""));
		System.out.println(json.toString());
		return json.toString();
	}
}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
