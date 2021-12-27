package com.arikanogluulku.thirdhomework.converter;

import com.arikanogluulku.thirdhomework.dto.ProductCommentDto;
import com.arikanogluulku.thirdhomework.entity.ProductComment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductCommentConverter {

    ProductCommentConverter INSTANCE = Mappers.getMapper(ProductCommentConverter.class);

    @Mapping(target = "commentId" , source = "id")
    ProductCommentDto convertCommentToCommentDto(ProductComment productComment);

    @Mapping(target = "commentId" , source = "id")
    List<ProductCommentDto> convertAllCommentToCommentDto(List<ProductComment> productComments);

    @Mapping(target = "id" , source = "commentId")
    ProductComment convertCommentDtoToComment(ProductCommentDto productCommentDto);

    @Mapping(target = "id" , source = "commentId")
    List<ProductComment> convertAllCommentDtoToComment(List<ProductCommentDto> productCommentDtoList);


}
