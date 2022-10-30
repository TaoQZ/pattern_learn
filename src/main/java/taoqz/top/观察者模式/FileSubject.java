package taoqz.top.观察者模式;

import javax.tools.FileObject;
import java.util.ArrayList;
import java.util.List;

public class FileSubject implements Subject{

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notify(Message message) {
        for (Observer observer : observerList) {
            observer.accept(message);
        }
    }
}
