package io.github.pumpkinxd.examples;


import java.io.*;

public class TextFileCopier {
    public static void main(String[] args) {
        //偷懒了. 我直接用家目录了
        //访问当前用户家目录的方法:
        //*sh(包括bash和pwsh): cd ~/
        //windows(资源管理器):  %USERPROFILE%/ 或 %USERPROFILE%\
        //linux(GUI资源管理器应用): ~/
        File sourceFile = new File(System.getProperty("user.home"),"source.txt");
        File targetFileByteStream = new File(System.getProperty("user.home"),"target_byte.txt");
        File targetFileCharStream = new File(System.getProperty("user.home"),"target_char.txt");

        try {
            //使用字节流复制
            copyFileUsingByteStream(sourceFile, targetFileByteStream);
            System.out.println("使用字节流复制完成");

            //使用字符流复制
            copyFileUsingCharStream(sourceFile, targetFileCharStream);
            System.out.println("使用字符流复制完成");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    //使用字节流复制文件
    public static void copyFileUsingByteStream(File source, File target) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(source);
            fos = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }

    // 使用字符流复制文件
    public static void copyFileUsingCharStream(File source, File target) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(source);
            fw = new FileWriter(target);
            char[] buffer = new char[1024];
            int length;
            while ((length = fr.read(buffer)) > 0) {
                fw.write(buffer, 0, length);
            }
        } finally {
            if (fr != null) {
                fr.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}
