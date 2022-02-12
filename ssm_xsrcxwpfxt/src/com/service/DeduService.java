//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Dedu;

@Service("deduService")
public interface DeduService {
	// 插入数据 调用deduDAO里的insertDedu配置
	public int insertDedu(Dedu dedu);

	// 更新数据 调用deduDAO里的updateDedu配置
	public int updateDedu(Dedu dedu);

	// 删除数据 调用deduDAO里的deleteDedu配置
	public int deleteDedu(String deduid);

	// 查询全部数据 调用deduDAO里的getAllDedu配置
	public List<Dedu> getAllDedu();

	// 按照Dedu类里面的字段名称精确查询 调用deduDAO里的getDeduByCond配置
	public List<Dedu> getDeduByCond(Dedu dedu);

	// 按照Dedu类里面的字段名称模糊查询 调用deduDAO里的getDeduByLike配置
	public List<Dedu> getDeduByLike(Dedu dedu);

	// 按主键查询表返回单一的Dedu实例 调用deduDAO里的getDeduById配置
	public Dedu getDeduById(String deduid);

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
