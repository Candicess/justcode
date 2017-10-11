package com.observer.news;

public class AdminObserver implements IAdminObserver {

	@Override
	public void check(INews news) {
		// 审核结果
//		boolean flag = false;
		boolean flag = true;
		if (flag){
			news.notifyUser();
		}else {
			System.out.println("我是管理员，该条新闻审核不通过");
		}
	}

}
