
package com.cmall.provider.mapper;

import com.cmall.core.mybatis.MyMapper;
import com.cmall.provider.model.entity.UacRoleAction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The interface Uac role action mapper.
 *
 */
@Mapper
@Component
public interface UacRoleActionMapper extends MyMapper<UacRoleAction> {
	/**
	 * Delete by action id int.
	 *
	 * @param actionId the action id
	 *
	 * @return the int
	 */
	int deleteByActionId(@Param("actionId") Long actionId);

	/**
	 * Delete by role id list int.
	 *
	 * @param roleIdList the role id list
	 *
	 * @return the int
	 */
	int deleteByRoleIdList(@Param("roleIdList") List<Long> roleIdList);
}