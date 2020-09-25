package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public interface LegGeneralFileSealResource {
	
	/**
	 *   文件归档超过5天未处理，给操作人发送邮件
	 * @param legActivitiDto
	 */
	@RequestMapping(value = "/shqhUrgingEmail", method = RequestMethod.POST)
	public void shqhUrgingEmail();
	
}
