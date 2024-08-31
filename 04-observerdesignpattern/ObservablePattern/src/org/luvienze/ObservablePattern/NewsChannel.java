package org.luvienze.ObservablePattern;

public class NewsChannel implements Channel {
    @Override
    public void update(Object news) {
        System.out.println("Breaking News: " + news);
    }
}
