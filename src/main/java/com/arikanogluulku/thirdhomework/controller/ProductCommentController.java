package com.arikanogluulku.thirdhomework.controller;

import com.arikanogluulku.thirdhomework.converter.ProductCommentConverter;
import com.arikanogluulku.thirdhomework.dto.ProductCommentDto;
import com.arikanogluulku.thirdhomework.entity.ProductComment;
import com.arikanogluulku.thirdhomework.service.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/productComments")
public class ProductCommentController {

    @Autowired
    private ProductCommentService productCommentService;

    @GetMapping("")
    public List<ProductCommentDto> findAll(){
      List<ProductComment> commentList = productCommentService.findAll();
      List<ProductCommentDto> commentDtoList = ProductCommentConverter.INSTANCE.convertAllCommentToCommentDto(commentList);
      return commentDtoList;
    }
    @GetMapping("/{id}")
    public ProductCommentDto findById(@PathVariable String id) {
        ProductComment productComment = productCommentService.findById(id);
        ProductCommentDto productCommentDto = ProductCommentConverter.INSTANCE.convertCommentToCommentDto(productComment);
        return  productCommentDto;
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody ProductCommentDto productCommentDto) {
        ProductComment productComment =ProductCommentConverter.INSTANCE.convertCommentDtoToComment(productCommentDto);
        productComment = productCommentService.save(productComment);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(productComment.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        productCommentService.delete(id);
    }
}
