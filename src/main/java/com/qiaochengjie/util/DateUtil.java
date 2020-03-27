package com.qiaochengjie.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: ���������Χ�ڵ�����
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
public static Date randomDate(Date startDate,Date endDate) {
	long t1 = startDate.getTime();
	long t2 = endDate.getTime();
	if (t1>t2) {
		throw new RuntimeException("��ʼ���ڲ��ܴ��ڵ�ǰ���ڣ�����");	
	}
	long t=(long) (Math.random()*(t2-t1)+t1);
	return new Date(t);
}

public static int getage(Date birthday) {
	  Calendar c = Calendar.getInstance();//��ȡ������
	  int s_year =c.get(Calendar.YEAR);//��ȡϵͳ����
	  int s_month =c.get(Calendar.MONTH);//��ȡϵͳ����
	  int s_date =c.get(Calendar.DAY_OF_MONTH);//��ȡϵͳ����
	  c.setTime(birthday);//�ó������ڳ�ʼ������
	  int b_year = c.get(Calendar.YEAR);//��ȡ��������
	  int b_month =c.get(Calendar.MONTH);//��ȡ��������
	  int b_date =c.get(Calendar.DAY_OF_MONTH);//��ȡ��������
	  //��������
	 int age = s_year - b_year;
	 //���ϵͳ�·�С��b_month
	 if(s_month < b_month) {
		 age--; //�������һ��
	 } 
	 //����·���ȣ�����ϵͳ����С�ڳ�������
	 if(s_month == b_month &&s_date < b_date) {
		 age--; //�������һ��
	 }
	return age;  
}

/**
 * 
 * @Title: getEndMonth 
 * @Description: ����һ���µ���ĩ   �� ���� 2020/3/27 .���� 2020/3/31 23��59:59
 * @param date
 * @return
 * @return: Date
 */
public static Date getEndMonth(Date date) {
   Calendar c =  Calendar.getInstance();
   c.setTime(date);
   
   c.add(Calendar.MONTH, 1);
    Date initMonth = getInitMonth(date);
    c.setTime(initMonth);
    c.add(Calendar.SECOND, -1);
    return c.getTime();
	
}


/**
 * 
 * @Title: getInitMonth 
 * @Description: ���ش������ڵ��³�   �� ���� 2020/3/27 .���� 2020/3/01 00��00:00
 * @param date
 * @return
 * @return: Date
 */
public static Date getInitMonth(Date date) {
	Calendar c = Calendar.getInstance();//��ȡһ��������
	//�ô�������ڳ�ʼ��������
	c.setTime(date);
	
	c.set(Calendar.DAY_OF_MONTH, 1);//���������Ŀ�ʼ����Ϊ��һ��
	c.set(Calendar.HOUR_OF_DAY, 0);//�������0 ��Сʱ
	c.set(Calendar.MINUTE, 0);//�������0 ����
	c.set(Calendar.SECOND, 0);//�������0 ��
	return c.getTime();
	
}

}
