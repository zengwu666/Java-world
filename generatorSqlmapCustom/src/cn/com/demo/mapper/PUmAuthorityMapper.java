package cn.com.demo.mapper;

import java.util.List;

import cn.com.demo.po.PUmAuthority;


public interface PUmAuthorityMapper {

	/*
	 * ��ѯ���е�Ȩ��
	 */
	List<PUmAuthority> selectByAuthority();
	
	/*
	 * ����Ȩ��idɾ��Ȩ��
	 */
	int deleteByPrimaryKey(String authorityid);
	
	/*
	 * ͨ��Ȩ��id����
	 */
	PUmAuthority selectByPrimaryKey(String authorityid);
	
	/*
	 * �޸�Ȩ��
	 */
	int updateByPrimaryKey(PUmAuthority pUmAuthority);
	
	/*
	 * ���ݽ�ɫidɾ��Ȩ�޺ͽ�ɫ������Ϣ
	 */
	void delRoleAuthorityByROleId(String[] str);

	/*
	 *���ݽ�ɫidɾ������Ȩ��
	 */
	void delauthByRoleId(String[] str);
}