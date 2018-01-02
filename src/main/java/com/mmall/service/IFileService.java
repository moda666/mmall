package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author MaWenXiang
 * @date 2017/12/12
 */
public interface IFileService {

    String upload(MultipartFile file, String path);

}
