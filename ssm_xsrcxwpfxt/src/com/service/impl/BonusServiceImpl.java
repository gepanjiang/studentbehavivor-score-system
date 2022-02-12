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
import com.dao.BonusDAO;
import com.entity.Bonus;
import com.service.BonusService;

@Service("bonusService")
public class BonusServiceImpl implements BonusService {
	@Autowired
	@Resource
	private BonusDAO bonusDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertBonus(Bonus bonus) {
		return this.bonusDAO.insertBonus(bonus);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateBonus(Bonus bonus) {
		return this.bonusDAO.updateBonus(bonus);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteBonus(String bonusid) {
		return this.bonusDAO.deleteBonus(bonusid);
	}

	@Override // 继承接口的查询全部
	public List<Bonus> getAllBonus() {
		return this.bonusDAO.getAllBonus();
	}

	@Override // 继承接口的按条件精确查询
	public List<Bonus> getBonusByCond(Bonus bonus) {
		return this.bonusDAO.getBonusByCond(bonus);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Bonus> getBonusByLike(Bonus bonus) {
		return this.bonusDAO.getBonusByLike(bonus);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Bonus getBonusById(String bonusid) {
		return this.bonusDAO.getBonusById(bonusid);
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
