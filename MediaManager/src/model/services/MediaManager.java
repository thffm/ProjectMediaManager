package model.services;

import model.entities.Book;
import model.entities.Item;

import java.util.ArrayList;
import java.util.List;

public final class MediaManager<T extends Media> {
    private List<T> list = new ArrayList<>();

    public MediaManager() {
    }

    public void addMedia(T item){
        list.add(item);

    }
    public void listMedia(){
        int counter = 0;
        for (T media: list){
            counter ++;
            System.out.printf("[%d] ",counter);
            media.displayInformation();
        }
    }
}
