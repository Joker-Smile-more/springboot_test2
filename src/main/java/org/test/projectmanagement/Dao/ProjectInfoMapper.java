package org.test.projectmanagement.Dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.test.projectmanagement.Model.ProjectInfo;

import java.util.List;
import java.util.Map;
@Component
public interface ProjectInfoMapper {

    List<ProjectInfo> getProjectInfo(Map<String,Object> map);

    ProjectInfo getProjectInfoById(@Param("id") Integer id);

    Integer updateProjectInfoStruts(Map<String,Object> map);
}
