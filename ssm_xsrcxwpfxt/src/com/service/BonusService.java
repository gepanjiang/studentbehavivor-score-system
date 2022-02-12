//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
package com.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Bonus;

@Service("bonusService")
public interface BonusService {
	// 插入数据 调用bonusDAO里的insertBonus配置
	public int insertBonus(Bonus bonus);

	// 更新数据 调用bonusDAO里的updateBonus配置
	public int updateBonus(Bonus bonus);

	// 删除数据 调用bonusDAO里的deleteBonus配置
	public int deleteBonus(String bonusid);

	// 查询全部数据 调用bonusDAO里的getAllBonus配置
	public List<Bonus> getAllBonus();

	// 按照Bonus类里面的字段名称精确查询 调用bonusDAO里的getBonusByCond配置
	public List<Bonus> getBonusByCond(Bonus bonus);

	// 按照Bonus类里面的字段名称模糊查询 调用bonusDAO里的getBonusByLike配置
	public List<Bonus> getBonusByLike(Bonus bonus);

	// 按主键查询表返回单一的Bonus实例 调用bonusDAO里的getBonusById配置
	public Bonus getBonusById(String bonusid);

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
