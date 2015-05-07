package com.sds.icto.guestbook.test;

import java.util.List;

import com.sds.icto.guestbook.dao.GuestBookDao;
import com.sds.icto.guestbook.vo.GuestBookVo;

public class GuestBookDaoTest {
	public static void main(String[] args) {
		try {
//			testDeleteById();
			testDelete();
//			testInsert();
//			testFetchList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void testDelete() throws Exception{
		GuestBookDao dao = new GuestBookDao();
		GuestBookVo vo = new GuestBookVo();
		vo.setNo(2);
		dao.deleteGuestBook(vo);
	}
	
/*	public static void testFetchList() throws Exception{
		GuestBookDao dao = new GuestBookDao();
		List<GuestBookVo> list = dao.fetchList();
		for (GuestBookVo email : list) {
			System.out.println(email);
		}
	}
	
	public static void testInsert() throws Exception{
		GuestBookVo vo = new GuestBookVo();
		vo.setFirstName("aa");
		vo.setLastName("bb");
		vo.setEmail("aaa@bbb.ccc");
		
		GuestBookDao dao = new GuestBookDao();
		dao.insert(vo);
		
		vo.setFirstName("Jungan");
		vo.setLastName("Lee");
		vo.setEmail("aaa@bbb.ccc");
		
		dao.insert(vo);
		
	}*/

}
