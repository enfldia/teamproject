package project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;
import project.entity.ItemImg;
import project.repository.ItemImgRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemImgService {

    @Value("$(itemImgLocation)")
    private String itemImgLocation;

    private final ItemImgRepository itemImgRepository;

    private  final FileService fileService;

    public void saveItemImg(ItemImg itemImg, MultipartFile itemImgFile) throws Exception{
        String oriImgName = itemImgFile.getOriginalFilename();
        String imgName = "";
        String imgUrl = "";
        System.out.println("333333333333333333333333333" + oriImgName.toString());
        System.out.println("1111111111111111111111" + imgName.toString());
        System.out.println("22222222222222222222222222" + imgUrl.toString());
        //파일 업로드
        if(!StringUtils.isEmpty(oriImgName)){
            imgName = fileService.uploadFile(itemImgLocation, oriImgName,
                    itemImgFile.getBytes());
            imgUrl = "/images/item/" + imgName;
        }
        System.out.println("444444444444444444444444444"+ imgName);
        System.out.println("5555555555555555555555555"+ imgUrl);
        //상품 이미지 정보 저장
        itemImg.updateItemImg(oriImgName,imgName,imgUrl);
        itemImgRepository.save(itemImg);
    }
}
