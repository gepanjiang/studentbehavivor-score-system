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
import com.dao.MarksDAO;
import com.entity.Marks;
import com.service.MarksService;

@Service("marksService")
public class MarksServiceImpl implements MarksService {
	@Autowired
	@Resource
	private MarksDAO marksDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertMarks(Marks marks) {
		return this.marksDAO.insertMarks(marks);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateMarks(Marks marks) {
		return this.marksDAO.updateMarks(marks);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteMarks(String marksid) {
		return this.marksDAO.deleteMarks(marksid);
	}

	@Override // 继承接口的查询全部
	public List<Marks> getAllMarks() {
		return this.marksDAO.getAllMarks();
	}

	@Override // 继承接口的按条件精确查询
	public List<Marks> getMarksByCond(Marks marks) {
		return this.marksDAO.getMarksByCond(marks);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Marks> getMarksByLike(Marks marks) {
		return this.marksDAO.getMarksByLike(marks);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Marks getMarksById(String marksid) {
		return this.marksDAO.getMarksById(marksid);
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
