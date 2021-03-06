package cn.come.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.come.demo.dto.UserRole;
import cn.come.demo.mapper.PUmUserRoleMapper;

@Service
public class PUmUserRoleService {
	@Resource
private PUmUserRoleMapper pUmUserRoleMapper;
	
	public List<UserRole> findUserRole(String userid) {
		List<UserRole> list = pUmUserRoleMapper.getUserRole(userid);
		return list;
	}

	public void addAssUserRole(String userid, String[] roleid) {
		
		pUmUserRoleMapper.deleteAllUserRole(userid);
		if(roleid!=null){
		List<UserRole> list=new ArrayList<>();
		for(int i=0;i<roleid.length;i++){
			UserRole userrole=new UserRole();
			userrole.setUserid(userid);;
			userrole.setRoleid(roleid[i]);
			list.add(userrole);
		}
		pUmUserRoleMapper.addUserRole(list);
		}
	}

}
