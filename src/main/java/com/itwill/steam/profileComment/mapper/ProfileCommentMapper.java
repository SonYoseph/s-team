package com.itwill.steam.profileComment.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itwill.steam.profileComment.ProfileComment;
import com.itwill.steam.user.User;

@Mapper
public interface ProfileCommentMapper {
	
	//방명록 작성
	public int insertProfileComment(ProfileComment profileComment);
	
	//방명록 수정
	public int updateProfileComment(ProfileComment profileComment);
	
	//방명록 삭제
	public int deleteProfileComment(int pcNo);
	
	//유저번호로 해당유저 방명록 리스트 보기
	public List<ProfileComment> selectByProfileUserNo(User user);

}
