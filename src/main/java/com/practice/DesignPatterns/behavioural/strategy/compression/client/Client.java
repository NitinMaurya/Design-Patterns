package com.practice.DesignPatterns.behavioural.strategy.compression.client;


import com.practice.DesignPatterns.behavioural.strategy.compression.CompressionContext;
import com.practice.DesignPatterns.behavioural.strategy.compression.RARCompressionStrategy;
import com.practice.DesignPatterns.behavioural.strategy.compression.ZIPCompressionStrategy;

import java.util.Collections;
import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        CompressionContext context = new CompressionContext(new ZIPCompressionStrategy());
        CompressionContext newContext = new CompressionContext(new RARCompressionStrategy());
        context.archiveFiles(Collections.emptySet());
        newContext.archiveFiles(new HashSet<>());
    }
}
