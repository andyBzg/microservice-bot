package com.andybzg.service.impl;

import com.andybzg.service.AnswerConsumer;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Service
public class AnswerConsumerImpl implements AnswerConsumer {
    @Override
    public void consume(SendMessage sendMessage) {

    }
}
