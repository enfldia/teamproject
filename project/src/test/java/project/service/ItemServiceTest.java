package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import project.repository.ItemImgRepository;
import project.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ItemServiceTest {

    @Autowired
    ItemService itemService;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ItemImgRepository itemImgRepository;

//    List<MultipartFile> createMultipartFiles() throws Exception{
//        List<MultipartFile> multipartFileList = new ArrayList<>();
//
//        for(int i=0;i<5;i++){
//            String path = "D:/teamproject/project/item";
//        }
//    }
}