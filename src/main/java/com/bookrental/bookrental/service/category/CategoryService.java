package com.bookrental.bookrental.service.category;

import com.bookrental.bookrental.helpers.Helper;
import com.bookrental.bookrental.model.Category;
import com.bookrental.bookrental.model.Member;
import com.bookrental.bookrental.pojo.category.CategoryRequestPojo;
import com.bookrental.bookrental.pojo.category.CategoryResponsePojo;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

public interface CategoryService {
    void createUpdateCateogory(CategoryRequestPojo crp);

    CategoryResponsePojo getCategoryById(Integer id);

    List<CategoryResponsePojo> getAllCategory();

    void deleteCategory(Integer id);

    Category findCategoryById(Integer id);

    ByteArrayInputStream getExcelData() throws IOException;

    void save(MultipartFile file);

}
