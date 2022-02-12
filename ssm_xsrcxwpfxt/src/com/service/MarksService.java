//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Marks;

@Service("marksService")
public interface MarksService {
	// 插入数据 调用marksDAO里的insertMarks配置
	public int insertMarks(Marks marks);

	// 更新数据 调用marksDAO里的updateMarks配置
	public int updateMarks(Marks marks);

	// 删除数据 调用marksDAO里的deleteMarks配置
	public int deleteMarks(String marksid);

	// 查询全部数据 调用marksDAO里的getAllMarks配置
	public List<Marks> getAllMarks();

	// 按照Marks类里面的字段名称精确查询 调用marksDAO里的getMarksByCond配置
	public List<Marks> getMarksByCond(Marks marks);

	// 按照Marks类里面的字段名称模糊查询 调用marksDAO里的getMarksByLike配置
	public List<Marks> getMarksByLike(Marks marks);

	// 按主键查询表返回单一的Marks实例 调用marksDAO里的getMarksById配置
	public Marks getMarksById(String marksid);

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
