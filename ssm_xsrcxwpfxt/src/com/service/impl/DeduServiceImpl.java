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
import com.dao.DeduDAO;
import com.entity.Dedu;
import com.service.DeduService;

@Service("deduService")
public class DeduServiceImpl implements DeduService {
	@Autowired
	@Resource
	private DeduDAO deduDAO;

	@Override // 继承接口的新增 返回值0(失败),1(成功)
	public int insertDedu(Dedu dedu) {
		return this.deduDAO.insertDedu(dedu);
	}

	@Override // 继承接口的更新 返回值0(失败),1(成功)
	public int updateDedu(Dedu dedu) {
		return this.deduDAO.updateDedu(dedu);
	}

	@Override // 继承接口的删除 返回值0(失败),1(成功)
	public int deleteDedu(String deduid) {
		return this.deduDAO.deleteDedu(deduid);
	}

	@Override // 继承接口的查询全部
	public List<Dedu> getAllDedu() {
		return this.deduDAO.getAllDedu();
	}

	@Override // 继承接口的按条件精确查询
	public List<Dedu> getDeduByCond(Dedu dedu) {
		return this.deduDAO.getDeduByCond(dedu);
	}

	@Override // 继承接口的按条件模糊查询
	public List<Dedu> getDeduByLike(Dedu dedu) {
		return this.deduDAO.getDeduByLike(dedu);
	}

	@Override // 继承接口的按主键查询 返回Entity实例
	public Dedu getDeduById(String deduid) {
		return this.deduDAO.getDeduById(deduid);
	}

}
//-------------------------请加下面QQ请求远程辅助运行代码  ID:3664--------------------------
//-----------------更多毕设, 联系QQ1305637939-------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加作者QQ协助运行: 1305637939-----------------------
//-------------------------请加下面QQ请求远程辅助运行代码----------------------------
