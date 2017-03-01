package cn.icbrains.io;

import java.io.FileInputStream;

/**
 * Created by ubuntu-icbrain on 17-3-1.
 */
public class FileOperateIO {
    //测试输入输出流method
    public void TestIOMethod()throws Exception{
        //创建字节输入流FileInputStream
        FileInputStream inputStream=new FileInputStream("java.txt");
        //创建一个字节数据
        byte byteBuff[]=new byte[1024];
        //存储实际读取的字节数
        int hasRead =0;

        //从java.txt中反复读取字节
        while ((hasRead=inputStream.read(byteBuff))>0){

            //将字节包装成字符串输出
            System.out.println(new String(byteBuff,0,hasRead));
        }
    }
}
