package org.luvienze.ObservablePattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public NewsAgency(String news){
        this.news = news;
    }

    public void addObserver(Channel channel){
        this.channels.add(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for(Channel channel : this.channels){
            channel.update(this.news);
        }
    }
}
