package com.qiaochengjie.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随机产生范围内的日期
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
public static Date randomDate(Date startDate,Date endDate) {
	long t1 = startDate.getTime();
	long t2 = endDate.getTime();
	if (t1>t2) {
		throw new RuntimeException("开始日期不能大于当前日期！！！");	
	}
	long t=(long) (Math.random()*(t2-t1)+t1);
	return new Date(t);
}

public static int getage(Date birthday) {
	  Calendar c = Calendar.getInstance();//获取日期类
	  int s_year =c.get(Calendar.YEAR);//获取系统的年
	  int s_month =c.get(Calendar.MONTH);//获取系统的月
	  int s_date =c.get(Calendar.DAY_OF_MONTH);//获取系统的日
	  c.setTime(birthday);//用出生日期初始日历类
	  int b_year = c.get(Calendar.YEAR);//获取出生的年
	  int b_month =c.get(Calendar.MONTH);//获取出生的月
	  int b_date =c.get(Calendar.DAY_OF_MONTH);//获取出生的日
	  //计算年龄
	 int age = s_year - b_year;
	 //如果系统月份小于b_month
	 if(s_month < b_month) {
		 age--; //年龄减少一岁
	 } 
	 //如果月份相等，但是系统的天小于出生的天
	 if(s_month == b_month &&s_date < b_date) {
		 age--; //年龄减少一岁
	 }
	return age;  
}

/**
 * 
 * @Title: getEndMonth 
 * @Description: 返回一个月的月末   如 传入 2020/3/27 .返回 2020/3/31 23：59:59
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
 * @Description: 返回传入日期的月初   如 传入 2020/3/27 .返回 2020/3/01 00：00:00
 * @param date
 * @return
 * @return: Date
 */
public static Date getInitMonth(Date date) {
	Calendar c = Calendar.getInstance();//获取一个日历类
	//用传入的日期初始化日历类
	c.setTime(date);
	
	c.set(Calendar.DAY_OF_MONTH, 1);//设置日历的开始日期为第一天
	c.set(Calendar.HOUR_OF_DAY, 0);//设置天的0 个小时
	c.set(Calendar.MINUTE, 0);//设置天的0 分钟
	c.set(Calendar.SECOND, 0);//设置天的0 秒
	return c.getTime();
	
}

}
