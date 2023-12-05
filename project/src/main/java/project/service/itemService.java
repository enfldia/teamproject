package project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import project.dto.ItemFormDto;
import project.entity.Item;
import project.repository.ItemImgRepository;
import project.repository.ItemRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class itemService {

    private final ItemRepository itemRepository;
    private final ItemImgService itemImgService;
    private final ItemImgRepository itemImgRepository;

    public Long saveItem(ItemFormDto itemFormDto, List<MultipartFile> itmeImgFileList) throws Exception{
        //상품 등록
        Item item = itemFormDto.createItem();
        itemRepository.save(item);

        //이미지 등록
        for(int i=0;i<itemImgFileList.size();i++)
            //  6   wkd 29vpdlw
    }
}
