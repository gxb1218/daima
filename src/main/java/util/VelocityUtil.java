/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年12月02日 13:46
 */
package util;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.*;
public class VelocityUtil {
    private final static String CHARSET = "utf8";

    /**
     * 生成MFT 上传、下载脚本
     *
     * @param manageType 上传或下载 put/get
     * @param dirPath    上传文件所在文件夹或下载文件存放文件夹
     * @param fileName   上传文件名称或下载文件名称
     * @param dest       生成脚本存放路径(文件夹+文件名称)
     * @param userId     银行分配的id
     * @param encode     编码格式
     */
    public static String createMFTCommandFile(String manageType,
                                              String dirPath,
                                              String fileName,
                                              String dest,
                                              String userId,
                                              String encode) {
        FileOutputStream outStream = null;
        BufferedWriter sw = null;
        try {
            VelocityEngine ve = new VelocityEngine();
            ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
            ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
            ve.init();
            Template t = ve.getTemplate("MFTModel.vm", encode);
            VelocityContext ctx = new VelocityContext();
            ctx.put("dirPath", dirPath);
            ctx.put("userId", userId);
            ctx.put("fileName", fileName);
            ctx.put("manageType", manageType);
            //确定静态文档在共享文件目录的完整存储路径
            File file = new File(dest);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            outStream = new FileOutputStream(file);
            OutputStreamWriter oswriter = new OutputStreamWriter(outStream, encode);
            sw = new BufferedWriter(oswriter);
            t.merge(ctx, sw);
            sw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sw != null) {
                    sw.close();
                }
                if (outStream != null) {
                    outStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dest;
    }

    /**
     * 生成MFT 上传脚本
     *
     * @param manageType 上传或下载 put/get
     * @param dirPath    上传文件所在文件夹或下载文件存放文件夹
     * @param fileName   上传文件名称或下载文件名称
     * @param dest       生成脚本存放路径(文件夹+文件名称)
     * @param userId     银行分配的id
     */
    public static String createMFTCommandFile(String manageType,
                                              String dirPath,
                                              String fileName,
                                              String dest,
                                              String userId) {
        return createMFTCommandFile(manageType, dirPath, fileName, dest, userId, CHARSET);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(createMFTCommandFile("put", "/home/qy_work/cebfile/upload",
                "20181107.txt", "D:/file/put01", "USERID"));
    }

}
