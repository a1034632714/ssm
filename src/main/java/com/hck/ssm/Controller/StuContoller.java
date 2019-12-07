package com.hck.ssm.Controller;

import com.hck.ssm.Service.IStuService;
import com.hck.ssm.model.Student;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("stu")
public class StuContoller {
    @Autowired
    private IStuService service;
    @RequestMapping("info")
    public String getAll(Model model){
        List<Student> students = service.selectAll();
        model.addAttribute("students",students);
        return "student/info";
    }
    @RequestMapping("search")
    public String search(@RequestParam Integer str, Model model){
        Student student = service.searchById(str);
        System.out.println(str);
        System.out.println(student);
        model.addAttribute("search",student);
        return "student/info";
    }
    @RequestMapping("tosave")
    public String tosave(){
//        model.addAttribute("id",id);
        return "student/add";
    }
    @RequestMapping("save")
    @Transactional
    public String save( Student student){
        service.update(student);
        return "redirect:/stu/info.do";
    }
    @RequestMapping("delete")
    @Transactional
    public String delete(Integer id){
        service.deleteById(id);
        return "redirect:/stu/info.do";
    }
    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest req)
            throws Exception {
        // 判断文件是否为空，空则返回失败页面
        if (file.isEmpty()) {
            return "student/failed";
        }
        // 获取原文件名
        String fileName = file.getOriginalFilename();
        // 获取文件存储路径（绝对路径）
//        String path = req.getServletContext().getRealPath("C:/Users/Ken/Desktop/新建文件夹/"+fileName);

        // 创建文件实例
//        File filePath = new File(path, fileName);
        // 如果文件目录不存在，创建目录
      /*  if (!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdirs();
            System.out.println("创建目录" + filePath);
        }*/
        // 写入文件
        System.out.println(fileName);
        file.transferTo(new File("C:/Users/Ken/Desktop/新建文件夹/"+fileName));
        return "student/success";
    }
}
