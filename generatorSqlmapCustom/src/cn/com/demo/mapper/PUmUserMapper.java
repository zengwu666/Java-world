package cn.com.demo.mapper;

import java.util.List;
import java.util.Map;

import cn.com.demo.po.PUmUser;

public interface PUmUserMapper {
	/*
	 * ��ѯ�û��Ƿ����
	 */
	PUmUser selectByUser(PUmUser pUmUser);
	/*
	 * �����û���ѯ���з��������ĸ���
	 */
	int selectcountByUser(PUmUser user);
	/*
	 * ����������ҳ��ѯ�������������û�
	 */
	List<PUmUser> selectByUserList(Map<String, Object> map);
	
	/*
	 * �����û�idɾ���û����ɫ�Ĺ�������Ϣ
	 */
	void deleteAllUserRole(String userid);
	
	/*
	 * �����û�idɾ���û�
	 */
	int deleteByPrimaryKey(String userid);
	
	/*
	 * �����û�id���Ҷ�Ӧ���û���Ϣ
	 */
	 PUmUser selectByPrimaryKey(String userid);
	 /*
	  * �����û�id�޸��û���Ϣ
	  */
	 int updateByPrimaryKey(PUmUser pUmUser);
	 
	 /*
	  * ����ɾ��
	  */
	 void delMoreUser(String[] strs);
	 
	 /*
	  * �ҳ��û���id����ֵ
	  */
	 int findMaxUserId();
	 
	 /*
	  * �����û�
	  */
	 int insert(PUmUser pUmUser);
}