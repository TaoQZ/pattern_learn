package taoqz.top.行为型模式.观察者模式;

import java.io.*;

public class StartUp {

    public static void main(String[] args) throws IOException {

        FileObserver fileObserver = new FileObserver();
        FileSubject fileSubject = new FileSubject();
        fileSubject.register(fileObserver);

        File originFile = new File("src/main/java/taoqz/top/观察者模式/origin.jpeg");
        long originFileLength = originFile.length();

        File destFile = new File("src/main/java/taoqz/top/观察者模式/copy.jpeg");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        int count = 1;
        int len;
        byte[] bytes = new byte[1];
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originFile));
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes);
            bos.flush();
            if (destFile.length() % (originFileLength * 0.2) == 0) {
                Message message = new Message("文件："+ originFile.getName()+ "  已复制：" + (count * 20) + "%");
                fileSubject.notify(message);
                count++;
            }
        }

        bis.close();
        bos.close();

    }

}
