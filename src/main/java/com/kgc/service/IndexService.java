package com.kgc.service;

import com.kgc.pojo.Meetingroom;

import java.util.List;

/**
 * @author shkstart
 */
public interface IndexService {
    List<Meetingroom> selall();
    int add(Meetingroom meetingroom);
}
