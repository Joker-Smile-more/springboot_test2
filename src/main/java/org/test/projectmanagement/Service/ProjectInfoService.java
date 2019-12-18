package org.test.projectmanagement.Service;

import org.test.projectmanagement.Model.ProjectInfo;

import java.util.List;
import java.util.Map;

public interface ProjectInfoService {
    List<ProjectInfo> getProjectInfo(Map<String,Object> map);

    ProjectInfo getProjectInfoById(Integer id);

    Integer updateProjectInfoStruts(Map<String,Object> map);
}
