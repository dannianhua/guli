package com.sheng.oss.controller;

import com.sheng.commonutils.R;
import com.sheng.oss.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/eduoss/fileoss")
@CrossOrigin    // 解决跨域问题
public class OssController {
    @Autowired
    private OssService ossService;

    // 上传头像操作
    @PostMapping
    public R uploadOssFile(MultipartFile file) {
        // 获取上传文件
        // 返回上传的oss路径
       String url = ossService.uploadFileAvatar(file);
        return R.ok().data("url", url);
    }
}
