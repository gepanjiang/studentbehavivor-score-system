//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Marks;

@Repository("marksDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface MarksDAO {

	/**
	 * MarksDAO 接口 可以按名称直接调用marks.xml配置文件的SQL语句
	 */

	// 插入数据 调用entity包marks.xml里的insertMarks配置 返回值0(失败),1(成功)
	public int insertMarks(Marks marks);

	// 更新数据 调用entity包marks.xml里的updateMarks配置 返回值0(失败),1(成功)
	public int updateMarks(Marks marks);

	// 删除数据 调用entity包marks.xml里的deleteMarks配置 返回值0(失败),1(成功)
	public int deleteMarks(String marksid);

	// 查询全部数据 调用entity包marks.xml里的getAllMarks配置 返回List类型的数据
	public List<Marks> getAllMarks();

	// 按照Marks类里面的值精确查询 调用entity包marks.xml里的getMarksByCond配置 返回List类型的数据
	public List<Marks> getMarksByCond(Marks marks);

	// 按照Marks类里面的值模糊查询 调用entity包marks.xml里的getMarksByLike配置 返回List类型的数据
	public List<Marks> getMarksByLike(Marks marks);

	// 按主键查询表返回单一的Marks实例 调用entity包marks.xml里的getMarksById配置
	public Marks getMarksById(String marksid);

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
