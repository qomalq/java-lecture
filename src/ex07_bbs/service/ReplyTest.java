package ex07_bbs.service;

import java.util.List;

import ex07_bbs.dao.ReplyDao;
import ex07_bbs.entity.Reply;

public class ReplyTest {

	public static void main(String[] args) {
		ReplyDao rDao = new ReplyDao();
		
//		Reply r1 = new Reply(1,"안녕하세요1","james",1);
//		Reply r2 = new Reply(2,"안녕하세요2","maria",2);
//		rDao.insertReply(r1);
//		rDao.insertReply(r2);
		
		
		List<Reply> list = rDao.getReplyList(10, 0);
		for (Reply r: list)
			System.out.println(r);
		System.out.println("========================================");
		
		Reply reply = rDao.getReply(2);
		System.out.println(reply);
		System.out.println("========================================");
		
		reply.setComment("안녕하세요3");
		reply.setUid("maria");
		System.out.println(reply);
	}

}
