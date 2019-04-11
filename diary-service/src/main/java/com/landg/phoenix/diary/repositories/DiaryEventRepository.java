package com.landg.phoenix.diary.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.landg.phoenix.diary.entities.DiaryEvent;
import com.landg.phoenix.diary.entities.DiaryEventRequestVO;

@Repository
public interface DiaryEventRepository extends CrudRepository<DiaryEvent,Long>{

	/**
	 * 
	 * @param eventTypes
	 * @param diaryEventLoadedStatus
	 * @return
	 */

	@Query("SELECT new com.landg.phoenix.diary.entities.DiaryEventRequestVo(de.diaryUid, to_char(de.diaryTimestamp,'YYYY-MM-DD'),de.status,de.policy,de.diaryData,TRIM(de.diaryType),TRIM(de.diarySource)) from DiaryEvent de WHERE de.diaryType in:diaryTypeList AND date(de.diaryTimestamp)<= CURRENT_DATE AND de.status=:status")
	List<DiaryEventRequestVO> getDiaryEventList(@Param("diaryTypeList")List<String> diaryTypeList,@Param("status") String status);

}
