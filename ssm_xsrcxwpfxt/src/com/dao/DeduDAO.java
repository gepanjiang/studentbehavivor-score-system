//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.entity.Dedu;

@Repository("deduDAO") // Repository标签定义数据库连接的访问 Spring中直接
public interface DeduDAO {

	/**
	 * DeduDAO 接口 可以按名称直接调用dedu.xml配置文件的SQL语句
	 */

	// 插入数据 调用entity包dedu.xml里的insertDedu配置 返回值0(失败),1(成功)
	public int insertDedu(Dedu dedu);

	// 更新数据 调用entity包dedu.xml里的updateDedu配置 返回值0(失败),1(成功)
	public int updateDedu(Dedu dedu);

	// 删除数据 调用entity包dedu.xml里的deleteDedu配置 返回值0(失败),1(成功)
	public int deleteDedu(String deduid);

	// 查询全部数据 调用entity包dedu.xml里的getAllDedu配置 返回List类型的数据
	public List<Dedu> getAllDedu();

	// 按照Dedu类里面的值精确查询 调用entity包dedu.xml里的getDeduByCond配置 返回List类型的数据
	public List<Dedu> getDeduByCond(Dedu dedu);

	// 按照Dedu类里面的值模糊查询 调用entity包dedu.xml里的getDeduByLike配置 返回List类型的数据
	public List<Dedu> getDeduByLike(Dedu dedu);

	// 按主键查询表返回单一的Dedu实例 调用entity包dedu.xml里的getDeduById配置
	public Dedu getDeduById(String deduid);

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
