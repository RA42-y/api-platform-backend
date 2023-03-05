package com.ra.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ra.apicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author jieniyu
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-02-28 15:32:28
* @Entity com.ra.project.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




