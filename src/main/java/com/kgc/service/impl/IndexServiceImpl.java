package com.kgc.service.impl;

import com.kgc.mapper.MeetingroomMapper;
import com.kgc.pojo.Meetingroom;
import com.kgc.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    MeetingroomMapper meetingroomMapper;

    @Override
    public List<Meetingroom> selall() {
        return meetingroomMapper.selectByExample(null);
    }

    @Override
    public int add(Meetingroom meetingroom) {
        return meetingroomMapper.insert(meetingroom);
    }
}
