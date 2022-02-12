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
import com.service.ClazzService;
import com.util.PageHelper;

//定义为控制器
@Controller
// 设置路径
@RequestMapping(value = "/clazz", produces = "text/plain;charset=utf-8")
public class ClazzAction extends BaseAction {
	// 注入Service 由于标签的存在 所以不需要getter setter
	@Autowired
	@Resource
	private ClazzService clazzService;

	// 准备添加数据
	@RequestMapping("createClazz.action")
	public String createClazz() {
		return "addclazz";
	}

	// 添加数据
	@RequestMapping("addClazz.action")
	public String addClazz(Clazz clazz) {
		this.clazzService.insertClazz(clazz);
		return "redirect:/clazz/createClazz.action";
	}

	// 通过主键删除数据
	@RequestMapping("deleteClazz.action")
	public String deleteClazz(String id) {
		this.clazzService.deleteClazz(id);
		return "redirect:/clazz/getAllClazz.action";
	}

	// 批量删除数据
	@RequestMapping("deleteClazzByIds.action")
	public String deleteClazzByIds() {
		String[] ids = this.getRequest().getParameterValues("clazzid");
		for (String clazzid : ids) {
			this.clazzService.deleteClazz(clazzid);
		}
		return "redirect:/clazz/getAllClazz.action";
	}

	// 更新数据
	@RequestMapping("updateClazz.action")
	public String updateClazz(Clazz clazz) {
		this.clazzService.updateClazz(clazz);
		return "redirect:/clazz/getAllClazz.action";
	}

	// 显示全部数据
	@RequestMapping("getAllClazz.action")
	public String getAllClazz(String number) {
		List<Clazz> clazzList = this.clazzService.getAllClazz();
		PageHelper.getPage(clazzList, "clazz", null, null, 10, number, this.getRequest(), null);
		return "listclazz";
	}

	// 按条件查询数据 (模糊查询)
	@RequestMapping("queryClazzByCond.action")
	public String queryClazzByCond(String cond, String name, String number) {
		Clazz clazz = new Clazz();
		if (cond != null) {
			if ("clazzname".equals(cond)) {
				clazz.setClazzname(name);
			}
			if ("memo".equals(cond)) {
				clazz.setMemo(name);
			}
		}

		List<String> nameList = new ArrayList<String>();
		List<String> valueList = new ArrayList<String>();
		nameList.add(cond);
		valueList.add(name);
		PageHelper.getPage(this.clazzService.getClazzByLike(clazz), "clazz", nameList, valueList, 10, number, this.getRequest(), "query");
		name = null;
		cond = null;
		return "queryclazz";
	}

	// 按主键查询数据
	@RequestMapping("getClazzById.action")
	public String getClazzById(String id) {
		Clazz clazz = this.clazzService.getClazzById(id);
		this.getRequest().setAttribute("clazz", clazz);
		return "editclazz";
	}

	public ClazzService getClazzService() {
		return clazzService;
	}

	public void setClazzService(ClazzService clazzService) {
		this.clazzService = clazzService;
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
