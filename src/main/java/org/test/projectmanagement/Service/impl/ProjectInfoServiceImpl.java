package org.test.projectmanagement.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.projectmanagement.Dao.ProjectInfoMapper;
import org.test.projectmanagement.Model.ProjectInfo;
import org.test.projectmanagement.Service.ProjectInfoService;

import java.util.List;
import java.util.Map;
@Service("ProjectInfoService")
public class ProjectInfoServiceImpl implements ProjectInfoService {

    @Autowired
    private ProjectInfoMapper projectInfoMapper;
    @Override
    public List<ProjectInfo> getProjectInfo(Map<String, Object> map) {
        return projectInfoMapper.getProjectInfo(map);
    }

    @Override
    public ProjectInfo getProjectInfoById(Integer id) {
        return projectInfoMapper.getProjectInfoById(id);
    }

    @Override
    public Integer updateProjectInfoStruts(Map<String, Object> map) {
        return projectInfoMapper.updateProjectInfoStruts(map);
    }
}
