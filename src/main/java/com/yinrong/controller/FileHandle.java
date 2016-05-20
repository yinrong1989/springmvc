package com.yinrong.controller;


import com.yinrong.model.Message;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


/**
 * Created by yinrong on 2016/5/2.
 */
@Controller
public class FileHandle implements ApplicationContextAware {
    private  static Log log= LogFactory.getLog(FileHandle.class);
    private  static  ApplicationContext applicationContext;
    @RequestMapping(value = "/dofileUpload", method = RequestMethod.POST)
    public @ResponseBody Message dofileUpload(@RequestParam MultipartFile file, HttpServletRequest request) {
        Message message=new Message();
        if(!file.isEmpty()){
            log.info("Precess file:{}"+file.getOriginalFilename());
            String path = System.getProperty("user.dir");
            String webappcontext=request.getSession().getServletContext().getRealPath("/");
            log.info("webappcontext:"+webappcontext);
            log.info("path:"+path);
            try {

              //  FileUtils.copyInputStreamToFile(file.getInputStream(),new File(request.getContextPath()+"/file",System.currentTimeMillis()+file.getOriginalFilename()));
                FileUtils.copyInputStreamToFile(file.getInputStream(),new File(webappcontext+"/file",System.currentTimeMillis()+file.getOriginalFilename()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            message.setResult("success");
            message.setRemark("上传成功");
           return message;
       }else{
           message.setResult("fail");
           return message;
       }
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
