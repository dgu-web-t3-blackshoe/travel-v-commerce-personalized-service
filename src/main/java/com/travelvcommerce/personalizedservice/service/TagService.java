package com.travelvcommerce.personalizedservice.service;

import com.travelvcommerce.personalizedservice.dto.TagDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface TagService {
    List<String> getSubscribedTagList(String userId);
    List<String> getViewedTagList(String userId);
    Map<String, String> initSubscribedTagList(String userId, TagDto.InitTagListRequestDto initTagListRequestDto);
    Map<String, String> subscribeTag(String userId, TagDto.SubscribeTagRequestDto subscribeTagRequestDto);
    Map<String, String> unsubscribeTag(String userId, TagDto.UnsubscribeTagRequestDto unsubscribeTagRequestDto);
    Map<String, String> viewTag(String userId, TagDto.ViewTagRequestDto viewTagRequestDto);
}
